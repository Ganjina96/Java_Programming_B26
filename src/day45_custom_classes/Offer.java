package day45_custom_classes;

public class Offer {
    /*
        create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO
    */

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numOfPTO;


    /*
        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

    */

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;
    }
    /*
        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects
     */

    public String toString(){

        String info = "\n" + company + " located in " + location;
        info += " - " + (salary > 0 ? salary : "");
        info += " - " + (isFullTime ? "Full time" : "Contract");
        info += " - " + (numOfPTO > 0 ? numOfPTO : "");
        return info;
    }

}
