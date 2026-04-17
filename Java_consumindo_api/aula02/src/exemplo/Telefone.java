package exemplo;

import java.util.Objects;

public final class Telefone {
    private final String  ddd;
    private final String numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public int hashcode(){
        return Objects.hash(ddd, numero);
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        } else if (!(obj instanceof Telefone)) {
            return false;
        } else {
            Telefone other = (Telefone) obj;
            return Objects.equals(ddd, other.ddd) && Objects.equals(numero, other.numero);
        }
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
