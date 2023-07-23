import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int ele = sc.nextInt();
            a.add(ele);
        }
        
        int q = sc.nextInt();
        for(int j = 0;j<q;j++)
        {
        String s1 = sc.next();
        
        if(s1.equals("Insert")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            a.add(x, y);
        }
        else if(s1.equals("Delete")){
            int x = sc.nextInt();
            a.remove(x);
        }
         
        }
        for(int k: a){
            System.out.print(k +" ");
        }
    }
}
