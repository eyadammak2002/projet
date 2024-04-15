public class Compte_courant extends Compte{
    private Employe emp;
  
    private double frais_compte=35;

//fil constructeur non paramétrer  3adi 3malt casting tol 5ater deja les attributs nulls
    public Compte_courant()
    {   
        super();
        emp=(Employe)this.gettitulaire();
        
    }


/*fil constructeur  paramétrer ki nji na3mel casting ena 3andi menlowel personne inhelo iwali employer o il employer zeyed 3al
 personne des attributs ken bech na3mel casting tol kima fil constructeur non paramétrer les attributs
 ili 3and employer o ili mouch 3and l'employer bech iwaliw null 5ater howa 3ando ken personne 
 donc ena fil parametre mte3 il constructeur lezem neb3athlo employer bech howa yebda ando tous les valeurs 
 des attributs bech yejem ihawel mil personne lio employer*/
    public Compte_courant(int num_compte, double solde,Employe titulaire,Date date_creation,Agence agence)
    { //il super bech tetla3 lil constructeur mte3 compte o bech tesna3 titulaire de type personne
        super(num_compte, titulaire,date_creation, agence);
    // this.emp bech te5o il titulaire ili ena da5alto fil paramétre mte3 constructeur ili howa de type employer beh ta3mel bih casting
         this.emp=titulaire;
          setautorisation(true);
      
    }
  

    public Employe getemp( )
    {return emp;}    

    public void setemp(Employe emp)
    {this.emp = emp;}

   

    public void frais_finMois(Date date,int h,int m,int s){
          if(this.solde<0)
            {  double a=(this.solde*2)/100;
                this.solde-=a; 
                this.operations[this.nbOperation]=new Operation(new DateTime(date, h, m,s), "crédit", a, agence);
                this.nbOperation++;
            }
    }


  


    public void retrait(double montant,Date date,int h,int m,int s){
        if((getautorisation()==true)&&(montant<=emp.getsalaire()))
          {  solde=solde-montant;
            this.operations[this.nbOperation]=new Operation(new DateTime(date, h, m,s), "crédit", montant, agence);
            this.nbOperation++;
          }
        else
          System.out.println("échec Opération! vous avez depasser le plafond de dépassement ");
        
            }



    public void viseverser(Compte_epargne comp,double montant,Date date,int h,int m,int s){
        if((getautorisation()==true)&&(montant<=emp.getsalaire()))
           { this.retrait(montant,date,h,m,s);
            comp.versement(montant,date,h,m,s);
            this.operations[this.nbOperation]=new Operation(new DateTime(date, h, m,s), "crédit ", montant, agence);
            this.nbOperation++;
            this.operations[this.nbOperation]=new Operation(new DateTime(date, h, m,s), "debit", montant, agence);
            this.nbOperation++;
        }
        else
          
            System.out.println("échec Opération! vous avez depasser le plafond de dépassement ");
 
          }
    

    public void fraisTrimestre(Date date,int h,int m,int s){
       
        if ((date.getmois()==3)||(date.getmois()==6)||(date.getmois()==9)||(date.getmois()==12))        
        {
            super.solde=super.solde-frais_compte;
            this.operations[this.nbOperation]=new Operation(new DateTime(date, h, m,s), "crédit", frais_compte, agence);
            this.nbOperation++;

        }
    } 


   
}
