package Java_S_L.DZ.DZ_1;
// Вывести все простые числа от 1 до 1000
public class Dz_2 {
    public static void main(String[] args) {
		System.out.println();
		int number = 1000;
		int count = 0;
		for (int i = 1; i < number; i++) 
			{
		    	for (int j = 1; j <= i; j++) 
					{
		        		if (i % j == 0) 
							{
								count+= 1;
							}
		    		}
		    	if (count == 2) 
					{
						System.out.printf("%d ", i);
					}
		    	count = 0;
			}
		System.out.println();
    }
}
