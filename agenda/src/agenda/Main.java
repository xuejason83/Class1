package agenda;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		FileHandler.getFile();
		FileHandler fH = new FileHandler();
		ArrayList<DailyArrange> days = new ArrayList<>(fH.readFromFile());
		//add item  I only show how to handle the ArrayList, the logic need you to modify and control
		//variables I am using public directly read it, you will need to use get and set to control it.
		{
		    String dayString = "Monday";
		    for (DailyArrange it : days) {
			   if (it.day == "Monday") {
				   //if find
				  it.addSubject("Math", "1:00 pm", 20);
			   }
		    }
		    //This part need you to do some logic,to let it run when the above not found it from list
		    DailyArrange dayTest = new DailyArrange("Monday");
		    dayTest.addSubject("Math", "12:00 pm", 12);
		    days.add(dayTest);
		}
		// TODO Auto-generated method stub
        
        
        fH.writeToFile(days);
        try {
			if (days.size() == 0)
			days.add(new DailyArrange("Monday","Math"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
