/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarstudikasus;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class BelajarStudiKasus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String npm,nama;
        Double Ips1, Ips2, Ips3;
        Double Ipk;
        
        System.out.println("Masukkan Npm : ");
        npm = input.nextLine();
        System.out.println("Masukkan Nama : ");
        nama = input.nextLine();
        
        System.out.println("Ips1 : ");
        Ips1 = input.nextDouble();
        
        System.out.println("Ips2 : ");
        Ips2 = input.nextDouble();
        
        System.out.println("Ips3 : ");
        Ips3 = input.nextDouble();
        
        Ipk = (Ips1 + Ips2 + Ips3)/ 3 ;
        System.out.println("Rata-rata Ipk : " + Ipk);
        
        Npm myobj = new Npm(); //itu dari konstruktor
        System.out.println( myobj.getGrade());
        
        /*if (Ipk >=0 && Ipk<=2.5){ 
        System.out.println("Tidak Memuaskan");
        } else if (Ipk >=2.6 && Ipk<=2.9){
        System.out.println("Memuaskan");
        } else if (Ipk >=3 && Ipk<=3.4){
        System.out.println("Sangat Memuaskan");
        } else {
        System.out.println("Dengan Pujian");
        }*/
        
        
        // TODO code application logic here
    }
    
}
