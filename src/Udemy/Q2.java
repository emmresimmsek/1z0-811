package Udemy;

public class Q2 {
    public static void main(String[] args) {

        // Given the code fragment:  What is the result?

        boolean checkOut = true;
        int days = 0;

        while (checkOut){

            days++;
            if (days > 3) {

                checkOut =  false;

            }

        }

        System.out.println(days);

        // while döngüsü, koşul "false" olana kadar devam eder. Yani, döngü koşulu "true" olduğu sürece döngü içerisindeki kod çalışır. Koşul "false" olduğunda ise döngü sona erer.


    }
}
