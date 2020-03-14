package io.github.agawrysiuk.gamecollectionbackend.gamedetails.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.utils.PlatformsDeserializer;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@JsonDeserialize(using = PlatformsDeserializer.class)
public class Platform {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String slug;
}
