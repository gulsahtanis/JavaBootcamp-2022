public class Method2 {
    public  void sonucMethodu(){
      String mesaj=sehir();
      System.out.println(mesaj);
      int sayi=topla(5,7);
      System.out.println(sayi);
      int toplamDeger=topla1(5,8,3,7);
        System.out.println(toplamDeger);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
     System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Guncellendi");
    }
    public static int topla(int sayi1,int sayi2){
       return sayi1+sayi2;
    }
    public static int topla1(int... sayilar){
       int toplam=0;
       for(int sayi:sayilar){
           toplam+=sayi;
       }
       return toplam;
    }
    public static String sehir(){
        return "Ankara";
    }
}
