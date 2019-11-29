package TextbookExamples;


public class Person {
    Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person("Peter");
        Student student = new Student("Susan");
        Employee employee = new Employee("Eva");
        Faculty faculty = new Faculty("Frank");
        Staff staff = new Staff("Shane");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

    }

    String name;
    String address;
    int phoneNumber;
    String emailAddress;
}

class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

class Employee extends Person {
    String office;
    int salary;
    java.util.Calendar dateHired;

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

class Faculty extends Employee {
    String officeHours;
    String rank;

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

class Staff extends Employee {
    String title;

    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}