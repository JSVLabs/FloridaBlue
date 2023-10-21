package com.libraries.pages;

import com.Utilities.BasePage;
import medha.MedhaLibrary.MedhaDataReader;
import medha.MedhaLibrary.MedhaReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetaQuote extends BasePage {
    @FindBy(id="zipcode")
    WebElement zipcode;

    @FindBy(id="")
    WebElement addmore;

    public GetaQuote(){
        PageFactory.initElements(driver,this);
    }

    public void verifyZipCode(){
        String zip = MedhaDataReader.getFieldValue("zipcode");
        String getZipText = zipcode.getText();
        MedhaReporter.assertEqual("Verify zip code ",zip.toLowerCase(),getZipText.toLowerCase());
    }

    public void selectPeople(){
        String people = MedhaDataReader.getFieldValue("people");
        WebElement dynamicButton = driver.findElement(By.xpath("//li/button[@class='option' and @role='radio' and text()='" + people + "']"));
        dynamicButton.click();
        MedhaReporter.report("Select number of famialy members","info","");
    }

    public void clickAddMore(){

    }


}
