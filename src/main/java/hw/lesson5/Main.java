package hw.lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String pathToFile = "src/main/java/hw/lesson5/data.csv";
    private static final String[] headers = {"value1", "value2", "value3"};
    private static final String separator = ";";

    public static void main(String[] args){
        int[][] intArray = {{1,2,3},{3,4,5},{6,7,8},{9,10,11},{12,13,14}};
        AppData data = new AppData(headers, intArray);

        save(data);

        AppData newData = loadData(pathToFile);

        newData.printInfo();
    }

    public static void save(AppData data) {
        try (FileWriter writer = new FileWriter(pathToFile)) {
            for (String header : data.getHeaders()) {
                writer.write(header + ";");
            }
            writer.write(System.getProperty("line.separator"));
            for (int[] intArray : data.getData()) {
                for (int value : intArray) {
                    writer.write(value + ";");
                }
                writer.write(System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData loadData(String pathToFile) {
        List<int[]> dataList = new ArrayList<>();
        String[] headers;
        int[] rowData;

        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            headers = reader.readLine().split(separator);
            String line;

            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(separator);
                rowData = new int[splitLine.length];
                for (int col = 0; col < splitLine.length; col++) {
                    rowData[col] = Integer.parseInt(splitLine[col]);
                }
                dataList.add(rowData);
            }

            return new AppData(headers, dataList.toArray(new int[0][]));
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
