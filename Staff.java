/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author USER
 */
public class Staff extends Employee {
    private String Address;
    private long Salary;

    public Staff(String Name, String Address, long Salary) {
        super(Name, Address, Salary);
    }
    
}
