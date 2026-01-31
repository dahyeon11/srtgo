package z;

import android.content.Context;

/* loaded from: classes.dex */
public interface O0 {
    public static final O0 EMPTY_INSTANCE = new a();

    class a implements O0 {
        a() {
        }

        @Override // z.O0
        public InterfaceC6565N getConfig(b bVar) {
            return null;
        }
    }

    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    public interface c {
        O0 newInstance(Context context);
    }

    InterfaceC6565N getConfig(b bVar);
}
