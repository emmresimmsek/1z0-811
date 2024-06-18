
package PracticeTests;
public class Q04_Prefix_Postfix {
    public static void main(String[] args) {

        // SORU:
        // int a = 5,  b = 2, c = 30;               // int türünde 3 tane değişken tanımlanmış.
        // System.out.println( (a + b)-- * c  );


        // a: 180
        // b: 210
        // c: Compilation failure
        // d: Exception at run time

        // CEVAP: C seçeneğidir. Son ek veya önek artırma/azaltma işleçleri yalnızca bir değişkene uygulanabileceğinden derlenmez. (a+b) bir değişken değildir. Bu bir ifadedir
        // It will not compile because a postfix or prefix increment/decrement operators can only be applied to a variable. (a+b) is not a variable. It is an expression.

        // Java'da increment (++) ve decrement (--) operatörleri, değişkenlerin değerlerini 1 arttırmak veya azaltmak için kullanılan kısayollardır.
        // Bu operatörler tek başına bir değişkenle kullanılırlar (unary operator) ve iki farklı kullanım şekilleri vardır: prefix ve postfix.
        //  Prefix (Önek): ++a veya --a şeklinde kullanılır. Bu durumda, operatör değişkenin önüne yazılır. Önce değişkenin değeri 1 arttırılır veya azaltılır, sonra bu yeni değer kullanılır.
        //  Postfix (Sonek): a++ veya a-- şeklinde kullanılır. Burada operatör değişkenin sonuna yazılır. Önce mevcut değer kullanılır, sonra değişkenin değeri 1 arttırılır veya azaltılır.

//                ++ operatörü değişkenin değerini 1 arttırır.
//                -- operatörü değişkenin değerini 1 azaltır.
//                Prefix kullanımında, önce değer güncellenir sonra kullanılır.
//                Postfix kullanımında, önce değer kullanılır sonra güncellenir.

            // Yukarıdaki kodu düzeltelim
        int a = 5, b = 2, c = 30;
        System.out.println((a + b) * c);



    }
}
