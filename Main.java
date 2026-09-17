public class Main {

    public static void main(String[] args) {

        Student student1 =
            new Student(101, "Vasundara", 23, "Java");

        Student student2 =
            new Student(102, "Anu", 24, "Computer Science");

        student1.displayStudent();

        System.out.println();

        student2.displayStudent();
    }
}