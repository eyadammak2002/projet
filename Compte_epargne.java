public class Compte_epargne extends Compte {
   
    
    public Compte_epargne()
    {   
        super();
    }

    public Compte_epargne(int num_compte, double solde,Personne titulaire,Date date_creation,Agence agence, Date date_auj,Employe emp)
    { 
        super(num_compte, titulaire,date_creation, agence);   
    }

   

    public void frais_finMois(){
        int an;
        int i=0;
        
    {
        {
            while(i<12)
            {
                super.solde=((super.solde*6)/100);
                i+=3;
            }
            
        }while(super.date_creation.getmois()==12);
       an= super.gettitulaire().date_auj.getannee()+1;
    }while((an==super.date_creation.getannee())&&(super.gettitulaire().date_auj.getmois()==super.date_creation.getmois()));
    }
    
}
