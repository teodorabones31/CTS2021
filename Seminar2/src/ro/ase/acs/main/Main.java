package ro.ase.acs.main;

import java.io.IOException;
import java.util.Scanner;

import ro.ase.acs.readers.Reader;
import ro.ase.acs.writers.ConsoleWriter;
import ro.ase.acs.writers.Writer;

public class Main {
	
	public static void main(String[] args) {
		ioc Ioc=new ioc();
		
		Ioc.register(Readable.class, Reader.class);
		
		ConsoleWriter.print(Reader.read());
		
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
