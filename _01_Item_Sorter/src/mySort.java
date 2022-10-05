import java.util.ArrayList;
import java.util.Random;

public class mySort {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(10, 100);
        //showRandomArray(randomArray);
        ArrayList<Integer> randomArrayList = getArrayAsArrayList(randomArray);
        System.out.println(randomArrayList);
        System.out.println(sortRandomArrayList(randomArrayList));
    }

    public static ArrayList<Integer> sortRandomArrayList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
        int latestSmallestNumber = Integer.MAX_VALUE; //latest smallest number

        do {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) < latestSmallestNumber) {
                    latestSmallestNumber = arrayList.get(i);
                }
                if (i == arrayList.size() - 1) {
                    sortedArrayList.add(latestSmallestNumber);
                    int index = arrayList.indexOf(latestSmallestNumber);
                    arrayList.remove(index);
                    latestSmallestNumber=Integer.MAX_VALUE;
                }
            }
        } while (arrayList.size() != 0);
        return sortedArrayList;
    }

    public static int[] getRandomArray(int size, int randomSize) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            Random randomValue = new Random();
            randomArray[i] = randomValue.nextInt(randomSize);
        }
        return randomArray;
    }

    public static void showRandomArray(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }
    }

    public static ArrayList<Integer> getArrayAsArrayList(int[] data) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int value : data) {
            list.add(value);
        }
        return list;
    }
}
