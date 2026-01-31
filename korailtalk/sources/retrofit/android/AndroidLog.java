package retrofit.android;

import retrofit.RestAdapter;

/* loaded from: classes3.dex */
public class AndroidLog implements RestAdapter.Log {
    private static final int LOG_CHUNK_SIZE = 4000;
    private final String tag;

    public AndroidLog(String str) {
        this.tag = str;
    }

    public String getTag() {
        return this.tag;
    }

    @Override // retrofit.RestAdapter.Log
    public final void log(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + LOG_CHUNK_SIZE;
            logChunk(str.substring(i8, Math.min(length, i9)));
            i8 = i9;
        }
    }

    public void logChunk(String str) {
        getTag();
    }
}
