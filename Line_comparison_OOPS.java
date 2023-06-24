import java.util.Scanner;

public class Line_comparison_OOPS {

    public static int x1;
    public static int x2;
    public static int y1;
    public static int y2;

    public static void main(String[] args) {

        DisplayMsg.displayMsg();                   //call display method and display welcome msg

        System.out.println(); //for empty space

        Coordinates.getCoordinaters();              //call method and get coordinator from user and display

    }

    //display msg
    static class DisplayMsg {
        public static void displayMsg() {
            System.out.println("Welcome to Line Comparison Computation Program ");
        }
    }

    //get cooordinator

    public static class Coordinates extends Line_comparison_OOPS {
        public static void getCoordinaters() {
            Scanner sc = new Scanner(System.in); //create Scannner class object
            LengthOFLine lenLine = new LengthOFLine();
            int[] lineLengthArray = new int[2];
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter the start Co-ordintes of Line " + i + " (x1,y1) : ");
                x1 = sc.nextInt();
                y1 = sc.nextInt();
                System.out.println("Enter the End Co-ordintes of Line " + i + " (x2,y2) : ");
                x2 = sc.nextInt();
                y2 = sc.nextInt();
                System.out.println("Start Coordintes of Line " + i + " (x1,y1) :- " + x1 + " " + y1);
                System.out.println("End Coordintes of Line " + i + " (x2,y2) :- " + x2 + " " + y2);

                System.out.println(); //for empty space


                //first create objecct for lenghLine class --as we create in line no.8
                //lenght of line values store in new local variable
                int lineLength = lenLine.getLengthOfLine();
                lineLengthArray[i - 1] = lineLength;                                //store the length values in array
                System.out.println("Length of Line " + i + " = " + lineLength);        //print the length of lines values of both 2 line


            }
            System.out.println();                                      //for empty space
            //check equality of lines and compare botth lines
            //use if else to check line are equals or not and greter or not

            if (lineLengthArray[0] == lineLengthArray[1]) {
                System.out.println("Line 1 and Line 2 both are Equal ");
            } else if (lineLengthArray[0] > lineLengthArray[1]) {
                System.out.println("Line 1 is Grater than Line 2 ");
            } else {
                System.out.println("Line 1 is Smaller then Line 2 ");
            }

        }

    }


    //calculate Length of line
    public static class LengthOFLine extends Line_comparison_OOPS {
        public static int getLengthOfLine() {
            return (int) Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        }
    }
}





