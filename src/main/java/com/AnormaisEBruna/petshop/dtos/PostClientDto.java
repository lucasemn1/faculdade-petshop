package com.AnormaisEBruna.petshop.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PostClientDto(
        @NotBlank @NotNull String name,
        @NotBlank @NotNull String email,
        @NotBlank @NotNull String phoneNumber,

        @NotNull String addressCep,
        @NotNull String addressCity,
        @NotNull  String addressState,
        @NotNull  int addressNumber,
        @NotNull  String addressStreet,
        @NotNull  String addressComplement,

        @NotNull int userId
) { }

