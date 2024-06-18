package PracticeTests;

public class Q03_Char {
    public static void main(String[] args) {

        // Which of the following are char literals? You had to select 3 option(s)

        // a: 'a'  Bu, tek tırnak içinde bir karakterdir ve geçerli bir char literal'ıdır.
        // b: '\n' Bu, kaçış dizisi kullanılarak belirtilmiş yeni satır karakteridir. Geçerli bir char literal'ıdır.
        // c: '\uDEAF' Bu, Unicode kaçış dizisi kullanılarak belirtilmiş bir karakterdir. Geçerli bir char literal'ıdır.
        // d: /a/ This is an invalid syntax. Bu geçersiz bir sözdizimidir.
        // e: "a" Bir String için çift tırnak kullanılır, dolayısıyla "a" yalnızca bir karakter içeren bir String'dir

        // Sonuç olarak a, b, ve c seçenekleri doğrudur...
        // Karekterler tek tırnak (' ') içinde yazılır.

        char isim = '\uDEAF';  // Dikkat tek tırnakların arasına boşluk atma hata alırsın.
        System.out.println(isim);

        char isim2 = '\n';
        System.out.println(isim2);

        char isim3 = 'a';
        System.out.println(isim3);






    }
}
