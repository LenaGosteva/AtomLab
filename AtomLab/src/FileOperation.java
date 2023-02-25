import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileOperation<T> {
    /*Поля*/
    private String filePath;
    Logger log = new Logger("E:\\МИФИ", "log.txt");

    /*Конструктор*/
    FileOperation(String path, String fileName) {
        this.filePath = path + "\\" + fileName;
        /*Методы*/
    }

    public void writeFile(List<Person> data) {
        try (FileWriter writer = new FileWriter(this.filePath, false)) {
            for (int j = 0; j < data.size(); j++) {
                if (data.get(j) instanceof Teacher) {
                    Teacher teacher = (Teacher) data.get(j);
                    writer.write(teacher.getId() + "!" + teacher.getName() + "!" + teacher.getSurname()
                            + "!" + "!" + teacher.getLesson() + "!" + teacher.getNumberClass()
                            + "!" + teacher.account.getLogin() + "!" + teacher.account.getPassword());
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
    public List<Person> readFile(int role){
        List<Person> list = new ArrayList<Person>();

        try (FileReader read = new FileReader(this.filePath)){
            Scanner in = new Scanner(read);
            String[] strArr;
            String str;
            while (in.hasNextLine()){
                str = in.nextLine();
                strArr = str.split("!");
                switch (role){
                    case 1:
                        list.add(new Teacher(Integer.parseInt(strArr[0]),strArr[1], strArr[2],
                                Integer.parseInt(strArr[3]), strArr[4], strArr[5] , strArr[6], strArr[8]));
                        break;
                    case 2:
                    case 3:
                        break;
                }
            }
        }catch (IOException e){

        }
        return list;
    }
}

