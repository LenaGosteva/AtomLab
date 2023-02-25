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
        Logger logger = new Logger("E:\\АВТО", "log.txt");
        logger.setMsg("Программа запущена!", "info");
        String fileName = "Car.txt";
        Scanner scanner = new Scanner(System.in);
        FileOperation fileOperation = new FileOperation("E:\\АВТО", fileName);
        String exit = "e", brand, weight,ownerName;
        for (int i = 0; i < 2; i++) {
            while (true) {
                System.out.println("Enter brand:");
                brand = scanner.nextLine();
                System.out.println("Enter weight:");
                weight = scanner.nextLine();
                System.out.println("Enter ownerName:");
                ownerName = scanner.nextLine();
                scanner.nextLine();
                logger.setMsg("Если вы хотите завершить ввод, напишите 'e", "info");
                if (exit.equals(scanner.nextLine())) {
                    logger.setMsg("Программа завершена", "info");
                    break;
                }
            }
        }

    }}