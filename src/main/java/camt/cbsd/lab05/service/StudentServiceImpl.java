package camt.cbsd.lab05.service;

import camt.cbsd.lab05.dao.StudentDao;
import camt.cbsd.lab05.dao.StudentDaoImpl;
import camt.cbsd.lab05.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    //String imageBaseUrl="http://localhost:3000/images/";
    @Autowired
    StudentDao studentDao;

    public List<Student> getStudents() {
        return studentDao.getStudents();
    }
    @Override
    public Student findById(long id){
        return studentDao.findById(id);
    }

}

