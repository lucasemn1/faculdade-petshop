package com.AnormaisEBruna.petshop.dtos;

import jakarta.validation.constraints.NotNull;

public record PostSaleDto (
    @NotNull float price,
    @NotNull String description,
    @NotNull int userId
) {
}
