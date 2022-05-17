package day57_exceptions.webelement;

public class Google {
    public static void main(String[] args) {

        WebElement link = new Link(); // created a Link object with WebElement reference

        WebElement input = new Input(); // created an Input object with WebElement reference

        WebDriverUtil.clickElement(input);

        WebDriverUtil.clickElement(link);

        WebDriverUtil.clickElement(new Link());


        /*
        String [] --> array that stores String objects
        Link [] ---> array that stores Link objects
         */

        WebElement [] allElements = new WebElement[4]; // created an array that will store objects from classes that implement the WebElement interface

        allElements[0] = link;
        allElements[1] = input;
        allElements[2] = new Input();
        allElements[3] = new Image();


    }
}
