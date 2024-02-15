package com.jmezapaz.howmuchpayapi.dto;

import java.util.List;

public record ServiceDTO(Integer id, String name, List<PlanDTO> plans) {
}
