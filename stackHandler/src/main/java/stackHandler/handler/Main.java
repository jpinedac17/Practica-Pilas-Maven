package stackHandler.handler;

import umg.edu.gt.data_structure.stack.manual.StackLinked;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Debe ingresar una expresión.");
            return;
        }

        String expression = args[0];

        StackLinked stack = new StackLinked();

        for (char c : expression.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) {
                    System.out.println("Resultado: false");
                    return;
                }

                char open = stack.pop();

                if (!matches(open, c)) {
                    System.out.println("Resultado: false");
                    return;
                }
            }
        }

        System.out.println("Resultado: " + stack.isEmpty());
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
