<h2> val, var 차이점 </h2>

코틀린은 **Java**와 달리 변수 선언시 val과 var를 사용하며 타입선언 없이 바로 값을 할당할 수 있다. <br>
물론 타이도 별도 지정이 가능
<p>
</p>
val과 var는 변수의 시작을 알리면서 변수가 불변(immutable type)인지 가변(mutable type)인지를 나타낸다.<br>
공통적으로 초기화 시 값을 할당하지 않는 다면 반드시 type을 명시해야 한다.<p></p>

하지만 컴파일러가 변수 타입을 추론할 수 있는 경우에는 타입을 생각해도 된다.

<h3>1. val</h3>
* val로 지정된 불편 타입 변수는 초기에 값을 할당할 경우 나중에 값을 변경할 수 없으며 값을 변경하게 되면 **Complie error** 발생<br>
즉, 값 초기화만 가능하고 변경은 불가능<br>Java에서는 final과 같다고 볼수 있다.
* val은 **한번만 초기화 가능** <br>하지만 변수의 참조가 가리키는 갹체의 내부 값을 변경이 가능하다.

<pre>
<code>
fun main(args: Array<String>) {
    // 1. val : value의 약어이며 변경 불가능(immutable)한 변수, 초기화만 가능하다. 그래서 아래에는 초기화만 함.
    val name = "Kotlin"
    
    // 위에서 이미 초기화 했기 때문에 아래 코드처럼 값 할당이 불가능
    name = "Java"
    
    // 2. 타입 지정 가능, 다만 1번처럼 컴파일러에서 타입이 추론 가능한 경우 생략 가능
    val name2: String = "Swift"
    
    // 2.1 초기화시 값을 할당하지 않을시엔 반드시에 타입을 지정해야 함.
    val name2: String
    name2 = "Swift"
    
    // 3. 문맥에 따라 val 변수가 1번만 초기화 되는 것이 맏다면 여러 값을 초기화(할당) 가능
    val name3: String
    
    if (isSuccess()) {
        name3 = "Android"
    } else {
        name3 = "ios"
    }
    println("name3 : $name3")
    
    // 4. 변수가 참조가 가리키는 객체의 내부 값을 변경이 가능
    val nameArray = arrayListOf("Kotlin")
    nameArray.add("Java")
    println("nameArray: $nameArray")
}
</code>
</pre>