package io.infoservice.resources;

import io.infoservice.models.Games;
import io.infoservice.models.GameSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/games")
public class GamesResource {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{gameId}")
    public Movie getGameInfo(@PathVariable("movieId") String movieId) {
        GameSummary gameSummary = restTemplate.getForObject("https://api-v3.igdb.com/games/" + gameId + "?api_key=" +  apiKey, GameSummary.class);
        return new Games(gameId, gameSummary.getTitle(), gameSummary.getOverview());

    }

}
