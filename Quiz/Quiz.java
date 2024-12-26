import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Define the number of questions
        int totalQuestions = 10;

        // Arrays to store the questions, answers, and correct answers
        String[] questions = {
            "What is the capital of South Africa? (A) Pretoria (B) Johannesburg (C) Cape Town (D) Durban",
            "What is the largest planet in our solar system? (A) Earth (B) Mars (C) Jupiter (D) Saturn",
            "Who is known as the father of modern physics? (A) Isaac Newton (B) Albert Einstein (C) Galileo Galilei (D) Nikola Tesla",
            "What is the chemical symbol for water? (A) O2 (B) H2O (C) CO2 (D) NaCl",
            "Which continent is known as the 'Dark Continent'? (A) Asia (B) Africa (C) Europe (D) Australia",
            "What is the boiling point of water at sea level in degrees Celsius? (A) 90°C (B) 100°C (C) 110°C (D) 120°C",
            "Which animal is known as the king of the jungle? (A) Tiger (B) Elephant (C) Lion (D) Bear",
            "What is the fastest land animal? (A) Cheetah (B) Lion (C) Tiger (D) Kangaroo",
            "In which year did World War II end? (A) 1940 (B) 1945 (C) 1950 (D) 1960",
            "Who wrote the play 'Romeo and Juliet'? (A) William Shakespeare (B) Charles Dickens (C) Jane Austen (D) Mark Twain"
        };

        char[] correctAnswers = {'A', 'C', 'B', 'B', 'B', 'B', 'C', 'A', 'B', 'A'};
        char[] studentAnswers = new char[totalQuestions];

        // Display questions and collect answers
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");
            studentAnswers[i] = scanner.next().toUpperCase().charAt(0);  // Ensure input is uppercase
        }

        // Calculate the number of correct answers
        int correctCount = 0;
        for (int i = 0; i < totalQuestions; i++) {
            if (studentAnswers[i] == correctAnswers[i]) {
                correctCount++;
            }
        }

        // Display the result
        System.out.println("\nYou got " + correctCount + " out of " + totalQuestions + " correct.");

        // Provide feedback
        if (correctCount == totalQuestions) {
            System.out.println("Excellent! You got a perfect score!");
        } else if (correctCount >= totalQuestions * 0.7) {
            System.out.println("Good job! You have a solid understanding.");
        } else {
            System.out.println("Better luck next time! Review the material and try again.");
        }

        // Close the scanner
        scanner.close();
    }
}
