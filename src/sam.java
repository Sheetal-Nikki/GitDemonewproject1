
public class sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] arr =new int[5];
		arr[0]  = 1;
		arr[2] = 2;		
		arr[1] = 4;	
		arr[3] = 5;
		arr[4] = 6;
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		//for loop arr.length - 5
		for(int i=0;i< arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for (int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		String[] name = {"rahul", "shetty", "selenium"};
		
		for(int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		for(String s:name)
		{
			System.out.println(s);
		}
		
	}

}
