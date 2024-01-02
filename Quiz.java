import java.util.*;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions=questions;
        this.score=0;
    }

    public void StartQuiz() {
        Scanner sc = new Scanner(System.in);

        // below the loop will print the questions in the array

       int i = 0;
       for(Question currentQuestion : questions) {
        System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestionText());
        i++;

        String[] options = currentQuestion.getOptions();

        //below loop will iterate thorugh the options and prints the options for the current question

        for(int j = 0; j < options.length; j++){
            System.out.println((j + 1) + "." + options[j]);
        }

        System.out.println("Arpit (1-" + options.length + "): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == currentQuestion.getCorrectOptionIndex() + 1) {
                System.out.println("Correct !\n");
                score++;
            }else{
                System.out.println("Incorret . The  correct answer is:" + (currentQuestion.getCorrectOptionIndex() + 1) + "\n");
            }
       }
       System.out.println("Quiz completed! Your score: " + score + "/" + questions.length);
    }
}
