/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6_interface;

/**
 *
 * @author Erlangga Satrya H
 */
public class Laptop extends Komputer {
    void hidupkan_os(){
        System.out.println("hidupkan laptop");
    }

    void matikan_os(){
        System.out.println("matikan laptop");
    } 

    public void klik_kanan(){
        System.out.println("klik kanan");
    }

    public void klik_kiri(){
        System.out.println("klik kiri");
    }

    public void tekan_enter(){
        System.out.println("tekan enter");
    }

    public void cetak_data(){
        System.out.println("-----------------------");
        System.out.println("Laptop");
        hidupkan_os();
        matikan_os();
        klik_kanan();
        klik_kiri();
        tekan_enter();
    }
}
