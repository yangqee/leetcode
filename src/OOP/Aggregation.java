/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOP;
import java.io.*;
import java.util.*;

/**
 *
 * @author tony
 */
public class Aggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");
        
        List <Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);
        
        
        List <Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);
        
        
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
        
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
        
        
        Institute institute = new Institute("BITS", departments);
        
        System.out.print("Total students in institute:");
        System.out.print(institute.getTotalStudentsInInstitute());
        
        
             
        
    }
    
}
