package OOP;

/**
 * @author yangqee
 * @date 2022/6/29 9:04 下午
 */
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        this.name = name;

    }
    public void empAge(int empAge){
        age = empAge;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.print("Name:" +name);
        System.out.print("Age:"+age);
        System.out.print("Designation:"+ designation);
        System.out.print("salary:"+ salary);


    }
}
