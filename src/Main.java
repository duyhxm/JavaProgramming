public class Main {
    public static void main(String [] args){
        A a3 = new C(3);
        a3.inc1();
        a3.inc2();
        a3.show();
    }
}
class A {
    protected int value;
    public A(int x) {
        this.value = x;
    }
    public A() {
        this(1);
    }
    public void inc1() { this.value += 1;
    }
    public void inc2() { this.value += 2;
    }
    public final void show() { System.out.print(this.value);
    }
}
class B extends A {
    public void inc2() {
    this.inc1(); this.value += 2;
    }
}
class C extends B {
    public C(int y) {
    this.value += y;
    }
    public void inc1() {
        this.value += 4;
    }
    public void inc2() {
        super.inc2();
        super.inc1();
    }
}





