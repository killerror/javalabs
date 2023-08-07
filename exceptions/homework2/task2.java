/**Если необходимо, исправьте данный код
 * Задание 2
 * try {
 *    int d = 0;
 *    double catchedRes1 = intArray[8] / d;
 *    System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *    System.out.println("Catching exception: " + e);
 * }
 *
 *
 * Решение:
 * 1)Необходимо определить массив intArray
 * 2)Необходимо обработать ошибку, если нет элемента массива с индексом 8
 * либо добавляем еще один блок catch
 * catch(ArrayIndexOutOfBoundsException e){
 *    System.out.println("Catching exception: " + e);
 * }
 * передаем в имеющийся блок catch родителя наших ошибок Exception
 * */
public class task2 {
    public static void main(String[] args) {
        int[] intArray=new int[]{0,1,2,3,4,5,6,7,8};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
