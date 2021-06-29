package pl.dudecode.quiz;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    private QuizForm quizForm;
    private boolean answered;

    public void save(QuizForm quizForm) {
        setQuizForm(checkAnswers(quizForm));
        answered = true;
    }

    public void edit() {
        answered = false;
    }

    public void reset() {
        quizForm = new QuizForm();
        answered = false;
    }

    public QuizForm getQuizForm() {
        if (quizForm == null) {
            answered = false;
            return new QuizForm();
        } else {
            return quizForm;
        }
    }

    public void setQuizForm(QuizForm quizForm) {
        this.quizForm = quizForm;
    }

    public boolean isAnswered() {
        if (quizForm == null) {
            answered = false;
        }
        return answered;
    }

    private QuizForm checkAnswers(QuizForm quizForm) {
        if (StringUtils.isBlank(quizForm.getAnswerForC())) {
            quizForm.setAnswerForC(QuizForm.NO_ANSWER);
        }
        if (StringUtils.isBlank(quizForm.getAnswerForR())) {
            quizForm.setAnswerForR(QuizForm.NO_ANSWER);
        }
        if (StringUtils.isBlank(quizForm.getAnswerForU())) {
            quizForm.setAnswerForU(QuizForm.NO_ANSWER);
        }
        if (StringUtils.isBlank(quizForm.getAnswerForD())) {
            quizForm.setAnswerForD(QuizForm.NO_ANSWER);
        }
        return quizForm;
    }
}
