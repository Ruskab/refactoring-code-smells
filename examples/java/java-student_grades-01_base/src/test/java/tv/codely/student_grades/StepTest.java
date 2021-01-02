package tv.codely.student_grades;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepTest {

    @Test
    public void should_properly_calculate_video_step_estimated_completion_minutes() {
        var step = new Step("lerele", 0, 10, null);

        assertEquals(10, step.estimatedCompletionMinutes());
    }

    @Test
    public void should_properly_calculate_quizz_step_estimated_completion_minutes() {
        var step = new Step("lerele", 1, null, List.of(1, 2, 3));

        assertEquals(9, step.estimatedCompletionMinutes());
    }

    @Test
    public void should_properly_calculate_exercise_step_estimated_completion_minutes() {
        var step = new Step("lerele", 2, null, null);

        assertEquals(30, step.estimatedCompletionMinutes());
    }

}
