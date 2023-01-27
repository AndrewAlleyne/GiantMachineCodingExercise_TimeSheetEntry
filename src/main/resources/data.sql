/*CREATE TABLE TIMESHEET
(
    ID            INT PRIMARY KEY auto_increment NOT NULL,
    DATE          VARCHAR(255),
    CLIENT        VARCHAR(255),
    PROJECT       VARCHAR(255),
    CODE          VARCHAR(20),
    HOURS         FLOAT,
    BILLABLE      VARCHAR(255),
    FIRST_NAME    VARCHAR(255),
    LAST_NAME     VARCHAR(255),
    BILLABLE_RATE INT4
);*/


INSERT INTO timesheet (DATE, CLIENT, PROJECT, CODE, HOURS, BILLABLE, FIRST_NAME, LAST_NAME, BILLABLE_RATE)
SELECT *
FROM CSVREAD('src/main/resources/file.csv', null)
offset 1 row;



-- Date,Client,Project,Project Code,Hours,Billable?,First Name,Last Name,Billable Rate
-- offset might be slower than other methods.
-- Alternative might be WHERE clause but we can't order by anything since ID is not apart of the table.
