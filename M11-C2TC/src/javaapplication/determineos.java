package javaapplication;

public class determineos {

	public static void main(String[] args) {
		String os=System.getProperty("os.name");
		String version=System.getProperty("os.version");
		System.out.println(os+" "+version);
		

	}

}
