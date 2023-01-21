package agenda;

import java.util.ArrayList;

public class DailyArrange {
    public String day;  //Monday, Tuesday...
    ArrayList<Subject> subjects = new ArrayList<>();
    //define as more as you can think.......
    public DailyArrange(String day, String subjectsString) {
    	this.day = day;
    }
    public DailyArrange(String day) {
    	this.day = day;
    }
    public void addSubject(String name, String startTime, int duration)
    {
        subjects.add(new Subject(name,startTime,duration));
    }
}
