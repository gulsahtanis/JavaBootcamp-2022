public class RecapDemo1 {
    public void recapDemo1(){
        int sayi1=15;
        int sayi2=7;
        int sayi3=100;
        int enBuyuk=sayi1;
        if(sayi2>enBuyuk){
           enBuyuk=sayi2;
        }
        if(sayi3>enBuyuk){
            enBuyuk=sayi3;
        }

        System.out.println("En Buyuk Sayi: "+ enBuyuk);
    }
}
