package demo;

public class array1 {

	public static void main(String[] args) {
		
		int ar[] = new int[5];
		int temp;
		
		ar[0]=34;
		ar[1]=90;
		ar[2]=42;
		ar[3]=20;
		ar[4]=10;
		int size=ar.length;
		System.out.println(size);
		
		for(int i=0;i<=size-1;i++)
		{
			for(int j=i+1;j<=size-1;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
		}
		int a = ar[size-3];
		System.out.println(a);
		
		
	
	}
}
