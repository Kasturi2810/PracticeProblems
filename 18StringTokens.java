import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String s1 = s.trim();
        String[] tokens = s1.split("[ !,?._'@]+");
        
        if(s1.isEmpty()){
            System.out.println(0);
        }
        else{
             System.out.println(tokens.length);
             for(String s2 : tokens){
                  System.out.println(s2);
             }
        }
        
        scan.close();
    }
}

