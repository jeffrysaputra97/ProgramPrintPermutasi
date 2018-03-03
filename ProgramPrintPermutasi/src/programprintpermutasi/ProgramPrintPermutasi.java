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

    private static ArrayList<Integer> inisialisasi(int jumlah) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data ke - " + (i+1) + ": ");
            result.add(scan.nextInt());
        }

        return result;
    }

    private static void switchContent(ArrayList<Integer> data, int index1, int index2) {
        int temp = data.get(index2);
        data.set(index2, data.get(index1));
        data.set(index1, temp);
    }

    private static void printPermutasi(ArrayList<Integer> data, int callerIndex) {
        for (int i = callerIndex; i < data.size(); i++) {
            if (callerIndex != data.size() - 1) {
                switchContent(data, callerIndex, i);                
                printPermutasi(data, callerIndex + 1);
                switchContent(data, callerIndex, i);

            } else {
                for (int print : data) {
                    System.out.print(print + " ");
                }
                System.out.println("");
            }
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

        ArrayList<Integer> listOfNumber = inisialisasi(n);

        System.out.println("\nHasil Permutasi: ");
        printPermutasi(listOfNumber, 0);
    }

}
