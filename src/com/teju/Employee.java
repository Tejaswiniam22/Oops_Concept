package com.teju;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private int empCode;
    private String designation;
   // private float salary;

    String name;
    String role;
    double salary;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Employee( String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    //    public Employee(int empCode, String designation, float salary) {
//        this.empCode = empCode;
//        this.designation = designation;
//        this.salary = salary;
//    }

//    public Employee(String name, int age, Address address, int empCode, String designation, float salary) {
//        super(name, age, address);
//        this.empCode = empCode;
//        this.designation = designation;
//        this.salary = salary;
//    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void applyForLeave(){
        System.out.println("Please grant me a leave");
    }


    public void displayInfo(){
        //super.displayInfo();
        System.out.println("com.teju.Employee code:" +empCode);
        System.out.println("Designation:" +designation);
        System.out.println("salary:" +salary);
    }


    public static void sorting(){
        List<Employee> employee = Arrays.asList(new Employee("Rahul", 120000.0),new Employee("Teju", 300000.0));
        List<Employee> dev= employee.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(dev);
    }

    public String toString()
    {
        return "{ Salary " +getSalary()+ " and name is " +getName() + "}";
    }
}
