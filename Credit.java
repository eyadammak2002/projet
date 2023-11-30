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

    public Credit(int code_credit,Compte_courant com_courant,Double montant_credit,Date date_versement)
    { 
        this.code_credit = code_credit ;
        this.com_courant =com_courant; 
        this.montant_credit = 5*this.com_courant.getemp().getsalaire() ;
        this.date_versement = date_versement; 

        if ((date_versement.diffDate(com_courant.date_creation)/30)>=6)
        autorise_credit=true;
    }


    public void versement_credit (DateTime date_versement,double montant) {
        if (autorise_credit==true)
        {
            montant_credit=montant_credit+montant;
            com_courant.versement(fraisDossier(),date_versement);
        }
    }


    public double fraisDossier() {
        int test=date_versement.com_courant.getemp().getdate_naissance().ancien() ;
        if (test< 30) {
            return 0.01 * montant_credit;
        } else if (test >= 30 && test<= 50) {
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
