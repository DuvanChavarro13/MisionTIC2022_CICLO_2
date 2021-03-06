package co.edu.utp.misiontic2022.c2;

public class Convencional extends Verdura {
    //Atributos 
    private static final double RECARGO_CONVENCIONAL_BASE = 0.08;
    public double recargoConvencionales;
    public int gradoAditamentos;

    //Constructores
    public Convencional(String pNombre, double pPrecio){
        super(pNombre, pPrecio);
        this.recargoConvencionales = Convencional.RECARGO_CONVENCIONAL_BASE;
    }

    public Convencional(String pNombre, double pPrecio, double pRecargo){
        this(pNombre, pPrecio);
        this.recargoConvencionales = pRecargo;
    }

    public Convencional(String pNombre, double pPrecio, double pRecargo, int pGradoAditamentos){
        this(pNombre, pPrecio, pRecargo);
        this.gradoAditamentos = pGradoAditamentos;
    }

    public Convencional(String pNombre, double pPrecio, double pRecargo, int pGradoAditamentos, int pGramosVenta, boolean pImportada){
        this(pNombre, pPrecio, pRecargo, pGradoAditamentos);
        super.gramosVenta = pGramosVenta;
        super.importada = pImportada;
    }

    public Convencional(String pNombre, double pPrecio, int pGramosVenta, boolean pImportada){
        super(pNombre, pPrecio);
        super.gramosVenta = pGramosVenta;
        super.importada = pImportada;
    }

    //Metodo -> Requerimiento
    public double calcularPrecio(){
        double precioVerdura = super.calcularPrecio();
        double precioConvencional = precioVerdura + precioVerdura * this.recargoConvencionales;
        precioConvencional += precioVerdura * (0.01 * this.gradoAditamentos);
        return precioConvencional;
    }
    
}
