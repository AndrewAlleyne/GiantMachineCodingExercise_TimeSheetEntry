package com.example.giantmachinecodingexercise_timesheetentry.Controller;

import com.example.giantmachinecodingexercise_timesheetentry.Model.TimeSheet;
import com.example.giantmachinecodingexercise_timesheetentry.Repository.TimeSheetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

//max age set default 1L
@CrossOrigin(value = "http://localhost:3000")

@RestController
@RequestMapping("/api/")
public class TimeSheetController {

    private final TimeSheetRepository timeSheetRepository;

    public TimeSheetController(
            TimeSheetRepository timeSheetRepository) {
        this.timeSheetRepository = timeSheetRepository;
    }

    @RequestMapping(value = "/timeSheetEntry")
    public ResponseEntity<List<TimeSheet>> allEntries() {
        List<TimeSheet> timeSheets = (List<TimeSheet>) timeSheetRepository.findAll();
        return new ResponseEntity<>(timeSheets, HttpStatus.OK);
    }

    @RequestMapping(value = "/newEntry", method = RequestMethod.POST)
    public ResponseEntity<TimeSheet> newEntry(@RequestBody TimeSheet requestBody) {
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

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .build().toUri();
        //Save the entity in the H2 database
        timeSheetRepository.save(timeSheet);
        return ResponseEntity.created(location).body(timeSheet);
    }

    //    @RequestMapping(value = "/removeEntry/{id}", method = RequestMethod.DELETE)
    //    public void removeEntry(@PathVariable("id") Long id) {
    //        timeSheetRepository.deleteById(id);
    //    }
}
