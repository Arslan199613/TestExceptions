import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключений в методе main");

        }
        File file = new File("asdf");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("после Scanner 'a ");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");

    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("asdf");
        Scanner scanner = new Scanner(file);
    }
}