public class Main {
    public static void main(String[] args) {
        //Ders 5 Uygulamasi
        HelloWorld h=new HelloWorld();
        h.helloWorld();
        //Ders 6 Uygulamasi
        Variables v=new Variables();
        v.variables();
        //Ders 7 Uygulamasi
        DataTypes dt=new DataTypes();
        dt.dataTypes();

        //Ders 8 Uygulamasi
        Conditionals c=new Conditionals();
        c.conditionals();

        //Ders 9 Uygulamasi
        RecapDemo1 rd=new RecapDemo1();
        rd.recapDemo1();

        //Ders 10 Uygulamasi
        SwitchDemo1 sd=new SwitchDemo1();
        sd.switchDemo();

        //Ders 11 Uygulamasi
        LoopDemo ld=new LoopDemo();
        ld.loopDemo();

        //Ders 12 Uygulamasi
        ArraysDemo ad=new ArraysDemo();
        ad.arraysDemo();

        //Ders 15 Uygulamasi
        RecapDemo2 rd2=new RecapDemo2();
        rd2.recapDemo2();

        //Ders 16 Uygulamasi
        MultiDimensionalArrayDemo mda=new MultiDimensionalArrayDemo();
        mda.arraysDemo();

        //Ders 17 Uygulamasi
        StringDemo sd1= new StringDemo();
        sd1.stringDemo();

        //Ders 18 Uygulamasi
        StringDemo2 sd2=new StringDemo2();
        sd2.stringDemo();

        //Ders 19 Uygulamasi
        AsalSayi as=new AsalSayi();
        as.asalSayi();

        //Ders 20 Uygulamasi
        SesliHarfler sh=new SesliHarfler();
        sh.sesliHarfler();

        //Ders 21 Uygulamasi
        MukemmelSayi ms=new MukemmelSayi();
        ms.mukemmelSayi();

        //Ders 22 Uygulamasi
        ArkadasSayi as1= new ArkadasSayi();
        as1.arkadasSayi();

        //Ders 23 Uygulamasi
        SayiBulma sb=new SayiBulma();
        sb.sayiBulma();

        //Ders 24 Uygulamasi
        Method m=new Method();
        m.sayiBulmaca();

        //Ders 25 Uygulamasi
        Method2 method2=new Method2();
        method2.sonucMethodu();


        //Ders 26,27,28
        CustomerManager cm=new CustomerManager();
        CustomerManager cm1=new CustomerManager();
        cm1=cm;
        cm.add();
        cm.remove();
        cm.update();


        //Ders29
        //value
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);
        //referans
        int[] sayilar1=new int[]{5,4,8,1};
        int[] sayilar2=new int[]{4,1,4,0};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

        //Ders30
        DortIslem di=new DortIslem();
        int sonuc=di.topla(5,-2);
        System.out.println(sonuc);

        //Ders31
        Product product=new Product();
        product.id=1;
        product.name="Laptop";
        product.description="Dell";
        product.price=18000;
        product.stockAmounth=5;
        ProductManager pm=new ProductManager();
        pm.Add(product);

        //Ders 32 33
        Product2 p2=new Product2();
        p2.setId(15);
        p2.setName("Laptop");
        p2.setStockAmounth(18000);
        p2.setDescription("Dell");
        System.out.println(p2.getName());


        //Ders34
        Product2 p3=new Product2(16,"Laptop","Dell");

        //Ders35
        MethodOverloading mo=new MethodOverloading();
        System.out.println(mo.topla(2,8));
        System.out.println(mo.topla(10,3,5));

        //Ders36
        Customer custemer=new Customer();
        Employee employee=new Employee();

        EmployeeManager employeemanager=new EmployeeManager();
        CustomerManager customermanager=new CustomerManager();
        customermanager.add();

        //Ders37

        //OgretmenKrediManager ogretmenkredimanager=new OgretmenKrediManager();
        //ogretmenkredimanager.Hesapla();
        KrediUI krediui=new KrediUI();
        krediui.krediHesapla(new OgretmenKrediManager());
    }
}