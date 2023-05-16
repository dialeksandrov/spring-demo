package kg.megalab.springdemo.model.cats;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Cats {
    public Status status;
    public String _id;
    public String user;
    public String text;
    public int __v;
    public String source;
    public LocalDateTime updatedAt;
    public String type;
    public LocalDateTime createdAt;
    public boolean deleted;
    public boolean used;
}
