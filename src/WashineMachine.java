public class WashineMachine extends Device {
    private int mhkos;
    private int ypsos;
    private int bathos;
    private String onomakat;
    private String onomasys;
    private String typos;
    private int katanalosi;
    private boolean psifiakhothonh;
    private boolean smartleitorgeies;
    private  boolean texnologiafysalidon;
    private int thoribos;
    private boolean kathysterisi;

    public static int metrisi=0;


    WashineMachine(){

         mhkos=55;
         ypsos=40;
         bathos=30;
        onomakat="Bloomberg";
        onomasys="mx50";
        typos="Plynthrio";
         katanalosi=70;
         psifiakhothonh=true;
         smartleitorgeies=true;
         texnologiafysalidon=true;
         thoribos=50;
         kathysterisi=true;
metrisi=metrisi+1;
    }


    WashineMachine(int mhkos,int ypsos,int bathos,int katanalosi,String onomakat,String onomasys,String typos,boolean smartleitorgeies,boolean psifiakhothonh,boolean texnologiafysalidon,boolean kathysterisi,int thoribos){
        this.mhkos=mhkos;
        this.ypsos=ypsos;
        this.bathos=bathos;
        this.katanalosi=katanalosi;
        this.onomakat=onomakat;
        this.onomasys=onomasys;
        this.typos=typos;
        this.smartleitorgeies=smartleitorgeies;
        this.kathysterisi=kathysterisi;
        this.psifiakhothonh=psifiakhothonh;
        this.texnologiafysalidon=texnologiafysalidon;
        this.thoribos=thoribos;
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

    public boolean getKathysterisi(){
        return kathysterisi;
    }

    public boolean getTexnologiafysalidon(){
        return texnologiafysalidon;
    }

    public boolean getPsifiakhothonh(){
        return psifiakhothonh;
    }

    public  boolean getSmartleitorgeies(){
        return smartleitorgeies;
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

    public void setPsifiakhothonh(boolean psifiakhothonh) {
        this.psifiakhothonh = psifiakhothonh;
    }

    public void setThoribos(int thoribos) {
        this.thoribos = thoribos;
    }

    public void setKathysterisi(boolean kathysterisi) {
        this.kathysterisi = kathysterisi;
    }

    public void setSmartleitorgeies(boolean smartleitorgeies) {
        this.smartleitorgeies = smartleitorgeies;
    }

    public void setTexnologiafysalidon(boolean texnologiafysalidon) {
        this.texnologiafysalidon = texnologiafysalidon;
    }

    public static int getMetrisi() {
        return metrisi;
    }

    public void ektyposh(){
        System.out.println("\n\n             WASHINEMACHINE");
        System.out.println("\n\n        Stoixia Wshine\n" +"Typos:" +typos + "\nOnoma kataskeyasth:" +onomakat + "\nOnoma syskebeis:" +onomasys);
        System.out.println("\n\n     Xaraktiristika\n" +"Psyfiakh othonh:" +psifiakhothonh +"\nLeitoyrgies smart:  " +smartleitorgeies +"\nTexnologia fysalidon:" +texnologiafysalidon +"\nThoribos:" +thoribos +"\nKathisterisi enarkshs:" +kathysterisi);
        System.out.println("\n\n        Diastashs\n"+"Ypsos:" +ypsos +"\nMhkos:" +mhkos +"\nBathos:" +bathos);
    }
}
