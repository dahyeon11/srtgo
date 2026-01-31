package m1;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5905c {
    public static <T> AbstractC5905c ofData(int i8, T t8) {
        return new C5903a(Integer.valueOf(i8), t8, d.DEFAULT);
    }

    public static <T> AbstractC5905c ofTelemetry(int i8, T t8) {
        return new C5903a(Integer.valueOf(i8), t8, d.VERY_LOW);
    }

    public static <T> AbstractC5905c ofUrgent(int i8, T t8) {
        return new C5903a(Integer.valueOf(i8), t8, d.HIGHEST);
    }

    public abstract Integer getCode();

    public abstract Object getPayload();

    public abstract d getPriority();

    public static <T> AbstractC5905c ofData(T t8) {
        return new C5903a(null, t8, d.DEFAULT);
    }

    public static <T> AbstractC5905c ofTelemetry(T t8) {
        return new C5903a(null, t8, d.VERY_LOW);
    }

    public static <T> AbstractC5905c ofUrgent(T t8) {
        return new C5903a(null, t8, d.HIGHEST);
    }
}
