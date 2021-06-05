import org.openqa.selenium.chrome.ChromeDriver;

public class NhiMain {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");

        Account account = new Account(driver);
        TS_01_login ts_01_login = new TS_01_login(account);
    }
}
