package calismaSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q04_ArrayListTekrarEdenElemanlar {
    /*
    SORU: Verilen bir array’deki tekrar eden elementleri yazdirin.
     */

    public static void main(String[] args) {

        int arr[] = {3, 5, 7, 5, 7, 8, 9, 6, 2, 5, 8, 5, 8, 10};
        Arrays.sort(arr);
        System.out.println("Array :" + Arrays.toString(arr));
        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && !sayilar.contains(arr[i])) {
                sayilar.add(arr[i]);
            }

        }

        System.out.println("Array'de tekrar eden elementler Listi :" + sayilar);

    }


}

