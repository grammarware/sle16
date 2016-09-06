package org.gemoc.mocc.clocksystem.pharo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public	class LogStreamReader implements Runnable {

		private BufferedReader reader;

		public LogStreamReader(InputStream is) {
		    this.reader = new BufferedReader(new InputStreamReader(is));
		}

		public void run() {
		    try {
		        String line = reader.readLine();
		        while (line != null) {
		            System.out.println(line);
		            line = reader.readLine();
		        }
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
}
