package org.example;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String r = "G()(al)";
        System.out.println(interpret(r));
    }

    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder();

        for (int i=0; i < command.length(); i++) {
            if (command.charAt(i) == '(') {
                if (i != command.length() - 1) {
                    if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                        ans.append('o');
                    }
                }
                continue;
            }
            if (command.charAt(i) == ')') {
                continue;
            }

            ans.append(command.charAt(i));
        }


        return ans.toString();
    }
}
