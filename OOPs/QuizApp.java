package OOPs;
import java.util.Scanner;

public class QuizApp {

		String questions[]; // 3-4
		String options[][] ; // every question has 4 options
		int answers[]; // correct answers
		
		public QuizApp() {
			
		 questions = new String[3];	
		 this.questions[0]="What is the capital of india?";
		 this.questions[1]="What is the name of the national bird of india? ";
		 this.questions[2]="What si the name of the national animal of india?";
		 
		 options = new String[3][4];
		 this.options[0][0] = "Mumbai";
		 this.options[0][1] = "Delhi";
		 this.options[0][2] = "Kolkata";
		 this.options[0][3] = "Pune";
	
		 this.options[1][0] = "Piegon";
		 this.options[1][1] = "Peacock";
		 this.options[1][2] = "Crow";
		 this.options[1][3] = "Eagle";
		 
		 this.options[2][0] = "Lion";
		 this.options[2][1] = "Elephant";
		 this.options[2][2] = "Tiger";
		 this.options[2][3] = "Cow";
		 
		 
		 answers = new int[3];
		 this.answers[0] = 2;
		 this.answers[1] = 2;
		 this.answers[2] = 3;
		 
		 
		}
		
		public float playQuiz()
		{
			float point = 0;
			int answer;
			Scanner sc = new Scanner(System.in); 
			QuizApp quizapp = new QuizApp();
			
			System.out.println("Quiz is starting....");
			System.out.println("1 mark is for every correct answer and -0.5 is for every wrong answer...");
			for(int i=0;i<questions.length;i++)
			{
				System.out.println("Question "+ (i+1)+ " is :-"+questions[i]);
				for(int j=0;j<options.length;j++)
				{
					System.out.println("Option "+(j+1)+ " : " +options[i][j]);
				}
				System.out.println("Choose the correct option");
				answer = Integer.parseInt(sc.nextLine());
				if(answer == answers[i])
				{
					point++;
				}
				else
				{
					point = point-0.5f;
				}
				
			}
			
			
			return point;
		}
		

		public static void main(String[] args) {
			
			QuizApp quiz = new QuizApp();
			
			float res = quiz.playQuiz();
			System.out.println("Your final score is :"+res);
			
		}
	

}
