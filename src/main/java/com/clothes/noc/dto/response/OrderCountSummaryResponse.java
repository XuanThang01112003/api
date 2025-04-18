package com.clothes.noc.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class OrderCountSummaryResponse {
    long orderCount;
    long thisWeekOrderCount;
    long totalAmount;
}
