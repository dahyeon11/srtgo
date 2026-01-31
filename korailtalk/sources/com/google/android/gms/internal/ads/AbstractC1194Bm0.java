package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.google.android.gms.internal.ads.Bm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1194Bm0 {
    public static String zza(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            if (xmlPullParser.getAttributeName(i8).equals(str)) {
                return xmlPullParser.getAttributeValue(i8);
            }
        }
        return null;
    }

    public static boolean zzb(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean zzc(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }
}
