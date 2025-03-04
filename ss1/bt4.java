
class People {
    String name;
    int age;
    String country;

    public People(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void printfPeople() {
        System.out.println(name + " - " + age + " tuổi - " + country);
    }
}

public class bt4 {
    public static void main(String[] args) {
        People[] peopleArray = {
                new People("Nguyen Van An", 20, "Viet Nam"),
                new People("Tran Thi Bich", 22, "Nhat Ban"),
                new People("Le Hoang Nam", 19, "Han Quoc"),
                new People("Pham Minh Duc", 25, "My")
        };
        for (People p : peopleArray) {
            p.printfPeople();
        }
    }
}
