import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int count = 0 , i ;
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++){
                q[q_i] = (in.nextInt()-1);
                if( (q[q_i]-q_i)>2 ){
                    System.out.println("Too chaotic") ;
                    in.nextLine();
                    count = -1 ;
                    break ;
                }
            }
            // your code goes here
            if( count!=-1 ){
                for(int q_i=0; q_i < n; q_i++){
                    if( q[q_i]!=q_i ){
                        i = q_i+1 ;
                        while( i<n && q[i]!=q_i ){
                            i++ ;
                        }
                        if( i==n ){
                            System.out.println("Too chaotic") ;
                            count = -1 ;
                            break ;
                        }
                        else if( q[i]==q_i ){
                            while( i!=q_i ){
                                int temp = q[i-1] ;
                                q[i-1] = q[i] ;
                                q[i] = temp ;
                                count++ ;
                                i-- ;
                            }
                        }
                    }
                    //System.out.println( Arrays.toString(q));
                }
                if( count==-1 ){
                    System.out.println("Too chaotic");
                }
                else{
                    System.out.println(count);
                }
            }
        }
    }
}
