public class homeappliancesstore{
    static String onoma;
    static String diefthinsi;
     static int plhthos;


    public static void main(String args[])
    {

        setOnoma(args[0]);
        setPlhthos(Integer.parseInt(args[2]));
        setDiefthinsi(args[1]);
        getOnoma();
        getOnoma();
        getOnoma();
            System.out.println( "To perioxomenoton metablhton einai: \nonoma:" +onoma+ "\ndiefthinsi:" +diefthinsi+ "\nplhthos:"+plhthos);
    }

    public static String getOnoma(){
        return onoma;
    }
    public static String getDiefthinsi(){
        return diefthinsi;
    }
    public static int getPlhthos(){
        return plhthos;
    }
    public static void setOnoma(String onoma){
        homeappliancesstore.onoma=onoma;
    }
    public static void setPlhthos(int plhthos){
        homeappliancesstore.plhthos=plhthos;
    }
    public static void setDiefthinsi(String diefthinsi){
        homeappliancesstore.diefthinsi=diefthinsi;
    }
}



