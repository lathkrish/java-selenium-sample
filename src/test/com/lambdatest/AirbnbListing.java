//Import the necessary packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirbnbListing {

    public static void main(String[] args) {
        //Create a WebDriver object
        WebDriver driver = new ChromeDriver();
        
        //Navigate to the Airbnb website
        driver.get("https://www.airbnb.com/");
        
        //Login with valid credentials
        driver.findElement(By.id("field-guide-toggle")).click();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("email")).sendKeys("test@example.com"); //Replace with your email
        driver.findElement(By.id("password")).sendKeys("password123"); //Replace with your password
driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        
        //Click on the "List your space" or "Become a host" option
        driver.findElement(By.linkText("List your space")).click();
        
        //Enter the necessary details to list a property for rent
        //Location
        driver.findElement(By.id("location_input")).sendKeys("New York, NY");
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        
        //Property type
        driver.findElement(By.xpath("//div[contains(text(),'Entire place')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
//Guests
        driver.findElement(By.xpath("//div[contains(text(),'Up to 4 guests')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        
        //Bedrooms and beds
        driver.findElement(By.xpath("//div[contains(text(),'1 bedroom')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'1 bed')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        
        //Bathrooms
        driver.findElement(By.xpath("//div[contains(text(),'1 bathroom')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
//Amenities
        driver.findElement(By.xpath("//button[contains(text(),'Skip for now')]")).click();
        
        //Spaces guests can use
        driver.findElement(By.xpath("//button[contains(text(),'Skip for now')]")).click();
        
        //Photos
        WebElement upload = driver.findElement(By.id("photo-upload-input"));
        upload.sendKeys("/path/to/photo.jpg"); //Replace with your photo path
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        
        //Description
        driver.findElement(By.id("title-input")).sendKeys("Cozy apartment in NYC");
        driver.findElement(By.id("summary-input")).sendKeys("A comfortable and convenient place to stay in the heart of New York City.");
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        
        //Location details
        driver.findElement(By.id("address-line-1-input")).sendKeys("123 Main Street");
        driver.findElement(By.id("address-line-2-input")).sendKeys("Apt 4");
        driver.findElement(By.id("city-input")).sendKeys("New York");
        driver.findElement(By.id("state-input")).sendKeys("NY");
driver.findElement(By.id("postal-code-input")).sendKeys("10001");
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        
        //Pricing
        driver.findElement(By.id("price-input")).clear();
        driver.findElement(By.id("price-input")).sendKeys("100");
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        
        //Calendar
        driver.findElement(By.xpath("//button[contains(text(),'Skip for now')]")).click();
        
        //House rules
        driver.findElement(By.xpath("//button[contains(text(),'Skip for now')]")).click();

//Review and publish
        driver.findElement(By.xpath("//button[contains(text(),'Publish now')]")).click();

        
    }
}


