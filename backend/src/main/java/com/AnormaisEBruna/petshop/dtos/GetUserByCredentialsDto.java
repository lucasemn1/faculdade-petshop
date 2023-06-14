package com.AnormaisEBruna.petshop.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record GetUserByCredentialsDto(
    @NotBlank @NotNull String email,
    @NotBlank @NotNull String password
) { }
