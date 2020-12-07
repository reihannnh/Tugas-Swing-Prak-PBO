package tugas3;

public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public Balok() {
        super();
        tinggi = 0;
    }

    @Override
    public double volume(){
        return super.luas()*tinggi;
    }

    @Override
    public double luasPermukaan(){
        return 2*super.luas() + 2*super.getLebar()*tinggi + 2*super.getPanjang()*tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
}
