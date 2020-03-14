package io.github.agawrysiuk.gamecollectionbackend.gamedetails.service;

import io.github.agawrysiuk.gamecollectionbackend.game.model.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GameDetailsWriteService {
    public ResponseEntity<String> saveGame(Game game) {
        //todo implement it
        return ResponseEntity.ok("OK");
    }
}
