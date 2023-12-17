package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface FoundFriend extends AtlasWebElement, Freind {

    @FindBy("//input[@id='s_search']")
    AtlasWebElement foundFriend();

    @FindBy("//a[text()='Юрий Калинин' and @href='/id4929']")
    AtlasWebElement foundPerson();

    @FindBy("//span[text()='Добавить в друзья']")
    AtlasWebElement addFreind();
}