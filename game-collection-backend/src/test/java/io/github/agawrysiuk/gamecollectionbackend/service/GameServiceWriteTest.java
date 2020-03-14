package io.github.agawrysiuk.gamecollectionbackend.service;

import io.github.agawrysiuk.gamecollectionbackend.dto.Game;
import io.github.agawrysiuk.gamecollectionbackend.dto.ScreenShot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
@ActiveProfiles("test")
class GameServiceWriteTest {

    @Autowired
    private GameServiceWrite gameServiceWrite;
    @Autowired
    private GameServiceRead gameServiceRead;

    @Test
    public void when_gameHasMinusOneIdScreenshot_expect_notSaveThatScreenshot() {
        ScreenShot screenShot1 = new ScreenShot(-1L, "asdfg");
        ScreenShot screenShot2 = new ScreenShot(2L, "12345");
        Game game = new Game();
        game.setSlug("test");
        game.setShort_screenshots(new LinkedHashSet<>());
        game.getShort_screenshots().add(screenShot1);
        game.getShort_screenshots().add(screenShot2);
        gameServiceWrite.saveGame(game);
        Optional<Game> testedGame = gameServiceRead.getGameById("test");
        Assertions.assertTrue(testedGame.isPresent());
        Assertions.assertFalse(testedGame.get().getShort_screenshots().contains(screenShot1));
    }
}
