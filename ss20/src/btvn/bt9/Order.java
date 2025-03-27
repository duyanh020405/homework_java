package btvn.bt9;

import java.time.LocalDate;
import java.util.Optional;

public class Order {
    private int id;
    private String customerName;
    private LocalDate createdDate;
    private Optional<LocalDate> deliveryDate;

    public Order() {
        this.deliveryDate = Optional.empty();
    }

    public Order(int id, String customerName, LocalDate createdDate, Optional<LocalDate> deliveryDate) {
        this.id = id;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.deliveryDate = deliveryDate != null ? deliveryDate : Optional.empty();
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Optional<LocalDate> getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Optional<LocalDate> deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String toDisplayString() {
        return "Mã đơn hàng: " + id + "\n" +
                "Tên khách hàng: " + customerName + "\n" +
                "Ngày đặt hàng: " + createdDate + "\n" +
                "Ngày giao hàng: " + deliveryDate.map(LocalDate::toString).orElse("Chưa giao");
    }


}
