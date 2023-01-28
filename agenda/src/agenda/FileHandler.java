package agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
    
    
    public ArrayList<DailyArrange> readFromFile() {
    	ArrayList<DailyArrange> result = new ArrayList<>();
    	//Monday|1:00,1,English;2:00,1,Math;
        Scanner myReader;
		try {
			myReader = new Scanner(agendaFile);
			while (myReader.hasNextLine()) {
		          String data = myReader.nextLine();
		          String[] dayArrange = data.split("|");
				  DailyArrange obj = new DailyArrange(dayArrange[0]);
		          String[]  subjects = dayArrange[1].split(";");
		          for (String sub : subjects) {
		        	  String[] subDetails = sub.split(",");
		        	  obj.addSubject(subDetails[2], subDetails[0], Integer.parseInt(subDetails[1]));
		          }
		          result.add(obj);
		          System.out.println(data);
		        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    	
    	
    	return result;
    	
    }
}
