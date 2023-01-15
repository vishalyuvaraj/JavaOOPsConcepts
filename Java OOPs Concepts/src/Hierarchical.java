public class Hierarchical {
    void add() {
            int a=5,b=45;
            int sum=a+b;
            System.out.println("The sum of a and b is: " + sum);
    }
}
class ChildClass3 extends Hierarchical {
    void sub() {
        int a=30,b=5;
        int diff=a-b;
        System.out.println("The difference of a and b is: " + diff);
    }
}
class ChildClass4 extends Hierarchical {
    void multiply() {
        int a=10,b=10;
        int mul=a*b;
        System.out.println("The multiplication of a and b is: " + mul);
    }
}
class TestHierarchical {
    public static void main(String[] args) {
        ChildClass4 c = new ChildClass4();
        c.add();
        //c.sub();
        c.multiply();
    }
}

