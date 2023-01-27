CREATE TABLE TIMESHEET
(
    ID            INT PRIMARY KEY auto_increment NOT NULL,
    DATE          DATE,
    CLIENT        VARCHAR(255),
    PROJECT       VARCHAR(255),
    CODE          VARCHAR(5),
    HOURS         INT4,
    BILLABLE      INT4,
    FIRST_NAME    VARCHAR(255),
    LAST_NAME     VARCHAR(255),
    BILLABLE_RATE INT4
);


-- Date,Client,Project,Project Code,Hours,Billable?,First Name,Last Name,Billable Rate
