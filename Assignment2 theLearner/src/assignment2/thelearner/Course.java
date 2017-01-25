/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.thelearner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author c0689321
 */
public class Course {

    List<Student> students;

    public void Course() {
            students = new ArrayList<Student>();
    }

    public void Course(List<Student> students) {
           this.students=students;
    }

    public void add(Student students) {
      

    }

    public void remove(String id) {
       

    }

    public void remove(int position) {

    }

    public void insert(Student student, int position) {

    }

    public Student get(String id) {
        return null;
    }

    public Student get(int position) {
        return null;
    }

    public List<Student> getAll() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }

    public Set<Student> getAllGender(String gender) {
        return null;
    }

    public Map<String, Set<Student>> getGradeMap() {
        return null;
    }
}
