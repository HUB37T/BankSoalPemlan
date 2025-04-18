package BarokahMart;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String toko = input.nextLine();
        int jlh = input.nextInt();
        double cleaning = 0;
        double tool = 0;
        double total = 0;
        int valid = 0;
        int invalid = 0;
        String[] nama = new String[jlh];
        double[] harga = new double[jlh];
        Mart a[] = new Mart[jlh];
        input.nextLine();
        for (int i = 0; i < jlh; i++) {
            String isi = input.nextLine();
            String tes[] = isi.split(" ");
            switch(tes[0]){
                case "Cleaning":
                    double harga1 = Integer.parseInt(tes[2]);
                    int stok = Integer.parseInt(tes[3]);
                    if(tes[4].substring(0,2).equals("CL")){
                        valid++;
                        cleaning += harga1 * stok * 0.9;
                        nama[i] = tes[1];
                        harga[i] = harga1 * stok * 0.9;
                        a[i] = new Cleaning(tes[1],harga1,stok,tes[4]);
                    }
                    else if(!tes[4].substring(0,2).equals("CL")){
                        invalid++;
                        a[i] = new Cleaning(tes[1],harga1,stok,tes[4]);
                    }
                    break;
                case "Tool":
                    double harga2 = Integer.parseInt(tes[2]);
                    int stok2 = Integer.parseInt(tes[3]);
                    if(tes[4].substring(0,2).equals("TL")){
                        valid++;
                        tool += (harga2+100) * stok2;
                        nama[i] = tes[1];
                        harga[i] = (harga2+100) * stok2;
                        a[i] = new Tool(tes[1],harga2,stok2,tes[4]);
                    }
                    else if(!tes[4].substring(0,2).equals("CL")){
                        invalid++;
                        a[i] = new Tool(tes[1],harga2,stok2,tes[4]);
                    }
                    break;
            }
        }
        System.out.println("Distributor: "+ toko);
        System.out.println();
        total = cleaning + tool;
        for (int i = 0; i < jlh; i++) {
            System.out.println(a[i]);
            System.out.println();
        }
        System.out.println("Valid products: "+valid);
        System.out.println("Invalid products: "+invalid);
        System.out.println();

        System.out.println("Total stock value: Rp "+total);

        System.out.println();

        System.out.println("Most valuable product:");
        String max = "";
        double max1 = 0;
        for (int i = 0; i < jlh; i++) {
            if (harga[i] > max1) {
                max1 = harga[i];
                max = nama[i];
            }
        }
        System.out.println(max +" Rp " + max1);

        System.out.println();

        System.out.println("Total stock by category:");
        System.out.println("Cleaning: Rp "+cleaning);
        System.out.println("Tool: Rp "+tool);
    }
}
