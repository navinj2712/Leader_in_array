import java.util.ArrayList;
import java.util.Scanner;

public class LeaderInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        int[] outputArray = findLeaderInArray(array);
        System.out.println("Output Array : ");
        for(int i = 0; i < outputArray.length; i++){
            System.out.println(outputArray[i] + " ");
        }
    }

    private static int[] findLeaderInArray(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = array.length;
        int maximum = array[size-1];
        for (int i = size - 2; i >= 0; i--){
            if(array[i] > maximum){
                maximum = array[i];
                list.add(maximum);
            }
        }
        list.add(array[size-1]);
        int[] outputArray = new int[list.size()];
        for (int i = 0; i < outputArray.length; i++){
            outputArray[i] = list.get(i);
        }
        return outputArray;
    }
}
