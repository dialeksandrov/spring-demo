package kg.megalab.springdemo.model.post;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megalab.springdemo.dal.entity.PostEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private Long id;
    private String title;
    private String text;
    private Long userId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:MM:ss")
    private LocalDateTime createdDt;

    public PostDto(PostEntity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.text = entity.getText();
        this.userId = entity.getUserId();
        this.createdDt = entity.getCreatedDt();
    }
}
