package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

public class videoPage extends BaseClass{
private static final By first_video = By.xpath("(//*[@data-qa-id='video-details-thumbnail'])[1]");
    
    private static final By serachYourLib = By.xpath("//*[@data-qa-id='search-input']");

    private static final By highlight = By.xpath("//*[@data-qa-id='webnav-primarynav-highlights']");
    private static final By videolayout = By.xpath("//div[@data-qa-id='vi-video-overlay']");
    private static final By timeline = By.xpath("//*[@data-qa-id='prof-subnav-item-timeline']");
    private static final By highlight_dashboard = By.xpath("//*[@data-qa-id='prof-subnav-item-highlights']");
    private static final By schedule = By.xpath("//*[@data-qa-id='prof-subnav-item-schedule']");
    private static final By team = By.xpath("//*[@data-qa-id='prof-subnav-item-team']");
    private static final By firstSearchedVideo=By.xpath("(//h4[@class='uni-subhead'])[1]");
    private static final By QAHireProject=By.xpath("//h2[contains(text(),'QA Hire')]");
    
    
    public void clickonfirstVideo()
    {
    	getElement(first_video).click();
    }
    public void verifyvideopagedisplayed()
    {
    	getElement(videolayout).isDisplayed();
    }
    public void enterDetailsinSearch(String searchvideo)
    {
    	getElement(serachYourLib).sendKeys(searchvideo);
    }
    public void correctVideoDisplayed(String requiredText)
    {
    	String searchedvideotext=getElement(firstSearchedVideo).getText();
    	//searchedvideotext.compareToIgnoreCase(requiredText);
    	assertEquals(searchedvideotext,requiredText);
    }
    public void clickHighlight()
    {
    	getElement(highlight).click();
    }
    public void verifyQAHireProjectElementDisplayed()
    {
    	getElement(QAHireProject).isDisplayed();
    }
    public void verifyallElementDisplayedinHighlightPage()
    {
    	getElement(timeline).isDisplayed();
    	getElement(team).isDisplayed();
    	getElement(schedule).isDisplayed();
    	getElement(highlight).isDisplayed();
    }
}
