package com.libraries.pages;

import com.Utilities.BasePage;
import medha.MedhaLibrary.MedhaDataReader;
import medha.MedhaLibrary.MedhaReporter;

public class Browser extends BasePage {

    public void openBrowser(){
        initialize(MedhaDataReader.getBrowser());
        //initialize("chrome");
        String url = MedhaDataReader.getFieldValue("url");
        //String url = "https://consumer.websales.floridablue.com/";
        try{
            driver.get(url);
            driver.manage().window().maximize();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        MedhaReporter.report("Browser opened","info","");
        System.out.println(MedhaDataReader.getJobId());
    }

}
