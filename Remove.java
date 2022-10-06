import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Dupli{
	public static void main(String...s){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();
        Set<Integer> s1 = new HashSet<>();
        System.out.print("Enter the elements of Array: ");
		for(int i = 0; i < size; i++){
            s1.add(sc.nextInt());
		}
        int[] ar = new int[s1.size()];
		int n = ar.length;
        //Bubble Sort
		for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
				if( ar[j] > ar[j+1]){
					int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
				}
			}
		}
        System.out.println("Final Array: "+s1);
        sc.close();
	}
}