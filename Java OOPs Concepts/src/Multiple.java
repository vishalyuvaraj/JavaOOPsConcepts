/*
Multiple inheritance cannot be achieved in Java because it gives compile time error.
to overcome this problem interface concept is used. An aggregation is produced to overcome this error.
 */
public class Multiple {
    int sq(int n){
        return n*n;
    }
}

class Circle {
    Multiple mul;//aggregation
    double pi=3.14;

    double area(int radius) {
        mul = new Multiple();
        int rsq = mul.sq(radius);//code reusabillity
        return pi*rsq;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        double res = c.area(6);
        System.out.println(res);
    }
}