import java.util.*;
import java.io.*;

public class Solution{
public static void main(String[] args)throws FileNotFoundException{
	 Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
   
   
int T = in.nextInt();
	ArrayList<Integer> text = new ArrayList<Integer>();
	ArrayList<Integer> primeList = new ArrayList<Integer>();
	ArrayList<Integer> output = new ArrayList<Integer>();
	ArrayList<Integer> outputOrdered = new ArrayList<Integer>();
	ArrayList<Character> alfabeto = new ArrayList<Character>();
	ArrayList<String> outputChar = new ArrayList<String>();
	alfabeto.add('A');
	alfabeto.add('B');
	alfabeto.add('C');
	alfabeto.add('D');
	alfabeto.add('E');
	alfabeto.add('F');
	alfabeto.add('G');
	alfabeto.add('H');
	alfabeto.add('I');
	alfabeto.add('J');
	alfabeto.add('K');
	alfabeto.add('L');
	alfabeto.add('M');
	alfabeto.add('N');
	alfabeto.add('O');
	alfabeto.add('P');
	alfabeto.add('Q');
	alfabeto.add('R');
	alfabeto.add('S');
	alfabeto.add('T');
	alfabeto.add('U');
	alfabeto.add('V');
	alfabeto.add('W');
	alfabeto.add('X');
	alfabeto.add('Y');
	alfabeto.add('Z');
	
	
	
	for(int z=0; z<T; z++){
		int N = in.nextInt();
		int L = in.nextInt();

	for(int w=0; w<L; w++){
		text.add(in.nextInt());
	}
	 int i =0;
	 int num =0;
	 ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

	 int textMax=0;
	 for(int w=0; w<text.size(); w++){
		 if(text.get(w)>textMax){
			 textMax = text.get(w);
		 }
	 }
	 //System.out.println(textMax);
	 float textMaxf = textMax/100;
	 textMax = (int)textMaxf;
	 if(textMax <101){
		 textMax = 1000;
	 }
	 //System.out.println(textMax);
	 for (i = 0; i <= 3000; i++){
		 int counter=0;
		 for(num =i; num>=1; num--){
	         if(i%num==0){
	        	  counter = counter + 1;
		     }
		 }
		 if (counter ==2){
		     primeNumbers.add(i);
		 }	
	 }	
		
	
	for(int w=0; w<text.size(); w++){
	
		for(int q=0; q<primeNumbers.size()-1; q++){
		
			for(int e=q+1; e<primeNumbers.size(); e++){
				
				if(primeNumbers.get(q)*primeNumbers.get(e) == text.get(w)){
					
					if(primeNumbers.get(q) > primeNumbers.get(e)){
						
						primeList.add(primeNumbers.get(e));
						primeList.add(primeNumbers.get(q));
						
					}else{
					
						primeList.add(primeNumbers.get(q));
						primeList.add(primeNumbers.get(e));
						
						
					}
				}
			}
		}
	}

	
	for(int w=0; w<=primeList.size()-4; w+=4){
		
	
		
		if(primeList.get(w+1)==primeList.get(w+2) ||
				primeList.get(w+1)==primeList.get(w+3)){
			
		}else{
			int var = primeList.get(w+1);
			primeList.set(w+1,primeList.get(w));
			primeList.set(w, var);
		}
		
		if(primeList.get(w+2)==primeList.get(w) ||
				primeList.get(w+2)==primeList.get(w+1)){
			
		}else{
			int var = primeList.get(w+2);
			primeList.set(w+2, primeList.get(w+3));
			primeList.set(w+3, var);
			
		}
		
		
	}
	output.add(primeList.get(0));
	outputOrdered.add(primeList.get(0));
	for(int w=1; w<primeList.size(); w+=2){
		output.add(primeList.get(w));
		outputOrdered.add(primeList.get(w));
	}

	//outputOrdered.addAll(output);

	for(int m=0; m<outputOrdered.size()-1; m++){
		for(int n=m+1; n<outputOrdered.size(); n++){
			if(outputOrdered.get(n)<outputOrdered.get(m)){
				int var = outputOrdered.get(m);
				outputOrdered.set(m, outputOrdered.get(n));
				outputOrdered.set(n, var);
			}
		}
	}
	


	ArrayList<Integer> delete = new ArrayList<Integer>();
	for(int m=0; m<outputOrdered.size()-1; m++){
		
		
		for(int n = m+1; n<outputOrdered.size(); n++){
			int A = outputOrdered.get(m);
			int B = outputOrdered.get(n);
			if(A == B){
				delete.add(n);
					
			}
		}

		for(int n=delete.size()-1; n>=0; n--){
			int del = delete.get(n);
			outputOrdered.remove(del);
			
		}

		delete.clear();
		
	
	}

	int counterlist = 0;
	
	
	for(int m=0; m<output.size(); m++){
		int index=0;
		for(int n=0; n<outputOrdered.size(); n++){
		
			int uno = output.get(m);
			int due = outputOrdered.get(n);
			if(uno == due){
				
				index = n;
				
			}
		}
		outputChar.add(alfabeto.get(index).toString());
		
	}
	String result = "";
	
	for(String s: outputChar){
		result += s;
	}

	System.out.println("Case #"+(z+1)+": "+result);

	outputOrdered.clear();
	outputChar.clear();
	text.clear();
	primeNumbers.clear();
	primeList.clear();
	output.clear();
	}
	
	
	
}
}

