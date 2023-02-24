import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOperation {
    /*Поля*/
    private String filePath;
    Logger log = new Logger("E:\\АВТО", "log.txt");

    /*Конструктор*/
    FileOperation(String path, String fileName) {
        this.filePath = path + "\\" + fileName;
        /*Методы*/
    }

    public void WriteFile(List<Car> data) {
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
}