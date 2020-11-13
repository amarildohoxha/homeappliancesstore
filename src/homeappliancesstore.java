public class homeappliancesstore{


    public static void main(String[] args)
    {
      int synolo=0;

        Fridge pop1=new Fridge(90,160,80,50,"BOSCH","x33","Psygio",true,false,true,false,true);
        WashineMachine pop2=new WashineMachine(40,60,30,55,"Samsung","power","Plynthrio",true,true,true,true,55);
         Oven pop3=new Oven(50,65,25,90,"Pitsos","mx33","Hl.Kouzhna","keramhkes",true,7,66,false);
         AirCondition pop4=new AirCondition(60,20,15,70,"Samsung","max33","Air condition",true,true,true,true,55);
        Oven pop5=new Oven(50,65,25,90,"Davoline","mx33","Hl.Kouzhna","keramhkes",true,7,66,false);

        pop1.ektyposh();
        pop2.ektyposh();
        pop3.ektyposh();
        pop4.ektyposh();
        pop5.ektyposh();
        synolo=pop1.getMetrisi()+pop2.getMetrisi()+pop3.getMetrisi()+pop4.getMetrisi();

        System.out.println("\n\nTo plhthos ton perioxomenon einai:"+synolo);
    }




}



