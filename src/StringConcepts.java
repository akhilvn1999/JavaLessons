

public class StringConcepts {

    public static void main(String[] args) {

        // String object is created using the string literal
        java.lang.String name = "Akhil";

        /**

         * Here the string object will be created in the string constant pool
         * Once it is created, reference variable " name " will point to the string object inside the string constant pool
         * String constant pool is inside the heap memory

         */

        java.lang.String name2 = "Akhil";

        /**

         * it wont create new string object in string constant pool. because Akhil is already exist in SCP
         * now the name2 reference variable will point to the previously created string object Akhil

         */

        // It will return true because both the variables pointing to same string object inside SCP
        System.out.println(name == name2);

        //String created using new keyword
        String name3 = new String("Akhil");

        /**

         * Here string object created in the heap memory

         */

        String name4 = new String("Akhil");

        /**

         * Even if the content is same from the above string, it will create a new object in the heap

         */

        // It will return false because both the variables pointing to different string objects
        System.out.println(name3 == name4);


        // String object created using intern method
        String name5 = new String("Akhil").intern();

        /**

         * Here the string object will be created in the heap
         * And then it looks String constant pool
         * In the SCP Akhil already exist so name5 will point to this object available inside the SCP

         */


        //it will return true because both name and name5 pointing to the same object inside the SCP
        System.out.println(name==name5);


    }


}
