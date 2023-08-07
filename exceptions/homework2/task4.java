import java.util.Scanner;

/**Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 *  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 * */
public class task4 {
    public static void main(String[] args) {

        enterString();
    }
    private static void enterString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую строку: ");
        String inputString = scanner.nextLine();
        if (inputString=="") {
            throw new RuntimeException("Вы ввели пустую строку");
        } else {
            System.out.println("Все ок, мы приняли ваши данные");
        }
    }
}
