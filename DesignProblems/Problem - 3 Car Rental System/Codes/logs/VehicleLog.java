package logs;

import java.sql.Date;

import constants.VehicleLogType;

public class VehicleLog {
    private int logId;
    private VehicleLogType type;
    private String description;
    private Date creationDate;
}