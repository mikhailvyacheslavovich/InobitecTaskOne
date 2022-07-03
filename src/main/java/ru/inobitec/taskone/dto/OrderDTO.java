package ru.inobitec.taskone.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.inobitec.taskone.model.OrderItem;
import ru.inobitec.taskone.model.Orders;

import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
public class OrderDTO {
    private Long id;
    private Integer orderStatusId;
    private String customerName;
    private String customerPhone;
    private String customerComment;
    List<OrderItem> orderItems;

    public static OrderDTO buildOrderDto(Orders order, List<OrderItem> orderItems){
        OrderDTO orderDto = new OrderDTO();
        orderDto.setId(order.getId());
        orderDto.setOrderStatusId(order.getOrderStatusId());
        orderDto.setCustomerName(order.getCustomerName());
        orderDto.setCustomerPhone(order.getCustomerPhone());
        orderDto.setCustomerComment(order.getCustomerComment());
        orderDto.setOrderItems(orderItems);
        return orderDto;
    }
}