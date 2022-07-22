package calismaSorulari;

import java.util.Arrays;

public class Q01_Mda_ElemanlariToplayipYeniArrayYapma {

    /*
    SORU: Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
    birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana
    yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
    Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
     */

    public static void main(String[] args) {

     int sayilar1[][]= { {1,2,3}, {4,5,1}, {6,7,2,5} };

     int sayilar2[]=new int[3];

     int toplam=0;

        for (int i = 0; i <sayilar1.length ; i++) {

            for (int j = 0; j <sayilar1[i].length ; j++) {
                toplam+=sayilar1[i][j];

            }

            sayilar2[i]=toplam;
            toplam=0;

        }

        System.out.println("Toplamlardan olusan yeni Array: "+ Arrays.toString(sayilar2));

    }
}
