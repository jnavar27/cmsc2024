package JNavarro_Assignment2_Complete;

public class Procedure 
{
    private String procedureName, procedureDate, practitionerName;
	double procedureCharges;
    public Procedure() 
    {
    	
    }
    public Procedure(String procedureName, String procedureDate) 
    {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) 
    {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }
    public String getProcedureName() 
    {
        return procedureName;
    }

    public String getProcedureDate() 
    {
        return procedureDate;
    }

    public String getPractitionerName() 
    {
        return practitionerName;
    }

    public double getProcedureCharges() 
    {
        return procedureCharges;
    }

 
    public void setProcedureName(String procedureName) 
    {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) 
    {
        this.procedureDate = procedureDate;
    }
}

