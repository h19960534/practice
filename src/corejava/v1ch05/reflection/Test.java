package v1ch05.reflection;

class Same {
    public void C() {
        this.A();//实际为this.A()
        B();//实际为same.B()

    }
    public void B () {
        System.out.println("B正在运行");
    }
    public void A() {
        System.out.println("A正在运行");
    }
}

public class Test {
    public static void main(String[] args) {
        Same wode = new Same();
        wode.C();
    }

}