package pageObjects;

import org.openqa.selenium.By;

public class homePage extends BaseClass {

	 private static final By Home=By.xpath("//span[.='Home']");
	 private static final By video_link = By.xpath("//*[@data-qa-id='webnav-primarynav-video']");
	 
	 public void verifyHomeisDisplayed()
	 {
		 getElement(Home).click();
	 }
	 public void clickvideolink()
	 {
		 getElement(video_link).click();
	 }
}
