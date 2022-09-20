public class StringDemo2 {

    public void stringDemo(){
        String mesaj="Bugun hava cok guzel.";
        System.out.println(mesaj);
       // System.out.println(mesaj.replace(' ','-'));(Var olan mesaji degistirir)
        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,4));//2 den basla 4'e kadar alir 4 dahil degil.

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        String mesajBosluklu="    Bugun hava cok guzel  ";
        System.out.println(mesajBosluklu.trim());//Basindaki ve sonundaki tum bosluklari siler.

    }
}
