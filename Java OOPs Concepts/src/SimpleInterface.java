/*
An interface in java is a blueprint of a class. It has static constants and abstract methods.
The Interface in java is a mechanism to achieve abstraction. There can be only abstract methods in the java
interface, not method body. It is also used to achieve abstraction and multiple Inheritance in Java.
 */
interface SimpleInterface {
    void display(int id, String fname, String lname);
}
class UserDetail implements SimpleInterface {
    @Override
    public void display(int id, String fname, String lname) {
        System.out.println("Employee User Details");
        System.out.println("The Employee Id is: " + id);
        System.out.println("Employee First Name is: " + fname);
        System.out.println("Employee Last Name is: " + lname);
        System.out.println("Employee Full Name is: " + lname + ", " + fname);

    }
    public static void main(String[] args) {
        UserDetail ud = new UserDetail();
        ud.display(1001, "Vishal Raj", "Yuvaraj");
    }
}
