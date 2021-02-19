package kiralynok;

import java.io.IOException;

public class Kiralynok {
    
    private Tabla tabla;

    public Kiralynok() {
        tabla = new Tabla('#');
    }
    
    
    public static void main(String[] args) throws IOException {
      Kiralynok kir = new Kiralynok();
      kir.megoldasok();
       
    }
    public void  megoldasok(){
    feladat4();
    feladat6();
    feladat9();

    }

    private void feladat4() {
          //4.feladat
        System.out.println("4.feladat: üres tábla megjelenítése:");
       
        tabla.megjelenit();
        
    }

    private void feladat6() {
        //6. feladat
        System.out.println("6.feladat: feltöltött tábla:");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }

    private void feladat9() {
       //9.feladat
        System.out.println("9.feladat:üres sorok és oszlopok száma:");
        System.out.println("sorok: " + tabla.uresSorokSzama());
        System.out.println("oszlopok: "+ tabla.uresOszlopokSzama());
    }
}
