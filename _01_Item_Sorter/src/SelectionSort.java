import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = mySort.getRandomArray(5, 10);
        ArrayList<Integer> myArrayList = mySort.getArrayAsArrayList(myArray);
        System.out.println(SelectionSort(myArrayList));

    }

    public static ArrayList<Integer> SelectionSort(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            int currentValue = arrayList.get(i);
            for (int j = i+1; j < arrayList.size(); j++) {
                if (arrayList.get(j)<currentValue){
                    currentValue = arrayList.get(j);
                }
                if(j==arrayList.size()-1){
                    arrayList.remove(arrayList.indexOf(currentValue));
                    arrayList.add(i,currentValue);
                }
            }
        }
        return arrayList;
    }
}
