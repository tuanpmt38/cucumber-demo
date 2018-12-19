package demo;

import java.util.List;

public class DataReader {

    public static void main(String[] args) {
//        readCSV();
        readXLS();
    }

    public static void readCSV(){
        String filename = "/home/tuan-minh/setup/setup-selenium/UserAccount";
        List<String []> records =  utils.CSV.get(filename);
        for (String[] record : records) {
            for (String field : record){
                System.out.println(field);
            }
        }
    }

    public static void readXLS(){

        String filename = "/home/tuan-minh/setup/setup-selenium/UserLogin.xls";
        String [][] data = utils.Excel.get(filename);
        for (String [] record : data) {
            System.out.println(record [0]);
            System.out.println(record [1]);
            System.out.println(record [2]);
        }

    }
}
