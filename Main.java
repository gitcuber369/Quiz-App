public class Main{
        public static void main(String[] args) {
            Question[] questions = new Question[3];

            questions[0] = new Question("What is the capital of France?", new String[]{"Berlin", "Paris", "Madrid", "Rome"}, 2);
            questions[1] = new Question("Which planet is known as the red planet", new String[]{"Mars", "Earth", "Venus", "Mercury"}, 1);

            Quiz quiz = new Quiz(questions);


            quiz.StartQuiz();
        }
    }