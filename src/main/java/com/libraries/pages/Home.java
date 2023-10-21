package com.libraries.pages;

import com.Utilities.BasePage;
import medha.MedhaLibrary.MedhaDataReader;
import medha.MedhaLibrary.MedhaReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Home extends BasePage {

    @FindBy(id = "edit-homepage-zip")
    WebElement txtZipCode;

    @FindBy(id="eac-container-edit-homepage-zip")
    WebElement lstCounties;

    @FindBy(id="continue_btn")
    WebElement Continue;

    public Home(){
        PageFactory.initElements(driver,this);
    }
    public void enterZipCode(){
        String zip = MedhaDataReader.getFieldValue("zipCode");
        //String zip = "32259";
        txtZipCode.sendKeys(zip);
        MedhaReporter.report("Enter zip code","info","");
    }

    public void selectCounty(){
        String county = MedhaDataReader.getFieldValue("CountyName");
        //String county = "32259 - SAINT JOHNS";
        List<WebElement> listCounties = lstCounties.findElements(By.tagName("li"));
        for (WebElement li : listCounties) {
          if(li.getText().equalsIgnoreCase(county)){
              li.click();
          }

        }
        MedhaReporter.report("Select the county " + county,"info","");

    }

    public void clickContinue(){
        Continue.click();
        MedhaReporter.report("Clicked on Continue button","info","");
    }
}
