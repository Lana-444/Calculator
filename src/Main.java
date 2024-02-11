public class Main {
    public static void main(String[] args) {

        try {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
        
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0 невозможно");
        }


    }
}

// При делении (a/b) возникает ошибка ArithmeticException, так как b=0 (поделить на 0 нельзя)
// данную ошибку необходимо обработать с помощью конструкции try-catch