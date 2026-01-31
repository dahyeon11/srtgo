package H1;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import y1.C6528i;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    private final C6528i[] f1712a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1713b;

    public l2(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, y1.w.AdsAttrs);
        String string = typedArrayObtainAttributes.getString(y1.w.AdsAttrs_adSize);
        String string2 = typedArrayObtainAttributes.getString(y1.w.AdsAttrs_adSizes);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.f1712a = a(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f1712a = a(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(y1.w.AdsAttrs_adUnitId);
        this.f1713b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static C6528i[] a(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        C6528i[] c6528iArr = new C6528i[length];
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            String strTrim = strArrSplit[i8].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    c6528iArr[i8] = new C6528i("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                c6528iArr[i8] = C6528i.BANNER;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                c6528iArr[i8] = C6528i.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(strTrim)) {
                c6528iArr[i8] = C6528i.FULL_BANNER;
            } else if ("LEADERBOARD".equals(strTrim)) {
                c6528iArr[i8] = C6528i.LEADERBOARD;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                c6528iArr[i8] = C6528i.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(strTrim)) {
                c6528iArr[i8] = C6528i.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                c6528iArr[i8] = C6528i.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(strTrim)) {
                c6528iArr[i8] = C6528i.FLUID;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                c6528iArr[i8] = C6528i.zza;
            }
        }
        if (length != 0) {
            return c6528iArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String zza() {
        return this.f1713b;
    }

    public final C6528i[] zzb(boolean z8) {
        if (z8 || this.f1712a.length == 1) {
            return this.f1712a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
