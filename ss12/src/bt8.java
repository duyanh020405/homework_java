public class bt8 {
    class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getDiscount() {
            return 0;
        }

        public double getFinalPrice() {
            return price - (price * getDiscount() / 100);
        }

        public double getDiscount(int quantity) {
            if (quantity > 100) {
                return 5.0;
            }
            return getDiscount();
        }

        public double getFinalPrice(int quantity) {
            double discount = getDiscount(quantity);
            return price - (price * discount / 100);
        }
    }

    class Electronics extends Product {
        public Electronics(String name, double price) {
            super(name, price);
        }

        @Override
        public double getDiscount() {
            return 10.0;
        }
    }

    class Clothing extends Product {
        public Clothing(String name, double price) {
            super(name, price);
        }

        @Override
        public double getDiscount() {
            return 20.0;
        }
    }

    class Food extends Product {
        public Food(String name, double price) {
            super(name, price);
        }

        @Override
        public double getDiscount() {
            return 5.0;
        }
    }

    public static void main(String[] args) {
        bt8 outer = new bt8();
        Product genericProduct = outer.new Product("Generic Product", 1000);
        Electronics laptop = outer.new Electronics("Laptop", 1500);
        Clothing tShirt = outer.new Clothing("T-Shirt", 500);
        Food apple = outer.new Food("Apple", 200);

        System.out.println(genericProduct.name + " final price: " + genericProduct.getFinalPrice());
        System.out.println(laptop.name + " final price: " + laptop.getFinalPrice());
        System.out.println(tShirt.name + " final price: " + tShirt.getFinalPrice());
        System.out.println(apple.name + " final price: " + apple.getFinalPrice());

        int quantity = 150;
        System.out.println(genericProduct.name + " final price for " + quantity + " items: " + genericProduct.getFinalPrice(quantity));
        System.out.println(laptop.name + " final price for " + quantity + " items: " + laptop.getFinalPrice(quantity));
        System.out.println(tShirt.name + " final price for " + quantity + " items: " + tShirt.getFinalPrice(quantity));
        System.out.println(apple.name + " final price for " + quantity + " items: " + apple.getFinalPrice(quantity));
    }
}