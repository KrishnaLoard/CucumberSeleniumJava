package com.krishnasPackage.basePackage;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.krishnasPackage.fatures.CollectionVariables;
import com.krishnasPackage.fatures.ConfigurationEnv;
import com.krishnasPackage.pages.ArtofTestingPage;
import com.krishnasPackage.pages.CommonMethods;
import com.krishnasPackage.pages.GooglePageBase;
import com.krishnasPackage.pages.MainBasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Map;

public class BaseDriverClass {

    //Main Web Driver
    public WebDriver driver;

    //Pages Initialization
    public MainBasePage basePage;
    public GooglePageBase googleBasePage;
    public ArtofTestingPage artofTestingPage;
    public CommonMethods commonMethods;

    public BaseDriverClass() throws Exception {
        // TODO Auto-generated constructor stub
        CollectionVariables.environmentConfiguration = new Gson();
        FileReader configReader = ReadFileConfig(System.getProperty("user.dir") + "/SeleniumConfigFile.json");

        Type typeConvert = new TypeToken<Map<String, Object>>() {
            private static final long serialVersionUID = 1L;
        }.getType();

        // Map Configuration
        Map<String, Object> configEnv = CollectionVariables.environmentConfiguration.fromJson(configReader,
                typeConvert);
        //System.out.println("Environment Configuration File --> " + configEnv);

        // Convert The TestSettings into the Object
        CollectionVariables.configurationEnv = CollectionVariables.environmentConfiguration
                .fromJson(configEnv.get("TestSettings").toString(), ConfigurationEnv.class);

        // IF Browser is Google Chrome
        if (CollectionVariables.configurationEnv.getBrowserType().endsWith("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (CollectionVariables.configurationEnv.getBrowserType().endsWith("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        basePage = new MainBasePage(driver);
        googleBasePage = new GooglePageBase(driver);
        artofTestingPage = new ArtofTestingPage(driver);
        commonMethods = new CommonMethods(driver);

        //driver.get("https://" + CollectionVariables.configurationEnv.getBaseUrl());
        driver.get(CollectionVariables.configurationEnv.getBaseUrl());

        // Verify the page title
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        assert title.contains("Google") : "Title does not match!";
    }

    @After
    public void TearDownMethod() {
        driver.quit();
    }

    public FileReader ReadFileConfig(String FilePath) {
        try {

            return new FileReader(FilePath);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }
}
