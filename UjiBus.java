/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class UjiBus {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini=new Bus();
        busMini.penumpang=5;
        busMini.maxpenumpang=5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang+5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang-2;
        busMini.cetak();
        
        
        busMini.penumpang=busMini.penumpang+8;
        busMini.cetak();
        
          
    }
}
