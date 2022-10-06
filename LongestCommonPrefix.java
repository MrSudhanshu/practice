// import java.util.Arrays;

// public class LongestCommonPrefix {   
//     /* 
//     public String longestCommonPrefix(String[] strs) {
//         String str =  "";
//         String temp = "";
//         boolean flag = false;
//         for (int i = 0; i < strs.length; i++) {
//             for (int j = 0; j < strs[i].length(); j++) {
//                 temp = temp + String.valueOf(strs[i].charAt(j));
//                 // System.out.println(temp);
//                 if(strs[1].contains(temp)) flag = true;
//                 for (int k = 2; k < strs.length; k++){
//                     // else str = "";
//                     if(strs[k].contains(temp)) str = temp;
//                     else{
//                         flag = false;
//                         break;
//                     }
//                 }
//             }
//         }
//         return str;
//     }*/
//     static void PrintArray(String array[]){
// 		int n = array.length;
// 		for(int i = 0; i < n; i++){
// 			System.out.print(array[i]+" ");
// 		}
// 	}
//     public String longestCommonPrefix(String[] strs){
//         int size = strs.length;
//         if(size == 0) return "";
//         if(size == 1) return strs[0];
//         Arrays.sort(strs);
//         // PrintArray(strs);
//         int min = Math.min(strs[0].length(), strs[size-1].length());
//         System.out.println(Math.min(4, 5));
//         // PrintArray(strs);
//         // System.out.println(min);
//         int i = 0;
// 		while (i < min && strs[0].charAt(i) == strs[size-1].charAt(i) )
// 			i++;

// 		String pre = strs[0].substring(0, i);
// 		return pre;
//     }
//     public static void main(String[] args) {
//         LongestCommonPrefix lcp = new LongestCommonPrefix();
//         String[] arr = {"flower", "flk","flow","flight", "flowerhogya"};
//         Arrays.sort(arr);
//         PrintArray(arr);
//         // System.out.println(lcp.longestCommonPrefix(arr));
//     }
// }
// Java program to find longest common prefix of
// given array of words.
import java.util.*;
class GFG
{
    static void PrintArray(String array[]){
        		int n = array.length;
        		for(int i = 0; i < n; i++){
        			System.out.print(array[i]+" ");
        		}
        	}
	public String longestCommonPrefix(String[] a)
	{
		int size = a.length;

		/* if size is 0, return empty string */
		if (size == 0)
			return "";

		if (size == 1)
			return a[0];

		/* sort the array of strings */
		Arrays.sort(a);

		/* find the minimum length from first and last string */
		int end = Math.min(a[0].length(), a[size-1].length());

		/* find the common prefix between the first and
		last string */
		int i = 0;
		while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
			i++;

		String pre = a[0].substring(0, i);
		return pre;
	}

	/* Driver Function to test other function */
	public static void main(String[] args)
	{
		GFG gfg = new GFG();
		String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        PrintArray(input);
        Arrays.sort(input);
        PrintArray();
		// System.out.println( "The longest Common Prefix is : " +
		// 						gfg.longestCommonPrefix(input));
	}
}
