package old.programming.flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleFlow {

	public static void main(String[] args) {
		

		try {
			System.out.println("Enter your name ");
			BufferedReader bufferRead = new BufferedReader(
					new InputStreamReader(System.in));
			String name = bufferRead.readLine();
			System.out.println("Enter your password ");
			String password = bufferRead.readLine();
			
			if(name.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("password")){
				System.out.println("Authentication Successful");
			}
			else{
				System.out.println("Authentication Failed");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
