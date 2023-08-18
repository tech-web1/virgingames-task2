package com.virgingames.www.gamesinfo;

import com.virgingames.www.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;

public class GamesSteps {

    String currency = "currency";

    @Step
    @Title("This will be get All data")
    public ValidatableResponse getGamesData(){
       return SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_Games)
                .then().log().all().statusCode(200);
    }

    @Title("This will be get All ERU Currency")
    public ValidatableResponse getGamesDataERU()
    {
        return SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_GAMES_WITH_EUR)
                .then().log().all().statusCode(200);
    }
    @Title("This will be get All SEK Currency")
    public ValidatableResponse getGamesDataSEK()
    {
        return SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_GAMES_WITH_SEK)
                .then().log().all().statusCode(200);
    }

}
