import java.util.Arrays;
import java.util.Scanner;

public class CreateAnArrayFromTerminal {
    public static Scanner scanner= new Scanner(System.in);

    public static int[] createAnArray(int len){
        int[] array=new int[len];
        System.out.println("Enter the "+ len+ " elements of your array: ");
        for(int i=0; i<len;i++){
            array[i]=scanner.nextInt();
            scanner.nextLine();
        }
        return array;

    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(createAnArray(6)));

    }
}
