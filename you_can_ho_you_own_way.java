import java.util.*;
import java.io.*;


public class Solution{
public static void main(String[] args)throws FileNotFoundException{

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int T = in.nextInt();
    ArrayList<Integer> testCases = new ArrayList<Integer>();
    ArrayList<PathEnemy> testCasesPath = new ArrayList<PathEnemy>();
    String path;
    for(int i=0; i<T; i++){
        testCases.add(in.nextInt());
        path = in.next();
        testCasesPath.add(new PathEnemy(path));
    }
    
    for(int i=0; i<T; i++){
  
    	ArrayList<Character> preoutList;
    	preoutList = testCasesPath.get(i).MyPath(); 
    	char[] preout = new char[preoutList.size()];
        for(int j=0; j<preoutList.size(); j++){
        	preout[j] = preoutList.get(j);
        }
    	

        String output = new String(preout);

        System.out.println("Case #"+(i+1)+": "+output);
    }


}
}

class  PathEnemy{
    public ArrayList<Character> path;
    
    public PathEnemy(String x){
        path = new ArrayList<Character>();
        char[] myChar = x.toCharArray();
        for(int j=0; j<myChar.length; j++){
            path.add(myChar[j]);
        }
    }
    
    public ArrayList<Character> MyPath(){
        ArrayList<Character> myp = new ArrayList<Character>();
        for(int i=0; i<path.size(); i++){
            if(path.get(i) == 'S'){
                myp.add('E');
            }else{
                myp.add('S');
            }
        }
        return myp;
    }
}
