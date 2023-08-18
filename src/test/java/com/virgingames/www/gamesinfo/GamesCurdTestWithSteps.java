package com.virgingames.www.gamesinfo;

import com.virgingames.www.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class GamesCurdTestWithSteps extends TestBase {

    @Steps
    GamesSteps gamesSteps;

    @Title("This will be get All Games")
    @Test
    public void test001()
    {
        gamesSteps.getGamesData();
    }

    @Title("This will be get All ERU Currency")
    @Test
    public void test002()
    {
        gamesSteps.getGamesDataERU();
    }

    @Title("This will be get All SEK Currency")
    @Test
    public void test003()
    {
        gamesSteps.getGamesDataSEK();
    }


}

