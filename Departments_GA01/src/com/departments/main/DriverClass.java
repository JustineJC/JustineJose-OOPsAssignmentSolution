package com.departments.main;
import com.departments.model.AdminDepartment;
import com.departments.model.HrDepartment;
import com.departments.model.TechDepartment;

public class DriverClass {
    
    public static void main(String[] args) throws Exception {
       //Below class are invoked by creating respective objects
        AdminDepartment admin = new AdminDepartment();
        HrDepartment hr = new HrDepartment();
        TechDepartment tech = new TechDepartment();
      //Calling the methods of AdminDepartment class
        admin.departmentName();
        admin.getTodaysWork();
        admin.getWorkDeadline();
        admin.isTodayAHoliday();

        System.out.println();
        System.out.println();
      //Calling the methods of HrDepartment class 
        hr.departmentName();
        hr.doActivity();
        hr.getTodaysWork();
        hr.getWorkDeadline();
        hr.isTodayAHoliday();

        System.out.println();
        System.out.println();
      //Calling the methods of TechDepartment class
        
        tech.departmentName();
        tech.getTodaysWork();
        tech.getWorkDeadline();
        tech.getTechStackInformation();
        tech.isTodayAHoliday();


    }
}
