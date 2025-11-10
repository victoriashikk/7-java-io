package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        // Пример тестирования с файлом input.test:
        try (InputStream inputStream = new FileInputStream("task03/src/com/example/task03/input.test")) {
            String result = readAsString(inputStream, Charset.forName("UTF-8"));
            System.out.println(result);
        }
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException();
        }

        byte[] buffer = new byte[1024];
        StringBuilder result = new StringBuilder();
        int bytesRead;

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            result.append(new String(buffer, 0, bytesRead, charset));
        }

        return result.toString();
    }
}