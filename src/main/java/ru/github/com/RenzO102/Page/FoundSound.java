package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface FoundSound extends AtlasWebElement {

    @FindBy("//button[@class='audio_page_player_ctrl audio_page_player_play _audio_page_player_play']")
    FoundSound playmusic();

}