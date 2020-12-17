package com.egen.shipping.service;

import com.egen.shipping.model.Shipping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import javax.persistence.Column;

@Component
@Slf4j
@AllArgsConstructor
public class ShippingEventsWorker {

    private ObjectMapper objectMapper = new ObjectMapper();
    private ShippingService shippingService;

    @Column(name = "shipping_id")
    private long id;
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "order_shipping_addressline1")
    private String addressLine1;
    @Column(name = "order_shipping_addressline2")
    private String addressLine2;
    @Column(name = "order_shipping_city")
    private String city;
    @Column(name = "order_shipping_state")
    private String state;
    @Column(name = "order_shipping_zip")
    private int zip;
    @Column(name = "order_shipping_country")
    private String country;

    @RabbitListener(queues = "shipping-events-order-service")
    public void receiveEvent(String message) {
        try {
            ShippingEvent event = objectMapper.readValue(message, ShippingEvent.class);

            Shipping shipping = new Shipping();
            shipping.setOrderId(event.getOrderId());
            shipping.setAddressLine1(event.getAddressLine1());
            shipping.setAddressLine2(event.getAddressLine2());
            shipping.setCity(event.getCity());
            shipping.setCountry(event.getCountry());
            shipping.setState(event.getState());
            shipping.setZip(event.getZip());
           shippingService.save(shipping);
        } catch (JsonProcessingException e) {
//            log(String.format("Unable to process event from shipping: %s", message), e);
        }
    }
}
