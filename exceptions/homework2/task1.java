import java.util.Scanner;

/**Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 *  и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 *  вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * */
public class task1 {
    public static void main(String[] args) {
        enterNumber();
    }
    private static void enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите десятичное число: ");
        Float number;
        try{
            number = scanner.nextFloat();
            System.out.println("Вы ввели верное число: "+number);
        } catch (Exception e){
            System.err.println("Введено не число");
            enterNumber();
        }
    }
}
