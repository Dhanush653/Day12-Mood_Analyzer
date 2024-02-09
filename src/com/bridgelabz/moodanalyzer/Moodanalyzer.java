package com.bridgelabz.moodanalyzer;

public class Moodanalyzer {
    String message;

    public Moodanalyzer(String message) {
        this.message = message;
    }

    public void analyzeMood() {
        try{
            if (message.contains("sad") || message.contains("Sad") || message.contains("SAD")) {
                System.out.println("Sad");
            }
            if (!message.contains("sad") || !message.contains("Sad") || !message.contains("SAD")){
                System.out.println("HAPPY");
            }
        }
        catch (NullPointerException e){
            System.out.println("happy (You have enter Null String)");
        }
    }
}