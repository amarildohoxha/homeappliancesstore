public class homeappliancesstore{
    static String onoma;
    static String diefthinsi;
     static int plhthos;


    public static void main(String args[])
    {

        setOnoma(args);
        setPlhthos(args);
        setDiefthinsi(args);
        getDiefthinsi();
        getOnoma();
        getPlhthos();
            System.out.println( "To perioxomenoton metablhton einai: \nonoma:" +onoma+ "\ndiefthinsi:" +diefthinsi+ "\nplhthos:"+plhthos);
    }

    public static String getOnoma(){
        return onoma;
    }
    public static String getDiefthinsi(){
        return diefthinsi;
    }
    public static Integer getPlhthos(){
        return plhthos;
    }
    public static void setOnoma(String args[]){
        onoma=args[0];
    }
    public static void setPlhthos(String args[]){
        plhthos=Integer.parseInt(args[2]);
    }
    public static void setDiefthinsi(String args[]){
        diefthinsi=args[1];
    }
}



