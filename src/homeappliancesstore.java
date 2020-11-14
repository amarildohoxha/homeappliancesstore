public class homeappliancesstore{
    static String onoma;
    static String diefthinsi;
     static int plhthos;


    public static void main(String args[])
    {

       int synolo;


        Fridge pop1=new Fridge(50,160,40,40,"Bosch","Coolx3","Psygeio",true,true,false,false,true);
        WashineMachine pop2=new WashineMachine(40,60,35,45,"Bloomberg","Tr330","Plynthrio",true,true,true,true,55);
        Oven pop3=new Oven(45,65,50,80,"Pitsos","mly800","Hl.Kouzhna","Keramhkes",true,7,66,false);
        AirCondition pop4=new AirCondition(20,25,15,60,"Samsung","maxair","Air condition",true,true,true,true,60);
        WashineMachine pop5=new WashineMachine();


        pop1.ektyposh();
        pop2.ektyposh();
        pop3.ektyposh();
        pop4.ektyposh();
        pop5.ektyposh();

        synolo=pop1.getMetrisi()+pop2.getMetrisi()+ pop3.getMetrisi()+pop4.getMetrisi();
        System.out.println("\n\nTO SYNOLO TON PERIOXOMENON EINAI:"+synolo);
    }
}



