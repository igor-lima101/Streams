import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentManager {

    private List<Student> list = new ArrayList<>();

    public void addStudent(Student student){
        list.add(student);
    }

    public List<Student> getApprovedStudents(){
        return list.stream()
                .filter(student ->  student.getGrade() > 6)
                .collect(Collectors.toList());
    }

    public List<String> getNamesUppercase(){
        return list.stream()
                .map(student -> student.getName().toUpperCase())
                .collect(Collectors.toList());
    }

    public double getAverageGrade(){
        return list.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public Optional<Student> getWorstStudent() {
        return list.stream()
                .min(Comparator.comparingDouble(Student::getGrade));
    }

    public Optional<Student> getTopStudent() {
        return list.stream()
                .max(Comparator.comparingDouble(Student::getGrade));
    }

    public List<Student> getStudentsSortedByGrade() {
        return list.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade))
                .collect(Collectors.toList());
    }

    public void showAll() {
        list.forEach(System.out::println);
    }

}
