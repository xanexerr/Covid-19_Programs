package CarFactory;

public class Car {
        private String brand;
        private String model;

        public Car(String var1, String var2) {
                this.brand = var1;
                this.model = var2;
        }

        public String getBrand() {
                return this.brand;
        }

        public void setBrand(String var1) {
                this.brand = var1;
        }

        public void displayInfo() {
                System.out.println("Brand: " + this.brand + ", Model: " + this.model);
        }

}
