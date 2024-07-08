package Enthuware;

import java.io.File;

public class Q05_null {
    public static void main(String[] args) {

        //Soru: Which of the following statements declares a valid null reference?
        // Aşağıdaki ifadelerden hangisi geçerli bir "null" referans bildirir?

        //a: String str : null;      GEÇERSİZ  Bu ifade, Java'da atama yapmak için kullanılan eşittir (=) yerine iki nokta üst üste (:) kullanıyor. Bu yüzden geçerli bir sözdizimi değil.
        //b: Object obj = NULL;      GEÇERSİZ  Java'da null kelimesi küçük harflerle yazılır. NULL büyük harflerle yazıldığında geçerli değildir.
        //c: Date d(null);           GEÇERSİZ  Bu, bir nesne oluşturma ifadesine benziyor ancak null parametresiyle bir kurucu çağırmak doğru sözdizimi değil. Bu şekilde bir null referansı atayamayız.
        //d: File f = null;          GEÇERLİDİR...


        File f = null;
        System.out.println(f);



        // File sınıfı, Java'da dosya ve dizinlerle ilgili işlemler yapmak için kullanılan bir sınıftır.
        // File sınıfı, dosya veya dizinlerin oluşturulması, silinmesi, adlandırılması ve çeşitli
        // özelliklerinin sorgulanması gibi işlemler için yöntemler sunar.
    }
}
