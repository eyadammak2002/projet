public class Operation {
    private DateTime date_operation;
    private String strtype;
    private double montant;
    private Agence agence;

    public Operation(DateTime date_operation,String strtype,double montant,Agence agence )
    { 
        this.date_operation = date_operation ;
        this.strtype =strtype; 
        this.montant = montant ;
        this.agence = agence; 
       
    } 
        
    public void affiche()
    {   
        System.out.print("type d'opération : "+strtype+"montant de l'opération : "+montant+"\nl'agence :"); 
        this.agence.affiche();
        this.date_operation.affiche();
    }

}



