 class Employee {
private String name;
private int Employeeid;
private double Salary;


public int getEmployeeid1() {
    return Employeeid;
}
public String getname1(){
    return name;
}
public double getsalary1(){
    return Salary;
}

public void setEmployeeid1(int empid) {
    Employeeid = empid;
}
public void setname1(String n){
name=n;
}
public void setsalary1(double s){
    Salary=s;
}

void displayemployeedetail(){
    System.out.println("Employee id: "+Employeeid+" Name: "+name+" Salary: "+Salary);
}
}

/**
 * Employees
 */
public class Employees {

    public static void main(String[] args) {
        Employee firstEmployee=new Employee();
       firstEmployee.setEmployeeid1(22);
       firstEmployee.setname1("wasif");
       firstEmployee.setsalary1(20000);
     firstEmployee.displayemployeedetail();
    
    }
}