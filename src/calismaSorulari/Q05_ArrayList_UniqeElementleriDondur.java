package calismaSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_ArrayList_UniqeElementleriDondur {

    /*
    SORU: Verilen bir array’deki unique elementleri yeni bir array olarak donduren bir
          method olusturun
     */

    public static void main(String[] args) {
        int[]arr={2,5,7,87,9,5,65,41,58,18,41,25,78,2,5,1,1};
        List<Integer> uniqueSayilar=new ArrayList<>();

        int arr2[]=uniqueSayilarYazdir(arr,uniqueSayilar);
        System.out.println("Unique Elementler Arrayi :"+ Arrays.toString(arr2));



    }

    public static int[] uniqueSayilarYazdir(int[] arr, List<Integer> uniqueSayilar) {

        for (int i = 0; i <arr.length ; i++) {

            if (!uniqueSayilar.contains(arr[i])){
                uniqueSayilar.add(arr[i]);
            }

        }



        int [] uniqueArray=new int[uniqueSayilar.size()];
        for (int i = 0; i <uniqueArray.length ; i++) {
            uniqueArray[i]=uniqueSayilar.get(i);


        }



        return uniqueArray;
    }
}
