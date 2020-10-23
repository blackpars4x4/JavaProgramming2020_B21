package day13_SwitchStatement;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {
        String browser = "cybertek";
        String selectedBrowser = "";

        switch (browser){ // chrome

            case "chrome": selectedBrowser = "CHROME BROWSER";
                break;

            case "firefox": selectedBrowser = "FIREFOX BROWSER";
                break;

            case "opera": selectedBrowser = "OPERA BROWSER";
                break;

            case "safari": selectedBrowser = "SAFARI BROWSER";
                break;

            case "edge": selectedBrowser = "EDGE BROWSER";
                break;

            case "ie": selectedBrowser = "INTERNET EXPLORE BROWSER";
                break;

            default: selectedBrowser ="INVALID BROWSER NAME";

        }

        System.out.println(selectedBrowser);


    }


}

/*


task:
    valid browsers: chrome, firefox, opera, safari, edge, ie

    string str = "chrome"

    outPut:
        CHROME BROWSER IS SELECTED

        12:35
 */