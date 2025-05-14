
package bibliotheque;


public class Reservation
{

    static void add(Reservation r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    private int idRes;
    private int idl;
    private String noml;
    private String dateRes;
    private int idE;
    private String nomE;
    private String prenomE;
//    private String adresseE ;
////  private int volume;
//    private String telE;
//    
   public Reservation ( int idE,int idl, int idE1, String dateRes, String nomE, String PrenomE)
    {
        this.idl = idl;
        this.dateRes = dateRes;
        this.idE=idE;
//        this.adresseE =adresseE;
////      this.volume =volume;
//        this.telE = telE;  
    }

    public Reservation(int idRes, int idl,String noml, String dateRes, int idE, String nomE, String prenomE) {
        this.idRes = idRes;
        this.idl = idl;
        this.noml=noml;
        this.dateRes = dateRes;
        this.idE = idE;
        this.nomE = nomE;
        this.prenomE = prenomE;
    }

    public Reservation(int idRes, int idl, String dateRes, int idE) 
    {
        this.idRes = idRes;
        this.idl= idl;
        this.dateRes = dateRes;
        this.idE = idE;
    }

    public Reservation(int idRes,int idl, int idE, String nomE, String prenomE) {
        this.idRes = idRes;
        this.idl=idl;
        this.idE = idE;
        this.nomE = nomE;
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public Reservation(int idE, int idl) {
        this.idE = idE;
        this.idl = idl;
    }
   
   

    public Reservation( int idRes,String livre,String dateRes) 
    {
        this.idRes = idRes;
//        this.livre = livre;
        this.dateRes = dateRes;
        this.idE = idE;
//        this.prenomE = prenomE;
//        this.adresseE = adresseE;
//        this.telE = telE ;
//        this.Isbn = Isbn;
    }
   
   
    public void setDateRes(String dateRes) {
        this.dateRes = dateRes;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public int getIdE() {
        return idE;
    }
//     public Reservation ( String livre,int idE)
//    {
//        this.livre = livre;
//         this.idE = idE;
////        this.adresseE =adresseE;
//////      this.volume =volume;
////        this.telE = telE;
//        
//    }
    
    public int getIdRes() {
        return idRes;
    }

    public int  getIdl() {
        return idl;
    }

    public String getNoml() {
        return noml;
    }
    

    public String getDateRes() {
        return dateRes;
    }
    
    
}
