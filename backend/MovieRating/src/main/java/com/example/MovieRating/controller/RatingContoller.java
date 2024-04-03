package com.example.MovieRating.controller;

import com.example.MovieRating.model.Rating;
import com.example.MovieRating.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/rating")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RatingContoller {

    @Autowired
    private RatingRepository ratingRepository;

    @GetMapping
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rating> getRatingById(@PathVariable Long id) {
        return ratingRepository.findById(id)
                .map(rating -> ResponseEntity.ok().body(rating))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Rating createRating(@RequestBody Rating rating) {
        return ratingRepository.save(rating);
    }
}