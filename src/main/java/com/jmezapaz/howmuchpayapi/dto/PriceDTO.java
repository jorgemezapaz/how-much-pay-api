package com.jmezapaz.howmuchpayapi.dto;

import java.math.BigDecimal;

public record PriceDTO(String country, String currency, BigDecimal amount) {
}
