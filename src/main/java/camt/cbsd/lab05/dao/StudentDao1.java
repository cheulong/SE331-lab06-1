package camt.cbsd.lab05.dao;

import camt.cbsd.lab05.entity.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Profile("firstDataSource")
@ConfigurationProperties(prefix = "server")
@Repository
public class StudentDao1 extends AbstractStudentDao implements StudentDao {
//    List<Student> students;
//    String baseUrl;
//    String imageUrl;
//
//    public void setBaseUrl(String baseUrl) {
//        this.baseUrl = baseUrl;
//    }
//
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
   String imageBaseUrl;
    @PostConstruct
    private void init(){
        imageBaseUrl=baseUrl+imageUrl;
        students=new ArrayList<>();
        Student student = new Student(4, "SE-004", "Mitsuha", "Miyamizu",
                2.15, imageBaseUrl+"mitsuha.gif", true, 0,
                "The most beloved one");
        students.add(student);
        student = new Student(5, "SE-005", "Prayuth", "The minister",
                3.59, imageBaseUrl+"tu.jpg", false, 15,
                "The great man ever!!!!");
        students.add(student);
        student = new Student(6, "SE-006", "Jurgen", "Kloop",
                2.15, imageBaseUrl+"Kloop.gif", true, 2,
                "The man for the Kop");
        students.add(student);
    }
//    @Override
//    public List<Student> getStudents(){
//        return students;
//    }
//    @Override
//    public Student findById(long id){
//        return students.stream().filter(s->s.getId()==id).findFirst().get();
//    }
}
