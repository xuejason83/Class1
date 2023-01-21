package agenda;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
	public static File agendaFile;
    public static File getFile() {
    	try {
			agendaFile = new File("agenda.txt");
			if (agendaFile.exists()) {
				System.out.println("File Exist!");
	    		return agendaFile;
	    	} else if(agendaFile.createNewFile()){
	    		System.out.println("New file created success");
	    		return agendaFile;
	    	} else {
	    		System.out.println("Create file failed");
	    		return null;
	    	}
            			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return agendaFile;
    	
    }
    
    public void writeToFile(ArrayList<DailyArrange> days) {
    	//Same in this function, also only example, you need to organize it. and use get and set
    	String content = "";
    	for(DailyArrange itr:days) {
    		content += itr.day + ":";
    		for (Subject sub:itr.subjects) {
    			content +=sub.name + "," + sub.startTime + "," + sub.duration + ";";
    		}
    	}
    	try {
			FileWriter myWriter = new FileWriter("agenda.txt");
			myWriter.write(content);
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
