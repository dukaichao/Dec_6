package exception1;
/*
 	�쳣��ϵ��
 		------|Throwable  �����쳣���ߴ�����ĳ���
 		---------|Error   ����
 		---------|Exception   �쳣
 	jvm���е�a/b������ʱ������bΪ0������Ϊ0�����ǵ���ʵ�����������ڲ�����
 	����ģ�jvmһ���������ֲ�����������Ǻ���ôjvm�ͻ����ϴ���һ����Ӧ���쳣
 	���󣻲��һ��������쳣�����printStackTrance�ķ��������쳣
 		
 	�쳣�Ĵ���
 		��ʽһ��������
 				�������ʽ��
 					try{
 						���ܷ����쳣�Ĵ���
 					}catch��������쳣���� ��������{
 						�����쳣�Ĵ���....
 					}
 			
 				
 			������Ҫע���ϸ�ڣ�
 				1.���try���д�������쳣�����˴���֮����ôtry����catch�����������ִ��
 				2.���try���г������쳣���룬��ôtry���г����쳣�������Ĵ����ǲ���ִ�е�
 				3.һ��try�������Ը����catch��ģ�Ҳ����һ��try����Բ�������쳣������
 				4.һ��try����Բ�������쳣�����ͣ����ǲ������ͱ����С������в��񣬷�����뱨��
 				
 		��ʽ�����׳�����
 */
public class Demo2 {
	public static void main(String [] args) {
		div(4,0);
	}
	public static void div(int a,int b) {
		int c = 0;
		try {
			c = a/b;
			System.out.println("����������ִ����");
		}catch(ArithmeticException e) {
			//�����쳣�Ĵ���
			System.out.println("�쳣������....");
			System.out.println("toString :"+e.toString());
		}catch(Exception e) {
			System.out.println("hahah");
		}
		
		
		System.out.println(+c);
	}
}