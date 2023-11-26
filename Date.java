

public class Date{
    private int jour;
    private int mois;
    private int annee;
   

    public Date()
    {
       this.jour = 0 ;
        this.mois =0 ;
        this.annee = 0 ; 
    }
    

    public Date(int jour ,int mois,int annee)
    {
        this.jour = jour ;
        this.mois = mois ;
        this.annee = annee ;
    }

    public int getjour() {
		return jour;
	}
    public int getmois() {
		return mois;
	}
    public int getannee() {
		return annee;
	}
    public void setjour(int jour) {
		this.jour = jour;
	}
    public void setmois(int mois) {
		this.mois = mois;
	}
	
	public void setannee(int annee) {
		this.annee = annee;
	}

    public void affiche()
    { 
        System.out.print(+jour+"/"+mois+"/"+annee ); 
    }

    public String ToString()
    { 
        return jour+"/"+mois+"/"+annee ; 
    }
    

    int diffDate(Date d )
    {   int res;
        res=Math.abs(((this.annee-d.annee-1)*360)+((this.mois)*30+(12-d.mois)*30)+(this.jour)+(30-d.jour));
        return res;
    }
   

public static void main(String[] args) {
    Date d1=new Date(1,1,2024);
    Date d2=new Date(1,1,2022);
    System.out.println(d1.diffDate(d2));

}
  

}