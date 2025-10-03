/* (((((10*3)+2)*4)-4)/2) */

package sep;

public class Assignment_Method_2 {
	
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	}
	
	public int sum(int x,int y)
	{
		int z;
		z=x+y;
		return z;
	}
	
	public int sub(int d,int e)
	{
		int f;
		f=d-e;
		return f;
	}
	
	public void div(int g,int h)
	{
		int i;
		i=g/h;
		System.out.println("The result is "+i);
	}
	
	public static void main(String[] args) {
		
		Assignment_Method_2 am2=new Assignment_Method_2();
		int mulresult=am2.mul(10, 3);
		int sumresult=am2.sum(mulresult, 2);
		int mulresult1=am2.mul(sumresult, 4);
		int subresult=am2.sub(mulresult1, 4);
		am2.div(subresult, 4);		
	}

}
