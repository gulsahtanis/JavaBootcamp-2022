public class LoopDemo {
    public void loopDemo(){
        System.out.println("1'den 10'a kadar olan sayilar");
        for (int i=1;i<=10;i++){
            System.out.println(" "+i);
        }

        System.out.println("1'den 10'a kadar olan tek sayilar");
        for (int i=1;i<=10;i+=2){
            System.out.println(" "+i);
        }

        System.out.println("1'den 10'a kadar olan cift sayilar");
        for (int i=2;i<=10;i+=2){
            System.out.println(" "+i);
        }

        System.out.println("For Donguleri bitti");


        System.out.println("1'den 10'a kadar olan sayilar");
        int i = 1;
        while (i<10){
            System.out.println(i);
            i++;
        }

        System.out.println("1'den 10'a kadar olan tek sayilar");
        i = 1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }

        System.out.println("1'den 10'a kadar olan cift sayilar");
        i = 2;
        while (i<10){
            System.out.println(i);
            i+=2;
        }

        System.out.println("While Donguleri bitti");

        int j=1;
        do{
        System.out.println(j);
        j+=2;
        }while(j<10);

        System.out.println("Do-While Donguleri bitti");
    }
}
