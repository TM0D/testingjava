package u5classes;

public class HiddenWord {
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
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

    public static void testingHW() {
        HiddenWord puzzle = new HiddenWord("WELLERMAN"); // 9
    
        System.out.println(puzzle.getHint("WESTLTOWN"));
        System.out.println(puzzle.getHint("WELLSTOWN"));
        System.out.println(puzzle.getHint("WELLERTON"));
        System.out.println(puzzle.getHint("WELLERMIN"));
        System.out.println(puzzle.getHint("WELLERMAN"));
    
      }
}