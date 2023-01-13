package agenda;

import java.io.File;

public class FileHandler {
	public static File agendaFile;
    public static File getFile() {
    	try {
			agendaFile = new File("agenda.txt");
			if (agendaFile.exists()) {
	    		return agendaFile;
	    	} else if(agendaFile.createNewFile()){
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
}
