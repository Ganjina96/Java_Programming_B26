package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        JavaTextook book1 = new JavaTextook(); // reference of itself
        book1.name = "Java programming";
        book1.size = 20.5;
        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();

        EBook book2 = new JavaTextook();
        book2.name = "Java programming";
        book2.size = 20.5;
        //book2.fun = true; // EBook doesn't have access to JavaTextbook where the "fun" variable is located
        ((JavaTextook)book2).fun = true; // cast the reference from the EBook to the child reference of JavaTextbook class which allowed us to access the "fun" variable
        book2.read();
        book2.open();
        book2.download();

        Book book3 = new JavaTextook();
        book3.name = "Java programming";
//        book3.size = 20.5;
//        book3.fun = true;
        book3.read();
//        book3.open();
//        book3.download();

        // Book reference only has access to the name variable and the read variable

        Downloadable book4 = new JavaTextook();
//        book4.name = "Java programming";
//        book4.size = 20.5;
//        book4.fun = true;
//        book4.read();
//        book4.open();
        book4.download();

        // The only thing accessible by the Downloadable interface is the download method

        JavaTextook book5 = (JavaTextook)book4;
        // book4 was the interface reference, we cast the reference to be a JavaTextbook and assigned it to the book5 reference
        book5.read();
        book5.open();
        book5.fun = false;




    }
}
