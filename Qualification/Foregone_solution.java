import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));     
    int T = in.nextInt();
    String num;
    String A;
    int B;
    for(int i=0; i<T; i++){
    	B = 0;
    	num = in.next();
    	char[] myChar = num.toCharArray();
    	
    	for(int j=0; j<myChar.length; j++){
    		if(myChar[j] == '4'){
    			myChar[j] = '3';
    			int preB = 1;
    			for(int k=0; k<myChar.length-(j+1); k++){
    				preB = preB*10;
    			}
    			
    			B = B+preB;
    
    		}
    	}
    	A = new String(myChar);
    	System.out.println("Case #"+(i+1)+": "+A+" "+B);
    }
    
    
    }
}
