import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String INFO = "info";
    private static final String ERROR = "err";
    private static final String WARNING = "war";
    private static final String NOT_TYPE = "not_type";
    String pathToFile;
    private final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private final LocalDateTime now = LocalDateTime.now();
    String date = now.format(format);
    private String msg;
    private String type;

    public Logger(String path, String fileName) {
        this.pathToFile = path + "\\" + fileName;
    }

    public void setMsg(String msg, String type) {
        if (type.equals(NOT_TYPE)) {
            System.out.println(this.date + " " + msg);
        } else {
            if (!type.equals(INFO) && !type.equals(ERROR) && !type.equals(WARNING)) {
                System.out.println("Указанный тип отсутствует!" + type);
                return;
            }
                this.msg = msg;
                this.type = type;
                System.out.println(this.date + " [" + this.type + "] " + this.msg);
//                System.out.printf("%s [%s] %s", this.date, this.type, this.msg);
            }

        }

    private void writeFile() {
        try (FileWriter writer = new FileWriter(this.pathToFile, true)) {
            writer.write(this.date + " ["+this.type+"] " + this.msg);
            writer.append("\n");
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
}
    }}