public class Compte_courant extends Compte{
    private Employe emp;
    private double max_dep;
    private double frais_compte=35;


    public Compte_courant()
    {   
        super();
        emp=(Employe)this.gettitulaire();
        max_dep=0;
    }

    public Compte_courant(int num_compte, double solde,Employe titulaire,Date date_creation,Agence agence,String strType)
    { 
        super(num_compte, titulaire,date_creation, agence, strType);
        this.emp=titulaire;
        max_dep=-emp.getsalaire();
    }

    public Employe getemp( )
    {return emp;}    

    public void setemp(Employe emp)
    {this.emp = emp;}


    public void frais_finMois(DateTime date){
          if(this.solde<0)
             {  double a=(this.solde*2)/100;
                this.solde-=a; 
             this.operations[this.operations.length]=new Operation(date, strType,a, agence);}
             }


    public boolean testdepassement()
    {
      return(max_dep>super.solde);
    }


    public void retrait(double montant,DateTime date){
        if(testdepassement())
          {  solde=solde-montant;
            this.operations[this.operations.length]=new Operation(date, strType, montant, agence);}

        else
          {System.out.println("échec Opération! vous avez depasser le plafond de dépassement ");
           this.operations[this.operations.length]=new Operation(date, strType, montant, agence);}
    }



    public void viseverser(Compte_epargne comp,double montant,DateTime date){
        if(testdepassement())
           { this.retrait(montant,date);
            comp.versement(montant,date);
            this.operations[this.operations.length]=new Operation(date, strType, montant, agence);
}
        else
          {
            System.out.println("échec Opération! vous avez depasser le plafond de dépassement ");
            this.operations[this.operations.length]=new Operation(date, strType, montant, agence);
          }




    }
    

    public void fraisTrimestre(Date date){
       
        if ((date.getmois()==3)||(date.getmois()==6)||(date.getmois()==9)||(date.getmois()==12))        
        {
            super.solde=super.solde-frais_compte;
        }
    } 


   
}
