package ro.ase.acs.readers;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

import ro.ase.acs.contracts.Readeble;

public abstract class Reader implements Closeable, Readeble{
	
	private Scanner scanner = new Scanner(System.in);
	
	public String read() {
		System.out.println("Message: ");
		String message = scanner.nextLine();
		return message;
	}

	@Override
	public void close() throws IOException {
		scanner.close();
		
	}


}
