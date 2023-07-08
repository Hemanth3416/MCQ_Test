package Mcq_Test;

import java.util.List;

public class Mcqs 
{
	private String question;
    private List<String> options;
    private int correctAnswer;

    public Mcqs(String question, List<String> options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
