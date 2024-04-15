public class Compte_epargne extends Compte {
   
    
    public Compte_epargne()
    {   
        super();
        
    }

    public Compte_epargne(int num_compte, double solde,Personne titulaire,Date date_creation,Agence agence)
    { 
        super(num_compte, titulaire,date_creation, agence);  
        setautorisation(false);
    }

     

    public void setsolde(double solde)
    {this.solde = solde;}


    public void benifice(Date date,int h,int m,int s){
       if ((date.getmois()==3)||(date.getmois()==6)||(date.getmois()==9)||(date.getmois()==12))
        {
            double a=((super.solde*6)/100);
            this.solde+=a; 
            this.operations[this.nbOperation]=new Operation(new DateTime(date, h, m,s), "crédit", a, agence);
            this.nbOperation++;
        }
       }
       
    }
 

            
     
    

