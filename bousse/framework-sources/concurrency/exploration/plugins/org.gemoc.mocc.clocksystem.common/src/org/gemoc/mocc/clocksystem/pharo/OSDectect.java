package org.gemoc.mocc.clocksystem.pharo;

public class OSDectect {
		
	private static String OS = System.getProperty("os.name").toLowerCase();
		
		public String curos;
		
		public OSDectect()
		{
			if (isWindows()) {
				curos = "Windows";
			} else if (isMac()) {
				curos = "mac";
			} else if (isUnix()) {
				curos = "linux";
			}
			else {
				System.out.println("OS not supported !");
			}
		}
	 	
		public boolean isWindows() {
	 
			return (OS.indexOf("win") >= 0);
	 
		}
	 
		public boolean isMac() {
	 
			return (OS.indexOf("mac") >= 0);
	 
		}
	 
		public boolean isUnix() {
	 
			return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
	 
		}
	 
		public boolean isSolaris() {
	 
			return (OS.indexOf("sunos") >= 0);
	 
		}
}