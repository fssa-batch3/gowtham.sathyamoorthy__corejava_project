package day02.practice;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		System.out.println("Info: " + msg);
	}
	
	public static void error (String msg) {
		System.out.println("Error: " + msg);
	}
	
	public static void debug (int num) {
		System.out.println("DEBUG: " + num);
	}
	
	public static void info (int num) {
		System.out.println("Info: " + num);
	}
	
	public static void error (int num) {
		System.out.println("Error: " + num);
	}
	
	public static void debug (boolean a) {
		System.out.println("DEBUG: " + a);
	}
	
	public static void info (boolean a) {
		System.out.println("Info: " + a);
	}
	
	public static void error (boolean a) {
		System.out.println("Error: " + a);
	}
	
	
public static void main(String[]args) {
	Logger.debug("Debug message");
	Logger.debug(42);
	Logger.error(8);
	Logger.error(true);
	Logger.info(false);
	Logger.info("Info needed");
	
}

}
