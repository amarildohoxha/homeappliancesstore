public class homeappliancesstore{
    static String onoma;
    static String diefthinsi;
     static int plhthos;


    interface DeviceBasic{
        public void ektyposh();
        public  void poweron ();
   public void poweroff ();
  public void periodicMantainance();
   public boolean status();


         void setBathos(int bathos);

         void setMhkos(int mhkos);

        void setKatanalosi(int katanalosi);

         void setOnomakat(String onomakat);

         void setOnomasys(String onomasys);

         void setYpsos(int ypsos);

         void setTypos(String typos);


        int getMhkos();


         int getYpsos();

         int getBathos();


         int getKatanalosi();


         String getOnomakat();


         String getOnomasys();


    }


   public static void DeviceStatus(Device d) {
       if (d instanceof Fridge) {
           System.out.println("H syskevh einai Psygeio");
           Fridge fridge = (Fridge) d;  //downcast
           fridge.poweron();
           if (fridge.status() == true) {
               System.out.println("To Psygeio einai anameno");
           } else {
               System.out.println("To Psygeio einai apenergopoihmeno");
           }
       } else if (d instanceof Oven) {
           System.out.println("H syskevh einai HL.Syskeyh");
           Oven oven = (Oven) d; //downcast;
           if (oven.status == true) {
               System.out.println("H HL.Koyzina einai anamenh");
           } else {
               System.out.println("H HL.Koyzina einai apenergopoihmenh");
           }
       } else if (d instanceof WashineMachine) {
           System.out.println("H syskevh einai Plyntirio");
           WashineMachine washineMachine = (WashineMachine) d; //downcast;
           if (washineMachine.status == true) {
               System.out.println("To plyntirio  einai anameno");
           } else {
               System.out.println("To plyntirio  einai apenergopoihmeno");
           }
       }

       if (d instanceof AirCondition) {
           System.out.println("H syskevh einai klimatistiko");
           AirCondition airCondition = (AirCondition) d; //downcast;
           if (airCondition.status == true) {
               System.out.println("To klimatistiko  einai anameno");
           } else {
               System.out.println("To klimatistiko  einai apenergopoihmeno");
           }
       }

   }
    public static void main(String[] args){

       int  synolo;


        Fridge pop1=new Fridge(50,160,40,40,"Bosch","Coolx3","Psygeio",true,true,false,false,true);
        WashineMachine pop2=new WashineMachine(40,60,35,45,"Bloomberg","Tr330","Plynthrio",true,true,true,true,55);
        WashineMachine pop5=new WashineMachine();
        Oven pop3=new Oven(45,65,50,80,"Pitsos","mly800","Hl.Kouzhna","Keramhkes",true,7,66,false);
        AirCondition pop4=new AirCondition(20,25,15,60,"Samsung","maxair","Air condition",true,true,true,true,60);




 DeviceStatus(pop2);


}}



