package com.AnormaisEBruna.petshop.exceptions;

public class SQLException extends Exception {
    private String message;

    public SQLException(String message) {
        super("Erro de SQL");
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.message;
    }
}
