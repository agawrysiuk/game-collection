package io.github.agawrysiuk.gamecollectionbackend.service;

import io.github.agawrysiuk.gamecollectionbackend.game.model.Game;
import io.github.agawrysiuk.gamecollectionbackend.game.respository.GameRepository;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.service.GameDetailsDownloaderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class GameServiceWrite {
    private final GameDetailsDownloaderService detailsService;
    private final GameRepository gameRepository;

    public ResponseEntity<String> saveGame(Game game) {
        Optional<Game> optionalGame = gameRepository.findById(game.getSlug());
        if (optionalGame.isEmpty()) {
            gameRepository.save(game);
            log.info("Game {} saved",game.getName());
            return new ResponseEntity<>("Game saved", HttpStatus.OK);
        }
        log.info("Game {} exists",game.getName());
        return new ResponseEntity<>("Game exists", HttpStatus.CONFLICT);
    }
}
