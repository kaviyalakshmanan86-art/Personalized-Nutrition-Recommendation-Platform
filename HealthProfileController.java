package com.nutrition.backend.controller;

import com.nutrition.backend.dto.HealthProfileRequest;
import com.nutrition.backend.model.HealthProfile;
import com.nutrition.backend.service.HealthProfileService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/health-profile")
public class HealthProfileController {

    private final HealthProfileService healthProfileService;

    public HealthProfileController(
            HealthProfileService healthProfileService) {

        this.healthProfileService = healthProfileService;
    }

    @PostMapping("/{userId}")
    public ResponseEntity<HealthProfile> saveProfile(
            @PathVariable Long userId,
            @RequestBody HealthProfileRequest request) {

        return ResponseEntity.ok(
                healthProfileService
                        .createOrUpdateProfile(userId, request)
        );
    }

    @GetMapping("/{userId}")
    public ResponseEntity<HealthProfile> getProfile(
            @PathVariable Long userId) {

        return ResponseEntity.ok(
                healthProfileService.getProfile(userId)
        );
    }
}