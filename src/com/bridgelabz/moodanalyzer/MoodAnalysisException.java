package com.bridgelabz.moodanalyzer;

public class MoodAnalysisException extends Exception {

    enum ExceptionType {
        //To keep track of different types of exception thrown
        EMPTY_OR_NULL
    }
    ExceptionType type;

    public MoodAnalysisException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
