package day05;

import java.io.*;

public class ExceptionExam2 {

    static void createStream() {
        try {
            FileOutputStream fos = new FileOutputStream("data.dat");
            byte data = 65;

            fos.write(data);
            fos.close();
        }catch (Exception e){
            System.out.println("예외가 발생함.");
        }
    }
    static void readFile(String fileName){
        try {

            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
        }catch (Exception e){
            System.out.println("파일을 찾을수 없습니다.");
        }
    }
    public static void main(String[] args){
            createStream();
            readFile("myFile.dat");
    }
}
