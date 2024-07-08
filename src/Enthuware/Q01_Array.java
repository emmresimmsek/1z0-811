package Enthuware;

public class Q01_Array {
    public static void main(String[] args) {

        // Question: Is it possible to create arrays of length zero?

        //  a:  Yes, you can create arrays of any type with length zero. (Evet, sıfır uzunlukta herhangi bir türde dizi oluşturabilirsiniz.)
        //  b:  Yes, but only for primitive datatypes.
        //  c:  Yes, but only for arrays of object references.
        //  d:  Yes, and it is same as a null array.
        //  e:  No, arrays of length zero do not exist in Java.

        // Java'da her türden (primitive veya nesne referansları) sıfır uzunlukta dizi oluşturmak mümkündür. Bu diziler geçerlidir ve programda kullanılabilir.

        // Sağlamasını yapalım.
        int[] sayilar = {}; // Sıfır uzunlukta int dizisi
        int length = sayilar.length;
        System.out.println(length); // Çıktı: 0





    }





}
