package enumeração;

public class Cliente {
    public enum TypePay {
        AVISTA,APRAZO;
    }

    private String nom;
    private TipoCliente tip;
    private TypePay tp;

    public Cliente(String nom, TipoCliente tip, TypePay tp) {
        this.nom = nom;
        this.tip = tip;
        this.setTp(tp);
    }

    public void println() {
        System.out.println(this.nom);
        System.out.println(this.tip.getNum());
        System.out.println(this.tip.getType());
        System.out.println(this.tp);
    }
    
    public void setTp(TypePay tp) {
        this.tp = tp;
    }
    public String getNom() {
        return nom;
    }
    public void setTip(TipoCliente tip) {
        this.tip = tip;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

}
