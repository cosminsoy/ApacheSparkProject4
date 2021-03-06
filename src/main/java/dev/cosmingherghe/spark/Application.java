package dev.cosmingherghe.spark;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Application {

    public static void main(String[] args) {

        //Turn off INFO log entries
        Logger.getLogger("org").setLevel(Level.ERROR);
        Logger.getLogger("akka").setLevel(Level.ERROR);


        ArrayToDataset arrayToDatasetApp = new ArrayToDataset();
        arrayToDatasetApp.start();

        System.out.println("\n\n ---- Part 2 - Running CsvToDatasetHousetoDataframe \n");

        CsvToDatasetHouseToDataframe csvApp = new CsvToDatasetHouseToDataframe();
        csvApp.start();

        System.out.println("\n\n ---- Part 3 - Running WordCount \n");

        WordCount wordCount = new WordCount();
        wordCount.start();

    }
}