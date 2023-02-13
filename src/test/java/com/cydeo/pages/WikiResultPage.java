package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiResultPage {

    public WikiResultPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstHeading")
    public WebElement mainHeader;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;

}
