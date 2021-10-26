package ExercíciosPoo;

public abstract class Animal1 {
	
    private String tipo;

    abstract public void som();

    public Animal1(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
    this.tipo = tipo;
    }
}