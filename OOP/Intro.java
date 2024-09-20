package OOP;

class Student{
        String name;
        int age;

        void printDetails(){
            System.out.println("My name is "+this.name+" and i'am "+this.age);
        }
}

public class Intro {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "manasa";
        s1.age = 20;
        s1.printDetails();
    }
}

