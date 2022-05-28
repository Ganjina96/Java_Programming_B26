package day62_maps;

public class UsingBrowser {
    public static void main(String[] args) {

        Browser browser = Browser.CHROME;

        switch (browser){
            case EDGE:
            case CHROME:
                System.out.println("opening chrome browser");
                break;
            case SAFARI:
                System.out.println("opening safari browser");
                break;
            case FIREFOX:
        }
    }
}
