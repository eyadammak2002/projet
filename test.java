public class test {
    public static void main(String[] args) {
        Date date= new Date(1,2,2023);
        Date date_creation= new Date (1,1,2022);
        Date date_versement_credit=new Date(1,1,2023);
      
        Employe e1= new Employe("salem","yyyy",111111,new Date (13,5,1982),"développeur","contractuelle",1500,new Date(1,3,2018),date);
        Personne titulaire= new Personne("salem","yyyy",11111,new Date (13,5,1982));
        Agence agence= new Agence (24,"biat","sfax",new Date(25,12,2015));
      
        Compte_courant c1courant=new Compte_courant(12854,0,e1,date_creation,agence);
        Compte_epargne c1epargne=new Compte_epargne(95147,0,titulaire,date_creation,agence);
        Credit credit=new Credit(1,c1courant,3*e1.getsalaire(),date_versement_credit);
       
        System.out.println("annee : "+2022);
        for(int i=0;i<12;i++)   
        {
        c1courant.versement(e1.getsalaire(),new Date(1,i,2022),11,30,4);
        c1courant.viseverser(c1epargne,500,new Date(1,i,2022),11,35,4); 
        c1epargne.benifice(new Date(1,i,2022),1,36,4);
        c1courant.retrait(350,new Date(1,i,2022),11,38,4);
        c1courant.frais_finMois(new Date(1,i,2022),1,40,4);
        c1courant.fraisTrimestre(new Date(1,i,2022),1,45,4);
        c1courant.affiche();
        c1epargne.affiche();

        }
        System.out.println("annee : "+2023);
        credit.versement_credit(3*e1.getsalaire(),date_versement_credit,9,45,8);

       for(int i=0;i<12;i++)   
        {
            c1courant.retrait(400,new Date(1,i,2022),11,30,4);
        }

        for(int i=0;i<12;i=i+2)  
        {
            c1epargne.retrait(300,new Date(1,i,2022),11,30,4);
            
        }

        System.out.println("extraitBancaire de l'annee : "+2022);
        c1courant.extraitBancaire();
        System.out.println("extraitBancaire de l'annee : "+2023);
        c1epargne.extraitBancaire();

}}
