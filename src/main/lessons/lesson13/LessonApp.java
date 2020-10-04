package main.lessons.lesson13;



public abstract class LessonApp {
    public static void main(String[] args) {
        Electrocar car1 = new Electrocar(1);
        car1.start();


        Electrocar.Battery battery = new Electrocar.Battery();
        battery.chargeCar();

        Electrocar car2 = new Electrocar(5){
            @Override
            public void start() {
                Engine engine = new Engine();
                engine.startEngine();
                System.out.println("New Electro car with id " + id +" starting");
            }
        };

        car2.start();
 }
}
