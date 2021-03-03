import java.util.Scanner;
import java.util.Arrays;

public class sum_Array_target {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter 'target': ");
        int target = scn.nextInt();
        
        System.out.println("enter size of array 'nums': ");
        int x = scn.nextInt();
        int[] nums = new int[x];
        
        System.out.println("Enter the elements of array 'nums': ");
        for(int i=0; i<x; i++){
            nums[i]=scn.nextInt();
        }
        
        System.out.println(Arrays.toString(nums));
        
        int y=1, z=1;
        
        for( int j=0; j<nums.length; j++){
            
            for(int k=j+1; k<nums.length; k++){
                   if( nums[j] + nums[k] == target){
                       System.out.println(j + " " + k);
                   }
                   else {
                	   continue;
                   }
                }
            }
        
        

	}

}
