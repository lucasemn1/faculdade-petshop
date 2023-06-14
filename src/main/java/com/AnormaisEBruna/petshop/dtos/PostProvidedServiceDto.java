package com.AnormaisEBruna.petshop.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PostProvidedServiceDto(
    @NotNull @NotBlank String name,
    @NotNull double price,
    @NotNull int petId,
    @NotNull int serviceTypeId,
    @NotNull int userId
) {
}
