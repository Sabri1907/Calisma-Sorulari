package calismaSorulari;

import java.util.Arrays;

public class Q03_Array_IstenenElemanlariKaldirma {

    /*
    SORU: Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
    Array olarak yazdiran bir method yaziniz
     */

    public static void main(String[] args) {

        int sayilar[]={5,7,5,9,8,7,6,12,65,98,74,};

        System.out.println("Istenmeyen Sayi Cikarilmadan Onceki Array: "+Arrays.toString(sayilar));

        int istenmeyenSayi=5;

        int sayac=0;

        istenmeyeniKAldir(sayilar,istenmeyenSayi,sayac);

    }

    public static void istenmeyeniKAldir(int[] sayilar, int istenmeyenSayi, int sayac) {
        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]==istenmeyenSayi){
                sayac++;
            }
        }

        int[] sayilar2=new int[sayilar.length-sayac];

        for (int i = 0; i <sayilar2.length ; i++) {

            if (!(sayilar[i]==istenmeyenSayi)){
                sayilar2[i]=sayilar[i];


            }else {
                sayilar2[i]=sayilar[i+1];

            }

        }

        System.out.println("Istenmeyen Sayi cikarildiktan Sonraki Array: "+ Arrays.toString(sayilar2));
    }
}
