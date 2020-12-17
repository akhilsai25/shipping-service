package com.egen.shipping.controller;

import com.egen.shipping.model.Shipping;
import com.egen.shipping.service.ShippingService;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "egen/ship")
public class ShippingController {

    private ShippingService shippingService;

    @PostMapping
    public HttpStatus postShipping(Shipping shipping){
        shippingService.save(shipping);
        return HttpStatus.CREATED;
    }
}
