import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int num= sc.nextInt();
        for(int i = 0;i<num;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            
            int d = sc.nextInt();
            temp.add(d);
            for(int j = 0;j<d;j++){
                temp.add(sc.nextInt());
            }
          arr.add(temp);
        }
            int q = sc.nextInt();
            for(int k = 0;k<q;k++){
                int x = sc.nextInt()-1;
                int y = sc.nextInt();
                if(x<num && y <=arr.get(x).get(0)){
                    System.out.println(arr.get(x).get(y));
                }
                else{
                     System.out.println("ERROR!");
                }
                }
                
            }
        
        
    }

