package constructortopic;

import java.sql.SQLOutput;

public class EmployeeClass {
    String empName;
    String empID;
    String location;
    int empSalary;
    String empDesignation;
    static final String companyName = "Google";

//    public EmployeeClass(String empName, String empID) {
//        this.empName = empName;
//        this.empID = empID;
//    }
//    private EmployeeClass(){
//
//    }

//    public EmployeeClass(String empName, int empSalary, String empID) {
//        this.empName = empName;
//        this.empSalary = empSalary;
//        this.empID = empID;
//    }
//
//
//    public EmployeeClass(String empName, String empID, String location, int empSalary, String empDesignation) {
//        this.empName = empName;
//        this.empID = empID;
//        this.location = location;
//        this.empSalary = empSalary;
//        this.empDesignation = empDesignation;
//    }
    public String login(){
        System.out.println("Enter Employee Name: "+empName);
        System.out.println("Enter Employee ID: "+empID);
        return companyName;

    }

    public int getEmpSalary(String empName, String empID, int empSalary){
        System.out.println("Enter Employee Name: "+empName);
        System.out.println("Enter Employee ID: "+empID);
        return empSalary + empSalary/2;
    }

    public static void main(String[] args) {
//        EmployeeClass emp1 = new EmployeeClass("John", "ID123");
//        String login = emp1.login();
//        System.out.println(login);
//       // int newSalary = emp1.getEmpSalary("john");
       // System.out.println(newSalary);
        //EmployeeClass emp2 = new EmployeeClass("Rechal",100000,"ID123");
        //int newSalary = emp2.getEmpSalary();
        //System.out.println(newSalary);
       String s = companyName;
       EmployeeClass emp3 = new EmployeeClass();
        int newSalary = emp3.getEmpSalary("kalki","Kalki123",12300);
        System.out.println(newSalary);


    }
}
