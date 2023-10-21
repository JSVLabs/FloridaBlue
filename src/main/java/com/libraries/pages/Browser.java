package com.libraries.pages;

import com.Utilities.BasePage;
import medha.MedhaLibrary.MedhaDataReader;
import medha.MedhaLibrary.MedhaReporter;

public class Browser extends BasePage {

    public void openBrowser(){
        initialize(MedhaDataReader.getBrowser());
        String url = MedhaDataReader.getFieldValue("url");
        try{
            driver.get(url);
            driver.manage().window().maximize();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        MedhaReporter.report("Browser opened","info","");
    }

}
