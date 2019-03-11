package gfg_int_prep_arr;

import java.util.*;
class MinDist{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			long n = sc.nextLong();
			Long[] a = new Long[(int)n];
			for(long i = 0; i < n; i++)
				a[(int)i]=sc.nextLong();
			long x = sc.nextLong();
			long y = sc.nextLong();
			GfG_mindist g = new GfG_mindist();
			System.out.println(g.minDist(a,n,x,y));
		}
	}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG_mindist
{
    long minDist(Long arr[], long n, long x, long y) 
    {
       // add code here.
        long minDist = Long.MAX_VALUE;
        List<Long> lsx = new ArrayList<>();
        List<Long> lsy = new ArrayList<>();
        
        for(long i = 0l ; i < n ; i++){
            if(arr[(int)i] == x) lsx.add(i);
            else if (arr[(int)i] == y) lsy.add(i);
        }
       
       if(!lsx.isEmpty() && !lsy.isEmpty()){
        for(long xx:lsx){
            for(long yy:lsy){
                if(Math.abs(xx-yy) < minDist)
                    minDist = Math.abs(xx-yy);
            }
        }
       
        return Math.round(minDist);   
       }
       
       return -1l;
    }
}