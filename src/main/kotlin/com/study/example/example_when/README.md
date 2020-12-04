<h4> 자바에서의 switch case </h4>
 
switch-case 의 최대 단점으로 생각 했던 것 은
조건 당 걸리는 break 가 누락 된다면, 의도치 않은 아래의 case 까지 경유 하는 부분. 
(이로 인해서 간단한 소스코드 에서는 별 문제가 없겠지만, 거대한 소스일 경우 찾기 힘들정도의 에러를 뱉어낼 수 있다.)

Java code
~~~
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
~~~
  
      
    