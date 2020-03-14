package io.github.agawrysiuk.gamecollectionbackend.service;

import io.github.agawrysiuk.gamecollectionbackend.model.GameDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class GameDetailsDownloaderServiceTest {

    @Test
    void readJsonFromUrl() {
        String gameName = "Max Payne";
        GameDetailsDownloaderService detailsService = new GameDetailsDownloaderService();
        try {
            GameDetails gameDetails = detailsService.readJsonFromUrl(gameName);
            System.out.println(gameDetails);
            Assertions.assertNotNull(gameDetails);
        } catch (IOException e) {
            e.printStackTrace();
        };
    }
}
