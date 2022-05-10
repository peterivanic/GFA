package com.gfa.api.model;


import lombok.Data;

@Data
public class Error {
    private String error;

    public Error(String error) {
        this.error = error;
    }
}
