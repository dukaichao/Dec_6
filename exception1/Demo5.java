package exception1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5 {
	

	public static void main(String[] args) {
		//�ҵ�Ŀ���ļ�
		File file = new File("f:\\a.txt");
		FileReader filereader = null;
		//�����������ļ�������ͨ��
		try{
			filereader = new FileReader(file);
		//��ȡ�ļ�
		char [] buf = new char[1024];
		int length = 0;
		length = filereader.read(buf);
		System.out.println(new String(buf,0,length));
		}catch(IOException e) {
			System.out.println("��ȡ�ļ���Դʧ��");
		}finally {
			try{
				//�ر���Դ
			filereader.close();
			System.out.println("�ͷ���Դ�ɹ�");
			}catch(IOException e) {
				System.out.println("�ͷ���Դʧ��");
			}
		}
	}
}
