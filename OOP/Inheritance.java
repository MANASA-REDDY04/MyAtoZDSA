package OOP;

class Base{
    int x;
    Base(){
        System.out.println("I'am constructor invoked when new object is created");
    }
    public void setX(int x) {
        this.x = x;
//        x=x -> 0
    }

    public int getX() {
        return x;
    }
    public void printDetails(){
        System.out.println("I'am in base");
    }
}
class Derived extends Base{
    int y;
    Derived(){
        super();
        System.out.println("I'am base constructor");
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public void printDetails() {
        super.printDetails();
    }

    public void printDetails2(){
        super.printDetails();
        System.out.println("I'am in derived");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        b.setX(3);
        System.out.println(b.getX());
        b.printDetails();

        d.printDetails();
        d.printDetails2();
        d.setX(9);
        System.out.println(d.getX());
        d.setY(10);
        System.out.println(d.getY());
    }
}
