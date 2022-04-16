## Racing Car 미션 회고

#### Date : 2022.04.12

<hr>

### TDD 👀

- 실제 미션 후 회고
    - 미션을 하기 급급해 `TDD` 적용할 시간이 부족해 프로덕션 로직 설계 후 `단위 테스트 작성` 방법으로 코딩
    - `TDD` 작성에 시간이 너무 걸려서 매우 불편했음
    - 프로덕션 코드에 변경이 생길 경우 테스트 코드가 전부 변경되어서 불편하다고 느꼈음


- 회고 미션 후 회고
    - `TDD`를 이번 회고 기간동안 다시 코딩하면서 적용
    - 몇번의 미션 경험을 통해 간략하게 `TDD`를 수행하는 방법을 약간이나마 터득
    - `TDD`를 사용했을 경우 과감하게 리팩토링이 가능해짐
    - `TDD`를 꼼꼼하게 작성하는 경우 해당 테스트에서 걸러내지 못한 잘못된 설계를 다른 테스트에서 발견할 수 있음
    - `TDD` 작성시 실패하는 경우도 작성 할 수 있어 어떤 부분에서 예외가 발생할 수 있는지 추적이 가능해짐
    - `TDD`를 꼼꼼하고 친절하게 작성하면 하나의 기능 API 명세서처럼 활용이 가능함. 즉, 협업시 능률 상승이 가능해짐
    - 프로덕션 코드에 변경이 생길 경우 테스트 코드가 변경되는 것은 어쩔 수 없는 일. 다만 초기에 잘 설계하면 그만큼 변경될 테스트 코드도 줄어듬


- 나만의 TDD 작성 흐름 정리
  ```text
  - 요구사항을 분석해 대략적인 기능 목록을 추출
  - TDD로 구현이 가능할 것 같은 도메인 하나 선정
  - TDD로 구현하다가 테스트하기 어렵거나 복잡도가 있으면 코드 제거
  - 더 작은 단위의 도메인을 찾아 TDD로 구현 도전
  - TDD로 구현이 가능하면서, 만족하는 수준의 도메인 객체라 생각하면 구현 및 리팩토링 지속
  - 리팩토링이 적절하게 완료되면 1차 커밋
  - 앞에서 구현한 객체를 활용하는 더 큰 단위의 기능을 정하고, 도메인을 찾아 구현 시작
  - 이후 과정 반복
  ```

<br>

### 정적 팩터리 메서드 vs 생성자와 부생성자 👀

- 실제 미션 후 회고
    - 무지성 정적 팩토리 메서드 사용(단순히 메서드에 이름을 붙일 수 있어서)
    - 부생성자라는 키워드를 이때 처음 들음


- 회고 미션 후 회고
    - 정적 팩터리 메서드 vs 생성자와 부생성자
        - 정적 팩터리 메서드 사용 시점
            - 로직이 있을 경우는 정적 팩터리 메서드 사용
                - ex. stream을 사용해서 List<String>을 List<Car>로 변경
            - 내부에서 인터페이스를 활용해서 각각의 서로 다른 구현체를 생성해주고 이를 이를을 통해서 명시해주고 싶은 경우

        - 부생성자 사용 시점
            - 단순히 복잡한 로직이 없이 다양한 매개변수가 들어올 수 있는 경우에 부생성자 사용
            - 테스트 코드의 편의성을 위해서 다양한 생성자를 열어야 할 경우 부생성자 사용

### 일급 컬렉션

- 실제 미션 후, 회고 미션 후 회고
    1. 자료구조를 개발자가 직접 정의할 수 있다.
        - 어떠한 `List<객체>`를 필드로 가지고 이를 검증하기 위해서는 `List<객체>`를 가지고 있는 객체에서 검증을 수행해야 한다. 결국 이는, `List<객체>`가 사용되는 모든 곳에서 검증을
          수행해야 한다는 단점을 가지게 된다.
          <br><br>
          일급 컬렉션은 이러한 문제를 해결할 수 있다. 일급 컬렉션의 생성 조건으로 검증을 넣을 수 있기 때문에 개발자가 실수하는 문제를 줄이고 각 객체의 책임분리와 응집도를 높이는 효과를 가져올 수 있다.
          <br><br>
    2. 컬렉션의 불변 보장이 가능하다.
        - `List<객체>`는 `final`로 선언하더라도 재할당만 불가능하지 add 메서드를 통해 추가가 가능하여 불변하지 않다.
          <br><br>
          일급 컬렉션을 통해서 이를 한번 감싸주어서 이러한 add 메서드가 사용될 여지를 제거할 수 있다.
          <br><br>
    3. 상태와 행위를 한곳에서 관리가 가능하다.
        - `List<객체>`의 데이터를 활용한 어떠한 메서드를 사용하기 위해서는 해당 필드가 있는 곳에서 메서드를 작성해서 사용해주어야 한다. 이는 사용하는 곳마다 해당 메서드를 작성해주어야 한다는 불편함과
          개발자가 중복된 코드를 작성할 여지를 남겨두게 된다.
            ```java
            public void 가장_많이_전진한_자동차를_찾아내는_기능() { 
                List<Car> cars = Arrays.asList(new Car("rookie"), new Car("tony"));
    
                Car maxPositionCar = cars.stream()
                    .max(Car::compareTo)
                    .orElseThrow(() -> new RuntimeException());
            }
            ```  
          <br>
        
          일급 컬렉션을 통해서 `List<객체>` (상태)와 `findMaxPositionByCar()` (행위)를 한 곳에서 관리 할 수 있어 응집도 높은 코드 작성이 가능.
            ```java
            public void 가장_많이_전진한_자동차를_찾아내는_기능() {
                List<Car> carList = Arrays.asList(new Car("rookie"), new Car("tony"));

                Cars cars = new Cars(carList);
                Car maxPositionCar = cars.findMaxPositionByCar();
            }
            ``` 

### 이외의 자잘한 학습 로그

- Junit 5
    - Junit 5부터는 public 접근 제어자는 특정 상황인 경우에만 사용하도록 권장
      - 그 이유는 `private`나 `default` 접근제어자여도 리플렉션을 활용하여 메서드에 접근 가능하기 때문임
  ```text
    **Class and method visibility 
    
    Test classes, test methods, and lifecycle methods are not required to be public, but they
    must not be private.
    
    It is generally recommended to omit the public modifier for test classes, test methods, and lifecycle methods unless
    there is a technical reason for doing so – for example, when a test class is extended by a test class in another
    package. Another technical reason for making classes and methods public is to simplify testing on the module path when
    using the Java Module System.**
    ```
