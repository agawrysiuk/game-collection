package io.github.agawrysiuk.gamecollectionbackend.gamedetails.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Genre {
    @Id
    private Long id;
    private String name;
}
