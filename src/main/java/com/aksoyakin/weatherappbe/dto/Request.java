package com.aksoyakin.weatherappbe.dto;

public record Request(
        String type,
        String query,
        String language,
        String unit
) {
}
