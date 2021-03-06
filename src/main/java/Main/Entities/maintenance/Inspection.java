package Main.Entities.maintenance;


import Main.Entities.Facility.Facility;

import java.util.Date;

public class Inspection {

	private String id;

	private Facility facility;

	private int inspectingStaffID;

	private Date inspectionDate;

    public String getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = id;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public int getInspectingStaffID() {
        return inspectingStaffID;
    }

    public void setInspectingStaffID(int inspectingStaffID) {
        this.inspectingStaffID = inspectingStaffID;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }
}
