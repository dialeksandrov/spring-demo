package kg.megalab.springdemo.model.cats;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CatResponse {
    public String id;
    public String user;
    public String text;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    public LocalDateTime updatedAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    public LocalDateTime createdAt;

    public CatResponse(Cats cats) {
        this.id = cats.get_id();
        this.user = cats.getUser();
        this.text = cats.getText();
        this.updatedAt = cats.getUpdatedAt();
        this.createdAt = cats.getCreatedAt();
    }
}
