package ai.maum.m2u.cdk;

/* loaded from: classes.dex */
public class StreamingStatusDTO {
    private boolean isBreak;
    private boolean isEnd;
    private boolean isEvent;
    private String operationSyncId;
    private int size;
    private String streamId;
    private String type;

    public static class Streamingtype {
        public static String BYTES = "BYTES";
        public static String STRUCT = "STRUCT";
        public static String TEXT = "TEXT";
        public static String UNKNOWN = "UNKNOWN";
    }

    public StreamingStatusDTO() {
        this.isEvent = true;
        this.isBreak = false;
        this.isEnd = false;
        this.type = Streamingtype.BYTES;
        this.size = 0;
    }

    public String getOperationSyncId() {
        return this.operationSyncId;
    }

    public int getSize() {
        return this.size;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public String getType() {
        return this.type;
    }

    public boolean isBreak() {
        return this.isBreak;
    }

    public boolean isEnd() {
        return this.isEnd;
    }

    public boolean isEvent() {
        return this.isEvent;
    }

    public void setBreak(boolean z8) {
        this.isBreak = z8;
    }

    public void setEnd(boolean z8) {
        this.isEnd = z8;
    }

    public void setEvent(boolean z8) {
        this.isEvent = z8;
    }

    public void setOperationSyncId(String str) {
        this.operationSyncId = str;
    }

    public void setSize(int i8) {
        this.size = i8;
    }

    public void setStreamId(String str) {
        this.streamId = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public StreamingStatusDTO(String str, String str2, boolean z8, boolean z9, boolean z10, String str3, int i8) {
        this.isEvent = true;
        this.isBreak = false;
        this.isEnd = false;
        String str4 = Streamingtype.UNKNOWN;
        this.streamId = str;
        this.operationSyncId = str2;
        this.isEvent = z8;
        this.isBreak = z9;
        this.isEnd = z10;
        this.type = str3;
        this.size = i8;
    }
}
