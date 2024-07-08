package Udemy;

public class Q1 {
    public static void main(String[] args) {
     // Which statement is true about primitive variables?
     // Primitive değişkenler ile ilgili hangisi doğrudur ?


     // A: They can be compared with the == operator. (DOĞRU)
     // B: They can be compared with the equals method only. (YANLIŞ)
     // C: They cannot be compared. (YANLIŞ) Karşılaştırılabilir.
     // D: They can be compared with the compareTo method only. (YANLIŞ)


       /* AÇIKLAMA:  "Compare" kelimesi Türkçe'de "karşılaştırmak"
        anlamına gelmektedir. I want to compare these two books. (Bu iki kitabı karşılaştırmak istiyorum)  */

      /* A: Doğru: Primitive değişkenler == operatörü ile karşılaştırılabilir. Bu operatör, iki değerin eşit olup olmadığını kontrol eder.
         B: Yanlış: equals metodu, nesneleri karşılaştırmak için kullanılır. Primitive değişkenler için bu metot kullanılamaz.
         C: Yanlış: Primitive değişkenler karşılaştırılabilir.
         D: Yanlış: compareTo metodu, genellikle Comparable arayüzünü uygulayan nesneler için kullanılır, primitive değişkenler için değil.


       */


        int a = 3;
        int b = 3;

        if ( a == b ){
            System.out.println("They are the same");

        } else {

            System.out.println(" Not the same");



        }

        /*

        Here are primitive variables in Java:

        byte, short, int, long, float, double, boolean and char



         */






    }
}
