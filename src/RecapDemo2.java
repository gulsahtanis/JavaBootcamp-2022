public class RecapDemo2 {
    public void recapDemo2(){
        double[] sayilar={1.6,8.5,5.6,9.8};
        double total=0;
        double maxSayi=sayilar[0];
        for (double sayi : sayilar){
            if(maxSayi>sayi){
                maxSayi=sayi;
            }
            total+=sayi;
        }

        System.out.println("Total Sayi : "+ total);
        System.out.println("En Buyuk Sayi : "+ maxSayi);
    }
}
