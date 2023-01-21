package agenda;

import java.util.Date;

public class Subject {
    public String name; //subjectName like math, tennis, basketball
    public String startTime;//8:10:22 am    Date to string string to Date
    public int duration;
    //Define anything more you can think. 
    public void setName(String name123) {
    	if(name123.contains("1")) {
    		System.out.println();
    		return;
    	}
    	name = name123;
    }
    public Subject() {}
    public Subject(String name,String startTime,int duration) {
    	this.name = name;
    	this.startTime = startTime;
    	this.duration = duration;
    }
}
