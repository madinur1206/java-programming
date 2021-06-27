package Practice.socialmediatsak;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PostClass {
   private String body;
     final String dateTime ;

    public String getBody() {
        return body;
    }

    public PostClass(String body) {
        this.body ="my story";
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("06,23, 2021 | 12:11 AM"));
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
