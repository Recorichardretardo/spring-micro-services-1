package com.example.product.enquiry.service.client;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.product.enquiry.service.beans.ProductEnquiryBean;

//@FeignClient(name="product-stock-service", url="localhost:8800")
@FeignClient(name="product-stock-service")

public interface ProductStockClient {

   @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductEnquiryBean checkProductStock(@PathVariable String productName,
                                              @PathVariable String productAvailability);

}