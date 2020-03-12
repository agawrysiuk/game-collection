package io.github.agawrysiuk.gamecollectionbackend.controller;

import io.github.agawrysiuk.gamecollectionbackend.dto.Game;
import io.github.agawrysiuk.gamecollectionbackend.service.GameServiceRead;
import io.github.agawrysiuk.gamecollectionbackend.service.GameServiceWrite;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class GameController {
    private final GameServiceWrite serviceWrite;
    private final GameServiceRead serviceRead;

    @PostMapping("/save")
    public ResponseEntity<String> saveBook(@RequestParam Game game) {
        return serviceWrite.saveGame(game);
    }
}
