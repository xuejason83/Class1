package agenda;

import java.util.Date;

public class Subject {
    public String name; //subjectName like math, tennis, basketball
    public Date startTime;
    //Define anything more you can think. 
    public Subject(String name,Date startTime) {
    	this.name = name;
    	this.startTime = startTime;
    }
}
