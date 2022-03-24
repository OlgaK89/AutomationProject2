import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] arg) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\kobro\\Downloads\\Browsers\\edgedriver_win64\\msedgedriver.exe");


        WebDriver driver = new EdgeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        Thread.sleep(2000);

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Order")).click();
        Thread.sleep(1000);

        int randomNumber = (int) (Math.random() * 100);
        String random = "" + randomNumber;

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).clear();
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(random);
        Thread.sleep(2000);

        driver.findElement(By.className("btn_dark")).click();


        int pricePerUnit = 100;
        String total;

        if (randomNumber < 10) {
            total = "" + randomNumber * pricePerUnit;
            System.out.println(total);
        } else {
            total = "" + ((randomNumber * pricePerUnit) - ((randomNumber * pricePerUnit) / 100) * 8);
            System.out.println(total);

            Assert.assertFalse(Boolean.parseBoolean(total));

        }
        Thread.sleep(2000);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).click();
        String[] name = {"Jonny Depp", "Tom Cruise", "Michael Jackson", "Sandra Bullock", "Nathalie Portman"};
        Random randomName = new Random();
        int a = randomName.nextInt(name.length);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys(name[a]);

        Thread.sleep(1000);

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).click();
        String[] streetName = {"1900 5th ave", "453 Main str", "65 Water str", "1927 Church ave", "Hollywood sign"};
        Random randomStreet = new Random();
        int i = randomStreet.nextInt(streetName.length);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys(streetName[i]);

        Thread.sleep(1000);

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).click();
        String[] city = {"New York", "Chicago", "Miami", "Cleveland", "Los Angeles"};
        Random random1 = new Random();
        int index = random1.nextInt(city.length);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys(city[index]);

        Thread.sleep(1000);

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).click();
        String[] state = {"NY", "IL", "FL", "OH", "CA"};
        Random random2 = new Random();
        int index1 = random2.nextInt(state.length);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys(state[index1]);

        Thread.sleep(1000);


        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).click();
        int zip = (int) (9999 + (Math.random() * 10000));
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys(zip + "");

        Thread.sleep(1000);


        List<WebElement> web = driver.findElements(By.name("ctl00$MainContent$fmwOrder$cardList"));
        Random randomCard = new Random();
        int index4 = randomCard.nextInt(web.size());
        web.get(index4).click();
        Thread.sleep(2000);
        WebElement visaCard = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        WebElement masterCard = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1"));
        WebElement americanExpress = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2"));

        Thread.sleep(2000);
        if (visaCard.equals(web.get(index4))) {
            long num1 = 1000 + (int) (Math.random() * 9000);
            long num2 = 1000 + (int) (Math.random() * 9000);
            long num3 = 1000 + (int) (Math.random() * 9000);
            long num4 = 1000 + (int) (Math.random() * 9000);
            String visa = "4" + num1 + num2 + num3 + num4;

            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(visa);
            Thread.sleep(2000);
            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("03/25");
            Thread.sleep(2000);
            driver.findElement(By.className("btn_light")).click();

            Thread.sleep(1000);

        } else if (masterCard.equals(web.get(index4))) {

            long num1 = 1000 + (int) (Math.random() * 9000);
            long num2 = 1000 + (int) (Math.random() * 9000);
            long num3 = 1000 + (int) (Math.random() * 9000);
            long num4 = 1000 + (int) (Math.random() * 9000);
            String master = "5" + num1 + num2 + num3 + num4;

            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(master);
            Thread.sleep(2000);
            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("03/25");
            Thread.sleep(2000);
            driver.findElement(By.className("btn_light")).click();

            Thread.sleep(1000);
        } else if (americanExpress.equals(web.get(index4))) {

            int num1 = 1000 + (int) (Math.random() * 9000);
            int num2 = 1000 + (int) (Math.random() * 9000);
            int num3 = 1000 + (int) (Math.random() * 9000);
            int num4 = 10 + (int) (Math.random() * 90);
            String american = "3" + num1 + num2 + num3 + num4;
            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(american);
            Thread.sleep(2000);
            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("03/25");
            Thread.sleep(2000);
            driver.findElement(By.className("btn_light")).click();

        }
        Thread.sleep(2000);
        if (driver.getPageSource().contains("New order has been successfully added.")) {
            System.out.println("Verified");
        } else {
            System.out.println("Failed");
        }

        Thread.sleep(2000);

          driver.findElement(By.linkText("Logout")).click();

















        }
    }









