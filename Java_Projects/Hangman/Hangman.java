package Java_Projects.Hangman;

import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = {"astronomy", "galaxy", "computer", "variable", "programming"};
        Random rand = new Random();

        String word = words[rand.nextInt(words.length)];
        char[] progress = new char[word.length()];
        Arrays.fill(progress, '_');

        int attempts = 6;
        HashSet<Character> used = new HashSet<>();

        while (attempts > 0) {
            System.out.println("\nWord: " + String.valueOf(progress));
            System.out.println("Attempts left: " + attempts);
            System.out.println("Used letters: " + used);
            System.out.print("Guess a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);

            if (used.contains(guess)) {
                System.out.println("Already used!");
                continue;
            }
            used.add(guess);

            if (word.indexOf(guess) >= 0) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess)
                        progress[i] = guess;
                }
                if (String.valueOf(progress).equals(word)) {
                    System.out.println("\nYOU WIN! The word was: " + word);
                    return;
                }
            } else {
                attempts--;
            }
        }

        System.out.println("\nGAME OVER. Word was: " + word);
    }
}
