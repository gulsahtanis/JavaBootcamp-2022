public class MultiDimensionalArrayDemo {

    public void arraysDemo(){

        System.out.println("-----------------------------");
        String[][] sehirler=new String[3][3];
        sehirler[0][0]="Istanbul";
        sehirler[0][1]="Ankara";
        sehirler[0][2]="Izmir";
        sehirler[1][0]="Elazig";
        sehirler[1][1]="Malatya";
        sehirler[1][2]="Bingol";
        sehirler[2][0]="Manisa";
        sehirler[2][1]="Aydin";
        sehirler[2][2]="Denizli";


        for (int i=0;i<sehirler.length;i++)
        {
            System.out.println("-----------------------------");
            for (int j=0;j<sehirler.length;j++){
            System.out.println(sehirler[i][j]);
            }
        }

        System.out.println("-----------------------------");

    }
}
