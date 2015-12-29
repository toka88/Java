package znakovninizovi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class ProstoCitanje {
	
	public static BufferedReader ulaz = new BufferedReader(new StringReader("Hajduk Veljko\n22 1.61803"));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Kako se zoves: ");
			String ime = ulaz.readLine();
			System.out.println(ime);
			System.out.println("Koliko imas godina: "
					+ "Koji je tvoj omiljeni broj tipa double: ");
			System.out.println("(ulaz: <starost> <double>)");
			String brojevi = ulaz.readLine();	//Citanje reda sa brojevima
			System.out.println(brojevi);
			String [] numNiz = brojevi.split(" ");	//Pravljenje dva stringa u kome se nalaze po jedan broj
			int starost = Integer.parseInt(numNiz[0]);
			double omiljeni = Double.parseDouble(numNiz[1]);
			System.out.format("Zdravo %s.\n", ime);
			System.out.format("Za 5 godina imaces %d godina.\n", starost+5);
			System.out.format("Moj omiljeni broj tipa double je %f", omiljeni/2);
			
		}catch(IOException e){
			System.err.println("Izuzetak ulazno izlaznog sistema");
		}
		
	}

}
