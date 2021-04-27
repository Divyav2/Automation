import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnerLogin {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","E:\\Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://uat.weareimago.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/div[1]/div/input[1]")).sendKeys("swati.patil@v2solutions.com");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/div[1]/div/input[2]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/div[1]/div/button")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/a[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ui-view/div[1]/div/div/div/button")).click();


		//Thread.sleep(5000);

		//driver.quit();

}
}
