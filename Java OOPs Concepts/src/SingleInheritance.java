public class SingleInheritance {
    void add(){
        int a=5,b=20;
        int sum=a+b;
        System.out.println("The sum of a and b is: " + sum);
    }
}
class ChildClass extends SingleInheritance {
    void sub() {
        int a = 20,b=15;
        int diff=a-b;
        System.out.println("The difference of a and b is: " + diff);
    }
}
class Test {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.add();
        c.sub();
    }
}
