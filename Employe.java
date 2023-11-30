
public class Employe extends Personne {
    
    private String fonction ;
    private String situation;
    private double salaire;
    private Date date_embouche;

    public Employe()
    {   super();
        fonction = "" ; 
        situation = ""; 
        date_embouche=new Date();
        salaire = 0 ;
    }

    public Employe(String nom, String prenom, int cin ,Date date_naissance,String fonction, String situation,double salaire,Date date_embouche,Date date)
    {   
        super(nom,prenom,cin,date_naissance);
        this.fonction = fonction ;
        this.salaire = salaire; 
        this.date_embouche = date_embouche;
        this.situation(date);
    }

   

    public Date getdate_embouche() {
    return date_embouche;
    }
    
    public String getfonction() {
        return fonction;
    }
    public String getsituation() {
        return situation;
    }
    public double getsalaire() {
        return salaire;
    }
   

    public void setfonction(String fonction) {
        this.fonction = fonction;
    }
    public void setsituation(String situation) {
        this.situation = situation;
    }

    public void setsalaire(double salaire) {
        this.salaire = salaire;
    }
     public void setdate_embouche(Date date_embouche) {
        this.date_embouche = date_embouche;
    }

    
    public int ancien(Date date)
        {   int b;
            int a;
        
            a=date.diffDate(getdate_embouche());
            b = a/360;
            return b;  
        }


    public void afficheAncien(Date date){
    System.out.println("\n"+ancien(date) +"ans de travail");
    } 
        
  
    

    public boolean testSituation(Date date){
        return ( ancien(date)>=4);
    }

    public void situation(Date date) {   
        if(this.testSituation(date))
        this.setsituation("titulaire");
        else
        this.setsituation("contractuelle");
    }


    public void affiche()
    {   
        super.affiche();
        System.out.print("\ndate d'embouche de "+super.nom+": "); 
        this.date_embouche.affiche();
    }


    public String ToString()
    {   
        return super.ToString()+"\ndate d'embouche de "+super.nom+": "+"\ndate de création du compte: ";
        
    }

    /* 
    public static void main(String[] args)     
    {    Date date= new Date();
         Date date_embouche= new Date(1,7,2012); 
         Date date_naissance= new Date (2,7,2002);
         Employe e1= new Employe("eya","dammak",11167567,date_naissance,"développeur","contractuelle",35.500,date_embouche,date);
         e1.affiche(); 
         e1.afficheAncien(date);    
    }
    */
      
}
