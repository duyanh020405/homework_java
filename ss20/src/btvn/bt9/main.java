package btvn.bt9;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "Quý", LocalDate.of(2025, 3, 20), Optional.of(LocalDate.of(2025, 3, 25))),

                new Order(2, "Lan", LocalDate.of(2025, 3, 21), null),

                new Order(3, "Minh", LocalDate.of(2025, 3, 22), Optional.of(LocalDate.of(2025, 3, 23))),

                new Order(4, "Huyền", LocalDate.of(2025, 3, 23), null),

                new Order(5, "Việt", LocalDate.of(2025, 3, 23), Optional.of(LocalDate.of(2025, 3, 30)))

        );

        System.out.println("---- Các đơn đã giao -----");
        List<Order> shipped = orders.stream()
                .filter(o -> o.getDeliveryDate().isPresent())
                .toList();

        shipped.forEach(o -> System.out.println("id: " + o.getId() + " | KH: " + o.getCustomerName() +
                " | Đặt: " + o.getCreatedDate() + " | Giao: " + o.getDeliveryDate().get()));

        System.out.println("---- Các đơn chưa giao -----");
        List<Order> unshipped = orders.stream()
                .filter(o -> o.getDeliveryDate().isEmpty())
                .toList();

        unshipped.forEach(o -> System.out.println("id: " + o.getId() + " | KH: " + o.getCustomerName() +
                " | Đặt: " + o.getCreatedDate() + " | Giao: Chưa giao"));


        long countShipped = orders.stream()
                .filter(o -> o.getDeliveryDate().isPresent())
                .map(o -> o.getDeliveryDate().get())
                .filter(date -> date.compareTo(LocalDate.of(2025, 3, 17)) >= 0 &&
                        date.compareTo(LocalDate.of(2025, 3, 23)) <= 0)
                .count();

        System.out.println("== Số đơn hàng đã giao từ 2025-03-17 đến 2025-03-23 ==");
        System.out.println("Tổng đơn: " + countShipped);







    }
}
