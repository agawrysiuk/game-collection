package io.github.agawrysiuk.gamecollectionbackend.gamedetails.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

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
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "platforms_id")
    private Set<Platform> platforms;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "genre_id")
    private Set<Genre> genres;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "tag_id")
    private Set<Tag> tags;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "screenshot_id")
    private Set<ScreenShot> screenShots;
}
