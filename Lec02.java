/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println(q1(3)+" "+q1(4)+" "+q1(5)+" "+q1(6));
// 		System.out.println(q2(512));
// 		System.out.println(q3(5,3));
		System.out.println(q5(3));
	}
	public static int q1(int n){
	    if(n<=1) return n;
	    if(n%2==0) return n+q1(n/2);
	    else return q1((n+1)/2)+q1((n-1)/2);
	}
	public static int q2(int n){
	    if(n<=0) return 0;
	    return (n%10)+q2(n/10);
	}
	public static int q3(int x,int y){
	    if(y==0 || y==x) return 1;
	    return q3(x-1,y)+q3(x-1,y-1);
	}
	public static int q4(int x,int y){
	    if(x==y) return x*y;
	    return q4(x,(x+y)/2) + q4((x+y)/2+1,y);
	}
	public static List<Integer> q5(int n) {
        List<Integer> result = new ArrayList<>();
        if (n == 1) {
            result.add(1);
            return result;
        }
        
        List<Integer> prev = q5(n - 1);
        result.addAll(prev);
        result.add(n);
        result.addAll(prev);
        
        return result;
    }
}
