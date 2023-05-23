package kg.megalab.springdemo.dal.entity;

import jakarta.persistence.*;
import kg.megalab.springdemo.model.post.PostDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class PostEntity {

    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator"
    )
    private Long id;

    private String title;

    private String text;

    @Column(name = "created_dt", nullable = false)
    private LocalDateTime createdDt;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    public PostEntity(PostDto dto) {
        this.title = dto.getTitle();
        this.text = dto.getText();
        this.userId = dto.getUserId();
        this.createdDt = LocalDateTime.now();
    }

}
