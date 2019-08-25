package io.actions;

import io.model.Movie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AddToFile {

    public void addToFile(List<Movie> westerns, List<Movie> actions, String argument) {
        try (FileWriter fileWriter = new FileWriter(argument + "/info.txt"); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("|---westerns");

            for (int i = 0; i < westerns.size(); i++) {
                bufferedWriter.newLine();
                bufferedWriter.write("|     " + (i + 1) + " " + westerns.get(i).getName());
            }
            bufferedWriter.newLine();
            bufferedWriter.write("|---actions");
            for (int i = 0; i < actions.size(); i++) {
                bufferedWriter.newLine();
                bufferedWriter.write("|     " + (i + 1) + " " + actions.get(i).getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
