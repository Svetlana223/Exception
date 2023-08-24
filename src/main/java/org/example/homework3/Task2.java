package org.example.homework3;

import java.io.*;

public class Task2 {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        try {
            // Чтение файла
            String content = fileManager.readFile("C:/Users/User/IdeaProjects/errors/src/main/java/org/example/input.txt");
            System.out.println("Файд включает:");
            System.out.println(content);

            // Запись в файл
            fileManager.writeFile("output.txt", "Hello, World!");

            // Копирование файла
            fileManager.copyFile("input.txt", "copy.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Произошла ошибка при выполнении операции " + e.getMessage());
        }
    }

}


class FileManager {
    public String readFile(String filePath) throws FileNotFoundException, IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
        }
        return content.toString();
    }

    public void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    public void copyFile(String sourcePath, String destinationPath) throws IOException {
        try (InputStream inputStream = new FileInputStream(sourcePath);
             OutputStream outputStream = new FileOutputStream(destinationPath)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
    }
}
