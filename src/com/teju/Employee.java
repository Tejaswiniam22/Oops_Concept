package com.teju;

public class Employee extends Person{
    private int empCode;
    private String designation;
    private float salary;

    public Employee(int empCode, String designation, float salary) {
        this.empCode = empCode;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee(String name, int age, Address address, int empCode, String designation, float salary) {
        super(name, age, address);
        this.empCode = empCode;
        this.designation = designation;
        this.salary = salary;
    }

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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void applyForLeave(){
        System.out.println("Please grant me a leave");
    }


    public void displayInfo(){
        super.displayInfo();
        System.out.println("com.teju.Employee code:" +empCode);
        System.out.println("Designation:" +designation);
        System.out.println("salary:" +salary);
    }
}
