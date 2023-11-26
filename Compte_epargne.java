public class Compte_epargne extends Compte {
   
    
    public Compte_epargne()
    {   
        super();
        
    }

    public Compte_epargne(int num_compte, double solde,Personne titulaire,Date date_creation,Agence agence, Date date_auj,String strType)
    { 
        super(num_compte, titulaire,date_creation, agence,strType);   
    }

    public void frais_finMois(Date date_auj){
       if ((date_auj.getmois()==3)||(date_auj.getmois()==6)||(date_auj.getmois()==9)||(date_auj.getmois()==12))
       super.solde+=((super.solde*6)/100);
    }
 

            
     
    
}
