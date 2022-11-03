package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        String result = "";
        Integer counter = 0;
        while (counter < personArray.length) {
            Person person = personArray[counter];
            result = result + person.toString();
            counter++;
        }
            return result;
    }



    public String forLoop() {
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        String result = "";
        Integer value = 0;
        for(int i = 0; i <personArray.length;i++) {
            Person person = personArray[value];
            result = result + person.toString();
            value++;
        }
        return result;
    }



    public String forEachLoop() {
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        String result = "";
        for (Person person : personArray) {
            result = result + person.toString();
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
