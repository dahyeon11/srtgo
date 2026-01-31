package s3;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC6215c {

    /* renamed from: s3.c$a */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f36162a;

        a(int i8) {
            this.f36162a = i8;
        }

        public int getCode() {
            return this.f36162a;
        }
    }

    a getHeartBeatCode(String str);
}
