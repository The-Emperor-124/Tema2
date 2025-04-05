class Persoana {
    String nume;
    int varsta;

    
    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
}


class Student extends Persoana {
    String universitate;

    
    public Student(String nume, int varsta, String universitate) {
        super(nume, varsta);
        this.universitate = universitate;
    }

    
    public void afisareInformatii() {
        System.out.println("Nume: " + nume + "Varsta: " + varsta + "Universitate: " + universitate);
       
    }
}
