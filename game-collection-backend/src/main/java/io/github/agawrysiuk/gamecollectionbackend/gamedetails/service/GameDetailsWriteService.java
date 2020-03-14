package io.github.agawrysiuk.gamecollectionbackend.gamedetails.service;

import io.github.agawrysiuk.gamecollectionbackend.game.model.Game;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.GameDetails;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.ScreenShot;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.repository.GameDetailsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class GameDetailsWriteService {

    private final GameDetailsRepository detailsRepository;
    private final GameDetailsDownloaderService downloaderService;

    public ResponseEntity<String> saveGame(Game game) {
        String gameName = game.getSlug();
        Optional<GameDetails> optional = detailsRepository.findById(gameName);
        if(optional.isEmpty()) {
            return saveNewGameDetails(gameName);
        }
        log.info("Game {} exists.", gameName);
        return ResponseEntity.badRequest().body("Game exists");
    }

    private ResponseEntity<String> saveNewGameDetails(String gameName) {
        GameDetails gameDetails;
        try {
            gameDetails = downloaderService.getGameDetails(gameName);
            Set<ScreenShot> screenShots = downloaderService.getScreenShots(gameName);
            gameDetails.setScreenShots(screenShots);
            detailsRepository.save(gameDetails);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("Error while downloading the game {}.", gameName);
            return ResponseEntity.badRequest().body("Error while downloading the game.");
        }
        if (gameDetails.getName() == null || gameDetails.getName().equals("")) {
            log.info("Error while saving the game {}.", gameName);
            return ResponseEntity.badRequest().body("Error while saving the game.");
        }
        log.info("Game saved");
        return ResponseEntity.ok("OK");
    }
}
