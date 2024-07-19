import java.util.Scanner;

public class QuestionService {
    Question[] questions =new Question[5];
    String[] selection =new String[5];
    public QuestionService(){
        System.out.println("You are about to Create Questions and options and Respective answers:");
        System.out.println("Please enter whats been asked");
        for(int i=0;i<5;i++){
            questions[i]=new Question();
            questions[i].setId(i+1);
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter the question description:");
            questions[i].setDescription(sc.nextLine());
            System.out.println("Please enter the option1:");
            questions[i].setOption1(sc.nextLine());
            System.out.println("Please enter the option2:");
            questions[i].setOption2(sc.nextLine());
            System.out.println("Please enter the option3:");
            questions[i].setOption3(sc.nextLine());
            System.out.println("Please enter the option4:");
            questions[i].setOption4(sc.nextLine());
            System.out.println("Please enter the answer for the above question:");
            questions[i].setAnswer(sc.nextLine());

        }

    }

    public void playQuiz(){
        System.out.println("Now Quiz is about to begin:");
        System.out.println("Please enter the options that you wish to choose: ");
        for(int i=0;i<5;i++) {
            System.out.println(questions[i].getId() + "." + questions[i].getDescription());
            System.out.println(questions[i].getOption1());
            System.out.println(questions[i].getOption2());
            System.out.println(questions[i].getOption3());
            System.out.println(questions[i].getOption4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
        }
    }
    public void displayScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            if(questions[i].getAnswer().equals(selection[i])){
                score++;
            }
        }
        System.out.println("Your Score is :"+ score);
    }

}
