package com.example.MovieRating.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "rating", nullable = false)
    private int rating;
    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    @JsonBackReference(value="movie-rating")
    private Movie movie;
}
