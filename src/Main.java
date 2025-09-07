//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("Ana", 9.0));
        manager.addStudent(new Student("Igor", 6.5));
        manager.addStudent(new Student("Carlos", 7.5));
        manager.addStudent(new Student("Bruna", 5.0));
        manager.addStudent(new Student("Marcos", 8.5));

        System.out.println("---- ALL ----");
        manager.showAll();

        System.out.println("\n---- APPROVED ----");
        manager.getApprovedStudents().forEach(System.out::println);

        System.out.println("\n---- NAMES UPPERCASE ----");
        manager.getNamesUppercase().forEach(System.out::println);

        System.out.println("\n---- AVERAGE ----");
        System.out.println(manager.getAverageGrade());

        System.out.println("\n---- BETTER STUDENT ----");
        manager.getTopStudent().ifPresent(System.out::println);

        System.out.println("\n---- WORST STUDENT ----");
        manager.getWorstStudent().ifPresent(System.out::println);

        System.out.println("\n---- ORDERED BY GRADE || ASC ----");
        manager.getStudentsSortedByGrade().forEach(System.out::println);
    }
}