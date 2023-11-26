public class Compte_courant extends Compte{
    Employe emp;
    private double max_dep;
    private double frais_compte=35;

    
    public Compte_courant()
    {   //employer fer8in
        super();
        emp=(Employe)this.gettitulaire();
    }

    public Compte_courant(int num_compte, double solde,Employe titulaire,Date date_creation,Agence agence, Date date_auj,Employe emp,String strType)
    { 
        super(num_compte, titulaire,date_creation, agence, strType);
        this.emp=titulaire;
    }

    public void frais_finMois(Date date_auj){
          if(this.solde<0)
             this.solde-=(this.solde*2)/100;   
    }

    public boolean testdepassement()
    {
      return(super.solde<max_dep);
    }

    public void fraisTrimestre(Date date_auj){
        int a;
        a=((date_auj.getannee()-super.date_creation.getannee()-1)*3+((date_auj.getmois())*30+(12-super.date_creation.getmois())*30)+(date_auj.getjour()+30-date_auj.getjour()))/30/3;
        for(int i=0;i<a;i++)
        {
            super.solde=super.solde-frais_compte;
        }
    } 
    
}
