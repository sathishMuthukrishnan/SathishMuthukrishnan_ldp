package org.sathish.solidAssignment.srp.correct;

public class SRPCorrect {

    // Employee class
    static class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }

        public String getName(){
            return name;
        }

        public double getSalary(){
            return salary;
        }
    }

    //SalaryCalculator class - handles calculation logic
    static class SalaryCalculator {
        public double calculateSalary(Employee employee) {
            return employee.getSalary() * 1.2;
        }
    }

    //ReportGenerator class - handles report logic
    static class ReportGenerator {
        public void generateReport(Employee employee) {
            System.out.println("Generating report for employee:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Base Salary: " + employee.getSalary());
        }
    }


    public static void main(String[] args) {
        Employee emp = new Employee("Sathish", 10000);

        SalaryCalculator calculator = new SalaryCalculator();
        ReportGenerator reporter = new ReportGenerator();

        double calculatedSalary = calculator.calculateSalary(emp);
        System.out.println("Calculated Salary: " + calculatedSalary);

        reporter.generateReport(emp);
    }
}
