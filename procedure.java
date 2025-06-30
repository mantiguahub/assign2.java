//Name: Michael Antigua
//Cmsc 203
//Description:This is the procedure part

public class Procedure {
    
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharge;

   
    public Procedure() {}

    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharge = procedureCharge;
    }

    
    public String getProcedureName() { return procedureName; }
    public String getProcedureDate() { return procedureDate; }
    public String getPractitionerName() { return practitionerName; }
    public double getProcedureCharge() { return procedureCharge; }

  
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    public void setProcedureDate(String procedureDate) { this.procedureDate = procedureDate; }
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }
    public void setProcedureCharge(double procedureCharge) { this.procedureCharge = procedureCharge; }

    public String toString() {
        return procedureName + "\t" + procedureDate + "\t" + practitionerName + "\t" + String.format("%.2f", procedureCharge);
    }
}
