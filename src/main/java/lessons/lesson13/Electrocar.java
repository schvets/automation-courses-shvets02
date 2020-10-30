package lessons.lesson13;

public class Electrocar {
    public int id;
    private String type = "Electro";
    private String connectionPortId;
    public static int idStatic =5 ;

    public Electrocar(int id) {
        this.id = id;
    }

    public void start(){
        Engine engine = new Engine();
        engine.startEngine();
        System.out.println("Electro car with id " + id +" starting");
    }

    @Override
    public String toString() {
        return "Electrocar{" +
                "id=" + id +
                '}';
    }

    public class Engine{
        public void startEngine(){
            System.out.println(type);
            class Generator{
                void checkGeneratorStatus(){
                    System.out.println("check generator - OK");
                }
            }
            System.out.println("car engine start");
        }
    }


    static class Battery{
        public void chargeCar(){
            System.out.println("Electro car with id " + idStatic +" charging");

        }
    }
}
