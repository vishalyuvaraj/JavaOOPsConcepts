public class Inheritance {
    int a=5;
    int b=10;
    int sum=a+b;
}
class subClass extends Inheritance{
    String s1 = "The sum of a and b is ";
    public static void main(String[] args){
        subClass s = new subClass();
        System.out.println(s.s1 + s.sum);
    }
}
