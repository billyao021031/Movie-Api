package dev.bill.movies;

import org.bson.types.ObjectId;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
    Optional<Movie> findMovieByImdbId(String imdbId);
}
