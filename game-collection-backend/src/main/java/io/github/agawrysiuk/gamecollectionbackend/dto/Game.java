package io.github.agawrysiuk.gamecollectionbackend.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.util.Set;

@Getter
@Setter
public class Game {
    @Id
    private String slug;
    private String name;
    private String released;
    private String background_image;
    private Set<ScreenShot> short_screenshots;
    private Set<Genres> genres;
}
