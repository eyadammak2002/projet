
public class Employe extends Personne {
    
    private String fonction ;
    private String situation;
    private double salaire;
    private Date date_embouche;
  
    

    

    
    public Employe()
    {   super();
        fonction = "null" ; 
        situation = "null"; 
        date_embouche=new Date();
        salaire = 0 ;
        
     
        
    }

    public Employe(String nom, String prenom, int cin ,Date date_naissance,Date date_auj,String fonction, String situation,double salaire,Date date_embouche)
    {   super(nom,prenom,cin,date_naissance,date_auj);
        this.fonction = fonction ;
        this.situation = "contarctuelle" ;
        this.salaire = salaire; 
        this.date_embouche = date_embouche;
        
      
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
    
    
    
    
     public int ancien()
    {   int b;
        int a;
       
        a=date_auj.diffDate(date_embouche);
        b = a/360;
        return b;  
     }
    
    public void afficheAncien(){
    System.out.println("\n"+this.ancien() +"ans de travail");
    } 
        
  
    public boolean testAncien(){
        return ( this.ancien()>=5);
    }

    public boolean testSituation(){
        return ( this.ancien()>=4);
    }

    public void situation() {   
        if(this.testSituation())
        this.setsituation("titulaire");
    }

    public void affiche()
    {   
        super.affiche();
        System.out.print("\ndate d'embouche de "+super.nom+": "); 
        this.date_embouche.affiche();
        this.afficheAncien();
    }


    public String ToString()
    {   
        return super.ToString()+"\ndate d'embouche de "+super.nom+": "+"\ndate de création du compte: ";
        
    }

    public static void main(String[] args)     
    {
         Date date_embouche= new Date(1,9,2022);
         Date date_auj= new Date (1,9,2024);
          Date date_naissance= new Date (2,7,2002);
         Employe e1= new Employe("eya","dammak",11167567,date_naissance,date_auj,"développeur","contractuelle",3.500,date_embouche);
        
         e1.affiche();   
        
        
    }
    
}
