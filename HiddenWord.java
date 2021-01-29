public class HiddenWord {
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getGuess(String guess) {
        String output = "";
        for (int i = 0; i < word.length(); i++) {
            if (guess.charAt(i) == word.charAt(i)) {
                output += word.substring(i, i+1);
            } else if (word.indexOf(guess.charAt(i)) == -1){
                output += "*";
            } else {
                output += "+";
            }
        }
        return output;
    }
}