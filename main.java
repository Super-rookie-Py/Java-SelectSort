import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] num = new int[5];
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		for(int i=0; i<5; i++) 
		{
			num[i]= sc.nextInt();
		}
		for(int j=0;j<4;j++)
		{
			for(int k=j+1;k<5;k++)
			{
				if(num[j]<num[k])
				{
					temp=num[j];
					num[j]=num[k];
					num[k]=temp;
				}
			}
		}
		output(num);
	}

	private static void output(int[] num) {
		for(int i=0;i<5;i++)
		{
			System.out.println(num[i]);
		}
	}

}
