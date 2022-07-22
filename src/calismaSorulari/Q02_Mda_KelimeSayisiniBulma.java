package calismaSorulari;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Mda_KelimeSayisiniBulma {
    /*
    SORU: Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine().trim();
        String arr[]=cumle.split(" ");
        System.out.println(Arrays.toString(arr));
        int kelimeSayisi=arr.length;
        System.out.println("Girilen cumledeki kelime sayisi: "+ kelimeSayisi);
    }
}
