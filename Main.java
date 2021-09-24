/**
 * <h1>Method annotation examples.</h1>
 * <h2>
 * <b>More detailed information can be found <a target="_blank" href="https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html">here</a>!</b>
 * </h2>
 *
 *
 * @author Jordan
 * @version  1.0
 */
public class Main {

    public static void main(String[] args) {
        methodThatDoesSomething();
        methodThatDoesSomethingWithDescription();

        printTwoWords("Hello","World");

        String words = combineTwoWords("Goodbye","World");
        System.out.println(words);

        DrawingPanel panel = createPanel(100,100);
    }

    // Method that does something;
    public static void methodThatDoesSomething(){
        System.out.println("Something");
    }

    /**
     * This method is better than the last one because it has a proper description!
     * <b>These comments are written in html!</b>
     */
    public static void methodThatDoesSomethingWithDescription(){
        System.out.println("Better method that does something.");
    }

    /**
     * This method prints two words! It also has parameter annotations!
     * @param word1 The first word!
     * @param word2 The second word!
     */
    public static void printTwoWords(String word1, String word2){
        System.out.println(word1 + " " + word2);
    }

    /**
     * This method will combine two words together and return them to you!
     *
     * @param word1 The first word in the string!
     * @param word2 The second word in the string!
     * @return Returns the combination of word1 and word2
     */
    public static String combineTwoWords(String word1, String word2){
        return word1 + " " + word2;
    }

    /**
     * This method creates a panel for you to draw stuff in!
     *
     * @param width The width of the panel!
     * @param height The height of the panel!
     * @return The panel generated!
     * @see DrawingPanel#DrawingPanel()
     */
    public static DrawingPanel createPanel(int width, int height){
        return new DrawingPanel(width, height);
    }

}