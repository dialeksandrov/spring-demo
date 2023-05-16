package kg.megalab.springdemo.model.cats;

import lombok.Data;

@Data
public class Status {
    public boolean verified;
    public String feedback;
    public int sentCount;
}
