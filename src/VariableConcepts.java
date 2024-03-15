public class VariableConcepts {

    /*

    Variables declared at class level are global variables, the user can access these variables from anywhere in the class

     */

    // Static variable, this variable belongs to the class
    static  int a ; // here a variable named a is declared, the variable a can hold integer values

    // Instance variable, this variable belongs to the object of VariableConcepts class
    int b = 20; // we can declare and initialize the variable at the same time


    public  void localMethod(){

        // Static variable is not allowed inside a method
        int c = 30; // this is a local variable means the user can only access the variable from this method only
        System.out.println(c);

    }


    // int d is variable called parameter.it's like a input to the method
    public void localParams(int d){

        System.out.println(d);

    }




    public static void main(String[] args) {

        a = 10; // a value 0f 10 is assigned to variable a,this is the initialization
        System.out.println(VariableConcepts.a);

        // User needs to create the object of the VariableConcepts class to access the instance variable b and c
        VariableConcepts object = new VariableConcepts();
        System.out.println(object.b);
        object.localMethod();
        object.localParams(40);

    }

}

/**

 * Data needed for the program execution will be stored in the memory location.
 * variable is like a name or label given to that memory location
 * By using the variable, the user can access the data from that memory location
 * Every variable have a datatype. The data type will decide what type of value that variable can hold
 * Before using the variable user need to declare the variable
 * The value stored in a variable can be changed during program execution

 */

