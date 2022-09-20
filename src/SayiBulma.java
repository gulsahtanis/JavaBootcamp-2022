public class SayiBulma {
    public void sayiBulma() {
        int[] sayilar =new int[]{1,6,3,9,5};
        boolean varMi=false;
        int aranan=5;

        for(int sayi:sayilar)
        {
            if(sayi == aranan) {
                varMi=true;
                break;
            }
        }


        if(varMi==true) {
            System.out.println("Sayi mevcuttur");
        }
        else{
            System.out.println("Sayi mevcut degildir");
        }


    }
}
