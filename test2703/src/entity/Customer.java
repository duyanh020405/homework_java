package entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp {
    int id ;
    String name ;
    Optional<String> email ;

    public Customer() {
        this.id = this.id;
        this.name = this.name;
        this.email = Optional.ofNullable(String.valueOf(this.email));
    }
    @Override
    public  Customer inputdata(Scanner scanner) {
        System.out.println("Enter customer name: ");
        String name =  scanner.nextLine();
        System.out.println("Enter customer email: ");
        Optional<String> email =  Optional.ofNullable(scanner.next());
        return this;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  toString(){
        return "Customer (id=" + id + ", name=" + name + ", email=" + email + ")";
    }
}
