package tv.codely.student_grades;

import java.util.List;

public class Step {

    private String title;
    private StepType type;

    public Step(String title, Integer typeCode, Integer videoDurationInMinutes, List<Integer> quizQuestions) {
        this.title = title;
        this.type = StepFactory.fromPrimitive(typeCode, videoDurationInMinutes, quizQuestions);
    }

    public int estimatedCompletionMinutes() {
        return this.type.estimatedCompletionMinutes();
    }
}
