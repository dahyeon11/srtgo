package I7;

/* loaded from: classes3.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public final int httpCode;

    b(int i8) {
        this.httpCode = i8;
    }

    public static b fromHttp2(int i8) {
        for (b bVar : values()) {
            if (bVar.httpCode == i8) {
                return bVar;
            }
        }
        return null;
    }
}
