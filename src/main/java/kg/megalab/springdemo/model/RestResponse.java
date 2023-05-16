package kg.megalab.springdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestResponse<T> {

    private Status status;

    private String message;

    private T data;

    public RestResponse success(T data, String message) {
        RestResponse response = new RestResponse();
        response.setStatus(Status.SUCCESS);
        response.setData(data);
        response.setMessage(message);
        return response;
    }

    public RestResponse success(T data) {
        RestResponse response = new RestResponse();
        response.setStatus(Status.SUCCESS);
        response.setData(data);
        return response;
    }

    public RestResponse error(String message) {
        RestResponse response = new RestResponse();
        response.setStatus(Status.ERROR);
        response.setMessage(message);
        return response;
    }


    enum Status {
        SUCCESS, ERROR, FAIL
    }
}
