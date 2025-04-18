package com.clothes.noc.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class UserCountSummaryResponse {
    long userCount;
    long thisWeekUserCount;
}
