/*https://www.geeksforgeeks.org/non-repeating-element/
 * Love Babbar Documentation
 * Arrays Intermediate 9
 */
import java.util.*;

public class loveBim_array_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println();
		HashMap<Integer, Integer> map=new HashMap<>();
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int[] a=new int[n];
		    int index=-1;
		    int result=0;
		    
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    
		    for(int i=0;i<n;i++){
		        if(map.containsKey(a[i])){
		        	map.put(a[i], map.get(a[i]) + 1);
		        }
		        else{
		            map.put(a[i],1);
		        }
		    }
		    
		    for(int i=0;i<n;i++){
		        if(map.get(a[i])==1){
		            index=i;
		            result=a[i];
		            break;
		        }
		    }
			    	
		    System.out.printf("%d %d\n",result,index);
		    map.clear();
		}
	}

}
