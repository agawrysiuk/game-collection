package io.github.agawrysiuk.gamecollectionbackend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class ScreenShot {
    @Id
    private Long id;
    private String image;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_slug")
    private Game game;
}
