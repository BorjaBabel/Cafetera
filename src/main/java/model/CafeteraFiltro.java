package model;

public class CafeteraFiltro extends Cafetera{

    private Molino molino;
    public CafeteraFiltro(TipoCafe tipoCafe, Molino molino) {
        super(tipoCafe, molino);
    }

    @Override
    public TipoCafe hacerCafe() {
        System.out.println("Preparando café "+ super.getTipoCafe().getNombre()+ " con filtro...");
        super.getMolino().molerCafe();
        return super.getTipoCafe();
    }
}
