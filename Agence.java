public class Agence {
    private int code;
    private String nom_banque;
    private String adresse;
    private Date date_lance;
    
    
        public Agence()
        {   
            code =0; 
            nom_banque = "null" ;
            adresse = "null" ;
            date_lance=new Date();
        }
    
        public Agence(int code, String nom_banque,String adresse,Date date_lance)
        { 
            this.code =code; 
            this.nom_banque = nom_banque;
            this.adresse = adresse ;
            this.date_lance=date_lance;

        }
    
        public int getcode() {
            return code;
        }
        public String getnom_banque() {
            return nom_banque;
        }
        public String getadresse() {
            return adresse;
        }
         public Date getdate_lance() {
            return date_lance;
        }
        public void setdate_lance(Date date_lance) {
            this.date_lance = date_lance;
        }

        public void setcode(int code) {
            this.code = code;
        }
        public void setnom_banque(String nom_banque) {
            this.nom_banque = nom_banque;
        }
        public void setadresse(String adresse) {
            this.adresse = adresse;
        }
        
       
    
        public void affiche()
        {   System.out.println("code:"+code+" , nom_banque:"+nom_banque+" , adresse :"+adresse+","); 
            System.out.print("date de lancement de l'agence:");
            this.date_lance.affiche();
        }

        public String ToString()
        {
           String s;
           s= this.date_lance.toString()+"code :"+code+", nom_banque :"+nom_banque+",adresse :"+adresse;
           return s;
        }

        
    
    
    
}

    

