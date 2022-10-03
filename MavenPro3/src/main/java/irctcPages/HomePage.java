package irctcPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement dateModify;
	@FindBy (xpath="//a[text()='17']")
	private WebElement dateSeventeen;
	@FindBy (xpath="(//span[text()='Modify Search'])[1]")
	private WebElement modify;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void home() {
		dateModify.click();
		dateSeventeen.click();
		modify.click();
		
	}

}
