package com.departments.model;

//Creating HrDepartment and its methods to display as below
public class HrDepartment extends SuperDepartment{
    public void departmentName(){
        System.out.println("Welcome to HR Department");
    }
    public void getTodaysWork(){
        System.out.println("Fill today's worksheet and mark your attendance");
    }
    public void getWorkDeadline(){
        System.out.println("Complete by EOD");
    }
    public void doActivity(){
        System.out.println("team Lunch");
    }
}
