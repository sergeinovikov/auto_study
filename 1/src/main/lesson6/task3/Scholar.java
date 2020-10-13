package main.lesson6.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scholar {
    private Map<DayOfWeek, List> diary;

    public Map<DayOfWeek, List> getDiary() {
        return diary;
    }

    public void setDiary(DayOfWeek day, List lessons) {
        if (this.diary==null) {
            this.diary = new HashMap<>();
        }
        this.diary.put(day, lessons);
    }
}
