
package KolektorNilai;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah = Integer.parseInt(in.nextLine());
        Mahasiswa a[] = new Mahasiswa[jumlah];
        in.nextLine();
        for(int i = 0; i < jumlah; i++){
            String nama = in.nextLine();
            int nilai = Integer.parseInt(in.nextLine());
            a[i] = new Mahasiswa(nama,nilai);
        }
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - i - 1; j++) {
                if (a[j].getNilai() < a[j+1].getNilai()) {
                    Mahasiswa temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print("Urutan berdasarkan score (highest to lowest): [");
        for(int i = 0 ; i < jumlah; i++){
            System.out.print(a[i]);
            if(i != jumlah-1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println();
        System.out.println("Mahasiswa dengan nilai terendah: Student{name='" + a[jumlah-1].getNama() + "', score=" + a[jumlah-1].getNilai() + "}");
        System.out.println();
        System.out.println("Mahasiswa dengan nilai tertinggi: Student{name='" + a[0].getNama() + "', score=" + a[0].getNilai() + "}");
        System.out.println();
        System.out.print("Reversed list berdasarkan nilai (lowest to highest): [");
        for(int i = jumlah-1 ; i >= 0; i--){
            System.out.print(a[i]);
            if(i != 0) System.out.print(", ");
        }
        System.out.print("]");
    }
}