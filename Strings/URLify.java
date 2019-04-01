package gfg_int_prep_string;

import java.io.*;
public class URLify {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int t = Integer.parseInt(br.readLine());
	    
	    while(t-- > 0){
	        String s = br.readLine();
	        int k = Integer.parseInt(br.readLine()); //unused input
	        
	        System.out.println(s.trim().replaceAll("\\s+" , "%20"));
	    }
	 }
}
