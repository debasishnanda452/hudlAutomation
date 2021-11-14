package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.homePage;
import pageObjects.videoPage;
import pageObjects.videoPage;
import pageObjects.homePage;
public class StepDef {

    LoginPage LoginPage=new LoginPage();
    homePage homePage=new homePage();
    videoPage videoPage = new videoPage();
    public String text="SportscodeXML";
    @Given("Home Page of HUDL is opened")
    public void home_page_of_hudl_is_opened() {
    	LoginPage.launchApp(); 
    }

    @When("I enetred valid email and password")
    public void i_enetred_valid_email_and_password() {
    	LoginPage.enterEmailPassword();
    }

    @When("I clicked on login button")
    public void i_clicked_on_login_button() {
    	LoginPage.clickLogin();
    }

    @Then("HUDL home page should be displayed")
    public void hudl_home_page_should_be_displayed() {
        homePage.verifyHomeisDisplayed();
    }

    @Given("User clicks on video link in home page")
    public void user_clicks_on_video_link_in_home_page() {
        homePage.clickvideolink();
    }

    @Given("User clicks on 1st video available in the video page")
    public void user_clicks_on_1st_video_available_in_the_video_page() {
        videoPage.clickonfirstVideo();;
    }

    @Then("video should be played")
    public void video_should_be_played() {
    	videoPage.verifyvideopagedisplayed();
    }

    @When("I search SportscodeXML in search your library box")
    public void i_search_in_search_your_library_box() {
        videoPage.enterDetailsinSearch(text);
    }

    @Then("Correct video should be displayed")
    public void correct_video_should_be_displayed() {
        videoPage.correctVideoDisplayed(text);
    }

    @Given("User clicks on Highlights link in home page")
    public void user_clicks_on_highlights_link_in_home_page() {
        videoPage.clickHighlight();
    }

    @When("Highlight page is displayed")
    public void highlight_page_is_displayed() {
        videoPage.verifyQAHireProjectElementDisplayed();
    }


    @Then("Timeline, Highlight, Team, Schedule links should be displayed")
    public void timeline_highlight_team_schedule_links_should_be_displayed() {
        videoPage.verifyallElementDisplayedinHighlightPage();
    }


    
}
