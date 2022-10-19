package hw.lesson2;

public class MyArrayDataException extends Exception {
    MyArrayDataException(int row, int col){
        super("Неверный формат в ячейке " + row + ":" + col);
    }
}
