import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while(t-- > 0){
	        int n = Integer.parseInt(br.readLine().trim());
	        String s = br.readLine();
	        
	        HashMap<Character, Integer> m = new LinkedHashMap<>();
	        char c;
	        int val;
	        for(int i = 0 ; i < n ; ++i){
	            c = s.charAt(i);
	            if(!m.containsKey(c))
	                m.put(c, 1);
	           else{
	               val = m.get(c);
	               m.put(c,++val);
	           }
	                
	        }
	        char ret = 'A';
	        for(Character c1 : m.keySet()) {
	            if(m.get(c1) == 1){
	                ret = c1;
	                break;
	            }
	        }
	        
	        System.out.println(ret=='A' ? "-1" : ret);
	    }
	 }
}
