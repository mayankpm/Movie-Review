package com.example.MovieRating.model;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rating", nullable = false)
    private int rating;
    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;
}
