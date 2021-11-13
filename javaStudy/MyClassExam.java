package javaStudy;

public class MyClassExam {
    public static void main(String[] args) {
        // class가 가진 method를 사용하려면 먼저 객체(대명사)로 만들어야 한다.
        MyClass myclass = new MyClass(); // 여기서 myclass라는 객체(대명사, MyClass를 실행하는)를 하나 생성해낸 것.

        myclass.method1();

        myclass.method2(10); // MyClass의 method2를 보면 int값만 받는다고 명시. int만 처리 가능.

        int value = myclass.method3(); // "value"가 method3의 return값 받아낼 변수
        System.out.println("m3가 return한 값 " + value);

        myclass.method4(5, 10);

        int value2 = myclass.method5(55);
        System.out.println("m5가 return한 값: " + value2 );
    }

    public void method2(int x) {
        System.out.println(x + "을 이용한 m2 실행");
    }
}
