
    abstract class Device implements homeappliancesstore.DeviceBasic {

        private static int mhkos;
        private int ypsos;
        private int bathos;
        private String onomakat;
        private String onomasys;
        private String typos;
         public static boolean status;

        public abstract void setBathos(int bathos);

        public abstract void setMhkos(int mhkos);

        public abstract void setKatanalosi(int katanalosi);

        public abstract void setOnomakat(String onomakat);

        public abstract void setOnomasys(String onomasys);

        public abstract void setYpsos(int ypsos);

        public abstract void setTypos(String typos);


        public abstract int getMhkos();


        public abstract int getYpsos();

        public abstract int getBathos();


        public abstract int getKatanalosi();


        public abstract String getOnomakat();


        public abstract String getOnomasys();


        @Override

        public void poweroff() {
            status=false;
        }

        @Override
        public void poweron() {
            status=true;
        }


        public  boolean status() {
            return status;
        }

        public void setStatus(boolean status){
            this.status=status;
        }

        public boolean getStatus(){
            return status;
        }




    }

