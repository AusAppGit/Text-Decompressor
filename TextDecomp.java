import java.util.*;

public class TextDecomp
  {
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          // initialise Char array and take in string input
          char [] inArr = sc.nextLine().toCharArray();
          String msg = "";
          // iterate through the array to decompress
          for(int i = 0 ; i < inArr.length; i++){
            if(Character.isDigit(inArr[i])){
              int x = Character.getNumericValue(inArr[i]);
              int y = 0;
              // while loop adds the character to the string until the value
              while(y < x){
                msg += inArr[i-1];
                y++;
              }
            }
          }
          // print decompressed text to screen
          System.out.println(msg);
      }
    }
