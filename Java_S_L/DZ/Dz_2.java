package Java_S_L.DZ;
// Вывести все простые числа от 1 до 1000
public class Dz_2 {
    public static void main(String[] args) {
        System.out.println("Необходимо выести все простые числа от 1 до 1000");
		int quan = 1000;
		int count = 0;
		for (int i = 1; i < quan; i++) 
			{
		    	for (int j = 1; j <= i; j++) 
					{
		        		if (i % j == 0) count+= 1;
		    		}
		    	if (count <= 2) 
					{
						System.out.printf (i+", ");
					}
		    	count = 0;
			}
    }
}
