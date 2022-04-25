
    public class Hali {
        private double fiyat;


        public Hali(double fiyat) {
            this.fiyat = fiyat <= 0 ? 0 : fiyat;
        }

        public Hali() {
        }

        public double getFiyat() {
            return fiyat;
        }

        public void setFiyat(double fiyat) {
            this.fiyat = fiyat;
        }

        @Override
        public String toString() {
            double Birimfiyatı = 25.50;
            return String.format("Birim Fiyatı: %.2f", fiyat);
        }
    }
