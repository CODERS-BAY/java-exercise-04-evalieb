import java.util.Scanner;

public class Calculator {
    /*
        your code comes here...
     */

    //x as a global


    private static float addition (float x, float y){
        return x+y;
    }
    private static float subtraction (float x, float y){
        return x-y;
    }
    private static float divide (float x, float y){
        return x/y;
    }
    private static float modulo (float x, float y){
        return x%y;
    }
    private static float pythagoras (float x, float y){
        return ((x*x) + (y*y));
    }


    public static void main(String[] args) {
        boolean terminate = false;
        do {
            System.out.println("Would you like to make floating point calculations?");
            System.out.println("type y for yes and anything else for integer calculations");
            //read in a String float or double?
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            //Now we have to ask, if the user has put in a "y"

            //is this text "y"
            if (text.equals("y")){

            }

            System.out.println("Please enter your first number");
            int first = scanner.nextInt();
            System.out.println("Please enter your secound number");
            int secound = scanner.nextInt();

            scanner.nextFloat();





          // if (){}

                /*switch (x){
                //if the user types 1.
                case 1:
                    ....;
                    break;
                case 2:
                    break;
                    default: System.out.println ("Sie haben sich für das einlesen eines Integers entschieden")

                 */

            /*
                 your code comes here
            */



        } while (!terminate);

        String block = """
                You can make the following calculations:
                1.   addition
                2.   subtraction
                3.   divide
                4.   modulo
                5.   pythagoras you can calculate the hypotenuse c
                    
                To select a calculation please press the corresponding number.
          """;
        System.out.println(block);

    }


}

//parse text into an integer
//int x = Integer.parseInt(text);