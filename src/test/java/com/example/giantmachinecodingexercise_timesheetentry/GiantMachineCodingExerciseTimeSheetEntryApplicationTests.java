package com.example.giantmachinecodingexercise_timesheetentry;

import com.example.giantmachinecodingexercise_timesheetentry.Controller.TimeSheetController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GiantMachineCodingExerciseTimeSheetEntryApplicationTests {

    @Autowired
    TimeSheetController timeSheetController;

    //Check if a new instance of the class timeSheetController exist.
    @Test
    void contextLoads() {
        assertThat(timeSheetController).isNotNull();

    }

}
