/*
A class which is declared as abstract is known as an abstract class.
It can have abstract and non-abstract methods
 */
//Abstract class that has an abstract method.
abstract class Abstraction {
    abstract void display(String fname, String lname);
}
class UserEmployee extends Abstraction {
    void display(String fname, String lname) {
        System.out.println("Employee First Name is: " + fname);
        System.out.println("Employee Last Name is: " + lname);
        System.out.println("Employee Full Name is: " + lname + ", " + fname);
    }
    public static void main(String[] args) {
        Abstraction ab = new UserEmployee();
        ab.display("Vishal Raj", "Yuvaraj");
    }
}
