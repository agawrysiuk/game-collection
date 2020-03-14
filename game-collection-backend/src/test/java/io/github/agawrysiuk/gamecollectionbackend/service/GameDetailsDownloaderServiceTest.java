package io.github.agawrysiuk.gamecollectionbackend.service;

import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.GameDetails;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.ScreenShot;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.service.GameDetailsDownloaderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Set;

@SpringBootTest
class GameDetailsDownloaderServiceTest {
    String gameName = "Max Payne";

    @Autowired
    GameDetailsDownloaderService detailsService;

    @Test
    void given_GameName_Expect_GameDetailsObject() {
        try {
            GameDetails gameDetails = detailsService.getGameDetails(gameName);
            System.out.println(gameDetails);
            Assertions.assertNotNull(gameDetails);
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

    @Test
    void given_GameName_Expect_ScreenshotsForTheGame() {
        try {
            Set<ScreenShot> screenShots = detailsService.getScreenShots(gameName);
            Assertions.assertNotNull(screenShots);
            System.out.println(screenShots.toString());
        } catch (IOException e) {
            e.printStackTrace();
        };
    }
}
