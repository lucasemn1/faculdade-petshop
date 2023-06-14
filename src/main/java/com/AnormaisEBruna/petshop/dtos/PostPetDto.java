package com.AnormaisEBruna.petshop.dtos;

import jakarta.validation.constraints.NotNull;

public record PostPetDto(
    @NotNull String type,
    @NotNull String name,
    @NotNull String description,
    @NotNull int clientId
) {
}
