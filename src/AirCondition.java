public class AirCondition {
    private int mhkos;
    private int ypsos;
    private int bathos;
    private String onomakat;
    private String onomasys;
    private String typos;
    private int katanalosi;
    private  boolean wifi;
    private boolean ionisti;
    private int thoribos;
    private  boolean filtraaera;
    private boolean oikologikoygro;
    public  static int metrisi=0;
    AirCondition(){
         mhkos=15;
         ypsos=25;
         bathos=13;
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

    public int getMetrisi() {
        return metrisi;
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

    public void ektyposh(){
        System.out.println("\n\n             AIRCONDITION");
        System.out.println("\n\n        Stoixia Aircondition\n" +"Typos:" +typos + "\nOnoma kataskeyasth:" +onomakat + "\nOnoma syskebeis:" +onomasys);
       System.out.println("\n\n        Xaraktiristika\n" +"Wifi:" +wifi +"\nIonisti:" +ionisti +"\nFiltra aeriou:" +filtraaera +"\nOikologiko ygro(R32):" +oikologikoygro +"\nThoribos:" +thoribos);
        System.out.println("\n\n        Diastashs\n"+"Ypsos:" +ypsos +"\nMhkos:" +mhkos +"\nBathos:" +bathos);

    }
}
