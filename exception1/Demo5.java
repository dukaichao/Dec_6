package exception1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5 {
	

	public static void main(String[] args) {
		//找到目标文件
		File file = new File("f:\\a.txt");
		FileReader filereader = null;
		//建立程序与文件的数据通道
		try{
			filereader = new FileReader(file);
		//读取文件
		char [] buf = new char[1024];
		int length = 0;
		length = filereader.read(buf);
		System.out.println(new String(buf,0,length));
		}catch(IOException e) {
			System.out.println("读取文件资源失败");
		}finally {
			try{
				//关闭资源
			filereader.close();
			System.out.println("释放资源成功");
			}catch(IOException e) {
				System.out.println("释放资源失败");
			}
		}
	}
}
