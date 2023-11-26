public class DateTime extends Date {
    
    private int heure;
    private int minute;
    private int seconde;

    public DateTime()
    {   super();
        heure = 0 ; 
        minute = 0 ;
        seconde = 0 ;
    }

    public DateTime(int jour ,int mois,int annee,int heure ,int minute,int seconde)
    {   super(jour,mois,annee);
        this.heure = heure ;
        this.minute = minute ;
        this.seconde = seconde ;
    }

    public int getheure() {
		return heure;
	}
    public int getminute() {
		return minute;
	}
    public int getseconde() {
		return seconde;
	}
    public void setheure(int heure) {
		this.heure = heure;
	}
    public void setminute(int minute) {
		this.minute = minute;
	}
	
	public void setseconde(int seconde) {
		this.seconde = seconde;
	}

    public void affiche()
    {   super.affiche();
        System.out.println(heure+":"+minute+":"+seconde ); 
    }

}
