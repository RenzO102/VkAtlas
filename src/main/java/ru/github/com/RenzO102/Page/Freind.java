package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface Freind extends WriteMessage, AtlasWebElement {

    @FindBy("//a[@href='/write163760244']")
    AtlasWebElement foundMessage();
}