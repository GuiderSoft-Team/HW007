public class Hali {

        private double fiyat;

        public Hali(double fiyat) {
            this.setFiyat(fiyat);
        }

        public double getFiyat() {
            return fiyat;
        }

        public void setFiyat(double fiyat) {
            if(fiyat<0){
                fiyat=0;
            }
            this.fiyat = fiyat;
        }

        @Override
        public String toString() {
            return String.format("Birim Fiyat  :%5.2f ",fiyat);
        }



}
