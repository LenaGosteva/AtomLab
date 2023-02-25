import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //    public static void main(String[] args) {
//        Logger logger = new Logger("E:\\МИФИ", "log.txt");
//        logger.setMsg("Программа запущена!", "info");
//        logger.setMsg("Происходит работа программы", "not_type");
//        logger.setMsg("Происходит работа программы1111", "info");
//        logger.setMsg("Внимание Внимание", "warning");
//        logger.setMsg("Ошибка в программе", "err");
//        logger.setMsg("Программа закрыта!", "info");
//        logger.setMsg("Программа закр232323ыта!", "info123");
//
//
//    }
    public static void main(String[] args) {
        Logger logger = new Logger("C:\\АВТО", "log.txt");
        logger.setMsg("Программа запущена!", "info");
        String fileName = "Cars.txt";


        String exit = "e", brand, ownerName;
        int weight;
        Scanner scanner = new Scanner(System.in);
        FileOperation fileOperation = new FileOperation("C:\\АВТО", fileName);

        ArrayList<Car> cars = new ArrayList<>();
        cars = fileOperation.readFile();

        System.out.println("Введите бренд машины: ");
        String myBrand = scanner.nextLine();

        System.out.println("Введите имя владельца:");
        String name = scanner.nextLine();
        String[] authData = auth(cars, myBrand, name);

        if (authData.length == 0) {
            return;
        }
        System.out.println("Go in, " + authData[1] + "!");
        int lastID = (cars.size() == 0) ? 1 : cars.stream().mapToInt(Car::getId).max().getAsInt() + 1;
        int id = lastID;
        while (true) {
            System.out.println("Enter brand:");
            brand = scanner.nextLine();
            System.out.println("Enter weight:");
            weight = scanner.nextInt();
            System.out.println("Enter ownerName:");
            ownerName = scanner.nextLine();
            scanner.nextLine();
            logger.setMsg("Если вы хотите завершить ввод, напишите 'e", "info");
            cars.add(new Car(id, brand, weight, ownerName));
            if (exit.equals(scanner.nextLine())) {
                logger.setMsg("Программа завершена", "info");
                break;
            }
            id += 1;
        }
        if (cars.size() != 0) {
            fileOperation.writeFile(cars);
        }
    }
    static String[] auth(List<Car> data, String... authData) {
        String[] result = new String[2];
        for (int i = 0; i < data.size(); i++) {
            if (authData[0].equals(data.get(i).brand)
                    && authData[1].equals(data.get(i).ownerName)) {
                result[0] = data.get(i).getBrand();
                result[1] = String.valueOf(data.get(i).getOwnerName());
                break;
            }
        }return result;
    }

}