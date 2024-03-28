public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);


        calc.println.accept(c);

    }
}
// Исправление дз, с помощью тернарного опретаора проверяем ноль в знаменателе ,
// если есть - возвращаем ноль, если нет - результат производим деление