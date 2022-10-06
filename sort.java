import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Dupli{
	public static void main(String...s){
		System.out.print("Enter the Size of array:-");
        Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int ar[] = new int[size];
        // Set<Integer> s1 = new HashSet<>();
		System.out.println("Enter the Elements of array:-");
		for(int i = 0; i < size; i++){
			ar[i] = sc.nextInt();
            // s1.add
		}
		for(int i = 0; i < ar.length; i++){
			for(int j = i+1; j < ar.length; j++){
				if(ar[i] == ar[j]){
					ar[j] = 0;
				}
			}
		}  
		int n = ar.length;
		for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
				if( ar[j] > ar[j+1]){
					int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++){
			System.out.print(ar[i]+" ");
		}
        sc.close();
	}
}