package commands;

public enum Commands {
    UPLOAD ((byte) 10),
    DOWNLOAD ((byte) 20),
    MKDIR ((byte) 30),
    TOUCH ((byte) 40),
    REMOVE ((byte) 50),
    GET((byte) 60),
    CD ((byte) 70);

    private final byte bt;

    Commands(byte bt) {
        this.bt = bt;
    }

    public static Commands getCommand(byte bt) {
        if (bt == UPLOAD.bt) {
            return UPLOAD;
        } else if (bt == DOWNLOAD.bt) {
            return DOWNLOAD;
        } else if (bt == MKDIR.bt) {
            return MKDIR;
        } else if (bt == TOUCH.bt) {
            return TOUCH;
        } else if (bt == REMOVE.bt) {
            return REMOVE;
        } else if (bt == GET.bt) {
            return GET;
        } else {
            return CD;
        }
    }

    public byte getBt() {
        return bt;
    }
}