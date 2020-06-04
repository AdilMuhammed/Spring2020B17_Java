package day47_Abstraction;

public class driverObjects {

    public static void main(String[] args) {

        String URL = "https://www.google.come";

        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.quit();

        System.out.println("=====================================");

        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get(URL);
        driver2.quit();;

        System.out.println("=====================================");

        OperaDriver driver3 = new OperaDriver();
        driver3.get(URL);
        driver3.quit();


    }



}
