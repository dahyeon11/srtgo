package k1;

import android.graphics.Bitmap;
import android.graphics.RectF;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5843a {
    void close();

    void enableStatLogging(boolean z8);

    float getObjThresh();

    String getStatString();

    List<C0337a> recognizeImage(Bitmap bitmap);

    void setNumThreads(int i8);

    void setObjThresh(float f8);

    void setUseNNAPI(boolean z8);

    /* renamed from: k1.a$a, reason: collision with other inner class name */
    public static final class C0337a {

        /* renamed from: a, reason: collision with root package name */
        private final String f33534a;

        /* renamed from: b, reason: collision with root package name */
        private final String f33535b;

        /* renamed from: c, reason: collision with root package name */
        private final Float f33536c;

        /* renamed from: d, reason: collision with root package name */
        private RectF f33537d;

        /* renamed from: e, reason: collision with root package name */
        private int f33538e;

        public C0337a(String str, String str2, Float f8, RectF rectF) {
            this.f33534a = str;
            this.f33535b = str2;
            this.f33536c = f8;
            this.f33537d = rectF;
        }

        public final Float getConfidence() {
            return this.f33536c;
        }

        public final Float getConfidence1() {
            return this.f33536c;
        }

        public final int getDetectedClass() {
            return this.f33538e;
        }

        public final int getDetectedClass1() {
            return this.f33538e;
        }

        public final String getId() {
            return this.f33534a;
        }

        public final String getId1() {
            return this.f33534a;
        }

        public final RectF getLocation() {
            return new RectF(this.f33537d);
        }

        public final String getTitle() {
            return this.f33535b;
        }

        public final String getTitle1() {
            return this.f33535b;
        }

        public final void setDetectedClass(int i8) {
            this.f33538e = i8;
        }

        public final void setLocation(RectF rectF) {
            this.f33537d = rectF;
        }

        public String toString() {
            String strStringPlus = "";
            if (this.f33534a != null) {
                strStringPlus = "[" + ((Object) this.f33534a) + "] ";
            }
            if (this.f33535b != null) {
                strStringPlus = strStringPlus + ((Object) this.f33535b) + ' ';
            }
            Float f8 = this.f33536c;
            if (f8 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("(%.1f%%) ", Arrays.copyOf(new Object[]{Float.valueOf(f8.floatValue() * 100.0f)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                strStringPlus = Intrinsics.stringPlus(strStringPlus, str);
            }
            if (this.f33537d != null) {
                strStringPlus = strStringPlus + this.f33537d + ' ';
            }
            int length = strStringPlus.length() - 1;
            int i8 = 0;
            boolean z8 = false;
            while (i8 <= length) {
                boolean z9 = Intrinsics.compare((int) strStringPlus.charAt(!z8 ? i8 : length), 32) <= 0;
                if (z8) {
                    if (!z9) {
                        break;
                    }
                    length--;
                } else if (z9) {
                    i8++;
                } else {
                    z8 = true;
                }
            }
            return strStringPlus.subSequence(i8, length + 1).toString();
        }

        public C0337a(String str, String str2, Float f8, RectF rectF, int i8) {
            this.f33534a = str;
            this.f33535b = str2;
            this.f33536c = f8;
            this.f33537d = rectF;
            this.f33538e = i8;
        }
    }
}
