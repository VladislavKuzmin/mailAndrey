import Common.BasicSetting;
import Pages.PageManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMailRu extends BaseTest {


//    @BeforeEach
//    public void urlMain(){
//        System.out.println("Test123");
//    }

    @Test
    public void moveMessageToDraft() throws InterruptedException {
        pageManager.mainPageTest.enterButtonMain();
        pageManager.loginPageTest.iframeLoginPage()
                .usernameLoginPage("kiril1batsilev@mail.ru")
                .nextButtonClick()
                .passwordLoginPage("karabas22barabas")
                .signInButtonLoginPage();
        pageManager.incomingMessagesPageTest.clickDraftButton();

//        if (draftPageTest.numberOfMessageInDraft()>0){
//            Assertions.assertTrue(true);
//            System.out.println("the draft isn't empty ");
//        }
//        else{
//            Assertions.assertFalse(false);
//            System.out.println("the draft is empty");
//        }
    }

    @Test
    public void moveMessageToDraft1() throws InterruptedException {
        pageManager.mainPageTest.enterButtonMain();
        pageManager.loginPageTest.iframeLoginPage()
                .usernameLoginPage("kiril1batsilev@mail.ru")
                .nextButtonClick()
                .passwordLoginPage("karabas22barabas")
                .signInButtonLoginPage();
        pageManager.incomingMessagesPageTest.clickDraftButton();

//        if (draftPageTest.numberOfMessageInDraft()>0){
//            Assertions.assertTrue(true);
//            System.out.println("the draft isn't empty ");
//        }
//        else{
//            Assertions.assertFalse(false);
//            System.out.println("the draft is empty");
//        }
    }


}
