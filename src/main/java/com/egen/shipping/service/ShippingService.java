package com.egen.shipping.service;

import com.egen.shipping.model.Shipping;
import com.egen.shipping.repository.ShippingRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShippingService {

    private ShippingRepository shippingRepository;

    public ShippingService(ShippingRepository shippingRepository) {
        this.shippingRepository = shippingRepository;
    }

    public void save(Shipping shipping) {
        shippingRepository.save(shipping);
        //log
    }
}
