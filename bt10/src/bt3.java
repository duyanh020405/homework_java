package bt10.src;

public class bt3 {
    class Car {
        private String make ;
        private  String model ;
        private  int year ;
        public Car(String make, String model, int year) {
            this.make = make ;
            this.model = model ;
            this.year = year ;
        }

        private String getMake() {
            return make;
        }

        private void setMake(String make) {
            this.make = make;
        }
        private void getYear(){
            if(year >this.year ){
                System Sys;
                System.out.printf("Khong hop le , vuicl");
            }

        }
        private void display(){
            System.out.println(make + " " + model + " " + year);
        }
    }
}
