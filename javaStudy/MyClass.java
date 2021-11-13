package javaStudy;
// public 리턴형 메서드명 (매개변수들) { 필요한 기능 구현 }
// return형이 없을 땐 void 예약어 적어주기(return형이 "없다"는 뜻)

public class MyClass {

    public void method1() {
        System.out.println("m1 실행");
    }

    public void method2(int x){
        System.out.println(x + "을 이용한 m2 실행");
    }

    public int method3() {
        System.out.println("m3 실행");
        return 10; // 여기는 int라고 써줬으니까 return값도 써주기
        // 얘처럼 값을 return하는 method를 실행할 때는 return값 받아낼 변수 필요
    }

    public void method4(int x, int y) {
        System.out.println(x + y + "m4 실행");
    }

    public int method5(int y) {
        System.out.println((y + "이용한 m5 실행"));
        return y*2;
    }



    public int myMethod(int value) {
        return value;

        /* public(접근제한자) int(return형) myMethod(method명)(int value: 매개변수들) { 실행할 코드들, return할 반환값 return value; } */

    }
}
