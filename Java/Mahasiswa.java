package LATIHAN1DPBO2023.Java;

public class Mahasiswa {

    // atribut privat
    private String name;
    private int nim;
    private String studi;
    private String fakultas;

    // construtor
    public Mahasiswa(){
        this.name = "";
        this.nim = 0;
        this.studi = "";
        this.fakultas = "";
    }
    
    public Mahasiswa(String name, int nim, String studi, String fakultas)
    {
        this.name = name;
        this.nim = nim;
        this.studi = studi;
        this.fakultas = fakultas;
    }

    //getter
    public String getName()
    {
        return name;
    }
    public int getNim()
    {
        return nim;
    }
    public String getStudi()
    {
        return studi;
    }
    public String getFakultas()
    {
        return fakultas;
    }

    //setter
    public void setName(String name)
    {
        this.name = name;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }
    public void setStudi(String studi)
    {
        this.studi=studi;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}


