package dev.bill.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Review {
    @Id
    private ObjectId id;
    private String body;   

    public void setBody(String body){
        this.body = body;
    }
}
