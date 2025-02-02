package com.example.managementlibrary.dto.request;

import com.example.managementlibrary.entity.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class CartRequest {

    @NotNull
    @Min(value = 1)
    private Long id;
    private List<CartItemRequest> cartItems;
}
