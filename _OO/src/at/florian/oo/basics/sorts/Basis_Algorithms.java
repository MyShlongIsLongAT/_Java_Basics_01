package at.florian.oo.basics.sorts;

public class Basis_Algorithms {
    public static void main(String[] args) {
        int[] myArray = mySort.getRandomArray(20, 100);
        //int[] newArray = revert(myArray);
        //at.florian.oo.basics.sorts.mySort.showRandomArray(newArray);
        System.out.println(max(myArray));
        System.out.println(min(myArray));
    }

    public static int[] revert(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = array.length - 1; i > -1; i--) {
            newArray[array.length - i - 1] = array[i];
        }

        return newArray;
    }

    public static int max(int[] array) {
        int maxInt = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxInt) {
                maxInt = array[i];
            }
        }
        return maxInt;
    }
    public static int min(int[] array) {
        int minInt = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minInt) {
                minInt = array[i];
            }
        }
        return minInt;
    }
}
