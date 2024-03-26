package model;

public abstract class Cafetera {
    private Molino molino;
    private TipoCafe tipoCafe;

    public Molino getMolino() {
        return molino;
    }

    public void setMolino(Molino molino) {
        this.molino = molino;
    }

    public TipoCafe getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(TipoCafe tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public Cafetera(TipoCafe tipoCafe, Molino molino) {
        this.molino = molino;
        this.tipoCafe = tipoCafe;
    }


    public abstract TipoCafe hacerCafe();

}