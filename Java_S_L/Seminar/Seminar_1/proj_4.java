package Java_S_L.Seminar.Seminar_1;

import java.util.Random;

class proj_4 {

    public static void main(String[] args) {
        int[] array = new int[15];
        for(int i = 0; i < array.length; i++)
            {
                array[i] = new Random().nextInt(0, 2);
                System.out.printf("%d ", array[i]);
            }
        System.out.println();
        

        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < array.length; i++)
            {
                if(array[i] == 1)
                    {
                        count++;
                    }
                else
                    {       
                        if (maxCount < count) 
                            {
                                maxCount = count;
                                count = 0;
                            }       
                        if (count != 0 )
                            {
                                count = 0;
                            }        
                    }
            }
        
        System.out.printf("%d\n", maxCount);
        
    }
}