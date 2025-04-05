class Vehicul {
    int vitezaMaxima;

   
    public Vehicul(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }
}


class Masina extends Vehicul {
    String marca;

    
    public Masina(int vitezaMaxima, String marca) {
        super(vitezaMaxima); 
        this.marca = "Logan 08 gaz";
    }

    
    public void afiseazaDetalii() {
        System.out.println("Marca: " + marca + "Viteza maxima: " + vitezaMaxima + " km/h");
        
    }
}



