package tugas3;

public class PersegiPanjang implements MenghitungBidang{
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public PersegiPanjang() {
        panjang = 0;
        lebar = 0;
    }
    
    @Override
    public double luas(){
        return panjang*lebar;
    }
    
    @Override
    public double keliling(){
        return 2*panjang + 2*lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
}

