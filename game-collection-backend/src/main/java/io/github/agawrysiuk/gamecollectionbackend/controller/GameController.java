package io.github.agawrysiuk.gamecollectionbackend.controller;

import io.github.agawrysiuk.gamecollectionbackend.game.model.Game;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.GameDetails;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.service.GameDetailsReadService;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.service.GameDetailsWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GameController {
    private final GameDetailsWriteService serviceWrite;
    private final GameDetailsReadService serviceRead;

    @PostMapping("/save")
    public ResponseEntity<String> saveGame(@RequestBody Game game) {
        return serviceWrite.saveGame(game);
    }

    @GetMapping("/games")
    @ResponseBody
    public List<GameDetails> getGames() {return serviceRead.getAllGames();}
}
