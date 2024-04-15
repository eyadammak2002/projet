public class Credit {
    
    private int code_credit ;
    private Compte_courant com_courant;
    private double montant_credit;
    private boolean autorise_credit;
    private Date date_versement;


    public Credit()
    {   
        code_credit=0;
        com_courant=new Compte_courant();
        montant_credit = 0.0 ;
        date_versement=new Date();
        autorise_credit=false;  
    }

    public Credit(int code_credit,Compte_courant com_courant,Double montant_credit,int jour ,int mois,int annee)
    { 
        this.code_credit = code_credit ;
        this.com_courant =com_courant; 
        this.montant_credit = 5*this.com_courant.getemp().getsalaire() ;
        this.date_versement=new Date(annee,mois,jour); 

        if ((date_versement.diffDate(com_courant.date_creation)/30)>=6)
        autorise_credit=true;
    }
    

    public Credit(int code_credit,Compte_courant com_courant,Double montant_credit,Date date_versement)
    { 
        this.code_credit = code_credit ;
        this.com_courant =com_courant; 
        this.montant_credit = 5*this.com_courant.getemp().getsalaire() ;
        this.date_versement = date_versement; 

        if ((date_versement.diffDate(com_courant.date_creation)/30)>=6)
        autorise_credit=true;
    }


    public void versement_credit (double montant,Date date_versement,int h,int m,int s) {
        if (autorise_credit==true)
        {
            montant_credit=montant;
            com_courant.versement(fraisDossier(date_versement),date_versement,h,m,s);
        }
        else 
        System.out.println("pas d'autorisation credit ");
    }


    public double fraisDossier(Date date) {
       // int age=this.com_courant.getemp().ancien(date) ;
       int age=date.diffDate(this.com_courant.getemp().getdate_naissance());
        if (age< 30) {
            return 0.01 * montant_credit;
        } else if (age >= 30 && age<= 50) {
            return 0.02 * montant_credit;
        } else {
            return 0.03 * montant_credit;
        }
    }

    
    


    public void affiche()
    {   
        System.out.print("code credit :"+code_credit+"montant de credit"+montant_credit+"\ndate de versement de credit :"); 
        this.date_versement.affiche();
        this.com_courant.affiche();

    }


}       
