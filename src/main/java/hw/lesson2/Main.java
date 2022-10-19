package hw.lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "a"}, {"8", "9", "10", "11"}, {"12", "13", "14", "15"}};
        int sum = 0;
        try {
            sum = checkArray(array);
            System.out.println(sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int checkArray(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (stringArray.length != 4)
            throw new MyArraySizeException();
        for (int row = 0; row < stringArray.length; row++) {
            if (stringArray[row].length != 4)
                throw new MyArraySizeException();
            for (int col = 0; col < stringArray[row].length; col++) {
                try {
                    sum += Integer.parseInt(stringArray[row][col]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(row + 1, col + 1);
                }
            }
        }
        return sum;
    }
}
