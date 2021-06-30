package pl.dudecode.quiz;

import lombok.Data;

@Data
public class QuizForm {

    public static final String NO_ANSWER = "Brak Odpowiedzi";

    public static String questionForC = "Co oznacza literka C w akronimie CRUD";
    public static String questionForR = "Co oznacza literka R w akronimie CRUD";
    public static String questionForU = "Co oznacza literka U w akronimie CRUD";
    public static String questionForD = "Co oznacza literka D w akronimie CRUD";

    private String answerForC;
    private String answerForR;
    private String answerForU;
    private String answerForD;

}
