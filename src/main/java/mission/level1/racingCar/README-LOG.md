## Racing Car λ―Έμ νκ³ 

#### Date : 2022.04.12

<hr>

### TDD π

- μ€μ  λ―Έμ ν νκ³ 
    - λ―Έμμ νκΈ° κΈκΈν΄ `TDD` μ μ©ν  μκ°μ΄ λΆμ‘±ν΄ νλ‘λμ λ‘μ§ μ€κ³ ν `λ¨μ νμ€νΈ μμ±` λ°©λ²μΌλ‘ μ½λ©
    - `TDD` μμ±μ μκ°μ΄ λλ¬΄ κ±Έλ €μ λ§€μ° λΆνΈνμ
    - νλ‘λμ μ½λμ λ³κ²½μ΄ μκΈΈ κ²½μ° νμ€νΈ μ½λκ° μ λΆ λ³κ²½λμ΄μ λΆνΈνλ€κ³  λκΌμ


- νκ³  λ―Έμ ν νκ³ 
    - `TDD`λ₯Ό μ΄λ² νκ³  κΈ°κ°λμ λ€μ μ½λ©νλ©΄μ μ μ©
    - λͺλ²μ λ―Έμ κ²½νμ ν΅ν΄ κ°λ΅νκ² `TDD`λ₯Ό μννλ λ°©λ²μ μ½κ°μ΄λλ§ ν°λ
    - `TDD`λ₯Ό μ¬μ©νμ κ²½μ° κ³Όκ°νκ² λ¦¬ν©ν λ§μ΄ κ°λ₯ν΄μ§
    - `TDD`λ₯Ό κΌΌκΌΌνκ² μμ±νλ κ²½μ° ν΄λΉ νμ€νΈμμ κ±Έλ¬λ΄μ§ λͺ»ν μλͺ»λ μ€κ³λ₯Ό λ€λ₯Έ νμ€νΈμμ λ°κ²¬ν  μ μμ
    - `TDD` μμ±μ μ€ν¨νλ κ²½μ°λ μμ± ν  μ μμ΄ μ΄λ€ λΆλΆμμ μμΈκ° λ°μν  μ μλμ§ μΆμ μ΄ κ°λ₯ν΄μ§
    - `TDD`λ₯Ό κΌΌκΌΌνκ³  μΉμ νκ² μμ±νλ©΄ νλμ κΈ°λ₯ API λͺμΈμμ²λΌ νμ©μ΄ κ°λ₯ν¨. μ¦, νμμ λ₯λ₯  μμΉμ΄ κ°λ₯ν΄μ§
    - νλ‘λμ μ½λμ λ³κ²½μ΄ μκΈΈ κ²½μ° νμ€νΈ μ½λκ° λ³κ²½λλ κ²μ μ΄μ© μ μλ μΌ. λ€λ§ μ΄κΈ°μ μ μ€κ³νλ©΄ κ·Έλ§νΌ λ³κ²½λ  νμ€νΈ μ½λλ μ€μ΄λ¬


- λλ§μ TDD μμ± νλ¦ μ λ¦¬
  ```text
  - μκ΅¬μ¬ν­μ λΆμν΄ λλ΅μ μΈ κΈ°λ₯ λͺ©λ‘μ μΆμΆ
  - TDDλ‘ κ΅¬νμ΄ κ°λ₯ν  κ² κ°μ λλ©μΈ νλ μ μ 
  - TDDλ‘ κ΅¬ννλ€κ° νμ€νΈνκΈ° μ΄λ ΅κ±°λ λ³΅μ‘λκ° μμΌλ©΄ μ½λ μ κ±°
  - λ μμ λ¨μμ λλ©μΈμ μ°Ύμ TDDλ‘ κ΅¬ν λμ 
  - TDDλ‘ κ΅¬νμ΄ κ°λ₯νλ©΄μ, λ§μ‘±νλ μμ€μ λλ©μΈ κ°μ²΄λΌ μκ°νλ©΄ κ΅¬ν λ° λ¦¬ν©ν λ§ μ§μ
  - λ¦¬ν©ν λ§μ΄ μ μ νκ² μλ£λλ©΄ 1μ°¨ μ»€λ°
  - μμμ κ΅¬νν κ°μ²΄λ₯Ό νμ©νλ λ ν° λ¨μμ κΈ°λ₯μ μ νκ³ , λλ©μΈμ μ°Ύμ κ΅¬ν μμ
  - μ΄ν κ³Όμ  λ°λ³΅
  ```

<br>

### μ μ  ν©ν°λ¦¬ λ©μλ vs μμ±μμ λΆμμ±μ π

- μ€μ  λ―Έμ ν νκ³ 
    - λ¬΄μ§μ± μ μ  ν©ν λ¦¬ λ©μλ μ¬μ©(λ¨μν λ©μλμ μ΄λ¦μ λΆμΌ μ μμ΄μ)
    - λΆμμ±μλΌλ ν€μλλ₯Ό μ΄λ μ²μ λ€μ


- νκ³  λ―Έμ ν νκ³ 
    - μ μ  ν©ν°λ¦¬ λ©μλ vs μμ±μμ λΆμμ±μ
        - μ μ  ν©ν°λ¦¬ λ©μλ μ¬μ© μμ 
            - λ‘μ§μ΄ μμ κ²½μ°λ μ μ  ν©ν°λ¦¬ λ©μλ μ¬μ©
                - ex. streamμ μ¬μ©ν΄μ List<String>μ List<Car>λ‘ λ³κ²½
            - λ΄λΆμμ μΈν°νμ΄μ€λ₯Ό νμ©ν΄μ κ°κ°μ μλ‘ λ€λ₯Έ κ΅¬νμ²΄λ₯Ό μμ±ν΄μ£Όκ³  μ΄λ₯Ό μ΄λ₯Όμ ν΅ν΄μ λͺμν΄μ£Όκ³  μΆμ κ²½μ°

        - λΆμμ±μ μ¬μ© μμ 
            - λ¨μν λ³΅μ‘ν λ‘μ§μ΄ μμ΄ λ€μν λ§€κ°λ³μκ° λ€μ΄μ¬ μ μλ κ²½μ°μ λΆμμ±μ μ¬μ©
            - νμ€νΈ μ½λμ νΈμμ±μ μν΄μ λ€μν μμ±μλ₯Ό μ΄μ΄μΌ ν  κ²½μ° λΆμμ±μ μ¬μ©

### μΌκΈ μ»¬λ μ

- μ€μ  λ―Έμ ν, νκ³  λ―Έμ ν νκ³ 
    1. μλ£κ΅¬μ‘°λ₯Ό κ°λ°μκ° μ§μ  μ μν  μ μλ€.
        - μ΄λ ν `List<κ°μ²΄>`λ₯Ό νλλ‘ κ°μ§κ³  μ΄λ₯Ό κ²μ¦νκΈ° μν΄μλ `List<κ°μ²΄>`λ₯Ό κ°μ§κ³  μλ κ°μ²΄μμ κ²μ¦μ μνν΄μΌ νλ€. κ²°κ΅­ μ΄λ, `List<κ°μ²΄>`κ° μ¬μ©λλ λͺ¨λ  κ³³μμ κ²μ¦μ
          μνν΄μΌ νλ€λ λ¨μ μ κ°μ§κ² λλ€.
          <br><br>
          μΌκΈ μ»¬λ μμ μ΄λ¬ν λ¬Έμ λ₯Ό ν΄κ²°ν  μ μλ€. μΌκΈ μ»¬λ μμ μμ± μ‘°κ±΄μΌλ‘ κ²μ¦μ λ£μ μ μκΈ° λλ¬Έμ κ°λ°μκ° μ€μνλ λ¬Έμ λ₯Ό μ€μ΄κ³  κ° κ°μ²΄μ μ±μλΆλ¦¬μ μμ§λλ₯Ό λμ΄λ ν¨κ³Όλ₯Ό κ°μ Έμ¬ μ μλ€.
          <br><br>
    2. μ»¬λ μμ λΆλ³ λ³΄μ₯μ΄ κ°λ₯νλ€.
        - `List<κ°μ²΄>`λ `final`λ‘ μ μΈνλλΌλ μ¬ν λΉλ§ λΆκ°λ₯νμ§ add λ©μλλ₯Ό ν΅ν΄ μΆκ°κ° κ°λ₯νμ¬ λΆλ³νμ§ μλ€.
          <br><br>
          μΌκΈ μ»¬λ μμ ν΅ν΄μ μ΄λ₯Ό νλ² κ°μΈμ£Όμ΄μ μ΄λ¬ν add λ©μλκ° μ¬μ©λ  μ¬μ§λ₯Ό μ κ±°ν  μ μλ€.
          <br><br>
    3. μνμ νμλ₯Ό νκ³³μμ κ΄λ¦¬κ° κ°λ₯νλ€.
        - `List<κ°μ²΄>`μ λ°μ΄ν°λ₯Ό νμ©ν μ΄λ ν λ©μλλ₯Ό μ¬μ©νκΈ° μν΄μλ ν΄λΉ νλκ° μλ κ³³μμ λ©μλλ₯Ό μμ±ν΄μ μ¬μ©ν΄μ£Όμ΄μΌ νλ€. μ΄λ μ¬μ©νλ κ³³λ§λ€ ν΄λΉ λ©μλλ₯Ό μμ±ν΄μ£Όμ΄μΌ νλ€λ λΆνΈν¨κ³Ό
          κ°λ°μκ° μ€λ³΅λ μ½λλ₯Ό μμ±ν  μ¬μ§λ₯Ό λ¨κ²¨λκ² λλ€.
            ```java
            public void κ°μ₯_λ§μ΄_μ μ§ν_μλμ°¨λ₯Ό_μ°Ύμλ΄λ_κΈ°λ₯() { 
                List<Car> cars = Arrays.asList(new Car("rookie"), new Car("tony"));
    
                Car maxPositionCar = cars.stream()
                    .max(Car::compareTo)
                    .orElseThrow(() -> new RuntimeException());
            }
            ```  
          <br>
        
          μΌκΈ μ»¬λ μμ ν΅ν΄μ `List<κ°μ²΄>` (μν)μ `findMaxPositionByCar()` (νμ)λ₯Ό ν κ³³μμ κ΄λ¦¬ ν  μ μμ΄ μμ§λ λμ μ½λ μμ±μ΄ κ°λ₯.
            ```java
            public void κ°μ₯_λ§μ΄_μ μ§ν_μλμ°¨λ₯Ό_μ°Ύμλ΄λ_κΈ°λ₯() {
                List<Car> carList = Arrays.asList(new Car("rookie"), new Car("tony"));

                Cars cars = new Cars(carList);
                Car maxPositionCar = cars.findMaxPositionByCar();
            }
            ``` 

### μ΄μΈμ μμν νμ΅ λ‘κ·Έ

- Junit 5
    - Junit 5λΆν°λ public μ κ·Ό μ μ΄μλ νΉμ  μν©μΈ κ²½μ°μλ§ μ¬μ©νλλ‘ κΆμ₯
      - κ·Έ μ΄μ λ `private`λ `default` μ κ·Όμ μ΄μμ¬λ λ¦¬νλ μμ νμ©νμ¬ λ©μλμ μ κ·Ό κ°λ₯νκΈ° λλ¬Έμ
  ```text
    **Class and method visibility 
    
    Test classes, test methods, and lifecycle methods are not required to be public, but they
    must not be private.
    
    It is generally recommended to omit the public modifier for test classes, test methods, and lifecycle methods unless
    there is a technical reason for doing so β for example, when a test class is extended by a test class in another
    package. Another technical reason for making classes and methods public is to simplify testing on the module path when
    using the Java Module System.**
    ```
