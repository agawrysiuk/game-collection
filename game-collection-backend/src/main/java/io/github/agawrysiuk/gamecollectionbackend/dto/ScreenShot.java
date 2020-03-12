package io.github.agawrysiuk.gamecollectionbackend.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class ScreenShot {
    @Id
    private Long id;
    private String image;
}
