package F6;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public interface a {
    public static final a NONE = new C0030a();

    void clear();

    void clearKeyUri(String str);

    Bitmap get(String str);

    int maxSize();

    void set(String str, Bitmap bitmap);

    int size();

    /* renamed from: F6.a$a, reason: collision with other inner class name */
    static class C0030a implements a {
        C0030a() {
        }

        @Override // F6.a
        public Bitmap get(String str) {
            return null;
        }

        @Override // F6.a
        public int maxSize() {
            return 0;
        }

        @Override // F6.a
        public int size() {
            return 0;
        }

        @Override // F6.a
        public void clear() {
        }

        @Override // F6.a
        public void clearKeyUri(String str) {
        }

        @Override // F6.a
        public void set(String str, Bitmap bitmap) {
        }
    }
}
