package Polymorphism;
/*
Polymorphism- poly means many and morphism means forms so polymorphism refers to many forms.
There are 2 types of polymorphism
1.Method Overloading:
    In a class has multiple methods having same name but different parameters, it is known as Method Overloading.
2.Method Overriding
 */
public class MethodOverLoading {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
    int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }
}
class OverloadingPolymorphism {
    public static void main(String[] args) {
        MethodOverLoading m = new MethodOverLoading();
        System.out.println("Adding of 2 operand is: " + m.add(5,5));
        System.out.println("Adding of 3 operand is: " + m.add(10,10, 10));
        System.out.println("Adding of 4 operand is: " + m.add(15,15,15,15));
    }
}
