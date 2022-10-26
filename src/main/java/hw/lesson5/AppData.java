package hw.lesson5;

import java.io.Serializable;

public class AppData implements Serializable {
    private String[] headers;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.headers = header;
        this.data = data;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }


    public void setData(int[][] data) {
        this.data = data;
    }

    public String[] getHeaders() {
        return headers;
    }

    public int[][] getData() {
        return data;
    }

    public void printInfo() {
        for (String header : headers) {
            System.out.print(header +";");
        }
        System.out.println();
        for (int[] rowData : data) {
            for (int data : rowData) {
                System.out.print(data + ";");
            }
            System.out.println();
        }
    }

}
