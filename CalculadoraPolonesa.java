public class CalculadoraPolonesa {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso correto: java CalculadoraPolonesa <num1> <num2> <operador>");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            String operador = args[2];
            double resultado;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero.");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operador inválido. Use: + - * /");
                    return;
            }

            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Erro: os dois primeiros parâmetros devem ser números.");
        }
    }
}
