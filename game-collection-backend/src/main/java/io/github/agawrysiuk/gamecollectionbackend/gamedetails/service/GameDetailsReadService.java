package io.github.agawrysiuk.gamecollectionbackend.gamedetails.service;

import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.GameDetails;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.repository.GameDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameDetailsReadService {

    private final GameDetailsRepository detailsRepository;

    public List<GameDetails> getAllGames() {
        return detailsRepository.findAll();
    }
}
