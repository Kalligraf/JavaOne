package ru.ivanovkm.java.javaone.lesson2;
import java.util.Arrays;
public class HomeTaskTwo {

    public static void main(String[] args) {
 /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
        int[] byteArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            // Вывод в консоль исходных значений элементов массива
            System.out.println("1.\nИсходный массив =     "+Arrays.toString(byteArr));// Вызов исходных значений элементов массива

            // одной из тем урока было использование оператора switch,поэтому использовал его
            for (int i = 0; i <byteArr.length ; i++) {
                    switch (byteArr[i]) {
                        case 1:
                            byteArr[i]=0;
                            break;
                        case 0:
                            byteArr[i]=1;
                            break;
                    }
             }
            // Вывод в консоль значений элементов массива после замены
            System.out.println("Массив после замены = "+Arrays.toString(byteArr));

/*2. Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

        int[] emptyArr = new int[8];
            for (int i = 1; i < emptyArr.length; i++) {//начинаем цикл с индекса 1
                emptyArr[i] = emptyArr[i - 1] + 3;// Берем значение предыдущего индекса и прибавляем 3
            }

            System.out.println("\n2."+Arrays.toString(emptyArr)); //Вывод значений элементов массива

/*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2;
 */
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<6) {
                arr[i] *= 2;
            }
        }
        System.out.println("\n3."+Arrays.toString(arr)); //Вывод значений элементов массива

/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 */
        int[][] squareArray = new int[5][5];
        System.out.print("\n4.\n");
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0, x = squareArray.length - 1; j < squareArray.length; j++, x--) {
                if (i == j | i == x) squareArray[i][j] = 1;
                else squareArray[i][j] = 0;
                /*  ijx        ijx     ijx     ijx     ijx      i==j или x
                   (004)       013     022     031    (040)
                    104       (113)    122    (131)    140
                    204        213    (222)    231     240
                    304       (313)    322    (331)    340
                   (404)       413     322     431    (440)
                 */
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.print("\n");
        }

/*5. Задать одномерный массив и найти в нем минимальный и максимальный элементы*/

        int [] minAndMaxArr = {1, 5, -3*57, 2, -11, 4, 5, 2, -4, 8, 9, 1};// Произвольный массив
        int max = minAndMaxArr[0];//Присваиваем переменной значение нулевого индеска массива
        int min = minAndMaxArr[0];//Присваиваем переменной значение нулевого индеска массива
        for(int i = 0; i<minAndMaxArr.length; i ++){
            if(minAndMaxArr[i] > max){
                max = minAndMaxArr[i];/* С помощью цикла поочередно присваиваем переменной все значения которые больше
                                         предыдущих значений таким образом находим максимальное значение*/
            }
            if(minAndMaxArr[i] < min){
                min = minAndMaxArr[i];/* С помощью цикла поочередно присваиваем переменной все значения которые меньше
                                         предыдущих значений таким образом находим минимальное значение*/
            }
        }
        System.out.println("\n5. "+"Min = "+min + "\n   Max = " + max);

/*6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница
показана символами ||, эти символы в массив не входят.*/
        int[] originalArr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Возвращаемое значение - "+equalSidesSumm(originalArr));


/*7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами
*/

        int[] array = { 1, 2, 3, 4, 5};
        int[] res = arrayMove(array, -2);//вызов метода
        System.out.println(Arrays.toString(res));//вывод результата
    }
    public static boolean equalSidesSumm(int[] array){
        System.out.println("\n6.\nИсходный массив = "+Arrays.toString(array));

        int leftSide = 0;
        int rightSide = 0;

        for (int i:array) {//Получаем сумму всех элементов массива и присваеваем правой части массива
            rightSide += i;
        }
        for (int i = 0; i < array.length; i++) {
            if (leftSide == rightSide) {//Запускаем счетчик который при каждой итерации будет проверять равенство сторон
                return true;
            }
            leftSide += array[i];//В случае если стороны в данную итерацию не равны прибавляем значение текущего индекса массива к текущему значению переменной левой части массива
            rightSide -= array[i];//и вычитаем тоже значение из левой части
        }
        return false;//При несоблюдении условия равенста сторон после всех итераций выводим false
    }


/*    static int[] moves(int[] incoming, int delta){
        int currentIndex, movedIndex, buffer;
        for (int i = 0; i < greatestCommonDivisor(delta, incoming.length); i++) {
            buffer = incoming[i];

            currentIndex = i;

            if(delta > 0){
                while (true) {
                    movedIndex = currentIndex + delta;
                    if (movedIndex >= incoming.length)
                        movedIndex = movedIndex - incoming.length;
                    if (movedIndex == i)
                        break;
                    incoming[currentIndex] = incoming[movedIndex];
                    currentIndex = movedIndex;
                }
            }
            else if(delta < 0){
                while (true) {
                    movedIndex = currentIndex + delta;
                    if (movedIndex < 0)
                        movedIndex = incoming.length + movedIndex;
                    if (movedIndex == i)
                        break;

                    incoming[currentIndex] = incoming[movedIndex];
                    currentIndex = movedIndex;
                }
            }

            incoming[currentIndex] = buffer;
        }

        return incoming;
    }

    /**
     * Simple printout
     * @param incomingArray user array

    public static void printOut(int[] incomingArray){
        for(int item: incomingArray){
            System.out.print(item + " ");
        }

        System.out.println();
    }

    /**
     * Finding the GCD in recoursive function
     * @param a - first element
     * @param b - second element
     * @return int GCD

    static int greatestCommonDivisor(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return greatestCommonDivisor(b, a % b);
    }
*/

    public static    int[] arrayMove(int[] array, int offset) {
        int length = array.length;
        int offst = offset % length;
        System.out.println("offset is " + offst);
        int index = offst;
        if (index<0){
            index = length + offset;
        }
        //int index = offst >= 0? offst: length + offst;
        System.out.println("index is " + index);
        int value = array[0];
        for (int i = 0; i < length; i++) {
            System.out.println("i = " + i);
            System.out.println("index is " + index);
            value = swap(array, value, index);
            int newIndex = (index + offst) % length;
            index=newIndex;
            if (index<0){
                index = length + newIndex;
            }
            //index = newIndex >=0? newIndex: length + newIndex;
        }
        return array;
    }
    public static int swap(int[] array, int newValue, int index) {
        int old = array[index];
        array[index] = newValue;
        return old;
    }
}

