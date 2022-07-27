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
public class Department {
    String name;
    private List<Student> students;
    Department(String name, List<Student> students){
        this.name = name;
        this.students = students;
        
    }
    
    public List<Student> getStudents(){
        return students;
    }
  
}
