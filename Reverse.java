import java.util.*;
public class Reverse {
     public static void main(String[] args)
     {
           String input = "Poonam Kaur";
        char[] temp_array = input.toCharArray();
        int left, right=0;
        right = temp_array.length-1;
 
        for (left=0; left < right ; left++ ,right--)
        {
            // Swap values of left and right
            char temp = temp_array[left];
            temp_array[left] = temp_array[right];
            temp_array[right]=temp;
        }
 
        for (char c : temp_array)
            System.out.print(c);
        System.out.println();
    }
}
