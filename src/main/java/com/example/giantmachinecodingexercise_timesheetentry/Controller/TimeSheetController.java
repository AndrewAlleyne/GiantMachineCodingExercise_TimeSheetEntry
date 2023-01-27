package com.example.giantmachinecodingexercise_timesheetentry.Controller;

import com.example.giantmachinecodingexercise_timesheetentry.Model.TimeSheet;
import com.example.giantmachinecodingexercise_timesheetentry.Repository.TimeSheetRepository;
import com.example.giantmachinecodingexercise_timesheetentry.Service.TimeSheetService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//max age set default 1L
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class TimeSheetController {

    final TimeSheetService timeSheetService;
    private final TimeSheetRepository timeSheetRepository;

    public TimeSheetController(TimeSheetService timeSheetService,
                               TimeSheetRepository timeSheetRepository) {
        this.timeSheetService = timeSheetService;
        this.timeSheetRepository = timeSheetRepository;
    }


    @RequestMapping(value = "/timeSheetEntry")
    public ResponseEntity<TimeSheet> test() {
        List<TimeSheet> timeSheets = timeSheetService.fetchTimeSheet();
        return new ResponseEntity(timeSheets, HttpStatusCode.valueOf(200));
    }

    @RequestMapping(value = "/newEntry", method = RequestMethod.POST)
    public TimeSheet newEntry(@RequestBody TimeSheet requestBody) {
        TimeSheet timeSheet = new TimeSheet();
        timeSheet.setBillable(requestBody.getBillable());
        timeSheet.setBillableRate(requestBody.getBillableRate());
        timeSheet.setClient(requestBody.getClient());
        timeSheet.setCode(requestBody.getCode());
        timeSheet.setDate(requestBody.getDate());
        timeSheet.setHours(requestBody.getHours());
        timeSheet.setProject(requestBody.getProject());
        timeSheet.setFirstName(requestBody.getFirstName());
        timeSheet.setLastName(requestBody.getLastName());

        //Save the entity in the H2 database
        timeSheetRepository.save(timeSheet);
        return timeSheet;
    }

    @RequestMapping(value = "/removeEntry/{id}", method = RequestMethod.DELETE)
    public void removeEntry(@PathVariable("id") Long id) {
        timeSheetRepository.deleteById(id);
    }
}
