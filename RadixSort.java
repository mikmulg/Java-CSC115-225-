//Mikayla Mulgrew V00923052

//couldnt quite figure out how to sort the array into 
//buckets at each step. tried many routes. 
//have printed the least significant digit for each
//number, for each round. 
public class RadixSort{

    public static void radSort(int[] array, int j, int mX) {

        int aL = array.length;

        // array for new arrangement of numbers
        int nA[] = new int[aL];
        
        //array to hold least significant digits of each number in array
        int[] lsds = new int[aL];

        //buckets for ints 0-9
        int[][] bckts = new int[10][10];
        int[] b = new int[10];

        // for each number in array get lsd add to bucket
        for (int i = 0; i < aL; i++) {
            int lsd = (array[i] % (j * 10)) / j;
            lsds[i] = lsd;
            System.out.print(lsd + " ");
        }
        System.out.println();
        
        // for(int s = 0; s < 10; s++){
        //     for(int m = 0; m < aL; m++){
        //         if(lsds[m] == s){
        //             System.out.println(array[m]);
        //             lsds[m] = -1;
        //         }
        //     }
        // }
        // //int p = 0;
        // for (int k = 0; k < 10; k++){
        //     System.out.print(lsds[k] + " ");
        //     b[k] = 0;
        //     for(int s = 0; s < 10; s++){
        //         bckts[k][s] = mX;
        //     }
            
        
        //     // or (int r = 0; r < aL; r++){
        //     //     int pl = array[r];
        //     //     if ((pl%(j*10))/j == lsds[k]){
        //     //         nA[p++] = array[k];
        //     //     }
        //     // int l = lsds[k];
        //     // for(int m = 0; m < aL; m++){
        //     //     if (array[m] % (j * 10) / j == l ){
        //     //         nA[k] = array[m];
        //     //     }
        //     // }
        // }
        // System.out.println();
        
        // for(int t = 0; t < nA.length; t++){
        //     System.out.print(nA[t] + " ");
        // }
    }

    public static void main(String[] args) {

        // get string from command line
        String s = args[0];

        // get size of array
        int n = s.split(" ").length;
        
        // give arr size
        int[] arr = new int[n];

        // save split string sArr
        String sArr[] = s.split(" ");

        // convert entries in sArr to ints in arr
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }

        // create a variable to hold max value of array
        int max = arr[0];

        // get max value in array
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int j = 1;
        // sort arrays for each significant digit in max value
        while ((max/j > 0)){
            radSort(arr, j, max);
            //print array after each sort
            // for (int k = 0; k < n; k++){
            //     System.out.print(arr[k] + " ");
            // }
            // System.out.println();
            //increment for next lsd
            j *= 10;
        }



        // for (int i = 0; i < arr.length; i++){
        //     System.out.println((arr[i]%1000)/100);
        // }

        //for loop to go through each digits place 
        
        //radSort(arr, max);


        // //bucket sort for each place in max digit
        // for (int i = 1; max/i > 0; i *= 10){
        //     System.out.println(i);
        // }
    }
}