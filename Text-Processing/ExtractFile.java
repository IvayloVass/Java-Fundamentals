package TextProcessing_excersise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\\\");
        String tokens = input[input.length - 1];
        String fileName = tokens.split("\\.")[0];
        String extension = tokens.split("\\.")[1];
        System.out.printf("File name: %s%n" +
                "File extension: %s", fileName, extension);
    }
}
