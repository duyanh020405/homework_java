package bt10;

import java.util.List;
import java.util.Scanner;

import static bt10.main.products;

public class ShoppingCart {
    static List<CartItem> cartItems;
    static Scanner sc = new Scanner(System.in);
    static void addToCart(Product product, int quantity){
        for (CartItem cart : cartItems) {
            if(cart.product.id.equals(product.id)){
                cart.quantity += quantity;
            }
            else {
                cartItems.add(new CartItem(cart.product, quantity));
            }
        }
    }
    static void removeFromCart(String productId) throws Exception{
        for (CartItem cart : cartItems) {
            if(cart.product.id.equals(productId)){
                cartItems.remove(cart);
            }
            else {
                throw new Exception("Khong co san pham voi id nay !!");
            }
        }

    }
    static void displayCart(){
        for (CartItem cart : cartItems) {
            System.out.println(cart.product.getName() + cart.product.getPrice()+ cart.quantity);
            System.out.println("So luong : "+cart.quantity);
        }
    }
    static void checkout(){
        int sum = 0;
        for (CartItem cart : cartItems) {
            sum += cart.product.price * cart.quantity;
        }
        System.out.println("Tong tien :"+sum);


    }
}
