public class MultiLevel {
    void add() {
        int a=5,b=45;
        int sum=a+b;
        System.out.println("The sum of a and b is: " + sum);
    }
}
class ChildClass1 extends MultiLevel {
    void sub() {
        int a=30,b=5;
        int diff=a-b;
        System.out.println("The difference of a and b is: " + diff);
    }
}
class ChildClass2 extends ChildClass1 {
    void multiply() {
        int a=10,b=10;
        int mul=a*b;
        System.out.println("The multiplication of a and b is: " + mul);
    }
}
class TestMultilevel {
    public static void main(String[] args) {
        ChildClass2 c = new ChildClass2();
        c.add();
        c.sub();
        c.multiply();
    }
}
