/* (((((10+2)+2)-2)*2)/2) */

package sep;

public class Assignment_Method_1 {
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}
	
	public int mul(int e,int f)
	{
		int g;
		g=e*f;
		return g;
	}
	
	public void div(int h,int i)
	{
		int j;
		j=h/i;
		System.out.println("The result is "+j);
	}
	
	public static void main(String[] args) {
		
		Assignment_Method_1 am1=new Assignment_Method_1();
		int sumresult=am1.sum(10, 2);
		int sumresult1=am1.sum(sumresult, 2);
		int subresult=am1.sub(sumresult1, 2);
		int mulresult=am1.mul(subresult, 2);
		am1.div(mulresult, 2);
		
		
		
	}
	

}

