class Animal{
    protected String nume;
    protected int varsta;
    public Animal(String num,int varsta){
        this.nume=nume;
        this.varsta=varsta;
        public String getnume(){
            return nume;
        }
        public int getvarsta(){
            return varsta;
        }
    }
    class Caine extends Animal{
        private String rasa;
        public Caine(String nume,int varsta,String rasa){
            super(nume,varsta)
            this.rasa=rasa;
        }
        public void afisaredetalii(){
            System.out.println("Nume:"+getnume + ",Varsta:"+getvarsta + "Rasa:"+rasa);
        }
    }

}