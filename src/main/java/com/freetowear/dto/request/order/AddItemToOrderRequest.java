package com.freetowear.dto.request.order;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddItemToOrderRequest {

    @NotNull
    private String idProduct;

    @NotNull
    private String idVariation;

    @NotNull
    @Positive
    private Integer quantity;

    public AddItemToOrderRequest() {}

    public AddItemToOrderRequest(String idProduct, String idVariation, Integer quantity) {
        this.idProduct = idProduct;
        this.idVariation = idVariation;
        this.quantity = quantity;
    }
}