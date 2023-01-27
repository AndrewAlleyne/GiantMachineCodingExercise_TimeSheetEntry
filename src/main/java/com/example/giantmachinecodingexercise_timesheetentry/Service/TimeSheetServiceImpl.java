package com.example.giantmachinecodingexercise_timesheetentry.Service;

import com.example.giantmachinecodingexercise_timesheetentry.Model.TimeSheet;
import com.example.giantmachinecodingexercise_timesheetentry.Repository.TimeSheetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimeSheetServiceImpl implements TimeSheetService {

    private final TimeSheetRepository timeSheetRepository;
    List<TimeSheet> allTimes = new ArrayList<>();

    public TimeSheetServiceImpl(TimeSheetRepository timeSheetRepository) {
        this.timeSheetRepository = timeSheetRepository;
    }

    //read all entry from the database
    @Override
    public List<TimeSheet> fetchTimeSheet() {
        return (List<TimeSheet>) timeSheetRepository.findAll();
    }

    //save entry to the database
    @Override
    public TimeSheet saveEntry(TimeSheet timeSheetEntry) {
        return timeSheetRepository.save(timeSheetEntry);
    }

    //delete entry from database
    public void removeEntry(TimeSheet timeSheet) {
        timeSheetRepository.deleteById(timeSheet.getId());
    }

    //update entry in database by id
    @Override
    public void updateEntry(TimeSheet timeSheetEntry) {
        
    }

}
