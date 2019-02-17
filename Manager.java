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
public class Manager extends Employee {
    private long Bonus;

    public Manager(String Name, String Address, long Salary) {
        super(Name, Address, Salary);
        this.Bonus = Bonus;
    }

    public long getBonus() {
        return Bonus;
    }

    public void setBonus(long Bonus) {
        this.Bonus = Bonus;
    }

    @Override
    public long getSalary() {
        return super.getSalary(); 
    }
    
}
