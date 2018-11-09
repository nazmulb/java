/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nazmulbasher
 */
public class EmployeeTest {
    public static void main(String args[]) {
        Employee empOne = new Employee("Nazmul Basher");
        Employee empTwo = new Employee("Tasfin Hasan");
        
        empOne.empAge(38);
        empOne.empDesignation("Head of Development");
        empOne.empSalary(10);
        empOne.printEmployee();
        
        empTwo.empAge(32);
        empTwo.empDesignation("Senior Software Eng");
        empTwo.empSalary(7);
        empTwo.printEmployee();
    }
}
