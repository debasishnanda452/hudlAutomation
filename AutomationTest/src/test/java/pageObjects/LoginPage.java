package pageObjects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;

@SuppressWarnings("unused")
public class LoginPage extends BaseClass {

	private static final String URL = "https://www.hudl.com/home";
	
	private static final By email = By.id("email");

    private static final By password = By.id("password");

    private static final By login = By.id("logIn");

    private static final By video_link = By.xpath("//*[@data-qa-id='webnav-primarynav-video']");
    private static final By first_video = By.xpath("(//*[@data-qa-id='video-details-thumbnail'])[1]");
    
    private static final By serachYourLib = By.xpath("//*[@data-qa-id='search-input']");

    private static final By highlight = By.xpath("//*[@data-qa-id='webnav-primarynav-highlights']");

    private static final By timeline = By.xpath("//*[@data-qa-id='prof-subnav-item-timeline']");
    private static final By highlight_dashboard = By.xpath("//*[@data-qa-id='prof-subnav-item-highlights']");
    private static final By schedule = By.xpath("//*[@data-qa-id='prof-subnav-item-schedule']");
    private static final By team = By.xpath("//*[@data-qa-id='prof-subnav-item-team']");

    


    public void launchApp() {
        launchURL(URL);
    }
    public void enterEmailPassword()
    {
    	getElement(email).sendKeys("debasishnanda452@gmail.com");
    	getElement(password).sendKeys(" ");
    	
    }
    public void clickLogin()
    {
    	getElement(login).click();
    }

}


