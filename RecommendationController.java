package com.nutrition.backend.controller;

import com.nutrition.backend.dto.RecommendationResponse;
import com.nutrition.backend.service.RecommendationService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController(
            RecommendationService recommendationService) {

        this.recommendationService = recommendationService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<RecommendationResponse>>
    getRecommendations(@PathVariable Long userId) {

        return ResponseEntity.ok(
                recommendationService
                        .generateRecommendations(userId)
        );
    }
}