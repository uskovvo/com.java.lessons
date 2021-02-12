package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoSmallAndOneBigArray {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(str.readLine());
        }
        System.arraycopy(array, 0, array1, 0, 10); //копирование значений из одного массива в другой
        System.arraycopy(array, 10,array2, 0, 10); //где array массив откуда копировать, srcPos начальное
                                                                        //положение array, array1 куда копировать
                                                                        //destPos положение в какую ячейку копировать
        System.out.println(array2[0]);                                  //length сколько ячеек принимать в array1
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
        System.out.println(array2[4]);
        System.out.println(array2[5]);
        System.out.println(array2[6]);
        System.out.println(array2[7]);
        System.out.println(array2[8]);
        System.out.println(array2[9]);
    }
}
