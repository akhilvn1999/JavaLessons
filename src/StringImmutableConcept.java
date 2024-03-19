public class StringImmutableConcept {


    public static void main(String[] args) {

        String name = "Akhil";
        // reference variable called name will point to the String object created in the SCP



        name = name.concat(" V");
        // now it did not change the object called Akhil, it just add a new string object called Akhil V in the SCP. Also it changed the name variable pointing to the new object created


        System.out.println(name);

        /*

        String is immutable, meaning once a String object is created, its content cannot be changed. Any operation that appears to modify a String actually creates a new String object with the modified content.


         */








    }







}
