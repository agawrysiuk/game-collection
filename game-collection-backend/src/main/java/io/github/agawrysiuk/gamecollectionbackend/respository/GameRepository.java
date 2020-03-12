package io.github.agawrysiuk.gamecollectionbackend.respository;

import io.github.agawrysiuk.gamecollectionbackend.dto.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,String> {
}
