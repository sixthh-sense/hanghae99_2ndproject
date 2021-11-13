package pkg;
// package경로가 pkg와 같다.

public class ModifierTest {

    private void messageInside() {
        System.out.println("This is private modifier");
    }
    // private은 같은 class 안에서만 접근을 허용하는 "접근제어자"

    public void messageOutside() {
        System.out.println("This is public modifier");
        messageInside();
        // 13줄의 messageInside와 6줄의 messageInside는 당연히 서로 접근 가능
    }

    protected void messageProtected() {
        System.out.println("This is protected modifier");
    }

    void messagePackagePrivate() {
        System.out.println("This is package private modifier");
    }

}
