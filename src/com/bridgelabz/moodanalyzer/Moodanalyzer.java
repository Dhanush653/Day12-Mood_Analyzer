package com.bridgelabz.moodanalyzer;

public class Moodanalyzer {
    public String analyzeMood(String message){
        if(message.contains("sad") || message.contains("Sad")){
            return "SAD";
        }
        else{
            return "HAPPY";
        }
    }

}
