package dev.mani.movies;
import java.util.*;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {  
       
        return movieRepository.findAll();
    }
     public Optional<Movie> singlemovie(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
