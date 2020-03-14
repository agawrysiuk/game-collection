package io.github.agawrysiuk.gamecollectionbackend.dto;

import lombok.Data;

@Data
public class GameDetailsDto {
    private String slug;
    private String name;
    private String description;
    private String released;
    private String background_image;
    private String website;
}
