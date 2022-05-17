package my_utilities;

import day47_encapsulation.AccessModifier;

public class AccessOutsidePackage {
    // in a different class & package

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
//        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
//        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z);

        // c & z are private, so they can only be accessed in the same class
        // b & y are default (don't have an access modifier) so you can only access them in the same package but not outside it

        // so what is accessible outside the package?
        // public

    }
}
