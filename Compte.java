public class Compte {
    private Personne titulaire ;
    private int num_compte;
    protected Double solde;
    protected Date date_creation;
    protected Agence agence;
    protected String strType;
    protected boolean autorisation;
    private double frais_compte=15;

    Operation[][]tabOperation;



    public Compte()
    {   
       
       titulaire=new Personne();
        num_compte = 0; 
        date_creation=new Date();
        solde = 0.0 ;
        agence=new Agence();
        strType="";
       
    }

    public Compte(int num_compte,Personne titulaire,Date date_creation,Agence agence,String strType)
    { 
        this.num_compte = num_compte ;
        this.solde =0.0; 
        this.date_creation = date_creation ;
        this.titulaire = titulaire; 
        this.agence = agence; 
        this.strType=strType;
        if (strType.equals(new String ("courant")))
            setautorisation(true);
        else
            setautorisation(false);
    }

   
 

    public int getnum_compte() {
        return num_compte;}
    public Personne gettitulaire() {
        return titulaire;}
    public boolean getautorisation( )
        {return autorisation;}
    public Double solde() {
        return solde;}
    public Date date_creation() {
        return date_creation;}
    public Agence agence()
        {return agence;}
     public String strType( )
        {return strType;}    
  
 
    public void setsolde(double solde)
    {this.solde = solde;}
    public void setdate_creation(Date date_creation) {
        this.date_creation = date_creation; }
    public void setagence(Agence agence) {
        this.agence = agence; }
    public void setnum_compte(int num_compte)
    {this.num_compte = num_compte;}
    public void setstrType(String strType) {
        this.strType = strType; }
    public void setautorisation(boolean autorisation) {
        this.autorisation = autorisation; }
    public void settitulaire(Personne titulaire) {
        this.titulaire = titulaire; }
    
   
    public void affiche()
    {   System.out.println( "" ); 
    this.agence.affiche(); 
     System.out.println( "" ); 
        this.titulaire.affiche(); 
    System.out.print( "\ndate de créaction du compte:" ); 
        this.date_creation.affiche(); 
    System.out.println( "\nnumero du compte:"+num_compte+" , solde:"+solde +" \ntype du compte : "+strType+" \nnautorisation : "+autorisation); 
    }

    
    void versement(int montant){
        solde=solde+montant;
    }
    
    void retrait(int montant){
        solde=solde-montant;
    }

    public void fraisTrimestre(Date date_auj){
        int a;
        a=((date_auj.getannee()-date_creation.getannee()-1)*3+((date_auj.getmois())*30+(12-date_creation.getmois())*30)+(date_auj.getjour()+30-date_auj.getjour()))/30/3;
        for(int i=0;i<a;i++)
        {
            solde=solde-frais_compte;
        }
    } 
    
    public static void main(String[] args)     
    {    Date date_creation= new Date (1,1,2023);
         Date date_naissance= new Date (2,7,2002);
         Date date_lance=new Date(1,1,2022);
         Date date_auj=new Date();
         Personne titulaire= new Personne("eya","dammak",11167567,date_naissance);
         Agence agence= new Agence (1,"biat","route matar",date_lance);
         Compte c1= new Compte(1,titulaire,date_creation,agence,"courant");
         c1.versement(1200);
         c1.fraisTrimestre(date_auj);
         c1.affiche();
    }

}
