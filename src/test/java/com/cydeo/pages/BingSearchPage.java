package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingSearchPage {

    //#1:
    public BingSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //#2:
    @FindBy(name = "q")
    public WebElement searchBox;

}
