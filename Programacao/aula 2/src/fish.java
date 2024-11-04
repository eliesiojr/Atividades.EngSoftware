public class fish extends animal implements pet{

    private String name;
    public fish(){
       super(0);
    }


    @Override
    public void eat() {
        System.out.println("O peixe come carne");

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("O peixe nada de um lado para o outro");

    }
    public void walk(){
        System.out.println("O peixe possui nadadeiras");
    }
}
