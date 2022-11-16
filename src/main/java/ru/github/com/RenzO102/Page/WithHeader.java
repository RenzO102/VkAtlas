package ru.github.com.RenzO102.Page;

import io.qameta.atlas.core.api.Retry;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithHeader extends AtlasWebElement, FoundSound, FoundFriend{
    @FindBy("//span[text()='{{ text }}']")
    WithHeader input(@Param("text") String text);
}