package com.clothes.noc.admin.controller;

import com.clothes.noc.admin.service.UserManageService;
import com.clothes.noc.dto.response.ApiResponse;
import com.clothes.noc.dto.response.UserCountSummaryResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@PreAuthorize(value = "hasAnyAuthority('ADMIN')")
public class UserManageController {
    final UserManageService userManageService;
    @GetMapping("/summary")
    ApiResponse<UserCountSummaryResponse> getUserCountSummary() {
        return ApiResponse.<UserCountSummaryResponse>builder()
                .body(userManageService.getUserCountSummary())
                .build();
    }
}
