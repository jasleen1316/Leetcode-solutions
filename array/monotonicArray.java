import java.util.Scanner;

public class monotonicArray {

	public static void main(String[] args) {
		boolean a = false;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = scn.nextInt();
		}
		
		if(n==1){
            a= true;
        }
        
        for(int i=1; i<A.length; i++){
            
            if(A[i-1] <= A[i]){
                a = true;
            }
            // else if(A[n-i] <= A[n-i-1]){
            //     a = true;
            // }
            else{
                a = false;
                break;
            }
        }
        
        if(a==false){
            for(int i=1; i<A.length; i++){
                if(A[i-1] >= A[i]){
                    a = true;
                }
                else{
                    a = false;
                    break;
                }
            }
        }
        
        System.out.print(a);
	}

}

