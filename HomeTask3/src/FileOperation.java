import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperation {
    /*Поля*/
    private String filePath;
    Logger log = new Logger("E:\\АВТО", "log.txt");

    /*Конструктор*/
    FileOperation(String path, String fileName) {
        this.filePath = path + "\\" + fileName;
        /*Методы*/
    }

    public void writeFile(List<Car> data) {
        try (FileWriter writer = new FileWriter(this.filePath, false)) {
            for (int j = 0; j < data.size(); j++) {
                if (data.get(j) instanceof Car) {
                    Car newCar = (Car) data.get(j);
                    writer.write(newCar.getBrand() + "!" + newCar.getWeight() + "!" + newCar.getOwnerName());
                    writer.append("\n");
                } else {
                    log.setMsg("Данные этого каласса не поддерживаются", "err");
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Car> readFile() {
        ArrayList<Car> list = new ArrayList<Car>();

        try (FileReader read = new FileReader(this.filePath)) {
            Scanner in = new Scanner(read);
            String[] strArr;
            String str;
            while (in.hasNextLine()) {
                str = in.nextLine();
                strArr = str.split("!");

                list.add(new Car(Integer.parseInt(strArr[0]),strArr[1], Integer.parseInt(strArr[2]), strArr[3]));

            }
        } catch (IOException e) {

        }
        return list;
    }
}