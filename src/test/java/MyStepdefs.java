import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.*;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    LoginPage loginPage =new LoginPage();

    ProductPage productPage =new ProductPage();

    EmailToFriendPage emailToFriendPage =new EmailToFriendPage();

    EmailToFriendResultPage emailToFriendResultPage = new EmailToFriendResultPage();
    @Given("I am on registration page")
    public void iAmOnRegistrationPage() {
        homePage.clickOnRegisterButton();
    }

    @When("I enter required registration details")
    public void iEnterRequiredRegistrationDetails() {
      registerPage.enterRegisterDetails();
    }

    @Then("I should able to register successfully")
    public void iShouldAbleToRegisterSuccessfully() {
    registerResultPage.VerifyUserRegisterSuccessfully();
    }

    @When("I enter required registration New details")
    public void iEnterRequiredRegistrationNewDetails() {
     registerPage.enterRegistrationNewDetails();
    }

    @And("Click on log in button and fill required details")

    public void clickOnLogInButtonAndFillRequiredDetails() {
        loginPage.enterLoginDetails();
    }

    @And("Click on selected product")
    public void clickOnSelectedProduct() {
      productPage.VerifyUserSelectProductSuccessful();
    }

    @Then("I should able to email  this product to friend")
    public void iShouldAbleToEmailThisProductToFriend() {
       emailToFriendPage.enterSendFriendMailDetails();
    }

    @Then("Friend should get message")
    public void friendShouldGetMessage() {
        emailToFriendResultPage.VerifyUserSendEmailFriendsSuccessfully();
    }
}
