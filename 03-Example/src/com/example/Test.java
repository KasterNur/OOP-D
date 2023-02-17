/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import com.example.obj.Employee;
import com.example.obj.Manager;

/**
 *
 * @author k.nurmukan
 */
public class Test {
    
    public static void main(String args[])
    {
        System.out.println("hello");
        Employee emp = new Manager(100,"0001","SITE");
        System.out.println("the Employee:"+emp.getName()+" "+ emp.getSSN());
        
        emp.setName("Ali");
        System.out.println("now, the Employee get the Name, what is before? "+emp.getName()+" "+ emp.getSSN());
        //I can not change SSN because this design is not allowed get such method emp.setSSN(...
        
    }
}
