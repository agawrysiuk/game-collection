package io.github.agawrysiuk.gamecollectionbackend.game.model;

import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.Genre;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.ScreenShot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    private String slug;
    private String name;
    private String released;
    private String background_image;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "screenshot_id")
    private Set<ScreenShot> short_screenshots;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "genre_id")
    private Set<Genre> genres;
}
