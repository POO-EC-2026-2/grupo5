public abstract class Analise{
    private String dataInicio;
    private String dataFim;
    private String analista;
    
    public Analise(String dataInicio, String dataFim, String analista){
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.analista = analista;
    }
    
    public String getdataInicio() {
        return dataInicio;
    }
    
    public String getdataFim() {
        return dataFim;
    }
    
    public String getanalista() {
        return analista;
    }
}
