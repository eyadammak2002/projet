public class Compte {
    private Personne titulaire ;
    private int num_compte;
    protected Double solde;
    protected Date date_creation;
    protected Agence agence;
    Operation[][]tabOperation;



    public Compte()
    {   
        titulaire=new Personne();
        num_compte = 0; 
        date_creation=new Date();
      
        solde = 0.0 ;
        agence=new Agence();
       
    }

    public Compte(int num_compte,Personne titulaire,Date date_creation,Agence agence )
    { 
        this.num_compte = num_compte ;
        this.solde =0.0; 
        this.date_creation = date_creation ;
        this.titulaire = titulaire; 
        this.agence = agence; 
      
    

    }
    public void remplir(Operation tabOperation[i]){
        for(int i=0;i<tabOperation.length;i++)
    {
        this.tabOperation[i]=new Operation(date_operation, type, montant, agence);
        
    }
    }
 

    public int getnum_compte() {
        return num_compte;}
    public Personne gettitulaire() {
        return titulaire;}

    public void setnum_compte(int num_compte)
    {this.num_compte = num_compte;}
    public void settitulaire(Personne titulaire) {
        this.titulaire = titulaire; }

   
    public void affiche()
    {   System.out.println( "" ); 
    this.agence.affiche(); 
     System.out.println( "" ); 
        this.titulaire.affiche(); 
    System.out.print( "\ndate de créaction du compte:" ); 
        this.date_creation.affiche(); 
    System.out.println( "\nnumero du compte:"+num_compte+" , solde:"+solde ); 
    }

    
    void deposer(int montant){
        solde=solde+montant;
    }
   
    
    void retirer(int montant){
        solde=solde-montant;
    }

    public void fraisTrimestre(){
        int a;
        a=((titulaire.getdate_auj().getannee()-date_creation.getannee()-1)*3+((titulaire.getdate_auj().getmois())*30+(12-date_creation.getmois())*30)+(titulaire.getdate_auj().getjour()+30-titulaire.getdate_auj().getjour()))/30/3;
        for(int i=0;i<a;i++)
        {
            solde=solde-15;
        }
    } 
    
    public static void main(String[] args)     
    {    Date date_creation= new Date (1,1,2023);
         Date date_naissance= new Date (2,7,2002);
         Date date_lance=new Date(1,1,2022);
         Date date_auj=new Date(7,11,2023);
         Personne titulaire= new Personne("eya","dammak",11167567,date_naissance,date_auj);
         Agence agence= new Agence (1,"biat","route matar",date_lance);
         Compte c1= new Compte(1,titulaire,date_creation,agence);
         c1.affiche();
         c1.deposer(1200);
         c1.fraisTrimestre();
         c1.affiche();
    }

}
