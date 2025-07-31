package logs;

import constants.VehicleLogType;
import java.sql.Date;

public class VehicleLog {
    private int logId;
    private VehicleLogType type;
    private String description;
    private Date creationDate;

    public int getLogId() {
        return this.logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public VehicleLogType getType() {
        return this.type;
    }

    public void setType(VehicleLogType type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}