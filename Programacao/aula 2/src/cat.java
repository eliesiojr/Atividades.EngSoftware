public class cat extends animal implements pet {
    private String name;

    public cat(String name){
        super(4);
        this.setName(name);
    }
    public cat(){
        super(4);
        this.setName(null);
    }
    @Override
    public void eat() {
        System.out.println("O gato come ração");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("O gato brinca de correr atrás do laser");

    }
}
