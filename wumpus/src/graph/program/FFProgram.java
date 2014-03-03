package graph.program;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FFProgram extends Program {

//	private final static String FF_PROGRAM ="/home/mezz/Documents/eda132/eda132_3/files/Planning/FF-X/ff";
	private final static String FF_PROGRAM ="/h/d8/e/ada10lgu/Documents/eda132/FF-X/ff";
	
	public FFProgram(File inputFile, String domain) throws IOException {
		super(FF_PROGRAM,"-o", domain, "-f",inputFile.getAbsolutePath());
	}
	
	
	public double getTime() {
		Pattern p = Pattern.compile("(\\d+\\.\\d{2}) seconds total time");
		Matcher m = p.matcher(toString());
		
		if (m.find()) {
			String s = (m.group(1));
			return Double.parseDouble(s);
		}
		
		return -1;
	}
}
