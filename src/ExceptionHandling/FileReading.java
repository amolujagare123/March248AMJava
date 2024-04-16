package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReading {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("D:\\myfile1.txt");

    }
}
