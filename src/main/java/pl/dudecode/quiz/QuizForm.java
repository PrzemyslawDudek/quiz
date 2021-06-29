package pl.dudecode.quiz;

import lombok.Data;

@Data
public class QuizForm {

    public static String NO_ANSWER = "Brak Odpowiedzi";

    private String answerForC;
    private String answerForR;
    private String answerForU;
    private String answerForD;

}
