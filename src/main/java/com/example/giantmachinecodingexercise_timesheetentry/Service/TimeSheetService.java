package com.example.giantmachinecodingexercise_timesheetentry.Service;

import com.example.giantmachinecodingexercise_timesheetentry.Model.TimeSheet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TimeSheetService {
    //read entries
    List<TimeSheet> fetchTimeSheet();

    //save entry
    TimeSheet saveEntry(TimeSheet timeSheetEntry);

    //remove entry
    void removeEntry(TimeSheet timeSheetEntry);

    //update entry
    void updateEntry(TimeSheet timeSheetEntry);

}
