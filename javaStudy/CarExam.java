package javaStudy;

public class CarExam {
    public static void main(String[] args) {
        // 객체는 대명사다.
        Car c1 = new Car(); // 변수 c1은 참조 변수. 참조 조 변수.(명령어)
        Car c2 = new Car();
        Car car = new Car();
        car.run();

        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 1111;

        System.out.println(c1.name);
        System.out.println(c1.number);
        System.out.println(c2.name);
        System.out.println(c2.number);






        /* Car c = new Car(); // c라는 것을 Car의 object로 정했다(객체화).
        // 여기서의 Car은 class명칭으로 컴퓨터가 알아들었다. c라는 건 Car class에 표시된 기능을 수행하는 것인가?
        // <Car.java 참고할 것>
        //  Car 객체를 담기 위한 변수의 타입은 Car타입이어야 한다.
        // 정수를 담을 때는 int, 문자를 담을 때는 String 타입 선언. Integer 등등도 마찬가지.
        c.print(); // c를 print하라고 명령했다.
        앞에서 풀었던 문제라서 주석 처리 */
    }

}


