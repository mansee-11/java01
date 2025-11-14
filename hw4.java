//single inheritance

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}
class Manager extends Employee {
    void attendMeeting() {
        System.out.println("Manager is attending a meeting");
    }
}
// multi level inheritance

class Person {
    void displayName() {
        System.out.println("Name: Aryan");
    }
}
class Student extends Person {
    void displayClass() {
        System.out.println("Class: 12th");
    }
}
class Monitor extends Student {
    void checkDiscipline() {
        System.out.println("Monitor is checking discipline");
    }
}

class Book {
    void read() {
        System.out.println("Reading a book");
    }
}
class Novel extends Book {
    void storyLine() {
        System.out.println("The novel has an interesting storyline");
    }
}
public class hw4 {
    public static void main(String[] agrs){
        // single inheritance
        Manager m = new Manager();
        m.work();
        m.attendMeeting();

        //multi level inheritance
        Monitor mon = new Monitor();
        mon.displayName();
        mon.displayClass();
        mon.checkDiscipline();

        // book
        Novel n = new Novel();
        n.read();
        n.storyLine();
    }
}
