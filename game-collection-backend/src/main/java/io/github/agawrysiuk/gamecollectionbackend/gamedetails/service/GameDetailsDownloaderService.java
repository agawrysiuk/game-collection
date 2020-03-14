package io.github.agawrysiuk.gamecollectionbackend.gamedetails.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.GameDetails;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.model.ScreenShot;
import io.github.agawrysiuk.gamecollectionbackend.gamedetails.utils.GameNameFormatter;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URL;
import java.util.Set;

@Service
public class GameDetailsDownloaderService {
    private final static String GAME_URL = "https://api.rawg.io/api/games/";
    private final static String SCREENSHOTS_URL = "/screenshots";
    private ObjectMapper objectMapper;

    @PostConstruct
    public void postInit() {
        objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public GameDetails getGameDetails(String gameName) throws IOException {
        URL rawgUrl = new URL(GAME_URL + GameNameFormatter.changeTitleToURLFormat(gameName));
        return objectMapper.readValue(rawgUrl, GameDetails.class);
    }

    public Set<ScreenShot> getScreenShots(String gameName) throws IOException {
        URL rawgUrl = new URL(GAME_URL + GameNameFormatter.changeTitleToURLFormat(gameName) + SCREENSHOTS_URL);
        JsonNode json = objectMapper.readTree(rawgUrl);
        return objectMapper.readValue(json.get("results").traverse(),new TypeReference<Set<ScreenShot>>(){});
    }

}
