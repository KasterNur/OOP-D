/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.obj;

/**
 *
 * @author k.nurmukan
 */
public class Manager extends Employee {
    private String dep_Name;
    
    /*
      emp_id,
    SSN,
    dep_name
    */
    public Manager(int emp_Id, String SSN, String dep_name) {
        super(emp_Id, SSN);
        this.dep_Name = dep_name;
    }

    public String getDep_Name() {
        return dep_Name;
    }

    public void setDep_Name(String dep_Name) {
        this.dep_Name = dep_Name;
    }
    
}
