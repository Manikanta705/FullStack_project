package dev.mani.movies;
import java.util.*;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>>allmovies() {

        return new ResponseEntity<List<Movie>>(movieService.allMovies(),HttpStatus.OK); 
    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>>getsinglemovie(@PathVariable String imdbId) {
        return new ResponseEntity<>(movieService.singlemovie(imdbId),HttpStatus.OK);
    }
    
}
