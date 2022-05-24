package com.corcino.bookstore.api;

import com.corcino.bookstore.dto.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/health")
public class HealthController {

    @GetMapping
    public ResponseEntity<HealthResponse> hello() {
        return ResponseEntity.ok(new HealthResponse("Hello! Bookstore is on!"));
    }

}
