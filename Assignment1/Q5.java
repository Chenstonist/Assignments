package Assignments.Assignment1;
/*
According to the fact that the way how to combine the remain elements is not provided,
we assume that the length of two lists are equal.
 */
public class Q5 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        char[] arr2 = {'a','b','c','d','e','f'};
        combine(arr1,arr2);

    }

    private static void combine(int[] arr1, char[] arr2) {
        Object[] ans = new Object[arr1.length+arr2.length];
        for(int i = 0; i<=arr1.length-1; i++){
            ans[2*i] = arr1[i];
            ans[2*i+1] = arr2[i];
        }
        for(int i = 0; i<=ans.length-1; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
