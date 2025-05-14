
package bibliotheque;


public class Emprunt {
    
    static void add(Emprunt em) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int idEmp;
    private String dateEmp;
    private String dateRem;
    private String noml;
    private int idl;
    private String nomE;
    private String prenomE;
    private int idE;
    
 public Emprunt ( String dateRem,int idl,int idE)
    {
//        this.dateEmp = dateEmp;
        this.dateRem = dateRem;
        this.idl = idl;
        this.idE=idE;
        
//        this.adresseE =adresseE;
////      this.volume =volume;
//        this.telE = telE;
    }
     public Emprunt( int idEmp, String dateRem,String livre) 
    {
        this.idEmp = idEmp;
//        this.dateEmp = dateEmp;
        this.dateRem = dateRem;
//        this.livre = livre;
        
    }

    public int getIdEmp() {
        return idEmp;
    }

    public String getDateEmp() {
        return dateEmp;
    }

    public String getDateRem() {
        return dateRem;
    }

    public int getIdE() {
        return idE;
    }
    public int getIdl()
    {
        return idl;
    }

    public String getNoml() {
        return noml;
    }

    public void setNoml(String noml) {
        this.noml = noml;
    }

    public String getNomE() {
        return nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }
    

    
    public Emprunt(int idEmp,String dateEmp,String dateRem,String noml,int idl,String nomE,String prenomE,int idE) 
    {
        this.idEmp = idEmp;
        this.dateEmp = dateEmp;
        this.dateRem = dateRem;
        this.noml = noml;
        this.idl= idl;
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.idE = idE;
                
    }

    public Emprunt(int idEmp, String dateEmp, String dateRem, int idl, int idE) {
        this.idEmp = idEmp;
        this.dateEmp = dateEmp;
        this.dateRem = dateRem;
        this.idl = idl;
        this.idE = idE;
    }

    






}
