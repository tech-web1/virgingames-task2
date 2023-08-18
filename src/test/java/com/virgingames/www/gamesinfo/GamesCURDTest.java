package com.virgingames.www.gamesinfo;

import com.virgingames.www.constants.EndPoints;
import com.virgingames.www.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class GamesCURDTest extends TestBase {

    static  String currency="currency";
    @Title("This will be get All data")
    @Test
    public void getGamesData()
    {
          SerenityRest.given()
                 .headers("Content-Type", "application/json")
                .when()
                .get(EndPoints.GET_ALL_Games)
                .then().log().all().statusCode(200)
                .extract().path("data.pots.currency");
        Assert.assertEquals(currency,"currency");

    }
    @Title("This will be get All data")
    @Test
    public void getGamesDataERU()
    {
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_GAMES_WITH_EUR)
                .then().log().all().statusCode(200)
                .extract().path("data.pots.currency");
        Assert.assertEquals(currency,"currency");
    }
    @Title("This will be get All data")
    @Test
    public void getGamesDataSEK()
    {
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_GAMES_WITH_SEK)
                .then().log().all().statusCode(200)
                .extract().path("data.pots.currency");
        Assert.assertEquals(currency,"currency");
    }

}
