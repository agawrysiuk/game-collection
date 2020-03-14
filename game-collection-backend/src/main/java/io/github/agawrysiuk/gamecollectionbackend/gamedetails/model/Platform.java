package io.github.agawrysiuk.gamecollectionbackend.gamedetails.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.utils.PlatformsDeserializer;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@JsonDeserialize(using = PlatformsDeserializer.class)
public class Platform {
    @Id
    private Long id;
    private String slug;
}
