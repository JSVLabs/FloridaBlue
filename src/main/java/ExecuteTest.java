import com.libraries.pages.Browser;
import com.libraries.pages.Home;
import medha.MedhaLibrary.MedhaReader;

public class ExecuteTest {
    public static void main(String[] args) {
        String[] argss = { "3zr45upw4","QA","chrome"};
        MedhaReader medhaReader = new MedhaReader("AJ5YtUxO0efwk1A6Tb8AeBa6VDXcTJxd");
        medhaReader.startTest(argss);
//        Browser browser = new Browser();
//        browser.openBrowser();
//        Home home = new Home();
//        home.enterZipCode();
//        home.selectCounty();
//        home.clickContinue();

    }
}
