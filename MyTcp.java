import java.io.*;
import java.net.*;
public class MyTcp{
	private BufferedReader reader;
	private ServerSocket server;
	private Socket socket;
	void getserver(){
		try{
			server = new ServerSocket(8998);
			System.out.println("�������׽����Ѵ����ɹ�");
			while(true){
				System.out.println("�ȴ��ͻ�������");
				socket = server.accept();
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				getClientMessage();
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	private void getClientMessage(){
			try{
				while(true){
					//��ÿͻ���Ϣ
					System.out.println("�ͻ���:"+reader.readLine());
				}
			} catch (Exception e){
				e.printStackTrace();
			}
			try{
				if(reader !=null){
					reader.close();
				}
				if(socket !=null){
					socket.close();
				}
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		public static void main(String[] args){
			MyTcp tcp = new MyTcp();
			tcp.getserver();
		}
	}
	