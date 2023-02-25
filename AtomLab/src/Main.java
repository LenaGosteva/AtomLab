import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger("E:\\МИФи", "log.txt");
        logger.setMsg("Программа запущена!", "info");
        String fileName = "Teacher.txt";
        List<Teacher> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        FileOperation fileOperation = new FileOperation("E:\\МИФИ", fileName);
        String exit = "e", name, surname, login, password, lesson , numberClass;
        int age, id = 1, role = 1;
        persons = fileOperation.readFile(1);

        int lastID = (persons.size()==0)?1:persons.stream().mapToInt(v ->v.getId());
        while (true) {
            System.out.println("Enter name:");
            name = scanner.nextLine();
            System.out.println("Enter last name:");
            surname = scanner.nextLine();
            System.out.println("Enter age:");
            age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter login:");
            login = scanner.nextLine();
            System.out.println("Enter password:");
            password = scanner.nextLine();
            System.out.println("Enter class:");
            numberClass = scanner.nextLine();
            System.out.println("Enter subject:");
            lesson = scanner.nextLine();
            logger.setMsg("Если вы хотите завершить ввод, напишите 'e", "info");
            if (exit.equals(scanner.nextLine())) {
                logger.setMsg("Программа завершена", "info");
                break;
            }
        }

    }}