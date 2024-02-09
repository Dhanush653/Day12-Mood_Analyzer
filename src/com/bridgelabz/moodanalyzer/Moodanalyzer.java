package com.bridgelabz.moodanalyzer;

public class Moodanalyzer {

    String message;

    public Moodanalyzer(String message) {
        this.message = message;
    }

    public void analyzeMood() {
        try {
            if (message == null || message.isEmpty()) {//constructor
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_OR_NULL, "Message is null or empty");
            } else if (message.contains("sad") || message.contains("Sad") || message.contains("SAD")) {
                System.out.println("Sad");
            } else {
                System.out.println("HAPPY");
            }
        } catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }
    }
}
