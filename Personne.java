public class Personne {
   
    
    protected String nom ;
    protected String prenom;
    protected int cin;
    protected Date date_naissance;
    protected Date date_auj;
    
        public Personne()
        {   
            nom = "null" ; 
            prenom = "null" ;
            cin = 0 ;
            date_naissance=new Date();
            date_auj=new Date();
            
        }
    
        public Personne(String nom, String prenom,int cin,Date date_naissance, Date date_auj)
        { 
            this.nom = nom ;
            this.prenom = prenom ;
            this.cin = cin ;
            this.date_naissance=date_naissance;
            this.date_auj = date_auj;

        }

        public Personne(String nom, String prenom,int cin, int a,int m,int j)
        { 
            this.nom = nom ;
            this.prenom = prenom ;
            this.cin = cin ;
            this.date_naissance=new Date(a,m,j);

        }

        
  
        public String getnom() {
            return nom;
        }
        public String getprenom() {
            return prenom;
        }
        public int getcin() {
            return cin;
        }
        public Date getdate_naissance() {
            return date_naissance;
        }
        public void setdate_naissance(Date date_naissance) {
            this.date_naissance = date_naissance;
        }
        public void setnom(String nom) {
            this.nom = nom;
        }
        public void setprenom(String prenom) {
            this.prenom = prenom;
        }
        
        public void setseconde(int cin) {
            this.cin = cin;
        }
   
        public Date getdate_auj() {
            return date_auj;
        }
        public void setdate_auj(Date date_auj) {
            this.date_auj = date_auj;
        }
 

        public void affiche()
        {   
            System.out.print(nom+" , "+prenom+" , cin"+cin+"\ndate de naissance:"); 
            this.date_naissance.affiche();
        }

    public String ToString()
    { 
        return nom+" , "+prenom+" , cin"+cin+"\ndate de naissance:"+this.date_naissance.ToString(); 
    }

    public int age()
    {   int b;
        int a;
       
        a=date_auj.diffDate(date_naissance);
        b = a/360;
        return b;  
     }
        
        
    
    
    
}
