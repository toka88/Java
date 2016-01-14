package Chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Socket s = new Socket("192.168.1.4", 1234);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msgin="", msgout="";
		while(!msgin.equals("end")){
			msgout = br.readLine();
			dout.writeUTF(msgout);
			msgin = din.readUTF();
			System.out.println(msgin);
		}
		
		}catch(IOException e){
			
			
		}
	}

}
