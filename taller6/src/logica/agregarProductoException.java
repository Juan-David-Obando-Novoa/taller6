package logica;

public class agregarProductoException extends Exception{
	private String informacionAdicional;

    public agregarProductoException(String mensaje, String informacionAdicional) {
        super(mensaje);
        this.informacionAdicional = informacionAdicional;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

}
