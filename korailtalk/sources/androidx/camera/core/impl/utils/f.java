package androidx.camera.core.impl.utils;

import Q7.X;
import android.location.Location;
import androidx.camera.core.B0;
import androidx.camera.core.InterfaceC0902s0;
import e0.C5339a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {
    public static final long INVALID_TIMESTAMP = -1;

    /* renamed from: c, reason: collision with root package name */
    private static final String f7672c = "f";

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f7673d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f7674e = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f7675f = new c();

    /* renamed from: g, reason: collision with root package name */
    private static final List f7676g = getAllExifTags();

    /* renamed from: h, reason: collision with root package name */
    private static final List f7677h = Arrays.asList(C5339a.TAG_IMAGE_WIDTH, C5339a.TAG_IMAGE_LENGTH, C5339a.TAG_PIXEL_X_DIMENSION, C5339a.TAG_PIXEL_Y_DIMENSION, C5339a.TAG_COMPRESSION, C5339a.TAG_JPEG_INTERCHANGE_FORMAT, C5339a.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, C5339a.TAG_THUMBNAIL_IMAGE_LENGTH, C5339a.TAG_THUMBNAIL_IMAGE_WIDTH, C5339a.TAG_THUMBNAIL_ORIENTATION);

    /* renamed from: a, reason: collision with root package name */
    private final C5339a f7678a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7679b = false;

    class a extends ThreadLocal {
        a() {
        }

        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    class b extends ThreadLocal {
        b() {
        }

        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    class c extends ThreadLocal {
        c() {
        }

        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    private static final class d {

        static final class a {

            /* renamed from: a, reason: collision with root package name */
            final double f7680a;

            a(double d9) {
                this.f7680a = d9;
            }

            double a() {
                return this.f7680a / 2.23694d;
            }
        }

        static a a(double d9) {
            return new a(d9 * 0.621371d);
        }

        static a b(double d9) {
            return new a(d9 * 1.15078d);
        }

        static a c(double d9) {
            return new a(d9);
        }
    }

    private f(C5339a c5339a) {
        this.f7678a = c5339a;
    }

    private void a() throws NumberFormatException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = e(jCurrentTimeMillis);
        this.f7678a.setAttribute(C5339a.TAG_DATETIME, strE);
        try {
            this.f7678a.setAttribute(C5339a.TAG_SUBSEC_TIME, Long.toString(jCurrentTimeMillis - c(strE).getTime()));
        } catch (ParseException unused) {
        }
    }

    private static Date b(String str) {
        return ((SimpleDateFormat) f7673d.get()).parse(str);
    }

    private static Date c(String str) {
        return ((SimpleDateFormat) f7675f.get()).parse(str);
    }

    public static f createFromFile(File file) {
        return createFromFileString(file.toString());
    }

    public static f createFromFileString(String str) {
        return new f(new C5339a(str));
    }

    public static f createFromImageProxy(InterfaceC0902s0 interfaceC0902s0) {
        ByteBuffer buffer = interfaceC0902s0.getPlanes()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.get(bArr);
        return createFromInputStream(new ByteArrayInputStream(bArr));
    }

    public static f createFromInputStream(InputStream inputStream) {
        return new f(new C5339a(inputStream));
    }

    private static Date d(String str) {
        return ((SimpleDateFormat) f7674e.get()).parse(str);
    }

    private static String e(long j8) {
        return ((SimpleDateFormat) f7675f.get()).format(new Date(j8));
    }

    private long f(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return c(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long g(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return b(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return d(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return f(str + X.SPACE + str2);
    }

    public static List<String> getAllExifTags() {
        return Arrays.asList(C5339a.TAG_IMAGE_WIDTH, C5339a.TAG_IMAGE_LENGTH, C5339a.TAG_BITS_PER_SAMPLE, C5339a.TAG_COMPRESSION, C5339a.TAG_PHOTOMETRIC_INTERPRETATION, C5339a.TAG_ORIENTATION, C5339a.TAG_SAMPLES_PER_PIXEL, C5339a.TAG_PLANAR_CONFIGURATION, C5339a.TAG_Y_CB_CR_SUB_SAMPLING, C5339a.TAG_Y_CB_CR_POSITIONING, C5339a.TAG_X_RESOLUTION, C5339a.TAG_Y_RESOLUTION, C5339a.TAG_RESOLUTION_UNIT, C5339a.TAG_STRIP_OFFSETS, C5339a.TAG_ROWS_PER_STRIP, C5339a.TAG_STRIP_BYTE_COUNTS, C5339a.TAG_JPEG_INTERCHANGE_FORMAT, C5339a.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, C5339a.TAG_TRANSFER_FUNCTION, C5339a.TAG_WHITE_POINT, C5339a.TAG_PRIMARY_CHROMATICITIES, C5339a.TAG_Y_CB_CR_COEFFICIENTS, C5339a.TAG_REFERENCE_BLACK_WHITE, C5339a.TAG_DATETIME, C5339a.TAG_IMAGE_DESCRIPTION, C5339a.TAG_MAKE, C5339a.TAG_MODEL, C5339a.TAG_SOFTWARE, C5339a.TAG_ARTIST, C5339a.TAG_COPYRIGHT, C5339a.TAG_EXIF_VERSION, C5339a.TAG_FLASHPIX_VERSION, C5339a.TAG_COLOR_SPACE, C5339a.TAG_GAMMA, C5339a.TAG_PIXEL_X_DIMENSION, C5339a.TAG_PIXEL_Y_DIMENSION, C5339a.TAG_COMPONENTS_CONFIGURATION, C5339a.TAG_COMPRESSED_BITS_PER_PIXEL, C5339a.TAG_MAKER_NOTE, C5339a.TAG_USER_COMMENT, C5339a.TAG_RELATED_SOUND_FILE, C5339a.TAG_DATETIME_ORIGINAL, C5339a.TAG_DATETIME_DIGITIZED, C5339a.TAG_OFFSET_TIME, C5339a.TAG_OFFSET_TIME_ORIGINAL, C5339a.TAG_OFFSET_TIME_DIGITIZED, C5339a.TAG_SUBSEC_TIME, C5339a.TAG_SUBSEC_TIME_ORIGINAL, C5339a.TAG_SUBSEC_TIME_DIGITIZED, C5339a.TAG_EXPOSURE_TIME, C5339a.TAG_F_NUMBER, C5339a.TAG_EXPOSURE_PROGRAM, C5339a.TAG_SPECTRAL_SENSITIVITY, C5339a.TAG_PHOTOGRAPHIC_SENSITIVITY, C5339a.TAG_OECF, C5339a.TAG_SENSITIVITY_TYPE, C5339a.TAG_STANDARD_OUTPUT_SENSITIVITY, C5339a.TAG_RECOMMENDED_EXPOSURE_INDEX, C5339a.TAG_ISO_SPEED, C5339a.TAG_ISO_SPEED_LATITUDE_YYY, C5339a.TAG_ISO_SPEED_LATITUDE_ZZZ, C5339a.TAG_SHUTTER_SPEED_VALUE, C5339a.TAG_APERTURE_VALUE, C5339a.TAG_BRIGHTNESS_VALUE, C5339a.TAG_EXPOSURE_BIAS_VALUE, C5339a.TAG_MAX_APERTURE_VALUE, C5339a.TAG_SUBJECT_DISTANCE, C5339a.TAG_METERING_MODE, C5339a.TAG_LIGHT_SOURCE, C5339a.TAG_FLASH, C5339a.TAG_SUBJECT_AREA, C5339a.TAG_FOCAL_LENGTH, C5339a.TAG_FLASH_ENERGY, C5339a.TAG_SPATIAL_FREQUENCY_RESPONSE, C5339a.TAG_FOCAL_PLANE_X_RESOLUTION, C5339a.TAG_FOCAL_PLANE_Y_RESOLUTION, C5339a.TAG_FOCAL_PLANE_RESOLUTION_UNIT, C5339a.TAG_SUBJECT_LOCATION, C5339a.TAG_EXPOSURE_INDEX, C5339a.TAG_SENSING_METHOD, C5339a.TAG_FILE_SOURCE, C5339a.TAG_SCENE_TYPE, C5339a.TAG_CFA_PATTERN, C5339a.TAG_CUSTOM_RENDERED, C5339a.TAG_EXPOSURE_MODE, C5339a.TAG_WHITE_BALANCE, C5339a.TAG_DIGITAL_ZOOM_RATIO, C5339a.TAG_FOCAL_LENGTH_IN_35MM_FILM, C5339a.TAG_SCENE_CAPTURE_TYPE, C5339a.TAG_GAIN_CONTROL, C5339a.TAG_CONTRAST, C5339a.TAG_SATURATION, C5339a.TAG_SHARPNESS, C5339a.TAG_DEVICE_SETTING_DESCRIPTION, C5339a.TAG_SUBJECT_DISTANCE_RANGE, C5339a.TAG_IMAGE_UNIQUE_ID, "CameraOwnerName", C5339a.TAG_BODY_SERIAL_NUMBER, C5339a.TAG_LENS_SPECIFICATION, C5339a.TAG_LENS_MAKE, C5339a.TAG_LENS_MODEL, C5339a.TAG_LENS_SERIAL_NUMBER, C5339a.TAG_GPS_VERSION_ID, C5339a.TAG_GPS_LATITUDE_REF, C5339a.TAG_GPS_LATITUDE, C5339a.TAG_GPS_LONGITUDE_REF, C5339a.TAG_GPS_LONGITUDE, C5339a.TAG_GPS_ALTITUDE_REF, C5339a.TAG_GPS_ALTITUDE, C5339a.TAG_GPS_TIMESTAMP, C5339a.TAG_GPS_SATELLITES, C5339a.TAG_GPS_STATUS, C5339a.TAG_GPS_MEASURE_MODE, C5339a.TAG_GPS_DOP, C5339a.TAG_GPS_SPEED_REF, C5339a.TAG_GPS_SPEED, C5339a.TAG_GPS_TRACK_REF, C5339a.TAG_GPS_TRACK, C5339a.TAG_GPS_IMG_DIRECTION_REF, C5339a.TAG_GPS_IMG_DIRECTION, C5339a.TAG_GPS_MAP_DATUM, C5339a.TAG_GPS_DEST_LATITUDE_REF, C5339a.TAG_GPS_DEST_LATITUDE, C5339a.TAG_GPS_DEST_LONGITUDE_REF, C5339a.TAG_GPS_DEST_LONGITUDE, C5339a.TAG_GPS_DEST_BEARING_REF, C5339a.TAG_GPS_DEST_BEARING, C5339a.TAG_GPS_DEST_DISTANCE_REF, C5339a.TAG_GPS_DEST_DISTANCE, C5339a.TAG_GPS_PROCESSING_METHOD, C5339a.TAG_GPS_AREA_INFORMATION, C5339a.TAG_GPS_DATESTAMP, C5339a.TAG_GPS_DIFFERENTIAL, C5339a.TAG_GPS_H_POSITIONING_ERROR, C5339a.TAG_INTEROPERABILITY_INDEX, C5339a.TAG_THUMBNAIL_IMAGE_LENGTH, C5339a.TAG_THUMBNAIL_IMAGE_WIDTH, C5339a.TAG_THUMBNAIL_ORIENTATION, C5339a.TAG_DNG_VERSION, C5339a.TAG_DEFAULT_CROP_SIZE, C5339a.TAG_ORF_THUMBNAIL_IMAGE, C5339a.TAG_ORF_PREVIEW_IMAGE_START, C5339a.TAG_ORF_PREVIEW_IMAGE_LENGTH, C5339a.TAG_ORF_ASPECT_FRAME, C5339a.TAG_RW2_SENSOR_BOTTOM_BORDER, C5339a.TAG_RW2_SENSOR_LEFT_BORDER, C5339a.TAG_RW2_SENSOR_RIGHT_BORDER, C5339a.TAG_RW2_SENSOR_TOP_BORDER, C5339a.TAG_RW2_ISO, C5339a.TAG_RW2_JPG_FROM_RAW, C5339a.TAG_XMP, C5339a.TAG_NEW_SUBFILE_TYPE, C5339a.TAG_SUBFILE_TYPE);
    }

    public void attachLocation(Location location) throws NumberFormatException {
        this.f7678a.setGpsInfo(location);
    }

    public void attachTimestamp() throws NumberFormatException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = e(jCurrentTimeMillis);
        this.f7678a.setAttribute(C5339a.TAG_DATETIME_ORIGINAL, strE);
        this.f7678a.setAttribute(C5339a.TAG_DATETIME_DIGITIZED, strE);
        try {
            String string = Long.toString(jCurrentTimeMillis - c(strE).getTime());
            this.f7678a.setAttribute(C5339a.TAG_SUBSEC_TIME_ORIGINAL, string);
            this.f7678a.setAttribute(C5339a.TAG_SUBSEC_TIME_DIGITIZED, string);
        } catch (ParseException unused) {
        }
        this.f7679b = false;
    }

    public void copyToCroppedImage(f fVar) throws NumberFormatException {
        ArrayList<String> arrayList = new ArrayList(f7676g);
        arrayList.removeAll(f7677h);
        for (String str : arrayList) {
            String attribute = this.f7678a.getAttribute(str);
            if (attribute != null) {
                fVar.f7678a.setAttribute(str, attribute);
            }
        }
    }

    public void flipHorizontally() throws NumberFormatException {
        int i8;
        switch (getOrientation()) {
            case 2:
                i8 = 1;
                break;
            case 3:
                i8 = 4;
                break;
            case 4:
                i8 = 3;
                break;
            case 5:
                i8 = 6;
                break;
            case 6:
                i8 = 5;
                break;
            case 7:
                i8 = 8;
                break;
            case 8:
                i8 = 7;
                break;
            default:
                i8 = 2;
                break;
        }
        this.f7678a.setAttribute(C5339a.TAG_ORIENTATION, String.valueOf(i8));
    }

    public void flipVertically() throws NumberFormatException {
        int i8;
        switch (getOrientation()) {
            case 2:
                i8 = 3;
                break;
            case 3:
                i8 = 2;
                break;
            case 4:
                i8 = 1;
                break;
            case 5:
                i8 = 8;
                break;
            case 6:
                i8 = 7;
                break;
            case 7:
                i8 = 6;
                break;
            case 8:
                i8 = 5;
                break;
            default:
                i8 = 4;
                break;
        }
        this.f7678a.setAttribute(C5339a.TAG_ORIENTATION, String.valueOf(i8));
    }

    public String getDescription() {
        return this.f7678a.getAttribute(C5339a.TAG_IMAGE_DESCRIPTION);
    }

    public int getHeight() {
        return this.f7678a.getAttributeInt(C5339a.TAG_IMAGE_LENGTH, 0);
    }

    public long getLastModifiedTimestamp() throws NumberFormatException {
        long jF = f(this.f7678a.getAttribute(C5339a.TAG_DATETIME));
        if (jF == -1) {
            return -1L;
        }
        String attribute = this.f7678a.getAttribute(C5339a.TAG_SUBSEC_TIME);
        if (attribute == null) {
            return jF;
        }
        try {
            long j8 = Long.parseLong(attribute);
            while (j8 > 1000) {
                j8 /= 10;
            }
            return jF + j8;
        } catch (NumberFormatException unused) {
            return jF;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.location.Location getLocation() {
        /*
            r16 = this;
            r0 = r16
            e0.a r1 = r0.f7678a
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.getAttribute(r2)
            e0.a r2 = r0.f7678a
            double[] r2 = r2.getLatLong()
            e0.a r3 = r0.f7678a
            r4 = 0
            double r6 = r3.getAltitude(r4)
            e0.a r3 = r0.f7678a
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.getAttributeDouble(r8, r4)
            e0.a r3 = r0.f7678a
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.getAttribute(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L2d
            r3 = r10
        L2d:
            e0.a r11 = r0.f7678a
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.getAttribute(r12)
            e0.a r12 = r0.f7678a
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.getAttribute(r13)
            long r11 = r0.g(r11, r12)
            if (r2 != 0) goto L45
            r1 = 0
            return r1
        L45:
            if (r1 != 0) goto L49
            java.lang.String r1 = androidx.camera.core.impl.utils.f.f7672c
        L49:
            android.location.Location r13 = new android.location.Location
            r13.<init>(r1)
            r1 = 0
            r14 = r2[r1]
            r13.setLatitude(r14)
            r14 = 1
            r1 = r2[r14]
            r13.setLongitude(r1)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L61
            r13.setAltitude(r6)
        L61:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto Lb5
            int r1 = r3.hashCode()
            r2 = 75
            if (r1 == r2) goto L8a
            r2 = 77
            if (r1 == r2) goto L80
            r2 = 78
            if (r1 == r2) goto L76
            goto L92
        L76:
            java.lang.String r1 = "N"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = r14
            goto L93
        L80:
            java.lang.String r1 = "M"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = 0
            goto L93
        L8a:
            boolean r1 = r3.equals(r10)
            if (r1 == 0) goto L92
            r1 = 2
            goto L93
        L92:
            r1 = -1
        L93:
            if (r1 == 0) goto La9
            if (r1 == r14) goto La0
            androidx.camera.core.impl.utils.f$d$a r1 = androidx.camera.core.impl.utils.f.d.a(r8)
            double r1 = r1.a()
            goto Lb1
        La0:
            androidx.camera.core.impl.utils.f$d$a r1 = androidx.camera.core.impl.utils.f.d.b(r8)
            double r1 = r1.a()
            goto Lb1
        La9:
            androidx.camera.core.impl.utils.f$d$a r1 = androidx.camera.core.impl.utils.f.d.c(r8)
            double r1 = r1.a()
        Lb1:
            float r1 = (float) r1
            r13.setSpeed(r1)
        Lb5:
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto Lbe
            r13.setTime(r11)
        Lbe:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.f.getLocation():android.location.Location");
    }

    public int getOrientation() {
        return this.f7678a.getAttributeInt(C5339a.TAG_ORIENTATION, 0);
    }

    public int getRotation() {
        switch (getOrientation()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long getTimestamp() throws NumberFormatException {
        long jF = f(this.f7678a.getAttribute(C5339a.TAG_DATETIME_ORIGINAL));
        if (jF == -1) {
            return -1L;
        }
        String attribute = this.f7678a.getAttribute(C5339a.TAG_SUBSEC_TIME_ORIGINAL);
        if (attribute == null) {
            return jF;
        }
        try {
            long j8 = Long.parseLong(attribute);
            while (j8 > 1000) {
                j8 /= 10;
            }
            return jF + j8;
        } catch (NumberFormatException unused) {
            return jF;
        }
    }

    public int getWidth() {
        return this.f7678a.getAttributeInt(C5339a.TAG_IMAGE_WIDTH, 0);
    }

    public boolean isFlippedHorizontally() {
        return getOrientation() == 2;
    }

    public boolean isFlippedVertically() {
        int orientation = getOrientation();
        return orientation == 4 || orientation == 5 || orientation == 7;
    }

    public void removeLocation() throws NumberFormatException {
        this.f7678a.setAttribute(C5339a.TAG_GPS_PROCESSING_METHOD, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_LATITUDE, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_LATITUDE_REF, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_LONGITUDE, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_LONGITUDE_REF, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_ALTITUDE, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_ALTITUDE_REF, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_SPEED, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_SPEED_REF, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_DATESTAMP, null);
        this.f7678a.setAttribute(C5339a.TAG_GPS_TIMESTAMP, null);
    }

    public void removeTimestamp() throws NumberFormatException {
        this.f7678a.setAttribute(C5339a.TAG_DATETIME, null);
        this.f7678a.setAttribute(C5339a.TAG_DATETIME_ORIGINAL, null);
        this.f7678a.setAttribute(C5339a.TAG_DATETIME_DIGITIZED, null);
        this.f7678a.setAttribute(C5339a.TAG_SUBSEC_TIME, null);
        this.f7678a.setAttribute(C5339a.TAG_SUBSEC_TIME_ORIGINAL, null);
        this.f7678a.setAttribute(C5339a.TAG_SUBSEC_TIME_DIGITIZED, null);
        this.f7679b = true;
    }

    public void rotate(int i8) throws NumberFormatException {
        if (i8 % 90 != 0) {
            B0.w(f7672c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i8)));
            this.f7678a.setAttribute(C5339a.TAG_ORIENTATION, String.valueOf(0));
            return;
        }
        int i9 = i8 % 360;
        int orientation = getOrientation();
        while (i9 < 0) {
            i9 += 90;
            switch (orientation) {
                case 2:
                    orientation = 5;
                    break;
                case 3:
                case 8:
                    orientation = 6;
                    break;
                case 4:
                    orientation = 7;
                    break;
                case 5:
                    orientation = 4;
                    break;
                case 6:
                    orientation = 1;
                    break;
                case 7:
                    orientation = 2;
                    break;
                default:
                    orientation = 8;
                    break;
            }
        }
        while (i9 > 0) {
            i9 -= 90;
            switch (orientation) {
                case 2:
                    orientation = 7;
                    break;
                case 3:
                    orientation = 8;
                    break;
                case 4:
                    orientation = 5;
                    break;
                case 5:
                    orientation = 2;
                    break;
                case 6:
                    orientation = 3;
                    break;
                case 7:
                    orientation = 4;
                    break;
                case 8:
                    orientation = 1;
                    break;
                default:
                    orientation = 6;
                    break;
            }
        }
        this.f7678a.setAttribute(C5339a.TAG_ORIENTATION, String.valueOf(orientation));
    }

    public void save() throws Throwable {
        if (!this.f7679b) {
            a();
        }
        this.f7678a.saveAttributes();
    }

    public void setDescription(String str) throws NumberFormatException {
        this.f7678a.setAttribute(C5339a.TAG_IMAGE_DESCRIPTION, str);
    }

    public void setOrientation(int i8) throws NumberFormatException {
        this.f7678a.setAttribute(C5339a.TAG_ORIENTATION, String.valueOf(i8));
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(getRotation()), Boolean.valueOf(isFlippedVertically()), Boolean.valueOf(isFlippedHorizontally()), getLocation(), Long.valueOf(getTimestamp()), getDescription());
    }
}
