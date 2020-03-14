package io.github.agawrysiuk.gamecollectionbackend.controller;

import io.github.agawrysiuk.gamecollectionbackend.model.Game;
import io.github.agawrysiuk.gamecollectionbackend.service.GameServiceRead;
import io.github.agawrysiuk.gamecollectionbackend.service.GameServiceWrite;
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
    private final GameServiceWrite serviceWrite;
    private final GameServiceRead serviceRead;

    @PostMapping("/save")
    public ResponseEntity<String> saveGame(@RequestBody Game game) {
        return serviceWrite.saveGame(game);
    }

    @GetMapping("/games")
    @ResponseBody
    public List<Game> getGames() {return serviceRead.getAllGames();}
}
