package day25_MethodsRecap;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
	if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
		Ex: getDriver("chrome");  ==> "Chrome Driver"
			getDriver("fireFOX"); ==> "FireFox Driver"
				...
	if the browser name does not match with any of browsers above, the method should return "Invalid"
	APPLY SWITCH STATEMENTS
2. do the first task with multi-branch if statement instead of switch statement
3. do the first task with ternaries instead of switch statements
 */
public class Driver {
     /*
method decleration:
		Access-modifers  Specifier  return-Type  MethodName(paramter){
				statements;
		}
 */
    public static void main(String[] args) {

        String str = getDriver1("Firefox");
        System.out.println(str);

        String str2 = getDriver2("CHroMe");
        System.out.println(str2);

        String str3 = getDriver3("opERa");
        System.out.println(str3);

    }

    public static String getDriver1(String browserName){

        String result = "";

        switch (browserName.toLowerCase()){
            case "chrome": result="Chrome Driver";
                break;
            case "firefox": result="Firefox Driver";
                break;
            case "safari": result="Safary Driver";
                break;
            case "opera": result="Opera Driver";
                break;
            case "edge": result="Edge Driver";
                break;
            default: result="Invalid Driver";
        }



        return result;

    }


    public static String getDriver2(String browserName){
        browserName = browserName.toLowerCase();
        String result = "";

        if (browserName.equals("chrome")){
            result = "Chrome Driver";
        }else if(browserName.equals("firefox")){
            result = "FireFox Driver";
        }else if(browserName.equals("safari")){
            result = "Safari Driver";
        }else if(browserName.equals("edge")){
            result = "Edge Driver";
        }else if(browserName.equals("opera")){
            result = "Opera Driver";
        }else {
            result = "Invalid Driver";
        }



        return result;


    }


    public static String getDriver3(String browserName){

        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome"))? "Chrome Driver"
                        : (browserName.equals("firefox"))? "FireFox Driver"
                        : (browserName.equals("safari"))? "Safari Driver"
                        : (browserName.equals("edge"))? "Edge Driver"
                        : (browserName.equals("opera"))? "Opera Driver"
                        : "Invalid Driver";

        return result;


    }


}
