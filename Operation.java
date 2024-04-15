public class Operation {
    private DateTime date_operation;

    private String strtype;
    private double montant;
    private Agence agence;


     public Operation()
    { 
        this.date_operation = new DateTime(); ;
        this.strtype =""; 
        this.montant = 0 ;
        this.agence = new Agence(); 
       
    } 

    public Operation(DateTime date_operation,String strtype,double montant,Agence agence )
    { 
        this.date_operation = date_operation ;
        this.strtype =strtype; 
        this.montant = montant ;
        this.agence = agence; 
       
    } 

    public Operation(String strtype,double montant,int jour ,int mois,int annee,int heure ,int minute,int seconde,int code, String nom_banque,String adresse,Date date_lance)
    { 
        this.date_operation = new DateTime(new Date (jour ,mois,annee),heure ,minute,seconde); ;
        this.strtype =""; 
        this.montant = 0 ;
        this.agence = new Agence(code, nom_banque,adresse,date_lance); 
       
    } 



    public Operation(String strtype,double montant,Date date,int heure ,int minute,int seconde,int code, String nom_banque,String adresse,Date date_lance)
    { 
        this.date_operation = new DateTime(new Date(),heure ,minute,seconde); ;
        this.strtype =""; 
        this.montant = 0 ;
        this.agence = new Agence(code, nom_banque,adresse,date_lance); 
       
    } 
        
    public void affiche()
    {   System.out.print("date d'opération : "); 
        ///////////////hna lezemni nzid affiche mte3 date  homa les opération il constructeur mte7om paramétrer ama super fer8a deja ki tne7ih iwali fama erreur lezem inbedelhom kolhom
        this.date_operation.affiche();
        System.out.print("type d'opération : "+strtype+"montant de l'opération : "+montant+"\nl'agence :"); 
        this.agence.affiche();
       
    }

}



