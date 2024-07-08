package Enthuware;

public class Q11_Result {
    public static void main(String[] args) {

//         Soru: What will be the result of attempting to compile and run the following code?
//         Soru: Aşağıdaki kodu derleyip çalıştırmayı denediğimizde sonuç ne olur?

//         Cevap:  It will print a.


        int i = 5;
        float f = 5.5f;
        double d = 3.8;
        char c = 'a';

        if (i == f) c++;  // Süslü parantez kullanmadan yazmak, genellikle kısa ve basit koşullar için tercih edilir,
        if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
        System.out.println(c);



    }
}
