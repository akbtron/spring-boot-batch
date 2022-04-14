package com.share.processor;

import com.share.model.Student;
import org.springframework.batch.item.ItemProcessor;


public class StudentProcessor implements ItemProcessor<Student, Student> {


    @Override
    public Student process(Student student) throws Exception {

        final String firstName = student.getFirstName().toUpperCase();
        final String lastName = student.getLastName().toUpperCase();
        final Student data =  new Student(student.getId(),firstName,lastName,student.getEmail());
        return data;
    }
}
