public class Compte_epargne extends Compte {
   
    
    public Compte_epargne()
    {   
        super();
        
    }

    public Compte_epargne(int num_compte, double solde,Personne titulaire,Date date_creation,Agence agence,String strType)
    { 
        super(num_compte, titulaire,date_creation, agence,strType);   
    }

     

    public void setsolde(double solde)
    {this.solde = solde;}


    public void frais_trimestre(DateTime date){
       if ((date.getmois()==3&&date.getjour()==1)||(date.getmois()==6&&date.getjour()==1)||(date.getmois()==9&&date.getjour()==1)||(date.getmois()==12&&date.getjour()==1))
        {
            double a=((super.solde*6)/100);
            this.solde+=a; 
            this.operations[this.operations.length]=new Operation(date, strType,a, agence);
        }
       }
       
    }
 

            
     
    

