import java.util.ArrayList;
import java.util.Random;

public class mySort {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(4, 10);
        //showRandomArray(randomArray);
        ArrayList<Integer> randomArrayList = getArrayAsArrayList(randomArray);
        System.out.println(randomArrayList);
        System.out.println(sortRandomArrayList(randomArrayList));
    }

    public static ArrayList<Integer> sortRandomArrayList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
        ArrayList<Integer> latestSmallestNumber = new ArrayList<Integer>(); //latest smallest number
        latestSmallestNumber.add(Integer.MAX_VALUE);

        do {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) < latestSmallestNumber.get(0)) {
                    if (arrayList.get(i) == latestSmallestNumber.get(0)) {
                        latestSmallestNumber.add(arrayList.get(i));
                    } else {
                        latestSmallestNumber.clear();
                        latestSmallestNumber.add(arrayList.get(i));
                    }
                }
                if (i == arrayList.size() - 1) {
                    sortedArrayList.addAll(latestSmallestNumber);
                    ArrayList<Integer> indicesList = getIndexOfSmallest(latestSmallestNumber.get(0), arrayList);
                    for (int j = 0; j < indicesList.size(); j++) {
                        System.out.println(indicesList.get(j));
                        arrayList.remove(indicesList.get(j));
                    }
                    latestSmallestNumber.clear();
                    latestSmallestNumber.add(Integer.MAX_VALUE);
                }
            }
        } while (arrayList.size() != 0);
        return sortedArrayList;
    }

    public static ArrayList<Integer> getIndexOfSmallest(int smallestNumber, ArrayList<Integer> arrayList) {
        ArrayList<Integer> index = new ArrayList<Integer>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == smallestNumber) {
                index.add(i);
            }
        }
        return index;
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
