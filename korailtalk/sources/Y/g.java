package Y;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.h;
import androidx.core.graphics.d;
import androidx.core.graphics.k;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class g {

    @Deprecated
    public static final String PARCEL_FONT_RESULTS = "font_results";

    public static class a {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;

        /* renamed from: a, reason: collision with root package name */
        private final int f5545a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f5546b;

        @Deprecated
        public a(int i8, b[] bVarArr) {
            this.f5545a = i8;
            this.f5546b = bVarArr;
        }

        static a a(int i8, b[] bVarArr) {
            return new a(i8, bVarArr);
        }

        public b[] getFonts() {
            return this.f5546b;
        }

        public int getStatusCode() {
            return this.f5545a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f5547a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5548b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5549c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f5550d;

        /* renamed from: e, reason: collision with root package name */
        private final int f5551e;

        @Deprecated
        public b(Uri uri, int i8, int i9, boolean z8, int i10) {
            this.f5547a = (Uri) Z.h.checkNotNull(uri);
            this.f5548b = i8;
            this.f5549c = i9;
            this.f5550d = z8;
            this.f5551e = i10;
        }

        static b a(Uri uri, int i8, int i9, boolean z8, int i10) {
            return new b(uri, i8, i9, z8, i10);
        }

        public int getResultCode() {
            return this.f5551e;
        }

        public int getTtcIndex() {
            return this.f5548b;
        }

        public Uri getUri() {
            return this.f5547a;
        }

        public int getWeight() {
            return this.f5549c;
        }

        public boolean isItalic() {
            return this.f5550d;
        }
    }

    public static Typeface buildTypeface(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return androidx.core.graphics.d.createFromFontInfo(context, cancellationSignal, bVarArr, 0);
    }

    public static a fetchFonts(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    @Deprecated
    public static Typeface getFontSync(Context context, e eVar, h.f fVar, Handler handler, boolean z8, int i8, int i9) {
        return requestFont(context, eVar, i9, z8, i8, h.f.getHandler(handler), new d.a(fVar));
    }

    @Deprecated
    public static ProviderInfo getProvider(PackageManager packageManager, e eVar, Resources resources) {
        return d.f(packageManager, eVar, resources);
    }

    @Deprecated
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, b[] bVarArr, CancellationSignal cancellationSignal) {
        return k.readFontInfoIntoByteBuffer(context, bVarArr, cancellationSignal);
    }

    public static void requestFont(Context context, e eVar, c cVar, Handler handler) {
        Y.a aVar = new Y.a(cVar);
        f.d(context.getApplicationContext(), eVar, 0, h.b(handler), aVar);
    }

    @Deprecated
    public static void resetCache() {
        f.f();
    }

    public static void resetTypefaceCache() {
        f.f();
    }

    public static Typeface requestFont(Context context, e eVar, int i8, boolean z8, int i9, Handler handler, c cVar) {
        Y.a aVar = new Y.a(cVar, handler);
        if (z8) {
            return f.e(context, eVar, aVar, i8, i9);
        }
        return f.d(context, eVar, i8, null, aVar);
    }

    public static class c {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @Deprecated
        public static final int RESULT_OK = 0;

        public void onTypefaceRequestFailed(int i8) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }
}
