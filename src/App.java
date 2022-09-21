import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Opening Google Chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\frncs\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
}
