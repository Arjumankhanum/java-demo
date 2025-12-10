class car {
    int fuel;
    int seats;

    car(int fuel, int seats) {
        this.fuel = fuel;
        this.seats = seats;
    }

    public void cdetails() {
        System.out.println(fuel + " " + seats);
    }
}

    class rollsroyce extends car {
        String color;
        int price;
        String model;

        rollsroyce(String color, int price, String model,int fuel, int seats) {
            super(fuel, seats);
            this.color = color;
            this.price = price;
            this.model = model;

        }

        public void rdetails() {
            System.out.println(color+" "+price+" "+model+" "+fuel+" "+seats);
        }
    }

    class defender extends car {
        String color1;
        int price1;
        String model1;

        defender(String color1, int price1, String model1, int fuel, int seats) {
            super(fuel, seats);
            this.color1 = color1;
            this.price1 = price1;
            this.model1 = model1;
        }

        public void ddetails() {
            System.out.println(color1 + " " + price1 + " " + model1 + " " + fuel + " " + seats);
        }
    }

    public class hier {
        public static void main(String[] args) {
            rollsroyce obj=new rollsroyce("Black",70000000,"Ghost",65,7);
            obj.rdetails();
        }
    }
