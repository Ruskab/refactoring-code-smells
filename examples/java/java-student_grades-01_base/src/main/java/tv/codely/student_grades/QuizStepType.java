package tv.codely.student_grades;

import java.util.List;

public class QuizStepType implements StepType {

    private static final int QUIZ_STEP_QUESTION_DURATION_ESTIMATION_IN_MINUTES = 3;

    private List<Integer> quizQuestions;

    public QuizStepType(List<Integer> quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    @Override
    public int estimatedCompletionMinutes() {
        return QUIZ_STEP_QUESTION_DURATION_ESTIMATION_IN_MINUTES * quizQuestions.size();
    }

}
