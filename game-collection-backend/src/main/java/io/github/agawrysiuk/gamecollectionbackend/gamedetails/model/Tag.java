package io.github.agawrysiuk.gamecollectionbackend.gamedetails.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Tag {
    @Id
    private Long id;
    private String name;
}
