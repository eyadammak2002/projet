

public class Compte {
    private Personne titulaire ;
    private int num_compte;
    protected Double solde;
    protected Date date_creation;
    protected Agence agence;
    protected boolean autorisation;
    private double frais_compte=15;

    Operation[] operations=new Operation[100];
    int nbOperation=0;



    public Compte()
    {   
       
       titulaire=new Personne();
        num_compte = 0; 
        date_creation=new Date();
        solde = 0.0 ;
        agence=new Agence();
        
       
    }

    public Compte(int num_compte,Personne titulaire,Date date_creation,Agence agence)
    { 
        this.num_compte = num_compte ;
        this.solde =0.0; 
        this.date_creation = date_creation ;
        this.titulaire = titulaire; 
        this.agence = agence; 
  
    }


    public int getnum_compte() {
        return num_compte;}
    public Personne gettitulaire() {
        return titulaire;}
    public boolean getautorisation( )
        {return autorisation;}
    public Double solde() {
        return solde;}
    public Date date_creation() {
        return date_creation;}
    public Agence agence()
        {return agence;}
  
  
 
    public void setsolde(double solde)
    {this.solde = solde;}
    public void setdate_creation(Date date_creation) {
        this.date_creation = date_creation; }
    public void setagence(Agence agence) {
        this.agence = agence; }
    public void setnum_compte(int num_compte)
    {this.num_compte = num_compte;}
 
    public void setautorisation(boolean autorisation) {
        this.autorisation = autorisation; }
    public void settitulaire(Personne titulaire) {
        this.titulaire = titulaire; }
    
   
    public void affiche()
    {   System.out.println( "" ); 
    this.agence.affiche(); 
     System.out.println( "" ); 
        this.titulaire.affiche(); 
    System.out.print( "\ndate de créaction du compte:" ); 
        this.date_creation.affiche(); 
    System.out.println( "\nnumero du compte:"+num_compte+" , solde:"+solde +" \nautorisation : "+autorisation); 
   
    }

    void retrait(double montant,Date date,int h,int m,int s){   
        solde=solde-montant;
        this.operations[this.nbOperation]=new Operation(new DateTime(date, h, m,s), "crédit", montant, agence);
        this.nbOperation++;
       

    }
    
    void versement(double montant,Date date,int h,int m,int s){   
        solde=solde+montant;
        this.operations[this.nbOperation]=new Operation(new DateTime(date, h, m,s), "débit", montant, agence);   
        this.nbOperation++; }
    

    

    public void fraisTrimestre(Date date,int h,int m,int s){
        if ((date.getmois()==3)||(date.getmois()==6)||(date.getmois()==9)||(date.getmois()==12))        
        {
            solde=solde-frais_compte;
        this.operations[this.nbOperation]=new Operation(new DateTime(date, h, m,s),"crédit", frais_compte, agence);
        this.nbOperation++;
        }
    }

    
    
    public void extraitBancaire() {
        System.out.println("Extrait bancaire pour le compte " + num_compte);
        for(int i=0;i<operations.length;i++)
         this.operations[i].affiche();
        
    }
    
   
    /*
    public static void main(String[] args)     
    {    Date date_creation= new Date (1,1,2023);
         Date date_naissance= new Date (2,7,2002);
         Date date_lance=new Date(1,1,2022);
         Date date_auj=new Date();
         Personne titulaire= new Personne("eya","dammak",11167567,date_naissance);
         Agence agence= new Agence (1,"biat","route matar",date_lance);
         Compte c1= new Compte(1,titulaire,date_creation,agence,"courant");
         c1.versement(1200);
         c1.fraisTrimestre(date_auj);
         c1.affiche();
    }
*/
}
