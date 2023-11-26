public class Personne {
   
    
    protected String nom ;
    protected String prenom;
    protected int cin;
    protected Date date_naissance;
  
    
        public Personne()
        {   
            nom = "" ; 
            prenom = "" ;
            cin = 0 ;
            date_naissance=new Date();
            
            
        }
    
        public Personne(String nom, String prenom,int cin,Date date_naissance)
        { 
            this.nom = nom ;
            this.prenom = prenom ;
            this.cin = cin ;
            this.date_naissance=date_naissance;
          

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
   
       

        public void affiche()
        {   
            System.out.print(nom+" , "+prenom+" , cin"+cin+"\ndate de naissance:"); 
            this.date_naissance.affiche();
        }

    public String ToString()
    { 
        return nom+" , "+prenom+" , cin"+cin+"\ndate de naissance:"+this.date_naissance.ToString(); 
    }

    public int age(Date date_auj)
    {   int b;
        int a;
       
        a=date_auj.diffDate(date_naissance);
        b = a/360;
        return b;  
     }
        
        
    
    
    
}
