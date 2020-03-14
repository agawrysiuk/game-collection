package io.github.agawrysiuk.gamecollectionbackend.gamedetails.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScreenShot {
    @Id
    private Long id;
    private String image;
}
