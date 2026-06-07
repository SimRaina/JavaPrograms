public class IncrementCharacter {
    public static void main(String[] args) {
        String input = "aceg"; // output "bdfh"
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char shifted = (char) (ch + 1);
            output.append(shifted);
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + output.toString());
    }
}
