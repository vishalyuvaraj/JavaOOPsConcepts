package Polymorphism;
/*
If subclass has the same method as declared in parent class, it is known as method overriding in Java.
 */
public class MethodOverriding {
    void add(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
    }
}
class Child extends MethodOverriding {
    void add(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
    }
}

class main {
    public static void main(String[] args) {
        MethodOverriding m = new MethodOverriding();
        m.add(5,5);
        MethodOverriding c = new Child();
        c.add(10,10);
    }
}
