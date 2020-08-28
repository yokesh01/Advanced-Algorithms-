import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
	public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
		int[] a = new int[3];
		int sum=0;
       String s[]= sc.nextLine().split(" ");
        for(int i =0 ;i < s.length;i++){
               a[i]= Integer.parseInt(s[i]);
            }
		ArrayList<Integer> ar = new ArrayList<>();
		String s2[]= sc.nextLine().split(" ");
		sc.close();
        for(int j =0 ;j < s2.length;j++)
		    {
               ar.add(Integer.parseInt(s2[j]));
            }	
        sum = (int)ar.get(a[2]);
		ar.remove(a[2]);
		Collections.sort(ar);
		for(int x=0;x<(a[1]-1);x++)
		{
			sum=(int)ar.get(x);
		}
		System.out.println(sum);
	}
}
