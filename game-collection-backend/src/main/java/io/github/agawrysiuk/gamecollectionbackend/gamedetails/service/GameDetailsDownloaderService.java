package io.github.agawrysiuk.gamecollectionbackend.gamedetails.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.GameDetails;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.utils.GameNameFormatter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;

@Service
public class GameDetailsDownloaderService {
    private final static String GAME_URL = "https://api.rawg.io/api/games/";
    private final static String SCREENSHOTS_URL = "/screenshots";

    public GameDetails readJsonFromUrl(String gameName) throws IOException {
        URL rawgUrl = new URL(GAME_URL + GameNameFormatter.changeTitleToURLFormat(gameName));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(rawgUrl, GameDetails.class);
    }

}
