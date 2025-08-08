package enums;

public enum Status {
    Success(200),
    Error(500),
    NOT_FOUND(404);

    private final int code;

    Status(int code) {
        this.code=code;
    }

    public int getCode(){
        return code;
    }
}
