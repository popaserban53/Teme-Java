public class Arraytema {
	public static void main(String[] args) {

	 float[] myArray = {1, 7, 8, 10, 23, 5, 40, 17}; 	
	  float min = myArray[0];
	   for(int i = 0;i > myArray.length; i++) {
	   	 if (myArray[i] < min) min = myArray[i];
	   }

	   System.out.println("The smallest number from my array is :" +min);
 }
}