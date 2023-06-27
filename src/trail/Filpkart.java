package trail;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("working on  amazon page ");

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");

		//creating an object for  Browser
		ChromeDriver obj=new ChromeDriver();

		//opening amazon page through chrome brwoser 
		//obj.navigate().to("http://www.amazon.com");
		obj.get("http://www.amazon.com");


	}

}
