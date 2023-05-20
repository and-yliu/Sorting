public class Sort {
    /**
     * Takes 2 sorted arrays and merges them into one sorted array
     * @param arr1 a sorted int array
     * @param arr2 a sorted int array
     * @return A merged sorted array of arr1 and arr2
     */
    public static int[] mergeSort(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        //Put each item in both arr1 and arr2 from largest to smallest into mergedArray until one array runs out of numbers.
        while (index1 < n1 && index2 < n2 && index3 < n1 + n2 ){
            if (arr1[index1] > arr2[index2]){
                mergedArray[index3] = arr1[index1];
                index1++;
                index3++;
            }
            else if(arr1[index1] < arr2[index2]){
                mergedArray[index3] = arr2[index2];
                index2++;
                index3++;
            }
            else if (arr1[index1] == arr2[index2]){
                mergedArray[index3] = arr1[index1];
                mergedArray[index3+1] = arr2[index2];
                index1++;
                index2++;
                index3 = index3 + 2;
            }

        }

        //Put the rest of the numbers in the longer array into mergedArray.
        while (index1 < n1) {
            mergedArray[index3] = arr1[index1];
            index1++;
            index3++;
        }
        while (index2 < n2) {
            mergedArray[index3] = arr2[index2];
            index2++;
            index3++;
        }

        return mergedArray;
    }
}
