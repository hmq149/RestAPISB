package springboot.RestAPISB.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot.RestAPISB.models.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController {

    // http://localhost:8080/students

    @GetMapping("/students")
    public Student getStudent() {
        return new Student("Quan","Hoang");
    }

    @GetMapping("/list-students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hoang","Quan"));
        students.add(new Student("Ngo","Minh"));
        students.add(new Student("Nguyen","Khoa"));
        students.add(new Student("Lam","Bao"));
        students.add(new Student("Nguyen","Tin"));
        return students;
    }

    // http://localhost:8080/students/1
    // @PathVariable annotation
    @GetMapping("/students/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName,lastName);
    }

}
