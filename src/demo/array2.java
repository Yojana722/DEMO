package demo;

public class array2 {

	public static void main(String[] args) {
		int ar[]= {100,89,20,10,56,66,32,5};
		System.out.println(ar[2]);  //20
		
		System.out.println("Size of array:"+ar.length); //8
		int size=ar.length;
		
		int temp;
		for(int i=0;i<=size-1;i++)  //1st value---i
		{
			for(int j=i+1;j<=size-1;j++)  //2nd value---i+1
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		int a = ar[size-3]; //ar[5]
		System.out.println("3rd highest value:"+a);
	}
}
