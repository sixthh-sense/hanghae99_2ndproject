package javaStudy;

public class StringExam {
    public static void main(String[] args){
        // String 타입을 선언할 때만큼은 따로 new를 선언할 필요X 인기 1위의 위엄?
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");
        // new를 사용하지 않으면 똑같은 문자열일 경우 같은 메모리 공간 사용
        // str1와 str2은 같은 문자열을 참조하게 되는 것. 같은 reference.
        // new를 사용하면 같은 문자열이어도 매번 메모리에 새롭게 할당
        // String 클래스는 다른 클래스와 다르게 new 사용하지 않고 사용 가능
        // 메모리 절약 목적으로는 되도록 new 사용 줄이기

        // new keyword로 instance를 만들면 상수 영역 참조X
        // 무조건 heap 메모리 영역에 새로 만듦.
        // heap 메모리 영역이란, 할당해야 할 메모리의 크기를 프로그램을 실행하는 동안
        // 결정해야 하는 경우 (런타임 때) 유용하게 사용되는 공간.
        // 기본 데이터 타입은 항상 크기가 동일하지만,
        // 객체들은 생성시에 크기가 다를 수 있으니 힙에 생성.

        if ( str1 == str2)
            // 비교 연산자 ==은 기본형인 경우 두 값이 같은지를 경우,
            // 참조형인 경우 값을 비교x 대신 가리키는 주소(메모리 영역의 주소) 비교
            System.out.println("str1과 str2는 같은 reference입니다.");

        if ( str3 == str4)
            System.out.println("str3과 str4는 같은 reference입니다.");
    }
}
