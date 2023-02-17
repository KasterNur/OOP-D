/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.obj;

/**
 *
 * @author k.nurmukan
 */
public class Employee {
    private int emp_Id;
    private String name;
    private double salary;
    private String SSN;

    public Employee(int emp_Id, String SSN) {
        this.emp_Id = emp_Id;
        this.SSN = SSN;
    }
// it is not allowed in our case (see reference in PPT , be carfull 
//    public void setEmp_Id(int emp_Id) {
//        this.emp_Id = emp_Id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

 

    public int getEmp_Id() {
        return emp_Id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSSN() {
        return SSN;
    }
    
    
    
}
