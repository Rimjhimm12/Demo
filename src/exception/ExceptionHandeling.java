package exception;

public class ExceptionHandeling {

    String browser;

    public ExceptionHandeling(String browser){
        this.browser = browser;

    }

    public String launchBrowser(String browser){
    switch (browser.trim().toLowerCase()) {
        case "chrome":
            try {
                int a = 9/0;
            }
            catch (ArithmeticException | NullPointerException e){
                System.out.println("AE");
                e.printStackTrace();

            }
            finally {
                System.out.println("Chrome is launched");
            }

            break;
        case "safari":
            System.out.println("safari is launched");
            break;
        case "firefox":
            System.out.println("firefox is launched");
            break;

        default:
            System.out.println("Please enter correct Browser ");
            throw new MyException("Driver is not found...." + browser);
    }
    return browser;

    }
}
