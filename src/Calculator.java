import java.util.Scanner;

public class Calculator {

    //functios for float
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
    //functions for integer
    private static int additionInt (int x, int y){
        return x+y;
    }
    private static int subtractionInt (int x, int y){
        return x-y;
    }
    private static int divideInt (int x, int y){
        return x/y;
    }
    private static int moduloInt (int x, int y){
        return x%y;
    }
    private static int pythagorasInt (int x, int y){
        return ((x*x) + (y*y));
    }

    private static String block = """
         You can make the following calculations:
            1.   addition
            2.   subtraction
            3.   divide
            4.   modulo
            5.   pythagoras you can calculate the hypotenuse c
         To select a calculation please press the corresponding number.
          """;
    private static String again = """
            Would you like to calculate again?
            Press y for yes or any other key for abort.
            """;

    public static void main(String[] args) {
        boolean terminate = false;
        do {
            System.out.println("Would you like to make floating point calculations?");
            System.out.println("type y for yes and anything else for integer calculations");
            //read in a String float or double?
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            //Now we have to ask, if the user has put in a "y"

            //is this text "y", if user wants to use float
            if (text.equals("y")){
                System.out.println("You decided to make a float calculation. Please use ',' for decimal");
                System.out.println("Please enter your first number");
                float first = scanner.nextFloat();
                System.out.println("x = " + first);
                System.out.println("Please enter your secound number");
                float secound = scanner.nextFloat();
                System.out.println("y = " + secound);
                System.out.println(block);
                int correspondingNumber = scanner.nextInt();

                switch(correspondingNumber)
                {
                    case 1:
                        System.out.println("Calculating: " + first + " + " + secound);
                        System.out.println("The solution is " + addition(first, secound));
                            break;
                    case 2:
                        System.out.println("Calculating: " + first + " - " + secound);
                        System.out.println("The solution is " + subtraction(first, secound));
                            break;
                    case 3:
                        System.out.println("Calculating: " + first + " / " + secound);
                        System.out.println("The solution is " + divide(first, secound));
                            break;
                    case 4:
                        System.out.println("Calculating: " + first + " % " + secound);
                        System.out.println("The solution is " + modulo(first, secound));
                            break;
                    case 5:
                        System.out.println("Calculating c = sqrt(" + first + "^2 + " + secound + "°2)");
                        System.out.println("The solution is " + pythagoras(first, secound));
                            break;
                            //??
                    default:
                        System.out.println("This was a bad choice");
                        break;
                }
                //if not typed in "y"
            }else {
                System.out.println("Please enter your first number");
                int first = scanner.nextInt();
                System.out.println("x = " + first);
                System.out.println("Please enter your secound number");
                int secound = scanner.nextInt();
                System.out.println("y = " + secound);
                System.out.println(block);
                int correspondingNumber = scanner.nextInt();

                switch(correspondingNumber)
                {
                    case 1:
                        System.out.println("Calculating: " + first + " + " + secound);
                        System.out.println("The solution is " + additionInt(first, secound));
                        break;
                    case 2:
                        System.out.println("Calculating: " + first + " - " + secound);
                        System.out.println("The solution is " + subtractionInt(first, secound));
                        break;
                    case 3:
                        System.out.println("Calculating: " + first + " / " + secound);
                        System.out.println("The solution is " + divideInt(first, secound));
                        break;
                    case 4:
                        System.out.println("Calculating: " + first + " % " + secound);
                        System.out.println("The solution is " + moduloInt(first, secound));
                        break;
                    case 5:
                        System.out.println("Calculating c = sqrt(" + first + "^2 + " + secound + "^2)");
                        System.out.println("The solution is " + pythagorasInt(first, secound));
                        break;
                    //If there was no input like 1, 2, 3, 4, 5 or 6
                    default:
                        System.out.println("This was a bad choice");
                        break;
                }

            }

            //System.out.println(again);
            System.out.println("Would you like to calculate again?");
            System.out.println("Press y for yes or any other key for abort.");
            scanner.nextLine();
            String onesMore = scanner.nextLine();

          if(!onesMore.equals("y")){
                terminate = true;
            }
        } while (!terminate);

    }


}

//parse text into an integer
//int x = Integer.parseInt(text);