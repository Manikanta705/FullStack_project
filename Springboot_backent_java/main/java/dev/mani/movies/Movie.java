package dev.mani.movies;

import java.util.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movies")  // If your MongoDB has capital "M"
public class Movie {

    @Id
    private ObjectId id;

    private String imdbId;   // ✅ fix typo

    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;

    private List<String> genres;

    private List<String> backdrops;   // ✅ fix typo

    @DocumentReference
    private List<Review> reviews;   // ✅ fix typo and casing
}
