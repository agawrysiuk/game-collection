package io.github.agawrysiuk.gamecollectionbackend.service;

import io.github.agawrysiuk.gamecollectionbackend.dto.Game;
import io.github.agawrysiuk.gamecollectionbackend.respository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GameServiceWrite {
    private final GameRepository gameRepository;

    public ResponseEntity<String> saveGame(Game game) {
        Optional<Game> optionalGame = gameRepository.findById(game.getSlug());
        if (optionalGame.isEmpty()) {
            gameRepository.save(game);
            return new ResponseEntity<>("Game saved", HttpStatus.OK);
        }
        return new ResponseEntity<>("Game exists", HttpStatus.CONFLICT);
    }
}
