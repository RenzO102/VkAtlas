package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface FoundGroup extends AtlasWebElement {

    @FindBy("//input[@id='groups_list_search']")
    WithHeader searchCom();
}