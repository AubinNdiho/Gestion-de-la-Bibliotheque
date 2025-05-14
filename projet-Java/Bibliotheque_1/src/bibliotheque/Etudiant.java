
package bibliotheque;

public class Etudiant
{
  
 private int idE;
    private String nomE;
    private String prenomE;
    private String adresseE ;
//  private int volume;
    private String telE;
    
    public Etudiant(){
        
    }
    public Etudiant(String nomE, String prenomE, String adresseE, String telE)
    {
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.adresseE =adresseE;
//      this.volume =volume;
        this.telE = telE;
        
    }

    public Etudiant( int idE,String nomE, String prenomE,String adresseE,String telE) 
    {
        this.idE = idE;
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.adresseE = adresseE;
        this.telE = telE ;
//        this.Isbn = Isbn;
    }

    public Etudiant(int idE, String nomE, String prenomE) {
        this.idE = idE;
        this.nomE = nomE;
        this.prenomE = prenomE;
    }

    public int getIdE() {
        return idE;
    }

    public String getNomE() {
        return nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public String getAdresseE() {
        return adresseE;
    }

    public String getTelE() {
        return telE;
    }   

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
