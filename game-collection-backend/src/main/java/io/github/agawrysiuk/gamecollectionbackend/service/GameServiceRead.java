package io.github.agawrysiuk.gamecollectionbackend.service;

import io.github.agawrysiuk.gamecollectionbackend.dto.Game;
import io.github.agawrysiuk.gamecollectionbackend.respository.GameRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class GameServiceRead {

    private final GameRepository gameRepository;

    public List<Game> getAllGames() {
        List<Game> list = gameRepository.findAll();
        log.info(String.valueOf(list));
        return list;
    }

    public Optional<Game> getGameById(String slug) {
        return gameRepository.findById(slug);
    }
}
