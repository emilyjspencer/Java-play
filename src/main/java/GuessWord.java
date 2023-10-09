import java.util.Scanner;

public class GuessWord {

    private String word;

    private int tries;

    public GuessWord(String word, int tries) {
        this.word = word;
        this.tries = tries;
    }



    public void play() {

            Scanner scanner = new Scanner(System.in);
            int remainingTries = tries;

            while(remainingTries > 0) {
                System.out.print("Tries left:" + remainingTries);
                System.out.println("Enter your guess of the word");
                String guess = scanner.nextLine();

                if (guess.length() != word.length()) {
                    System.out.println("Invalid attempt. Your word must have the same number of words as the hidden word");
                    continue;
                }

                int correctLetters = 0;
                int correctIndexing = 0;

                for(int x = 0; x < word.length(); x++) {
                    char letter = guess.charAt(x);
                    if(letter == word.charAt(x)) {
                        correctIndexing++;
                    } else if (word.indexOf(letter) >= 0) {

                        correctLetters++;
                    }
                }

                if(correctIndexing == word.length()) {
                    System.out.println("You won. The word was:" + word);
                    break;
                } else {
                    System.out.println("Correct letters: " + correctLetters);
                    System.out.println("correct indexing: " + correctIndexing);
                    remainingTries--;
                }

        }
            if(remainingTries == 0) {
                System.out.println("TIME IS UP. The word was: " + word);
            }
    }

}
class Game {

    public static void main(String[] args) {
        GuessWord guessWord = new GuessWord("happiness", 7);
        guessWord.play();
    }
};
