public class Question {
    private String QuestionText; 
    private String[] Options;
    private int CorrectOptionIndex;

    public Question (String QuestionText, String[] Options, int CorrectOptionIndex) {
        this.QuestionText= QuestionText;
        this.Options= Options;
        this.CorrectOptionIndex= CorrectOptionIndex;

        
    }

    public String getQuestionText() {
        return QuestionText;
    }

    public String[] getOptions() {
        return Options;
    }

    public int getCorrectOptionIndex() {
        return CorrectOptionIndex;
    }


}
