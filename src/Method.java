public class Method {
    public void sayiBulmaca(){
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


        if(varMi) {
            mesajVer("Sayi mevcuttur"+ aranan);
        }
        else{
            mesajVer("Sayi mevcut degildir"+ aranan);
        }

    }

    public void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
