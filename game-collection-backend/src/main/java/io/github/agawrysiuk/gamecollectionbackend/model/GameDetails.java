package io.github.agawrysiuk.gamecollectionbackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameDetails {
    @Id
    private String slug;
    private String name;
    @Lob
    private String description;
    private String released;
    private String background_image;
    private String website;
    //platforms
    //genres
    //tags
    //esrb_rating
}
