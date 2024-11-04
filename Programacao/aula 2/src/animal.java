public abstract class animal {
    protected  int Legs;

    protected animal(int Legs){
        super();
        this.Legs = Legs;
    }
    public void walk(){
        System.out.printf("Esse animal caminha sobre %d patas", Legs);
    }
    public abstract void eat();

}
