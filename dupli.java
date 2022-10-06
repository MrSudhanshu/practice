import java.util.Scanner;

class Dupli{
    public static void main(String...s){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of array:-");
		int size = sc.nextInt();
		int ar[] = new int[size];
		System.out.println("Enter the Elements of array:-");
		for(int i = 0; i < size; i++){
			ar[i] = sc.nextInt();
		}
        int size1 = ar.length;
        sc.close();
		for(int i = 0; i < ar.length; i++){
			for(int j = i+1; j < ar.length; j++){
				if(ar[i] == ar[j]){
                    // size1--;
					ar[j] = 0;
				}
			}
		} 
        int n = ar.length;
		for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if( ar[j] < ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
				}
			}
		}
        System.out.println(size);
        int[] array = new int[size1];
        for (int i = 0; i < size1; i++) {
            array[i] = ar[i];
        }
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
			System.out.print(array[i]+" ");
		}
	}
}