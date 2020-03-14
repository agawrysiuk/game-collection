package io.github.agawrysiuk.gamecollectionbackend.gamedetails.repository;

import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.GameDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameDetailsRepository extends JpaRepository<GameDetails, String> {
    @Override
    @Query("SELECT DISTINCT g FROM GameDetails g LEFT JOIN FETCH g.platforms p LEFT JOIN FETCH g.genres n LEFT JOIN FETCH g.tags t")
    List<GameDetails> findAll();
}
