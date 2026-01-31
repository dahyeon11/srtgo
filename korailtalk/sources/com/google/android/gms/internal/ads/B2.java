package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
abstract class B2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f12232a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f12233b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f12234c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static AbstractC2394bl0 a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (AbstractC1194Bm0.zzc(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZza = AbstractC1194Bm0.zza(xmlPullParser, strConcat2);
                String strZza2 = AbstractC1194Bm0.zza(xmlPullParser, strConcat3);
                String strZza3 = AbstractC1194Bm0.zza(xmlPullParser, strConcat4);
                String strZza4 = AbstractC1194Bm0.zza(xmlPullParser, strConcat5);
                if (strZza == null || strZza2 == null) {
                    return AbstractC2394bl0.zzm();
                }
                c2091Xk0.zzf(new C4710w2(strZza, strZza2, strZza3 != null ? Long.parseLong(strZza3) : 0L, strZza4 != null ? Long.parseLong(strZza4) : 0L));
            }
        } while (!AbstractC1194Bm0.zzb(xmlPullParser, str.concat(":Directory")));
        return c2091Xk0.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C4824x2 zza(java.lang.String r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.B2.zza(java.lang.String):com.google.android.gms.internal.ads.x2");
    }
}
