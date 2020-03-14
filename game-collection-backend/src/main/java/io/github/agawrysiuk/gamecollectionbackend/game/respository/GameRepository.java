package io.github.agawrysiuk.gamecollectionbackend.game.respository;

import io.github.agawrysiuk.gamecollectionbackend.game.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game,String> {

    @Override
//    @Query("SELECT DISTINCT m FROM Game m LEFT JOIN FETCH m.short_screenshots s LEFT JOIN FETCH m.genres g")
    @Query("SELECT DISTINCT m FROM Game m")
    List<Game> findAll();
}
