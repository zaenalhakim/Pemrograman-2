/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menentukannilai;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MenentukanNilai {

   
    public static void main(String[] args) {
        int DataNilai = 8;
        Scanner input;
        input = new Scanner(System.in);

        int Data[] = new int[DataNilai];
        System.out.println("");
        System.out.print("Masukan 8 bilangan yang ingin di lihat :");
    
        for (int i = 0; i < DataNilai; i++) {
            Data[i] = input.nextInt();
        }
         for (int x = 0; x < DataNilai - 1; x++) {
            for (int i = 0; i < DataNilai - 1; i++) {
                if (Data[i] < Data[i + 1]) {
                    int j = Data[i];
                    Data[i] = Data[i + 1];
                    Data[i + 1] = j;
                    
        }

    }
    
}
     
         System.out.println(" Menghasilkan 3 nilai terbesar :");
         System.out.println(Data[0]+ " " +Data[1] +" " +Data[2]);
         System.out.println("Haturnuhun");
       
    }
}