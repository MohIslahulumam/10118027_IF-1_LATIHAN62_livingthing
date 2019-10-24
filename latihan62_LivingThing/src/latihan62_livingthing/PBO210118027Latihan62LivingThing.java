/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan62_livingthing;

/**
 *
 * @author RYZEN
 * @author WAHID HERLAMBANG

 * NAMA     :M ISLAHUL UMAM D

 * KELAS    : IF-1

 * NIM      : 10118027

 * Deskripsi Program : Program ini berisi program yang menampilkan 

 * tentang aktivitas seseorang (Sedang berjalan, Bernafas, Makan). 

 */

public class PBO210118027Latihan62LivingThing {



    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        // TODO code application logic here

        Human human = new Human ();

        

        human.setNama("Wahid Herlambang Suroso");

        human.walk(human.getNama());

        human.breath(human.getNama());

        human.eat(human.getNama());

        

    }

    

}
