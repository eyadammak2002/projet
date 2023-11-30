public class test {
    public static void main(String[] args) {
        Date date_auj= new Date();
        Date date_creation= new Date (1,1,2022);
        DateTime date_versement_credit=new DateTime(1,1,2023,11,30,4);
      
        Employe e1= new Employe("salem","dammak",11167567,new Date (13,5,1982),"développeur","contractuelle",1500,new Date(1,3,2018),date_auj);
        Personne titulaire= new Personne("salem","dammak",11167567,new Date (13,5,1982));
        Agence agence= new Agence (24,"biat","sfax",new Date(25,12,2015));
        Compte c1= new Compte();
        Compte_courant c1courant=new Compte_courant(12854,0,e1,date_creation,agence,"courant");
        Compte_epargne c1epargne=new Compte_epargne(95147,0,titulaire,date_creation,agence,"courant");
        Credit credit=new Credit(1,c1courant,3*e1.getsalaire(),date_versement_credit);
       
        System.out.println(date_auj.getannee());
        for(int i=0;i<12;i++)   
        {
        c1courant.versement(e1.getsalaire(),new DateTime(2022,i,1,11,30,4));
        c1courant.viseverser(c1epargne,500,new DateTime(2022,i,1,11,30,4)); 
        c1epargne.frais_trimestre(new Date(2022,i,1));
        c1courant.retrait(350,new DateTime(2022,i,1,11,30,4));
        }

        credit.versement_credit(date_versement_credit,3*e1.getsalaire());

       for(int i=0;i<12;i++)   
        {
            c1courant.retrait(400,new DateTime(2022,i,1,11,30,4));
        }

        for(int i=0;i<12;i=i+2)  
        {
            c1epargne.retrait(300,new DateTime(2022,i,1,11,30,4));
            
        }
               
        c1courant.extraitBancaire();
        c1epargne.extraitBancaire();


        e1.afficheAncien( date_auj);
            if((e1.ancien(date_auj)>=5)&&((e1.getdate_embouche().getmois()==4)||(e1.getdate_embouche().getmois()==8)||(e1.getdate_embouche().getmois()==12)))
                { 
                  c1.versement(2*e1.getsalaire());
                }
            else
            c1.versement(e1.getsalaire());
        c1.affiche(); 
        c1.fraisTrimestre(date_auj);
        c1.affiche();
       
        
        
      
         
         
    }
}
