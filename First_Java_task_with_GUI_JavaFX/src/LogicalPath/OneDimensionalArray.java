package LogicalPath;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
// Class required for TASK 4
public class OneDimensionalArray {
    public static int[] getOddValue(int[] arr){
        for(int i = 1, j = 0; i <= 99;i++){
            if( i % 2 != 0){
                arr[j] = i;
                j++;
            }
        }
        return Arrays.copyOf(arr,arr.length);
    }

    public static int[] reverseValue(int[] arr){
        int temp;
        for(int i = arr.length - 1, j = 0; i > arr.length/2; i--,j++){
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        return Arrays.copyOf(arr,arr.length);
    }

    public static String oddAndEvenElementsOnArray(int[] arr, String result){
        result = "";
        int[] odd = new int[arr.length ];
        int[] even = new int[arr.length ];
        int j = 0 , k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even[j] = arr[i];
                j++;
            }
            else {
                odd[k] = arr[i];
                k++;
            }
        }
        int [] oddResult = Arrays.copyOf(odd,k);
        int [] evenResult = Arrays.copyOf(even,j);
        result += "Amount of odd values: " + oddResult.length + "\n";
        result += Arrays.toString(oddResult) ;
        result += "\n" + "Amount of even values: " + evenResult.length + "\n";
        result += Arrays.toString(evenResult) + "\n";
        return result;
    }

    public static int[] replaseOddValues(int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                result[i] = arr[i];
            }
            else {
                result[i] = 0;
            }
        }
        return Arrays.copyOf(result,result.length);
    }

    public static void minMaxValues(int[] arr){
        int min = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max: " + max + "\n" + "min: " + min);


    }

    public static void  lastEntryOfElement (int[] arr, int value){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == value){
                System.out.println("The last entry " + value + " is " + "[" + (i+1) + "]");
                break;
            }
        }
    }

    public static String minMaxAndEntryOfelements(int[] arr, String result){
        int min = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        result += "max: " + max + "\n" + "min: " + min + "\n";


        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == max){
                result += "The last max entry: "  + "[" + (i+1) + "]" + "\n";
                break;
            }
        }

        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == min){
                result += "The last min entry: "  + "[" + (i+1) + "]";
                break;
            }
        }
        return result;
    }

    public static String whichElement(int[] arr, String res){
        int count1 = 0; // for -1
        int count2 = 0; // for 1
        int count3 = 0; // for 0
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == -1){
                count1++;
            }
            if(arr[i] == 1){
                count2++;
            }
            if(arr[i] == 0){
                count3++;
            }
        }

        int result = Math.max(count1,count2);
        result = Math.max(result,count3);
        if((result == count1) && (result == count2) && (result == count3)){
            res += "All elements occur the same number of times: " + result + "\n";
            System.out.println("All elements occur the same number of times: " + result);
        }
        else {
            if((result == count1) && (result == count2) && (result != count3)){
                System.out.println("Element -1 and 1 occur the most number of times: " + result);
                res += "Element -1 and 1 occur the most number of times: " + result + "\n";
            }
            else{
                if((result == count1) && (result != count2) && (result == count3)){
                    res += "Element -1 and 0 occur the most number of times: " + result + "\n";
                    System.out.println("Element -1 and 0 occur the most number of times: " + result);
                }
                else{
                    if((result != count1) && (result == count2) && (result == count3)){
                        res += "Element 1 and 0 occur the most number of times: " + result + "\n";
                        System.out.println("Element 1 and 0 occur the most number of times: " + result);
                    }
                    else{
                        if(count1 == result){
                            res += "Element -1 occur the most number of times: " + result + "\n";
                            System.out.println("Element -1 occur the most number of times: " + result);
                        }
                        else {
                            if(count2 == result){
                                res += "Element 1 occur the most number of times: " + result + "\n";
                                System.out.println("Element 1 occur the most number of times: " + result);
                            }
                            else {
                                res += "Element 0 occur the most number of times: " + result + "\n";
                                System.out.println("Element 0 occur the most number of times: " + result);
                            }
                        }
                    }
                }
            }
        }

        return res;

    }
}
