package lambda;

public class Main {
    public static void main(String[] args) {
        //Создаем экземпляр станции
        ElectricStation station = new ElectricStation();

        //Побавляем электроприборы

        //Добавляем с помощью анонимного класса, экземпляр анон. класса,
        //который реализует ElecticStuff, и переопределяет elecricityOn
        station.addElectricStuff(new ElecticStuff() {
            @Override
            public void elecricityOn() {
                System.out.println("Лампочка зажглась");
            }
        });

        //Добавляем с помощью лямбды
        //название интерфейса мы опускаем, т.к. компилтор и так знает
        //экземпляр какого типа мы ждем в качестве аргумента.
        //Имя метода мы тоже опускам так как он в инерфейсе и так один.
        //Так же опускаем return если бы был и типы параметров если бы были
        station.addElectricStuff(() -> System.out.println("Радио заиграло"));

        station.electroStart();
    }
}
