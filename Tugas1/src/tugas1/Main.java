/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author WXO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pil = 1;
        
        // TODO code application logic here
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("+-----------------------------+");
        System.out.println("|  Program Konversi Suhu Air  |");
        System.out.println("+-----------------------------+");
        
        Konversi data = new Konversi(Input_data(key));
        
        while(pil != 3){
            
            System.out.println("\nOpsi");
            System.out.println("----");
            System.out.println("1. Lihat data konversi");
            System.out.println("2. Edit data konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            pil = key.nextInt();
            
            switch(pil){
                case 1 : tampil(data);break;
                case 2 : data.celcius = Input_data(key); break;
                default: System.out.println("Opsi tidak ada, Mohon masukan opsi dengan benar!");
            }
        } 
        
        
    }
    
    static Double Input_data(Scanner key){
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu dalam Celcius\t: "); 
        return key.nextDouble();
        
    } 
    
    static void tampil(Konversi data){
        System.out.println("Suhu dalam Celcius\t: " + data.celcius);
        data.fahrenheit();
        System.out.println("Suhu dalam Fahrenheit\t: " + data.fahrenheit);
        data.reamur();
        System.out.println("Suhu dalam Reamur\t: " + data.reamur);
        data.kelvin();
        System.out.println("Suhu dalam Kelvin\t: " + data.kelvin);
        data.cek_air();
    }
        
}
