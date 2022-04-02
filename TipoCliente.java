package enumeração;

public enum TipoCliente {

    P_FIS(1, "Pessoa física") ,P_JUR(2, "Pessoa jurdica");

    private int num;
    private String type;

    TipoCliente(int num, String type)  {
        this.num = num;
        this.type = type;
    }

    public int getNum() {
        return this.num;
    }
    public String getType() {
        return this.type;
    }
}
