import java.io.Serializable;

public class Fridge implements Serializable {

    private  int mhkos;
   private int ypsos;
    private int bathos;
    private String onomakat;
    private String onomasys;
    private String typos;
    private int katanalosi;
    private boolean eksodoskryou;
    private  boolean entoixoizomeno;
    private boolean nofrost;
    private  boolean pagkaki;
    private  boolean minibar;
public static int metrisi=0;
Fridge(){
    mhkos=50;
     ypsos=125;
     bathos=35;
    onomakat="Bosch";
     onomasys="mx";
     typos="Psygeio";
     katanalosi=77;
     eksodoskryou=true;
    entoixoizomeno=false;
    nofrost=true;
    pagkaki=true;
     minibar=true;

    metrisi=metrisi+1;
}
    Fridge(int mhkos,int ypsos,int bathos,int katanalosi,String onomakat,String onomasys,String typos,boolean eksodoskryou,boolean entoixoizomeno,boolean minibar,boolean pagkaki,boolean nofrost){
        this.mhkos =mhkos;
        this.ypsos=ypsos;
        this.bathos=bathos;
        this.katanalosi=katanalosi;
        this.onomakat=onomakat;
        this.onomasys=onomasys;
        this.typos=typos;
        this.eksodoskryou=eksodoskryou;
        this.pagkaki=pagkaki;
        this.minibar=minibar;
        this.entoixoizomeno=entoixoizomeno;
        this.nofrost=nofrost;
        metrisi=metrisi+1;

        }

    public void periodicMantainance(){}




    //get
    public int getMhkos(){
        return mhkos;
    }

    public int getYpsos() {
        return ypsos;
    }

    public int getBathos() {
        return bathos;
    }

    public int getKatanalosi() {
        return katanalosi;
    }

    public String getOnomakat() {
        return onomakat;
    }

    public String getOnomasys() {
        return onomasys;
    }

    public String getTypos() {
        return typos;
    }

     public  boolean getEntoixoizomeno(){
    return entoixoizomeno;
     }

     public  boolean getPagkaki(){
    return  pagkaki;
     }

     public  boolean getEksodoskryou(){
    return eksodoskryou;
     }

     public boolean getMinibar(){
    return minibar;
     }

     public boolean getNofrost(){
    return nofrost;
     }

    //set

    public void setBathos(int bathos) {
        this.bathos = bathos;
    }

    public void setMhkos(int mhkos) {
        this.mhkos = mhkos;
    }

    public void setKatanalosi(int katanalosi) {
        this.katanalosi = katanalosi;
    }

    public void setOnomakat(String onomakat) {
        this.onomakat = onomakat;
    }

    public void setOnomasys(String onomasys) {
        this.onomasys = onomasys;
    }

    public void setYpsos(int ypsos) {
        this.ypsos = ypsos;
    }

    public void setTypos(String typos) {
        this.typos = typos;
    }

    public void setEksodoskryou(boolean eksodoskryou) {
        this.eksodoskryou = eksodoskryou;
    }

    public void setEntoixoizomeno(boolean entoixoizomeno) {
        this.entoixoizomeno = entoixoizomeno;
    }

    public void setMinibar(boolean minibar) {
        this.minibar = minibar;
    }

    public void setNofrost(boolean nofrost) {
        this.nofrost = nofrost;
    }

    public void setPagkaki(boolean pagkaki) {
        this.pagkaki = pagkaki;
    }

    public  static int getMetrisi() {
        return metrisi;
    }

    public void ektyposh(){
        System.out.println("\n\n             FRIDGE");
        System.out.println("\n\n        Stoixia Psygioy\n" +"Typos:" +typos + "\nOnoma kataskeyasth:" +onomakat + "\nOnoma syskebeis:" +onomasys);
        System.out.println("\n\n     Xarakthristika\n"+"Entoixizomeno:" +entoixoizomeno +"\nEksodos kruou nerou:" +eksodoskryou +"\nEksodos gia pagkaki:" +pagkaki +"\nNofrost:" +nofrost +"\nMini bar:" +minibar);
        System.out.println("\n\n        Diastashs\n"+"Ypsos:" +ypsos +"\nMhkos:" +mhkos +"\nBathos:" +bathos);
    }
}
