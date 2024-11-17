class ArrayUtils {

    public static <T> boolean arraysEqual(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Индексы должны быть в пределах массива");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        System.out.println(arraysEqual(array1, array2));

        String[] array3 = {"a", "b", "c"};
        String[] array4 = {"a", "b", "d"};
        System.out.println(arraysEqual(array3, array4));

        swapElements(array1, 0, 2);
        for (Integer num : array1) {
            System.out.print(num + " ");
        }
    }
}