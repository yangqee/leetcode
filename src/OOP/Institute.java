/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;
import java.io.*;
import java.util.*;
/**
 *
 * @author tony
 */
public class Institute {
    String instituteName;
    private List<Department> departments;
    
    Institute(String instituteName, List<Department> departments){
        this.instituteName = instituteName;
        this.departments = departments;
    }
    
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students;
        for(Department dept : departments)
        {
            students = dept.getStudents();
            for(Student s : students)
            {
                noOfStudents++;
               
            }
            
            
        }
        return noOfStudents;
    }   

}
