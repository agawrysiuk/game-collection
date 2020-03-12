package io.github.agawrysiuk.gamecollectionbackend.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
public class Game {
    @Id
    private String slug;
    private String name;
    private String released;
    private String background_image;
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private Set<ScreenShot> short_screenshots;
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private Set<Genres> genres;
}
