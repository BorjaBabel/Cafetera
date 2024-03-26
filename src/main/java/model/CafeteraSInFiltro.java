package model;

public class CafeteraSInFiltro extends Cafetera{


    public CafeteraSInFiltro(TipoCafe tipoCafe, Molino molino) {
        super(tipoCafe, molino);
    }

    @Override
    public TipoCafe hacerCafe() {
        System.out.println("Preparando café "+ super.getTipoCafe().getNombre()+ " sin filtro...");
        super.getMolino().molerCafe();
        return super.getTipoCafe();
    }
}
