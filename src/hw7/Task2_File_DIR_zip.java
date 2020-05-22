package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Task2_File_DIR_zip {
    public static void main(String[] args) throws IOException {
        /*
        Создать на диске каталог (папку).
        В созданном каталоге создать три файла с содержимым.
        Заархивировать эти три файла в одном архиве.
        Переименовать каталог.
        Вывести в консоль все содержимое каталога.
        Удалить каталог.
         */

        //Создать на диске каталог (папку).
        File myDir = new File("d:\\test_dir");
        if (!myDir.exists()) {
            if (myDir.mkdir()) {
                System.out.println("Directory is created");
            }
        } else {
            myDir.delete();
            myDir.mkdir();
            System.out.println("Old directory is deleted. New directory is created");
        }
        //В созданном каталоге создать три файла с содержимым.
        File file1 = new File("d:\\test_dir\\file1.txt");
        File file2 = new File("d:\\test_dir\\file2.txt");
        File file3 = new File("d:\\test_dir\\file3.txt");
        if (!file1.exists() && !file2.exists() && !file3.exists()) {
            boolean createdFile1 = file1.createNewFile();
            boolean createdFile2 = file2.createNewFile();
            boolean createdFile3 = file3.createNewFile();
            if (createdFile1 && createdFile2 && createdFile3) {
                System.out.println("All three files are created!");
            }
        }
        try (FileWriter fw1 = new FileWriter(file1);
             FileWriter fw2 = new FileWriter(file2);
             FileWriter fw3 = new FileWriter(file3);
             ZipOutputStream zous = new ZipOutputStream(new FileOutputStream("d:\\test.zip"))
        ) {
            fw1.write("Text in first file");
            fw2.write("Text in second file");
            fw3.write("Text in third file");
            //Заархивировать эти три файла в одном архиве.
            ZipEntry entry1 = new ZipEntry(file1.getPath());
            ZipEntry entry2 = new ZipEntry(file2.getPath());
            ZipEntry entry3 = new ZipEntry(file3.getPath());
            zous.putNextEntry(entry1);
            zous.putNextEntry(entry2);
            zous.putNextEntry(entry3);
            System.out.println("ZIP is created.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Переименовать каталог.
        File newDir = new File("d:\\test_dir_renamed");
        if (myDir.renameTo(newDir)) {
            System.out.println("My directory is renamed.");
        }
        // Вывести в консоль все содержимое каталога. Удалить каталог.
        System.out.println("Directory " + newDir.getName() + " contains:");
        for (File item : newDir.listFiles()) {
            System.out.println(item.getName());
            item.delete();
        }
        String dirName = newDir.getName();
        boolean deletedDir = newDir.delete();
        if (deletedDir) System.out.println("Directory " + dirName + " was deleted.");
    }
}
