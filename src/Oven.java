public class Oven {
    private int mhkos;
    private int ypsos;
    private int bathos;
    private String onomakat;
    private String onomasys;
    private String typos;
    private int katanalosi;
    private String typosestion;
    private boolean psifiakhothoni;
    private int trophpsisimatos;
    private int xorithkothtafoyrnou;
    private boolean shsthmakatharismoy;
    public  static int metrisi=0;


    Oven(){

    }
    Oven(int mhkos,int ypsos,int bathos,int katanalosi,String onomakat,String onomasys,String typos,String typosestion,boolean psifiakhothoni,
         int trophpsisimatos,int xorithkothtafoyrnou,boolean shsthmakatharismoy){
        this.mhkos=mhkos;
        this.ypsos=ypsos;
        this.bathos=bathos;
        this.katanalosi=katanalosi;
        this.onomakat=onomakat;
        this.onomasys=onomasys;
        this.typos=typos;
        this.psifiakhothoni=psifiakhothoni;
        this.xorithkothtafoyrnou=xorithkothtafoyrnou;
        this.shsthmakatharismoy=shsthmakatharismoy;
        this.trophpsisimatos=trophpsisimatos;
        this.typosestion=typosestion;
        metrisi=metrisi+1;
    }
    public  int getMetrisi() {
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

    public int getTrophpsisimatos() {
        return trophpsisimatos;
    }

    public int getXorithkothtafoyrnou() {
        return xorithkothtafoyrnou;
    }

    public String getTyposestion(){
        return typosestion;
    }

    public boolean getPsifiakhothoni(){
        return psifiakhothoni;
    }
    public boolean getShsthmakatharismoy(){
        return shsthmakatharismoy;
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

    public void setPsifiakhothoni(boolean psifiakhothoni) {
        this.psifiakhothoni = psifiakhothoni;
    }

    public void setShsthmakatharismoy(boolean shsthmakatharismoy) {
        this.shsthmakatharismoy = shsthmakatharismoy;
    }

    public void setTyposestion(String typosestion) {
        this.typosestion = typosestion;
    }

    public void setTrophpsisimatos(int trophpsisimatos) {
        this.trophpsisimatos = trophpsisimatos;
    }

    public void setXorithkothtafoyrnou(int xorithkothtafoyrnou) {
        this.xorithkothtafoyrnou = xorithkothtafoyrnou;
    }

    public void ektyposh(){
        System.out.println("\n\n             OVEN");
        System.out.println("\n\n        Stoixia hl.koyzinas\n" +"Typos:" +typos + "\nOnoma kataskeyasth:" +onomakat + "\nOnoma syskebeis:" +onomasys);
        System.out.println("\n\n         Xarakthrhstika \n" + "Typos estion:" +typosestion +"\nSysthma katharismou:" +shsthmakatharismoy +"\nTopi psisimatos:" +trophpsisimatos
         +"\nXoritikothta foyrnoy:" +xorithkothtafoyrnou +"\nPsyfiakh othonh:" +psifiakhothoni + "\nKatanalosi:" +katanalosi);
        System.out.println("\n\n        Diastashs\n"+"Ypsos:" +ypsos +"\nMhkos:" +mhkos +"\nBathos:" +bathos);


    }
}
