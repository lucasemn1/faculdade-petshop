package com.AnormaisEBruna.petshop.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PostUserDto(
        @NotBlank @NotNull String name,
        @NotBlank @NotNull String email,
        @NotBlank @NotNull String password
) { }
