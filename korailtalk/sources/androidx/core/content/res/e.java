package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.google.firebase.iid.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class e {
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;

    static class a {
        static int a(TypedArray typedArray, int i8) {
            return typedArray.getType(i8);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f8941a;

        public c(d[] dVarArr) {
            this.f8941a = dVarArr;
        }

        public d[] getEntries() {
            return this.f8941a;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f8942a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8943b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f8944c;

        /* renamed from: d, reason: collision with root package name */
        private final String f8945d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8946e;

        /* renamed from: f, reason: collision with root package name */
        private final int f8947f;

        public d(String str, int i8, boolean z8, String str2, int i9, int i10) {
            this.f8942a = str;
            this.f8943b = i8;
            this.f8944c = z8;
            this.f8945d = str2;
            this.f8946e = i9;
            this.f8947f = i10;
        }

        public String getFileName() {
            return this.f8942a;
        }

        public int getResourceId() {
            return this.f8947f;
        }

        public int getTtcIndex() {
            return this.f8946e;
        }

        public String getVariationSettings() {
            return this.f8945d;
        }

        public int getWeight() {
            return this.f8943b;
        }

        public boolean isItalic() {
            return this.f8944c;
        }
    }

    private static int a(TypedArray typedArray, int i8) {
        return a.a(typedArray, i8);
    }

    private static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return c(xmlPullParser, resources);
        }
        e(xmlPullParser);
        return null;
    }

    private static b c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), U.h.FontFamily);
        String string = typedArrayObtainAttributes.getString(U.h.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(U.h.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(U.h.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(U.h.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(U.h.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(U.h.FontFamily_fontProviderFetchTimeout, w.ERROR_UNKNOWN);
        String string4 = typedArrayObtainAttributes.getString(U.h.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                e(xmlPullParser);
            }
            return new C0134e(new Y.e(string, string2, string3, readCerts(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(d(xmlPullParser, resources));
                } else {
                    e(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), U.h.FontFamilyFont);
        int i8 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(U.h.FontFamilyFont_fontWeight) ? U.h.FontFamilyFont_fontWeight : U.h.FontFamilyFont_android_fontWeight, 400);
        boolean z8 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(U.h.FontFamilyFont_fontStyle) ? U.h.FontFamilyFont_fontStyle : U.h.FontFamilyFont_android_fontStyle, 0);
        int i9 = typedArrayObtainAttributes.hasValue(U.h.FontFamilyFont_ttcIndex) ? U.h.FontFamilyFont_ttcIndex : U.h.FontFamilyFont_android_ttcIndex;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(U.h.FontFamilyFont_fontVariationSettings) ? U.h.FontFamilyFont_fontVariationSettings : U.h.FontFamilyFont_android_fontVariationSettings);
        int i10 = typedArrayObtainAttributes.getInt(i9, 0);
        int i11 = typedArrayObtainAttributes.hasValue(U.h.FontFamilyFont_font) ? U.h.FontFamilyFont_font : U.h.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i11, 0);
        String string2 = typedArrayObtainAttributes.getString(i11);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            e(xmlPullParser);
        }
        return new d(string2, i8, z8, string, i10, resourceId);
    }

    private static void e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i8 = 1;
        while (i8 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i8++;
            } else if (next == 3) {
                i8--;
            }
        }
    }

    private static List f(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static b parse(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> readCerts(Resources resources, int i8) throws Resources.NotFoundException {
        if (i8 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i8);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i9 = 0; i9 < typedArrayObtainTypedArray.length(); i9++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i9, 0);
                    if (resourceId != 0) {
                        arrayList.add(f(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(f(resources.getStringArray(i8)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* renamed from: androidx.core.content.res.e$e, reason: collision with other inner class name */
    public static final class C0134e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final Y.e f8948a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8949b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8950c;

        /* renamed from: d, reason: collision with root package name */
        private final String f8951d;

        public C0134e(Y.e eVar, int i8, int i9, String str) {
            this.f8948a = eVar;
            this.f8950c = i8;
            this.f8949b = i9;
            this.f8951d = str;
        }

        public int getFetchStrategy() {
            return this.f8950c;
        }

        public Y.e getRequest() {
            return this.f8948a;
        }

        public String getSystemFontFamilyName() {
            return this.f8951d;
        }

        public int getTimeout() {
            return this.f8949b;
        }

        public C0134e(Y.e eVar, int i8, int i9) {
            this(eVar, i8, i9, null);
        }
    }
}
