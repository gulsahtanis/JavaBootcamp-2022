public class StringDemo {

    public void stringDemo(){
        String mesaj="Bugun hava cok guzel.";
        System.out.println(mesaj);
        System.out.println("Eleman sayisi "+mesaj.length());
        System.out.println("5.eleman "+mesaj.charAt(4));
        System.out.println(mesaj.concat("Yasasin"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakter = new char[5];
        mesaj.getChars(0,5,karakter,0);
        System.out.println(karakter);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));
    }
}
