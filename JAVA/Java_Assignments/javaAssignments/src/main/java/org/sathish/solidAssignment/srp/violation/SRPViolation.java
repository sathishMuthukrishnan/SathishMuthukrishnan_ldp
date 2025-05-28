package org.sathish.solidAssignment.srp.violation;

class Employee {
    private String name;
    private double  salary;
public Employee(String name, double salary){
    this.name=name;
    this.salary=salary;
}
public double calculateSalary(){
    return salary * 1.2;
}
public void generateReport(){
    System.out.println("Generating employee report ...");

}}

public class SRPViolation {

    public static void main(String[] args) {
        Employee emp =new Employee("sathish", 10000);
        System.out.println("Salary :"+ emp.calculateSalary());
        emp.generateReport();
    }
}




