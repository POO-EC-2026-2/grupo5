public abstract class Amostra {
    private int codigoAmostra;
    private String tipoDiagnostico;
    private String municipioColeta;
    private String responsavelColeta;
    private String coordenadasColeta;
    private String destinacaoFinal;
    
    public Amostra(int codigoAmostra, String tipoDiagnostico, String municipioColeta, String responsavelColeta, String coordenadasColeta, String destinacaoFinal){
        this.codigoAmostra = codigoAmostra;
        this.tipoDiagnostico = tipoDiagnostico;
        this.municipioColeta = municipioColeta;
        this.responsavelColeta = responsavelColeta;
        this.coordenadasColeta = coordenadasColeta;
        this.destinacaoFinal = destinacaoFinal;
    }
        
    public int getcodigoAmostra() {
        return codigoAmostra;
    }
    
    public String gettipoDiagnostico() {
        return tipoDiagnostico;
    }
    
    public String getmunicipioColeta() {
        return municipioColeta;
    }
    
    public String getresponsavelColeta() {
        return responsavelColeta;
    }
    
    public String getcoordenadasColeta() {
        return coordenadasColeta;
    }
    
    public String getdestinacaoFinal() {
        return destinacaoFinal;
    }
    
    public void setcodigoAmostra(int codigoAmostra) {
        if (codigoAmostra > 0) {
            this.codigoAmostra = codigoAmostra;
        } else {
            System.out.println("Erro: Código inválido");
        }
    }
    
}
