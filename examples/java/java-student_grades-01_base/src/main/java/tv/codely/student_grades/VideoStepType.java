package tv.codely.student_grades;

public class VideoStepType implements StepType {

    private int videoDurationInMinutes;

    public VideoStepType(int videoDurationInMinutes) {
        this.videoDurationInMinutes = videoDurationInMinutes;
    }

    @Override
    public int estimatedCompletionMinutes() {
        return videoDurationInMinutes;
    }
}
