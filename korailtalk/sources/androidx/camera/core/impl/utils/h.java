package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.B0;
import e0.C5339a;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import maum.m2u.map.Map;
import z.EnumC6598p;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    static final String[] f7685c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d, reason: collision with root package name */
    private static final j[] f7686d;

    /* renamed from: e, reason: collision with root package name */
    private static final j[] f7687e;

    /* renamed from: f, reason: collision with root package name */
    private static final j[] f7688f;

    /* renamed from: g, reason: collision with root package name */
    static final j[] f7689g;

    /* renamed from: h, reason: collision with root package name */
    private static final j[] f7690h;

    /* renamed from: i, reason: collision with root package name */
    static final j[][] f7691i;

    /* renamed from: j, reason: collision with root package name */
    static final HashSet f7692j;

    /* renamed from: a, reason: collision with root package name */
    private final List f7693a;

    /* renamed from: b, reason: collision with root package name */
    private final ByteOrder f7694b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7695a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7696b;

        static {
            int[] iArr = new int[c.values().length];
            f7696b = iArr;
            try {
                iArr[c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7696b[c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC6598p.values().length];
            f7695a = iArr2;
            try {
                iArr2[EnumC6598p.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7695a[EnumC6598p.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7695a[EnumC6598p.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f7697c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f7698d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f7699e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f, reason: collision with root package name */
        static final List f7700f = Collections.list(new a());

        /* renamed from: a, reason: collision with root package name */
        final List f7701a = Collections.list(new C0119b());

        /* renamed from: b, reason: collision with root package name */
        private final ByteOrder f7702b;

        class a implements Enumeration {

            /* renamed from: a, reason: collision with root package name */
            int f7703a = 0;

            a() {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f7703a < h.f7691i.length;
            }

            @Override // java.util.Enumeration
            public HashMap<String, j> nextElement() {
                HashMap<String, j> map = new HashMap<>();
                for (j jVar : h.f7691i[this.f7703a]) {
                    map.put(jVar.name, jVar);
                }
                this.f7703a++;
                return map;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.h$b$b, reason: collision with other inner class name */
        class C0119b implements Enumeration {

            /* renamed from: a, reason: collision with root package name */
            int f7704a = 0;

            C0119b() {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f7704a < h.f7691i.length;
            }

            @Override // java.util.Enumeration
            public Map<String, g> nextElement() {
                this.f7704a++;
                return new HashMap();
            }
        }

        class c implements Enumeration {

            /* renamed from: a, reason: collision with root package name */
            final Enumeration f7706a;

            c() {
                this.f7706a = Collections.enumeration(b.this.f7701a);
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f7706a.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public Map<String, g> nextElement() {
                return new HashMap((Map) this.f7706a.nextElement());
            }
        }

        b(ByteOrder byteOrder) {
            this.f7702b = byteOrder;
        }

        private static Pair a(String str) throws NumberFormatException {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair pairA = a(strArrSplit[0]);
                if (((Integer) pairA.first).intValue() == 2) {
                    return pairA;
                }
                for (int i8 = 1; i8 < strArrSplit.length; i8++) {
                    Pair pairA2 = a(strArrSplit[i8]);
                    int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairA = new Pair(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairA;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j8 = Long.parseLong(str);
                        return (j8 < 0 || j8 > 65535) ? j8 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        Double.parseDouble(str);
                        return new Pair(12, -1);
                    }
                } catch (NumberFormatException unused2) {
                    return new Pair(2, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j9 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j10 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j9 >= 0 && j10 >= 0) {
                        if (j9 <= 2147483647L && j10 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }

        private void b(String str, String str2, List list) throws NumberFormatException {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            c(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void c(String str, String str2, List list) throws NumberFormatException {
            int i8;
            int i9;
            int i10;
            b bVar = this;
            String str3 = str;
            String strReplaceAll = str2;
            if ((C5339a.TAG_DATETIME.equals(str3) || C5339a.TAG_DATETIME_ORIGINAL.equals(str3) || C5339a.TAG_DATETIME_DIGITIZED.equals(str3)) && strReplaceAll != null) {
                boolean zFind = f7698d.matcher(strReplaceAll).find();
                boolean zFind2 = f7699e.matcher(strReplaceAll).find();
                if (str2.length() != 19 || (!zFind && !zFind2)) {
                    B0.w("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll(g5.e.STATE_NAME_NONE, ":");
                }
            }
            if (C5339a.TAG_ISO_SPEED_RATINGS.equals(str3)) {
                str3 = C5339a.TAG_PHOTOGRAPHIC_SENSITIVITY;
            }
            String str4 = str3;
            int i11 = 2;
            int i12 = 1;
            if (strReplaceAll != null && h.f7692j.contains(str4)) {
                if (str4.equals(C5339a.TAG_GPS_TIMESTAMP)) {
                    Matcher matcher = f7697c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        B0.w("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) Z.h.checkNotNull(matcher.group(1))) + "/1," + Integer.parseInt((String) Z.h.checkNotNull(matcher.group(2))) + "/1," + Integer.parseInt((String) Z.h.checkNotNull(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new k(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e8) {
                        B0.w("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e8);
                        return;
                    }
                }
            }
            int i13 = 0;
            int i14 = 0;
            while (i14 < h.f7691i.length) {
                j jVar = (j) ((HashMap) f7700f.get(i14)).get(str4);
                if (jVar == null) {
                    i8 = i14;
                    i9 = i12;
                } else {
                    if (strReplaceAll != null) {
                        Pair pairA = a(strReplaceAll);
                        if (jVar.primaryFormat == ((Integer) pairA.first).intValue() || jVar.primaryFormat == ((Integer) pairA.second).intValue()) {
                            i10 = jVar.primaryFormat;
                        } else {
                            int i15 = jVar.secondaryFormat;
                            if (i15 == -1 || !(i15 == ((Integer) pairA.first).intValue() || jVar.secondaryFormat == ((Integer) pairA.second).intValue())) {
                                i10 = jVar.primaryFormat;
                                if (i10 == i12 || i10 == 7 || i10 == i11) {
                                }
                            } else {
                                i10 = jVar.secondaryFormat;
                            }
                        }
                        String str5 = "/";
                        switch (i10) {
                            case 1:
                                i8 = i14;
                                i9 = i12;
                                ((Map) list.get(i8)).put(str4, g.createByte(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                i8 = i14;
                                i9 = i12;
                                ((Map) list.get(i8)).put(str4, g.createString(strReplaceAll));
                                break;
                            case 3:
                                i8 = i14;
                                i9 = i12;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i16 = 0; i16 < strArrSplit.length; i16++) {
                                    iArr[i16] = Integer.parseInt(strArrSplit[i16]);
                                }
                                ((Map) list.get(i8)).put(str4, g.createUShort(iArr, bVar.f7702b));
                                break;
                            case 4:
                                i8 = i14;
                                i9 = i12;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i17 = 0; i17 < strArrSplit2.length; i17++) {
                                    jArr[i17] = Long.parseLong(strArrSplit2[i17]);
                                }
                                ((Map) list.get(i8)).put(str4, g.createULong(jArr, bVar.f7702b));
                                break;
                            case 5:
                                String str6 = "/";
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                k[] kVarArr = new k[strArrSplit3.length];
                                int i18 = i13;
                                while (i18 < strArrSplit3.length) {
                                    String str7 = str6;
                                    String[] strArrSplit4 = strArrSplit3[i18].split(str7, -1);
                                    kVarArr[i18] = new k((long) Double.parseDouble(strArrSplit4[i13]), (long) Double.parseDouble(strArrSplit4[1]));
                                    i18++;
                                    str6 = str7;
                                    i14 = i14;
                                    i13 = 0;
                                }
                                i8 = i14;
                                i9 = 1;
                                ((Map) list.get(i8)).put(str4, g.createURational(kVarArr, bVar.f7702b));
                                break;
                            case 9:
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i19 = i13; i19 < strArrSplit5.length; i19++) {
                                    iArr2[i19] = Integer.parseInt(strArrSplit5[i19]);
                                }
                                ((Map) list.get(i14)).put(str4, g.createSLong(iArr2, bVar.f7702b));
                                i8 = i14;
                                i9 = 1;
                                break;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                k[] kVarArr2 = new k[strArrSplit6.length];
                                int i20 = i13;
                                while (i20 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i20].split(str5, -1);
                                    kVarArr2[i20] = new k((long) Double.parseDouble(strArrSplit7[i13]), (long) Double.parseDouble(strArrSplit7[i12]));
                                    i20++;
                                    str5 = str5;
                                    i12 = 1;
                                }
                                bVar = this;
                                ((Map) list.get(i14)).put(str4, g.createSRational(kVarArr2, bVar.f7702b));
                                i8 = i14;
                                i9 = 1;
                                break;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i21 = i13; i21 < strArrSplit8.length; i21++) {
                                    dArr[i21] = Double.parseDouble(strArrSplit8[i21]);
                                }
                                ((Map) list.get(i14)).put(str4, g.createDouble(dArr, bVar.f7702b));
                                break;
                        }
                    } else {
                        ((Map) list.get(i14)).remove(str4);
                    }
                    i8 = i14;
                    i9 = i12;
                }
                i14 = i8 + 1;
                i12 = i9;
                i11 = 2;
                i13 = 0;
            }
        }

        public h build() throws NumberFormatException {
            ArrayList list = Collections.list(new c());
            if (!((Map) list.get(1)).isEmpty()) {
                b(C5339a.TAG_EXPOSURE_PROGRAM, String.valueOf(0), list);
                b(C5339a.TAG_EXIF_VERSION, "0230", list);
                b(C5339a.TAG_COMPONENTS_CONFIGURATION, "1,2,3,0", list);
                b(C5339a.TAG_METERING_MODE, String.valueOf(0), list);
                b(C5339a.TAG_LIGHT_SOURCE, String.valueOf(0), list);
                b(C5339a.TAG_FLASHPIX_VERSION, "0100", list);
                b(C5339a.TAG_FOCAL_PLANE_RESOLUTION_UNIT, String.valueOf(2), list);
                b(C5339a.TAG_FILE_SOURCE, String.valueOf(3), list);
                b(C5339a.TAG_SCENE_TYPE, String.valueOf(1), list);
                b(C5339a.TAG_CUSTOM_RENDERED, String.valueOf(0), list);
                b(C5339a.TAG_SCENE_CAPTURE_TYPE, String.valueOf(0), list);
                b(C5339a.TAG_CONTRAST, String.valueOf(0), list);
                b(C5339a.TAG_SATURATION, String.valueOf(0), list);
                b(C5339a.TAG_SHARPNESS, String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                b(C5339a.TAG_GPS_VERSION_ID, "2300", list);
                b(C5339a.TAG_GPS_SPEED_REF, "K", list);
                b(C5339a.TAG_GPS_TRACK_REF, "T", list);
                b(C5339a.TAG_GPS_IMG_DIRECTION_REF, "T", list);
                b(C5339a.TAG_GPS_DEST_BEARING_REF, "T", list);
                b(C5339a.TAG_GPS_DEST_DISTANCE_REF, "K", list);
            }
            return new h(this.f7702b, list);
        }

        public b removeAttribute(String str) throws NumberFormatException {
            c(str, null, this.f7701a);
            return this;
        }

        public b setAttribute(String str, String str2) throws NumberFormatException {
            c(str, str2, this.f7701a);
            return this;
        }

        public b setExposureTimeNanos(long j8) {
            return setAttribute(C5339a.TAG_EXPOSURE_TIME, String.valueOf(j8 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b setFlashState(EnumC6598p enumC6598p) {
            int i8;
            if (enumC6598p == EnumC6598p.UNKNOWN) {
                return this;
            }
            int i9 = a.f7695a[enumC6598p.ordinal()];
            if (i9 == 1) {
                i8 = 0;
            } else if (i9 == 2) {
                i8 = 32;
            } else {
                if (i9 != 3) {
                    B0.w("ExifData", "Unknown flash state: " + enumC6598p);
                    return this;
                }
                i8 = 1;
            }
            if ((i8 & 1) == 1) {
                setAttribute(C5339a.TAG_LIGHT_SOURCE, String.valueOf(4));
            }
            return setAttribute(C5339a.TAG_FLASH, String.valueOf(i8));
        }

        public b setFocalLength(float f8) {
            return setAttribute(C5339a.TAG_FOCAL_LENGTH, new k((long) (f8 * 1000.0f), 1000L).toString());
        }

        public b setImageHeight(int i8) {
            return setAttribute(C5339a.TAG_IMAGE_LENGTH, String.valueOf(i8));
        }

        public b setImageWidth(int i8) {
            return setAttribute(C5339a.TAG_IMAGE_WIDTH, String.valueOf(i8));
        }

        public b setIso(int i8) {
            return setAttribute(C5339a.TAG_SENSITIVITY_TYPE, String.valueOf(3)).setAttribute(C5339a.TAG_PHOTOGRAPHIC_SENSITIVITY, String.valueOf(Math.min(65535, i8)));
        }

        public b setLensFNumber(float f8) {
            return setAttribute(C5339a.TAG_F_NUMBER, String.valueOf(f8));
        }

        public b setOrientationDegrees(int i8) {
            int i9;
            if (i8 == 0) {
                i9 = 1;
            } else if (i8 == 90) {
                i9 = 6;
            } else if (i8 == 180) {
                i9 = 3;
            } else if (i8 != 270) {
                B0.w("ExifData", "Unexpected orientation value: " + i8 + ". Must be one of 0, 90, 180, 270.");
                i9 = 0;
            } else {
                i9 = 8;
            }
            return setAttribute(C5339a.TAG_ORIENTATION, String.valueOf(i9));
        }

        public b setWhiteBalanceMode(c cVar) {
            int i8 = a.f7696b[cVar.ordinal()];
            return setAttribute(C5339a.TAG_WHITE_BALANCE, i8 != 1 ? i8 != 2 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static {
        j[] jVarArr = {new j(C5339a.TAG_IMAGE_WIDTH, 256, 3, 4), new j(C5339a.TAG_IMAGE_LENGTH, R.k.OPTIMIZATION_STANDARD, 3, 4), new j(C5339a.TAG_MAKE, 271, 2), new j(C5339a.TAG_MODEL, 272, 2), new j(C5339a.TAG_ORIENTATION, 274, 3), new j(C5339a.TAG_X_RESOLUTION, 282, 5), new j(C5339a.TAG_Y_RESOLUTION, 283, 5), new j(C5339a.TAG_RESOLUTION_UNIT, 296, 3), new j(C5339a.TAG_SOFTWARE, Map.MapException.StatusCode.AUTH_CHECK_AUTH_FAILED_VALUE, 2), new j(C5339a.TAG_DATETIME, 306, 2), new j(C5339a.TAG_Y_CB_CR_POSITIONING, 531, 3), new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4)};
        f7686d = jVarArr;
        j[] jVarArr2 = {new j(C5339a.TAG_EXPOSURE_TIME, 33434, 5), new j(C5339a.TAG_F_NUMBER, 33437, 5), new j(C5339a.TAG_EXPOSURE_PROGRAM, 34850, 3), new j(C5339a.TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new j(C5339a.TAG_SENSITIVITY_TYPE, 34864, 3), new j(C5339a.TAG_EXIF_VERSION, 36864, 2), new j(C5339a.TAG_DATETIME_ORIGINAL, 36867, 2), new j(C5339a.TAG_DATETIME_DIGITIZED, 36868, 2), new j(C5339a.TAG_COMPONENTS_CONFIGURATION, 37121, 7), new j(C5339a.TAG_SHUTTER_SPEED_VALUE, 37377, 10), new j(C5339a.TAG_APERTURE_VALUE, 37378, 5), new j(C5339a.TAG_BRIGHTNESS_VALUE, 37379, 10), new j(C5339a.TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new j(C5339a.TAG_MAX_APERTURE_VALUE, 37381, 5), new j(C5339a.TAG_METERING_MODE, 37383, 3), new j(C5339a.TAG_LIGHT_SOURCE, 37384, 3), new j(C5339a.TAG_FLASH, 37385, 3), new j(C5339a.TAG_FOCAL_LENGTH, 37386, 5), new j(C5339a.TAG_SUBSEC_TIME, 37520, 2), new j(C5339a.TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new j(C5339a.TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new j(C5339a.TAG_FLASHPIX_VERSION, 40960, 7), new j(C5339a.TAG_COLOR_SPACE, 40961, 3), new j(C5339a.TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new j(C5339a.TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new j("InteroperabilityIFDPointer", 40965, 4), new j(C5339a.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new j(C5339a.TAG_SENSING_METHOD, 41495, 3), new j(C5339a.TAG_FILE_SOURCE, 41728, 7), new j(C5339a.TAG_SCENE_TYPE, 41729, 7), new j(C5339a.TAG_CUSTOM_RENDERED, 41985, 3), new j(C5339a.TAG_EXPOSURE_MODE, 41986, 3), new j(C5339a.TAG_WHITE_BALANCE, 41987, 3), new j(C5339a.TAG_SCENE_CAPTURE_TYPE, 41990, 3), new j(C5339a.TAG_CONTRAST, 41992, 3), new j(C5339a.TAG_SATURATION, 41993, 3), new j(C5339a.TAG_SHARPNESS, 41994, 3)};
        f7687e = jVarArr2;
        j[] jVarArr3 = {new j(C5339a.TAG_GPS_VERSION_ID, 0, 1), new j(C5339a.TAG_GPS_LATITUDE_REF, 1, 2), new j(C5339a.TAG_GPS_LATITUDE, 2, 5, 10), new j(C5339a.TAG_GPS_LONGITUDE_REF, 3, 2), new j(C5339a.TAG_GPS_LONGITUDE, 4, 5, 10), new j(C5339a.TAG_GPS_ALTITUDE_REF, 5, 1), new j(C5339a.TAG_GPS_ALTITUDE, 6, 5), new j(C5339a.TAG_GPS_TIMESTAMP, 7, 5), new j(C5339a.TAG_GPS_SPEED_REF, 12, 2), new j(C5339a.TAG_GPS_TRACK_REF, 14, 2), new j(C5339a.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new j(C5339a.TAG_GPS_DEST_BEARING_REF, 23, 2), new j(C5339a.TAG_GPS_DEST_DISTANCE_REF, 25, 2)};
        f7688f = jVarArr3;
        f7689g = new j[]{new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4), new j("InteroperabilityIFDPointer", 40965, 4)};
        j[] jVarArr4 = {new j(C5339a.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        f7690h = jVarArr4;
        f7691i = new j[][]{jVarArr, jVarArr2, jVarArr3, jVarArr4};
        f7692j = new HashSet(Arrays.asList(C5339a.TAG_F_NUMBER, C5339a.TAG_EXPOSURE_TIME, C5339a.TAG_GPS_TIMESTAMP));
    }

    h(ByteOrder byteOrder, List list) {
        Z.h.checkState(list.size() == f7691i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f7694b = byteOrder;
        this.f7693a = list;
    }

    private g b(String str) {
        if (C5339a.TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = C5339a.TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i8 = 0; i8 < f7691i.length; i8++) {
            g gVar = (g) ((java.util.Map) this.f7693a.get(i8)).get(str);
            if (gVar != null) {
                return gVar;
            }
        }
        return null;
    }

    public static b builderForDevice() {
        return new b(ByteOrder.BIG_ENDIAN).setAttribute(C5339a.TAG_ORIENTATION, String.valueOf(1)).setAttribute(C5339a.TAG_X_RESOLUTION, "72/1").setAttribute(C5339a.TAG_Y_RESOLUTION, "72/1").setAttribute(C5339a.TAG_RESOLUTION_UNIT, String.valueOf(2)).setAttribute(C5339a.TAG_Y_CB_CR_POSITIONING, String.valueOf(1)).setAttribute(C5339a.TAG_MAKE, Build.MANUFACTURER).setAttribute(C5339a.TAG_MODEL, Build.MODEL);
    }

    java.util.Map a(int i8) {
        Z.h.checkArgumentInRange(i8, 0, f7691i.length, "Invalid IFD index: " + i8 + ". Index should be between [0, EXIF_TAGS.length] ");
        return (java.util.Map) this.f7693a.get(i8);
    }

    public String getAttribute(String str) {
        g gVarB = b(str);
        if (gVarB != null) {
            if (!f7692j.contains(str)) {
                return gVarB.getStringValue(this.f7694b);
            }
            if (str.equals(C5339a.TAG_GPS_TIMESTAMP)) {
                int i8 = gVarB.format;
                if (i8 != 5 && i8 != 10) {
                    B0.w("ExifData", "GPS Timestamp format is not rational. format=" + gVarB.format);
                    return null;
                }
                k[] kVarArr = (k[]) gVarB.a(this.f7694b);
                if (kVarArr != null && kVarArr.length == 3) {
                    return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf((int) (kVarArr[0].b() / kVarArr[0].a())), Integer.valueOf((int) (kVarArr[1].b() / kVarArr[1].a())), Integer.valueOf((int) (kVarArr[2].b() / kVarArr[2].a())));
                }
                B0.w("ExifData", "Invalid GPS Timestamp array. array=" + Arrays.toString(kVarArr));
                return null;
            }
            try {
                return Double.toString(gVarB.getDoubleValue(this.f7694b));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public ByteOrder getByteOrder() {
        return this.f7694b;
    }
}
