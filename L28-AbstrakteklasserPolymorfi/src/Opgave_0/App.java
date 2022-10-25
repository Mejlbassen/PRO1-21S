package Opgave_0;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("John", 1980);
        Student s1 = new Student("Magnus", 1991, "Dansk");
        Instructor i1 = new Instructor("Maren", 1950, 3800.5);

        System.out.println("Person");
        System.out.println(p1.toString());
        System.out.println("*****");
        System.out.println("Student");
        System.out.println(s1.toString());
        System.out.println("*****");
        System.out.println("Instructor");
        System.out.println(i1.toString());
    }
}
