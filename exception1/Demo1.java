package exception1;

import java.util.InputMismatchException;

/*
 	�쳣��
 		���ǵ�Java����Ҳ�ǻ���ڲ�����������ģ���Щ�����������
 		���Ǿ�ͳ��Ϊ�쳣
 	�쳣��ϵ��
 		------|Throwable
 		---------|Error
 		---------|Exception
 		
 	Throwable���÷�����
 		toString����   //��ʾ�쳣�����Ͳ����쳣ԭ��
 		getMessage����   //��ʾ�쳣ԭ�򣬲���ʾ����
 		printStackTrace����//���������쳣�¼�����ʱ��ջ������
 */
public class Demo1 {
	public static void main(String [] args) {
		/*Throwable throwable = new Throwable("laji");
		String t = throwable.toString();
		String t1 = throwable.getMessage();
		//String t2 = throwable.printStackTrace();
		System.out.println(t);   //java.lang.Throwable   ����+���� =  ��������
		System.out.println(t1); 
		//System.out.println(t2); */
		tes(-1);
	}
	public static void tes(int a){
		/*Throwable throwable = new Throwable("laji");
		throwable.printStackTrace();*/
		try{
			if(a<1||a>4) {
				System.out.println("n");
			}
		}catch(InputMismatchException e) {
			System.out.println("In");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
