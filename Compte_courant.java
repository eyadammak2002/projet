public class Compte_courant extends Compte{
    Employe emp;
    private double max_dep;
    public Compte_courant()
    {   
        super();
        emp=new Employe();
       
    }

    public Compte_courant(int num_compte, double solde,Personne titulaire,Date date_creation,Agence agence, Date date_auj,Employe emp)
    { 
        super(num_compte, titulaire,date_creation, agence);
        this.emp=emp;
        max_dep=emp.getsalaire();
    }

    public void frais_finMois(){
        int an;
    {
        {
            for(int i=0;i<12;i++)
                if(this.solde<0)
                this.solde-=(this.solde*20)/100;   
            }while(super.date_creation.getmois()==12);
            an= super.gettitulaire().date_auj.getannee()+1;
        }while((an==super.date_creation.getannee())&&(super.gettitulaire().date_auj.getmois()==super.date_creation.getmois()));
        }


    public boolean testdepassement()
    {
      return(super.solde<max_dep);
    }

    public void fraisTrimestre(){
        int a;
        a=((super.gettitulaire().date_auj.getannee()-super.date_creation.getannee()-1)*3+((super.gettitulaire().date_auj.getmois())*30+(12-super.date_creation.getmois())*30)+(super.gettitulaire().date_auj.getjour()+30-super.gettitulaire().date_auj.getjour()))/30/3;
        for(int i=0;i<a;i++)
        {
            super.solde=super.solde-35;
        }
    } 
    
}
