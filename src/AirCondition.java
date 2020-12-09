import java.io.Serializable;

public class AirCondition implements Serializable {
    private int mhkos;
    private int ypsos;
    private boolean ionisti;
    private int bathos;
    private String onomasys;
    private String typos;
    private int katanalosi;
    private  boolean wifi;
    private int thoribos;
    private  boolean filtraaera;
    private boolean oikologikoygro;
    public  static int metrisi=0;
    private String onomakat;
    AirCondition(){

         mhkos=15;
        bathos=13;
         ypsos=25;

        onomakat="Fujitzou";
        onomasys="airpro55";
         typos="Aircondition";
         katanalosi=60;
         wifi=true;
        ionisti=true;
        thoribos=35;
        filtraaera=true;
         oikologikoygro=true;

metrisi=metrisi+1;
    }
    AirCondition(int mhkos,int ypsos,int bathos,int katanalosi,String onomakat,String onomasys,String typos,boolean wifi,boolean ionisti,boolean oikologikoygro,boolean filtraaera,int thoribos){
this.mhkos=mhkos;
this.ypsos=ypsos;
this.bathos=bathos;
this.katanalosi=katanalosi;
this.onomakat=onomakat;
this.onomasys=onomasys;
this.typos=typos;
this.wifi=wifi;
this.filtraaera=filtraaera;
this.thoribos=thoribos;
this.oikologikoygro=oikologikoygro;
this.ionisti=ionisti;
        metrisi =metrisi+1;
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

    public boolean getWifi(){
        return  wifi;
    }

    public boolean getIonisti(){
        return ionisti;
    }

    public boolean getFiltraaera(){
        return  filtraaera;
    }

    public  boolean getOikologikoygro(){
        return oikologikoygro;
    }

    public  int getThoribos(){
        return thoribos;
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

    public void setFiltraaera(boolean filtraaera) {
        this.filtraaera = filtraaera;
    }

    public void setIonisti(boolean ionisti) {
        this.ionisti = ionisti;
    }

    public void setOikologikoygro(boolean oikologikoygro) {
        this.oikologikoygro = oikologikoygro;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setThoribos(int thoribos) {
        this.thoribos = thoribos;
    }

    public static int getMetrisi() {
        return metrisi;
    }


}
