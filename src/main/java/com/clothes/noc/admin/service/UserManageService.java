package com.clothes.noc.admin.service;

import com.clothes.noc.dto.response.UserCountSummaryResponse;
import com.clothes.noc.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class UserManageService {
    private final UserRepository userRepository;
    public UserCountSummaryResponse getUserCountSummary() {
        return UserCountSummaryResponse.builder()
                .userCount(userRepository.count())
                .thisWeekUserCount(userRepository.getThisWeekUserCount(LocalDate.now()
                        .with(DayOfWeek.MONDAY)
                        .atStartOfDay()))
                .build();
    }
}
