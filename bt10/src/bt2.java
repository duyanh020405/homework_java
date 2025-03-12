package bt10.src;

public class bt2 {
    /*
    ### 1. Kế thừa là gì? Nó giúp ích gì trong lập trình hướng đối tượng?

**Kế thừa (Inheritance)** là một trong những tính chất quan trọng của lập trình hướng đối tượng (OOP), cho phép một lớp (`subclass` – lớp con) kế thừa các thuộc tính và phương thức từ một lớp khác (`superclass` – lớp cha).

**Lợi ích của kế thừa:**
- **Tái sử dụng mã nguồn**: Lớp con có thể sử dụng lại các phương thức và thuộc tính từ lớp cha mà không cần viết lại.
- **Dễ bảo trì và mở rộng**: Nếu cần thay đổi logic chung, chỉ cần chỉnh sửa trong lớp cha mà không cần sửa đổi từng lớp con.
- **Tăng tính tổ chức của mã nguồn**: Giúp tạo ra mối quan hệ giữa các đối tượng theo mô hình phân cấp (hierarchy).

Ví dụ thực tế:
Giả sử có một lớp `Animal` chứa các phương thức chung như `eat()` và `sleep()`, thì các lớp con như `Dog` và `Cat` có thể kế thừa những phương thức này mà không cần định nghĩa lại.

---

### 2. Sự khác biệt giữa kế thừa (Inheritance) và đóng gói (Encapsulation) trong Java

| **Tiêu chí**      | **Kế thừa (Inheritance)** | **Đóng gói (Encapsulation)** |
|------------------|------------------------|------------------------|
| **Mục đích** | Tái sử dụng mã nguồn, mở rộng chức năng của lớp cha. | Bảo vệ dữ liệu, hạn chế truy cập trực tiếp vào thuộc tính của đối tượng. |
| **Cách thực hiện** | Dùng từ khóa `extends` để tạo lớp con từ lớp cha. | Dùng từ khóa `private` để ẩn dữ liệu, kết hợp với `getter` và `setter` để truy xuất dữ liệu. |
| **Tính chất** | Cho phép lớp con kế thừa thuộc tính và phương thức của lớp cha. | Kiểm soát quyền truy cập dữ liệu bằng cách giới hạn phạm vi truy cập của các biến. |
| **Lợi ích** | Giúp tái sử dụng mã nguồn, giảm thiểu lặp code. | Giúp bảo mật dữ liệu, ngăn chặn truy cập trái phép. |

---

### 3. Ví dụ về kế thừa trong Java với từ khóa `extends`
Dưới đây là một ví dụ minh họa cách sử dụng từ khóa `extends` để kế thừa các thuộc tính và phương thức từ lớp cha.

```java
// Lớp cha (Superclass)
class Animal {
    String name;

    public void eat() {
        System.out.println(name + " đang ăn.");
    }

    public void sleep() {
        System.out.println(name + " đang ngủ.");
    }
}

// Lớp con (Subclass) kế thừa từ lớp Animal
class Dog extends Animal {
    public void bark() {
        System.out.println(name + " sủa: Gâu Gâu!");
    }
}

// Sử dụng lớp con trong hàm main
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";

        myDog.eat();   // Kế thừa từ Animal
        myDog.sleep(); // Kế thừa từ Animal
        myDog.bark();  // Định nghĩa riêng trong Dog
    }
}
```

**Kết quả:**
```
Buddy đang ăn.
Buddy đang ngủ.
Buddy sủa: Gâu Gâu!
```

**Giải thích:**
- Lớp `Dog` kế thừa các phương thức `eat()` và `sleep()` từ lớp `Animal` mà không cần định nghĩa lại.
- `Dog` có thể bổ sung các phương thức riêng (`bark()`).
- `myDog` có thể sử dụng tất cả các phương thức của cả lớp cha và lớp con.

---

### 4. Lợi ích và hạn chế của kế thừa trong Java

#### **Lợi ích**
1. **Tái sử dụng mã nguồn**: Lớp con có thể dùng lại các phương thức và thuộc tính của lớp cha, giúp giảm thiểu lặp code.
2. **Dễ bảo trì**: Khi có thay đổi trong lớp cha, tất cả lớp con sẽ tự động cập nhật, giảm công sức chỉnh sửa nhiều nơi.
3. **Tổ chức mã tốt hơn**: Giúp xây dựng mô hình phân cấp rõ ràng, dễ đọc và dễ hiểu hơn.
4. **Mở rộng chức năng dễ dàng**: Lớp con có thể bổ sung hoặc ghi đè (override) các phương thức của lớp cha để phù hợp với nhu cầu cụ thể.

#### **Hạn chế**
1. **Sự phụ thuộc giữa các lớp**: Nếu lớp cha thay đổi, có thể ảnh hưởng đến tất cả lớp con, dẫn đến lỗi không mong muốn.
2. **Không linh hoạt trong một số trường hợp**: Java không hỗ trợ đa kế thừa (một lớp con chỉ có thể kế thừa từ một lớp cha), điều này có thể hạn chế khả năng mở rộng trong một số tình huống.
3. **Có thể tạo ra cấu trúc phân cấp phức tạp**: Khi số lượng lớp cha - lớp con quá nhiều, việc quản lý mã nguồn có thể trở nên khó khăn.
4. **Gây lãng phí bộ nhớ nếu không cần thiết**: Nếu lớp con không cần tất cả các thuộc tính/phương thức của lớp cha, kế thừa vẫn tạo ra bộ nhớ dư thừa.

---

### **Tổng kết**
- **Kế thừa (Inheritance)** giúp tái sử dụng mã nguồn, dễ mở rộng và tổ chức chương trình tốt hơn.
- So với **đóng gói (Encapsulation)**, kế thừa giúp mở rộng chức năng, trong khi đóng gói giúp bảo vệ dữ liệu.
- **Ví dụ với `extends`** minh họa cách lớp con có thể sử dụng lại phương thức của lớp cha và bổ sung các phương thức riêng.
- **Lợi ích**: Tái sử dụng mã nguồn, dễ bảo trì, tổ chức mã tốt hơn.
- **Hạn chế**: Phụ thuộc vào lớp cha, không có đa kế thừa, dễ gây phức tạp nếu không thiết kế hợp lý.

Kế thừa là công cụ mạnh trong OOP nhưng cần sử dụng cẩn thận để tránh tạo ra một hệ thống quá phụ thuộc và khó bảo trì. 🚀
     */
    bt*l
}
