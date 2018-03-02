/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programprintpermutasi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jeffr
 */

public class ProgramPrintPermutasi {

    /**
     * @param args the command line arguments
     */
    private static Scanner scan = new Scanner(System.in);
    
    private static int[] inisialisasi(int jumlah){
        int[] result = new int[jumlah];
        int angka;
        
        for (int i = 0; i < result.length; i++) {
            System.out.print("Masukkan angka ke - " + i + ": ");
            result[i] = scan.nextInt();
        }
        
        return result;
    }
    
//    , int index
    
    private static void printPermutasi(int[] data, int indexNow, int indexSwitch){
        int temp = data[indexSwitch];
        
        data[indexSwitch] = data[indexNow];
        data[indexNow] = temp;
        
        if (indexSwitch == data.length - 1) {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i] + " ");
            }
        } else {
            printPermutasi(data, indexNow, indexSwitch + 1);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            input N (jumlah objek angka yang akan dilakukan permutasi
            isi kumpulan dari objek angka sebanyak N data
            tampilkan seluruh kemungkinan permutasi
        */
        int n;
        
        System.out.print("Masukkan jumlah data: ");
        n = scan.nextInt();
        
        int[] listOfAngka = inisialisasi(n);
        
        printPermutasi(listOfAngka, 0, 0);
    }
    
}
