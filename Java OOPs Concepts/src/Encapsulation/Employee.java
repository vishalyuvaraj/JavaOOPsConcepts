package Encapsulation;
/*
Purpose of Encapsulation in Java is to protect or hide the code for others and code maintainability.
It is the process of wrapping code and data together into a single unit.
 */
public class Employee {
    private int id;
    private String fname;
    private String lname;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
}
