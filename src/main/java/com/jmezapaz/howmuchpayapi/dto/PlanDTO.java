package com.jmezapaz.howmuchpayapi.dto;

import java.util.List;

public record PlanDTO(String name, List<PriceDTO> prices) {
}
