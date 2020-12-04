<h3> Kotlin - when expression </h3>


 
<h5>1. Java 에서의 switch case 구문</h5>
switch-case 의 최대 단점으로 생각 했던 것 은
조건 당 걸리는 break 가 누락 된다면, 의도치 않은 아래의 case 까지 경유 하는 부분. 
(이로 인해서 간단한 소스코드 에서는 별 문제가 없겠지만, 거대한 소스일 경우 찾기 힘들정도의 에러를 뱉어낼 수 있다.)

<pre>
<code>
// case 1
int value = 0;
switch (value) {
    case 0:
        System.out.println("0");
        break;
    case 1:
        System.out.println("1");
        break;
    default:
        System.out.println("default");
        break;
}

// case 2
int value = 0;
switch (value) {
    case 0:
    case 1:
        System.out.println("1");
        break;
    default:
        System.out.println("default");
        break;
}
</code>
</pre>
물론 위 처럼 의도적으로 break 를 누락시켜 특정 케이스에서 소스코드를 줄일 수 있는 장점도 분명히 존재하는 부분이다.

<h5>2. Kotlin 의 When expression</h5>
정말 간결해졌다, 코드 라인 수 가 눈에 띄게 감소하였다.
when expression 에서 기존 자바의 switch-case 에서 사용하였던 의도적인 break 누락은 아래와  같다.
<pre>
<code>
// case 1
val = 0
when (val) {
    0 -> print("0")
    1 -> print("1")
    2 -> print("2")
}

// case 2
val = 0
when (val) {
    0, 1 -> print("0 and 1")
    2 -> print("2")
}
</code>
</pre>
switch-case 구문에서 조건 당 붙게되는 case 키워드를 확연히 줄여 보일러플레이트 코드를 감소 시킬 수 있고,
이는 곧 코드의 가독성 증가로 직결된다.
    