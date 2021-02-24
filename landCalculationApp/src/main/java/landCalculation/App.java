package landCalculation;

/**
 * Description: This program caculates the nuber of acres in a tract of land with 389,767 square feet.
 * 1 acre = 43,560 sq. ft.
 *
 * Creator: Sam Ross
 */
import javax.swing.JOptionPane;

public class App 

{
    public static void main( String[] args )
    {

        //Define variables
        String message;
        final int acre = 43560; //one acre in square feet
        final int tract = 389767; //given tract of land in square feet
        int calculation;


        //Main code
        calculation = tract / acre;
        message = String.format("The tract of land(%d sq. ft.) is: %d acres", tract, calculation);


        //Output
        JOptionPane.showMessageDialog(null, message);

    }
}
