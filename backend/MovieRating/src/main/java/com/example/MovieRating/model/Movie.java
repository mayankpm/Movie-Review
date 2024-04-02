package com.example.MovieRating.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "release_year", nullable = false)
    private int releaseYear;

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    @JsonManagedReference(value = "movie-rating")
    private List<Rating> ratings;
}
