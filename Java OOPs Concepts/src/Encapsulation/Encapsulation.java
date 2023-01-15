package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1001);
        emp.setFname("Vishal Raj");
        emp.setLname("Yuvaraj");
        System.out.println("The Employee Id is: " + emp.getId());
        System.out.println("Employee Full Name is: " + emp.getLname() + ", " + emp.getFname());
    }
}
