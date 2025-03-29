class Forma {
    private String culoare;

    public Forma(String culoare) {
        this.culoare = culoare;
    }

    public String descriere() {
        return "Culoarea formei este: " + culoare;
    }
}

class Cerc extends Forma {
    private double raza;

    public Cerc(String culoare, double raza) {
        super(culoare);
        this.raza = raza;
    }

    public double arie() {
        return Math.PI * raza * raza;
    }

    public void afisareDetalii() {
        System.out.println(descriere());
        System.out.println("Raza cercului: " + raza + "Aria cercului: " + arie);
       
    }
}
