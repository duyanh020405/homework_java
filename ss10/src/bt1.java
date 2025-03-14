package ss10.src;

public class bt1 {
    /*
    *
    * ### 1. Tính đóng gói là gì? Tại sao tính đóng gói lại quan trọng trong lập trình đối tượng?

**Tính đóng gói (Encapsulation)** là một trong bốn nguyên lý quan trọng của lập trình hướng đối tượng (OOP). Nó giúp **ẩn dữ liệu** (data hiding) bằng cách giới hạn quyền truy cập trực tiếp vào các thuộc tính của đối tượng và chỉ cho phép truy xuất hoặc thay đổi dữ liệu thông qua các phương thức đặc biệt.

**Tầm quan trọng của tính đóng gói**:
- **Bảo vệ dữ liệu**: Ngăn chặn sự thay đổi dữ liệu ngoài mong muốn từ bên ngoài lớp.
- **Kiểm soát quyền truy cập**: Chỉ các phương thức cụ thể có thể truy cập hoặc sửa đổi dữ liệu.
- **Dễ bảo trì và mở rộng**: Giúp quản lý mã nguồn tốt hơn, dễ sửa lỗi và nâng cấp mà không ảnh hưởng đến các thành phần khác của chương trình.
- **Tăng tính linh hoạt**: Cho phép thay đổi cách dữ liệu được xử lý bên trong mà không ảnh hưởng đến mã bên ngoài.

---

### 2. Làm thế nào để áp dụng tính đóng gói trong Java? Giải thích cách sử dụng getter và setter.

Trong Java, tính đóng gói được thực hiện bằng cách:
- **Khai báo các thuộc tính của lớp là `private`** để giới hạn quyền truy cập trực tiếp từ bên ngoài.
- **Cung cấp các phương thức `getter` và `setter` (public)** để truy xuất và cập nhật giá trị của các thuộc tính đó.

- **Getter**: Dùng để lấy giá trị của một thuộc tính.
- **Setter**: Dùng để đặt giá trị cho một thuộc tính, có thể thêm kiểm tra hợp lệ trước khi gán giá trị.

---

### 3. Ví dụ về tính đóng gói với lớp `Person`
Dưới đây là một lớp `Person` có hai thuộc tính `name` và `age` (được khai báo `private`), cùng với các phương thức `getter` và `setter` để truy xuất và thay đổi giá trị của chúng.

```java
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.setAge(age); // Sử dụng setter để kiểm tra hợp lệ
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Getter cho age
    public int getAge() {
        return age;
    }

    // Setter cho age (kiểm tra giá trị hợp lệ)
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi không hợp lệ!");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Sử dụng lớp Person
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Duy Anh", 22);
        p1.displayInfo();

        // Cập nhật thông tin
        p1.setAge(-5);  // Tuổi không hợp lệ
        p1.setAge(25);
        p1.displayInfo();
    }
- Các thuộc tính `name` và `age` được khai báo là `private`, đảm bảo không thể truy cập trực tiếp từ bên ngoài.
- Các phương thức `getName()`, `setName()`, `getAge()`, `setAge()` giúp truy cập dữ liệu một cách an toàn.
- `setAge()` có kiểm tra giá trị hợp lệ trước khi cập nhật, giúp bảo vệ dữ liệu khỏi những giá trị không hợp lệ.

### 4. Lợi ích của việc sử dụng tính đóng gói trong bảo vệ dữ liệu và kiểm soát quyền truy cập

1. **Bảo vệ dữ liệu khỏi thay đổi không mong muốn**
   - Dữ liệu không thể bị sửa đổi trực tiếp từ bên ngoài mà phải thông qua các phương thức setter với các kiểm tra hợp lệ.

2. **Kiểm soát cách dữ liệu được truy cập và sửa đổi**
   - Cho phép giới hạn quyền truy cập vào một số thông tin quan trọng.
   - Có thể thay đổi logic nội bộ mà không ảnh hưởng đến phần còn lại của chương trình.

3. **Dễ dàng bảo trì và phát triển mã nguồn**
   - Nếu cần thay đổi cách dữ liệu được lưu trữ, chỉ cần chỉnh sửa các phương thức getter/setter mà không ảnh hưởng đến mã bên ngoài.

4. **Tăng tính linh hoạt**
   - Có thể thêm các quy tắc kiểm tra dữ liệu trước khi cập nhật.
   - Hỗ trợ triển khai các chức năng bổ sung (ví dụ: ghi log khi thay đổi giá trị).

---

### Tổng kết
Tính đóng gói giúp bảo vệ dữ liệu và kiểm soát quyền truy cập, đảm bảo mã nguồn dễ bảo trì và mở rộng. Bằng cách sử dụng `private` và các phương thức `getter`/`setter`, Java giúp lập trình viên có thể áp dụng nguyên lý này một cách hiệu quả.
    *
    * */
}
