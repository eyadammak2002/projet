public class Operation {
    private Date date_operation;
    private String type;
    private double montant;
    private Agence agence;

    public Operation(Date date_operation,String type,double montant,Agence agence )
    { 
        this.date_operation = date_operation ;
        this.type =type; 
        this.montant = montant ;
        this.agence = agence; 
       
    } 
        
        
    public void remplir(Operation tabOperation[i]){
        for(int i=0;i<tabOperation.length;i++)
    {
        this.tabOperation[i]=new Operation(date_operation, type, montant, agence);
        
    }
    }

}



