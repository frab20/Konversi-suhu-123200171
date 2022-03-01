/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author WXO
 */
public class Konversi {
    double celcius, fahrenheit, reamur, kelvin;
    
    Konversi(double celcius){
        this.celcius = celcius;
    } 
    
    void reamur(){
        reamur = (4 * celcius)/5;
    }
    
    void fahrenheit(){
        fahrenheit = (9 * celcius)/5 + 32;
    }
    
    void kelvin(){
        kelvin = celcius + 273.15;
    }
    
    void cek_air(){
        if(celcius <= 0){
            System.out.println("Kondisi air membeku") ;
        }else if(celcius >=100){
            System.out.println("Kondisi air mendidih");
        }else{
            System.out.println("Kondisi air normal");
        }   
    }
}
