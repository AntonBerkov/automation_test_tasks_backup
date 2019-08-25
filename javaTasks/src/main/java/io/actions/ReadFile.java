package io.actions;

import java.io.*;


public class ReadFile {

    public void read(File file) {
        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int packages = 0;
            int files = 0;
            int sumNameLength = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("|---")) {
                    packages++;
                } else {
                    files++;
                    sumNameLength += (line.length() - 8);
                }
            }
            System.out.println("Packages " + packages);
            System.out.println("Files " + files);
            System.out.println("Average files in package " + (files / packages));
            System.out.println("Average file name length " + (sumNameLength / files));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
