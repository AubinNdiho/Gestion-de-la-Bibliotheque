
package bibliotheque;

public class Livre
{
  
    private int idl;
    private String noml;
    private String auteur;
    private String maison ;
    private int volume;
    private String Isbn;
    public Livre(){
        
    }
    public Livre(String noml, String auteur, String maison, int volume, String Isbn)
    {
        this.noml = noml;
        this.auteur = auteur;
        this.maison =maison;
        this.volume =volume;
        this.Isbn = Isbn;
        
    }

    public Livre( int idl,String noml, String auteur,int volume,String maison,String Isbn) 
    {
        this.idl = idl;
        this.noml = noml;
        this.auteur = auteur;
        this.volume = volume;
        this.maison = maison;
        this.Isbn = Isbn;
    }

    public int getIdl() {
        return idl;
    }

    public String getNoml() {
        return noml;
    }

    public String getAuteur() {
        return auteur;
    }
   public int getVolume()
   {
   return volume;
   }

    public String getMaison() {
        return maison;
    }

    public String getIsbn() {
        return Isbn;
    }
    
    
}
