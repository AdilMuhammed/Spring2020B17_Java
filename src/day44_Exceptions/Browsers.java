package day44_Exceptions;
/*
warmup task:
1. create a class called Browsers
	actions: openBrowser(): opens the default browser
		    closeBrowser(): closes the default browser
2. create a class called ChromeBrowser
	actions: openBrowser(): opens the chrome browser
			closeBrowser(): closes the chrome browser
3. create a class called FirefoxBrowser
	actions: openBrowser(): opens the Firefox browser
			closeBrowser(): closes the Firefox browser
4. create a class called Opera browser
		actions: openBrowser(): opens the Opera browser
				closeBrowser(): closes the Opera browser
5. create a class called Test:
	create an object of each browsers and call the openBrowser & closeBrowser actions
 */
public class Browsers {

    protected void openBrowser(){
        System.out.println("opening the default browser");
    }

    protected void closeBrowser(){
        System.out.println("closing the default browser");
    }

}

class ChromeBrowser extends Browsers{

    public void openBrowser(){
        System.out.println("opening the chrome browser");
    }

    public void closeBrowser(){
        System.out.println("closing the chrome browser");
    }
}

class FirefoxBrowser extends Browsers{
    public void openBrowser(){
        System.out.println("opening the firefox browser");
    }

    public void closeBrowser(){
        System.out.println("closing the firefox browser");
    }
}

class OperaBrowser extends Browsers{
    public void openBrowser(){
        System.out.println("opening the opera browser");
    }

    public void closeBrowser(){
        System.out.println("closing the opera browser");
    }
}

class Test{
    public static void main(String[] args) {
        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();

        System.out.println("================================");

        FirefoxBrowser obj2 = new FirefoxBrowser();
        obj2.openBrowser();
        obj2.closeBrowser();

        System.out.println("================================");

        OperaBrowser obj3 = new OperaBrowser();
        obj3.openBrowser();
        obj3.closeBrowser();
    }
}
