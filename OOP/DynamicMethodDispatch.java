package OOP;

class Phone{
    public void print(){
        System.out.println("phone");
    }
}
// run time polymorphism
class SmartPhone extends Phone{
    public void print(){
        System.out.println("Smart phone");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.print();
    }
}
