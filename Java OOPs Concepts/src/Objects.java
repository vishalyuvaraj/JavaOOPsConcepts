//An instance of class is known as Object. The Object has state and behavior
public class Objects {
    void display(){
        int a=5;
        int b=5;
        int sum=a+b;
        System.out.println("The sum is " + sum);
    }
    public static void main(String[] args){
        Objects ob = new Objects();
        ob.display();
    }
}
