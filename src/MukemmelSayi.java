public class MukemmelSayi {
    public void mukemmelSayi() {
        int sayi = 25;
        int toplam=0;

        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam+=i;
            }
        }
        if(toplam == sayi) {
            System.out.println(sayi + " Mukemmel bir sayidir.");
        }
        else {
            System.out.println(sayi + " Mukemmel bir sayi degildir.");
        }

    }
}
