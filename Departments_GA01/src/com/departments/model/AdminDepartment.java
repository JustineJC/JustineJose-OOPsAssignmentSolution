package com.departments.model;

  //Creating AdminDepartment and its methods to display as below
public class AdminDepartment extends SuperDepartment {
   
    public void departmentName(){
        System.out.println("Welcome to Admin Department");
    }
    public void getTodaysWork(){
        System.out.println("Complete your documents Submission");
    }
    public void getWorkDeadline(){
        System.out.println("Complete by EOD");
    }
}
