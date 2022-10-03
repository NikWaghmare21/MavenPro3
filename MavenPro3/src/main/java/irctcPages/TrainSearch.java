package irctcPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainSearch {
	@FindBy (xpath="(//button[@type='submit'])[1]")
	private WebElement popupOk;
	@FindBy (xpath="(//input[@aria-autocomplete='list'])[1]")
	private WebElement fromStation;
	@FindBy (xpath="(//li[@role='option'])[2]")
	private WebElement kalyan;
	@FindBy (xpath="(//input[@aria-autocomplete='list'])[2]")
	private WebElement toStation ;
	@FindBy (xpath="(//li[@role='option'])[2]")
	private WebElement ludiyana ;
	@FindBy (xpath="(//div[@style='width: 100%;'])[2]")
	private WebElement general;
	@FindBy (xpath="//li[@aria-label='LADIES']")
	private WebElement ladies;
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement date;
	@FindBy (xpath="//a[text()='15']")
	private WebElement fifteen;
	@FindBy (xpath="(//div[@style='width: 100%;'])[1]")
	private WebElement all;
	@FindBy (xpath="((//div[@style='width: 100%;'])//li)[3]")
	private WebElement ac;
	@FindBy (xpath="//button[@type='submit']")
	private WebElement searchBt;
	

	public TrainSearch(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void home() {
		popupOk.click();
		fromStation.click();
		kalyan.click();
		toStation.click();
		ludiyana.click();
		general.click();
		ladies.click();
		fifteen.click();
		all.click();
		ac.click();
		searchBt.click();
		
	}


}
