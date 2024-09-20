package OOP;

class Employee{
    private String name;
    private int rollno;
    public void setName(String empname){
        this.name = empname;
    }
    public void setRollno(int no){
        rollno = no;
    }
    public String getName() {return name;}
    public int getRollno() {return rollno; }
}
public class GettersSetters {
    public static void main(String[] args) {
        Employee e1 = new Employee();
//        e1.name = "manasa";
//        e1.rollno = 23 -> gives error due to private access modifier

        e1.setName("Manasa");
        e1.setRollno(23);
        System.out.println(e1.getName());
        System.out.println(e1.getRollno());
    }
}
