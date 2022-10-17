public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = mySort.getRandomArray(5, 100);
        mySort.showRandomArray(myArray);
        System.out.println("sorted:");
        mySort.showRandomArray(SelectionSort(myArray));
    }

//    public static ArrayList<Integer> SelectionSort(ArrayList<Integer> arrayList) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            int currentValue = arrayList.get(i);
//            for (int j = i; j < arrayList.size(); j++) {
//                if (arrayList.get(j) < currentValue) {
//                    currentValue = arrayList.get(j);
//                }
//                if (j == arrayList.size() - 1) {
//                    arrayList.remove(arrayList.indexOf(currentValue));
//                    arrayList.add(i, currentValue);
//                }
//            }
//        }
//        return arrayList;
//    }

    public static int[] SelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            int indexcV = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < currentValue) {
                    currentValue = array[j];
                    indexcV = j;
                }
                if (j == array.length - 1) {
                    array[indexcV] = array[i];
                    array[i] = currentValue;
                }
            }
        }
        return array;
    }
}
