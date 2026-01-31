package A6;

/* loaded from: classes.dex */
public enum c {
    None(0),
    CHK_ENTER(5002),
    ALIVE_NOTICE(5003),
    SET_COMPLETE(5004),
    GET_TID_CHK_ENTER(5101),
    INIT(5105),
    STOP(5106);


    /* renamed from: a, reason: collision with root package name */
    private int f80a;

    c(int i8) {
        this.f80a = i8;
    }

    public static c toEnum(int i8) {
        c[] cVarArrValues = values();
        for (int i9 = 0; i9 < cVarArrValues.length; i9++) {
            if (cVarArrValues[i9].value() == i8) {
                return cVarArrValues[i9];
            }
        }
        return None;
    }

    public int value() {
        return this.f80a;
    }

    public static c toEnum(String str) {
        try {
            return toEnum(Integer.parseInt(str));
        } catch (Exception unused) {
            return None;
        }
    }
}
