package hw.lesson3.task1;

public class SwapArray <A> {
    A element;

    public A[] swapElements(A[] array, int firstIndex, int secondIndex) {
        element = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = element;
        return array;
    }
}
