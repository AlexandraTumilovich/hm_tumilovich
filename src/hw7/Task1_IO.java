package hw7;

import java.io.*;

public class Task1_IO {
    public static void main(String[] args) throws IOException {
        /*
        Найти максимальный байт в файле и вывести его на экран.
        Имя файла необходимо ввести с консоли.
        Закрыть поток ввода-вывода после выполнения (или использовать конструкцию try-with-resources).
        Найти минимальный байт в файле и вывести его на экран.
        Имя файла необходимо ввести с консоли.
        Закрыть поток ввода-вывода после выполнения (или использовать конструкцию try-with-resources).
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите полный путь и имя файла, например d:\\tmp\\test.txt");
        String fileName = reader.readLine();
        try (FileInputStream file1 = new FileInputStream(fileName);
             FileWriter file2 = new FileWriter(fileName, true)) {
            byte[] bytes = file1.readAllBytes();
            if (bytes.length > 0) {
                byte max = bytes[0];
                byte min = bytes[0];
                for (int i = 1; i < bytes.length; i++) {
                    if (max < bytes[i]) max = bytes[i];
                    if (min > bytes[i]) min = bytes[i];
                }
                System.out.println("Наибольший байт: " + max);
                System.out.println("Наименьший байт: " + min);
            } else {
                System.out.println("Файл пустой.");
            }
            /*
            Записать в файл перевернутую строку.
            Строку ввести из консоли.
            Для работы со строкой можно использовать класс StringBuilder.
            */
            System.out.println("Введите строку для записи в файл.");
            String line = reader.readLine();
            char[] charsFromLine = line.toCharArray();
            StringBuilder newLine = new StringBuilder();
            for (int i = charsFromLine.length - 1; i >= 0; i--) {
                newLine.append(charsFromLine[i]);
            }
            System.out.println("Перевернутая строка, записанная в указанный файл: " + newLine);
            file2.write(newLine.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        /*
        Считать из файла строку и вывести ее на консоль так, чтобы слова в этой строке шли в обратном порядке.
        Например:
        Hello this is Java!
        Результат:
        Java! Is this Hello
         */
        System.out.println("Введите полный путь и имя файла, из которого надо прочитать строку, например d:\\tmp\\test2.txt");
        String secondFileName = reader.readLine();
        reader.close();
        try {
            FileReader file3 = new FileReader(secondFileName);
            BufferedReader reader2 = new BufferedReader(file3);
            String firstLine = reader2.readLine();
            if (firstLine != null) {
                String[] lines = firstLine.split(" ");
                StringBuilder revertedFirstLine = new StringBuilder();
                for (int i = lines.length - 1; i >= 0; i--) {
                    revertedFirstLine.append(lines[i]);
                    revertedFirstLine.append(" ");
                }
                System.out.println("Считанная из файла строка в обратном порядке: " + revertedFirstLine);
                file3.close();
                reader2.close();
            } else {
                System.out.println("Файл пустой");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
