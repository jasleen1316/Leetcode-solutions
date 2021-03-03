import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int sum = 0;
        for( int i=0; i<=x; i++){
            sum += i;
        }
        System.out.print(sum);
	}

}

