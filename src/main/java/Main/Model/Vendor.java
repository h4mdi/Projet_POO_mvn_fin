package Main.Model;

public class Vendor {
//    Un fournisseur est caracterise par un identiant, un nom, une adresse email, un
//    facebook, une adresse, une liste des types des jouets qu'il peut fournir et une
//    liste des numeros telephoniques.

    private int id ;
    private String name ;
    private String email ;
    private String facebook ;
    private String adress ;

    public Vendor(int id, String name, String email, String facebook, String adress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.facebook = facebook;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

