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
public class EmployeeActvi {

    
    public static void main(String[] args) {
        Employee Manager = new Manager("Ujang", "Antapani Kidul", 7500000 );
        Employee staff1 = new Staff("Tatang", "Cibiru", 4500000);
        Employee staff2 = new Staff("Alexandria", "Dago ", 5400000);

        System.out.println("Nama Manager    : " + Manager.getName());
        System.out.println("Alamat Rumah    : " + Manager.getAddress());
        System.out.println("Gaji Manager    : " + Manager.getSalary());
        System.out.println("");

        System.out.println("Nama Staff      : " + staff1.getName());
        System.out.println("Alamat Rumah    : " + staff1.getAddress());
        System.out.println("Gaji Staff      : " + staff1.getSalary());
        System.out.println("");

        System.out.println("Nama Staff      : " + staff2.getName());
        System.out.println("Alamat Rumah    : " + staff2.getAddress());
        System.out.println("Gaji Staff      : " + staff2.getSalary());
    }
    
}
