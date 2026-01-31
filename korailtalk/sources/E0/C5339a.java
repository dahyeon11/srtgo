package e0;

import H0.y;
import Q7.C0709m;
import Q7.C0712p;
import R.k;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import e3.AbstractC5358c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import maum.m2u.map.Map;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5339a {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final String GPS_DIRECTION_MAGNETIC = "M";
    public static final String GPS_DIRECTION_TRUE = "T";
    public static final String GPS_DISTANCE_KILOMETERS = "K";
    public static final String GPS_DISTANCE_MILES = "M";
    public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final String GPS_MEASUREMENT_2D = "2";
    public static final String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final String GPS_SPEED_KNOTS = "N";
    public static final String GPS_SPEED_MILES_PER_HOUR = "M";
    public static final String LATITUDE_NORTH = "N";
    public static final String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final String LONGITUDE_EAST = "E";
    public static final String LONGITUDE_WEST = "W";
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;

    /* renamed from: R, reason: collision with root package name */
    private static SimpleDateFormat f30153R = null;
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;

    /* renamed from: S, reason: collision with root package name */
    private static SimpleDateFormat f30154S = null;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final String TAG_APERTURE_VALUE = "ApertureValue";
    public static final String TAG_ARTIST = "Artist";
    public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";

    @Deprecated
    public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CFA_PATTERN = "CFAPattern";
    public static final String TAG_COLOR_SPACE = "ColorSpace";
    public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final String TAG_COMPRESSION = "Compression";
    public static final String TAG_CONTRAST = "Contrast";
    public static final String TAG_COPYRIGHT = "Copyright";
    public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final String TAG_DATETIME = "DateTime";
    public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final String TAG_DNG_VERSION = "DNGVersion";
    public static final String TAG_EXIF_VERSION = "ExifVersion";
    public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final String TAG_FILE_SOURCE = "FileSource";
    public static final String TAG_FLASH = "Flash";
    public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final String TAG_FOCAL_LENGTH = "FocalLength";
    public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final String TAG_F_NUMBER = "FNumber";
    public static final String TAG_GAIN_CONTROL = "GainControl";
    public static final String TAG_GAMMA = "Gamma";
    public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final String TAG_GPS_DOP = "GPSDOP";
    public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    public static final String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final String TAG_GPS_SPEED = "GPSSpeed";
    public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final String TAG_GPS_STATUS = "GPSStatus";
    public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final String TAG_GPS_TRACK = "GPSTrack";
    public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final String TAG_IMAGE_LENGTH = "ImageLength";
    public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final String TAG_IMAGE_WIDTH = "ImageWidth";
    public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final String TAG_ISO_SPEED = "ISOSpeed";
    public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

    @Deprecated
    public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final String TAG_LENS_MAKE = "LensMake";
    public static final String TAG_LENS_MODEL = "LensModel";
    public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final String TAG_LIGHT_SOURCE = "LightSource";
    public static final String TAG_MAKE = "Make";
    public static final String TAG_MAKER_NOTE = "MakerNote";
    public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final String TAG_METERING_MODE = "MeteringMode";
    public static final String TAG_MODEL = "Model";
    public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final String TAG_OECF = "OECF";
    public static final String TAG_OFFSET_TIME = "OffsetTime";
    public static final String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final String TAG_ORIENTATION = "Orientation";
    public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final String TAG_RW2_ISO = "ISO";
    public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final String TAG_SATURATION = "Saturation";
    public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final String TAG_SCENE_TYPE = "SceneType";
    public static final String TAG_SENSING_METHOD = "SensingMethod";
    public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final String TAG_SHARPNESS = "Sharpness";
    public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final String TAG_SOFTWARE = "Software";
    public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final String TAG_SUBFILE_TYPE = "SubfileType";
    public static final String TAG_SUBJECT_AREA = "SubjectArea";
    public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final String TAG_SUBSEC_TIME = "SubSecTime";
    public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
    public static final String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final String TAG_USER_COMMENT = "UserComment";
    public static final String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final String TAG_WHITE_POINT = "WhitePoint";
    public static final String TAG_XMP = "Xmp";
    public static final String TAG_X_RESOLUTION = "XResolution";
    public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final String TAG_Y_RESOLUTION = "YResolution";

    /* renamed from: W, reason: collision with root package name */
    private static final e[] f30158W;

    @Deprecated
    public static final int WHITEBALANCE_AUTO = 0;

    @Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;

    /* renamed from: X, reason: collision with root package name */
    private static final e[] f30159X;

    /* renamed from: Y, reason: collision with root package name */
    private static final e[] f30160Y;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;

    /* renamed from: Z, reason: collision with root package name */
    private static final e[] f30161Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final e[] f30162a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final e f30163b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final e[] f30164c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final e[] f30165d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final e[] f30166e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final e[] f30167f0;

    /* renamed from: g0, reason: collision with root package name */
    static final e[][] f30168g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final e[] f30169h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final e f30170i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final e f30171j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final HashMap[] f30172k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f30173l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final HashSet f30174m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final HashMap f30175n0;

    /* renamed from: o0, reason: collision with root package name */
    static final Charset f30176o0;

    /* renamed from: p0, reason: collision with root package name */
    static final byte[] f30177p0;

    /* renamed from: q0, reason: collision with root package name */
    private static final byte[] f30178q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final Pattern f30179r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final Pattern f30180s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final Pattern f30181t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final Pattern f30182u0;

    /* renamed from: a, reason: collision with root package name */
    private String f30188a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f30189b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f30190c;

    /* renamed from: d, reason: collision with root package name */
    private int f30191d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30192e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap[] f30193f;

    /* renamed from: g, reason: collision with root package name */
    private Set f30194g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f30195h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30196i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30197j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30198k;

    /* renamed from: l, reason: collision with root package name */
    private int f30199l;

    /* renamed from: m, reason: collision with root package name */
    private int f30200m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f30201n;

    /* renamed from: o, reason: collision with root package name */
    private int f30202o;

    /* renamed from: p, reason: collision with root package name */
    private int f30203p;

    /* renamed from: q, reason: collision with root package name */
    private int f30204q;

    /* renamed from: r, reason: collision with root package name */
    private int f30205r;

    /* renamed from: s, reason: collision with root package name */
    private int f30206s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f30207t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f30208u;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f30183v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w, reason: collision with root package name */
    private static final List f30184w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x, reason: collision with root package name */
    private static final List f30185x = Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};

    /* renamed from: y, reason: collision with root package name */
    static final byte[] f30186y = {-1, -40, -1};

    /* renamed from: z, reason: collision with root package name */
    private static final byte[] f30187z = {102, 116, 121, 112};

    /* renamed from: A, reason: collision with root package name */
    private static final byte[] f30136A = {109, 105, 102, 49};

    /* renamed from: B, reason: collision with root package name */
    private static final byte[] f30137B = {104, 101, 105, 99};

    /* renamed from: C, reason: collision with root package name */
    private static final byte[] f30138C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D, reason: collision with root package name */
    private static final byte[] f30139D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E, reason: collision with root package name */
    private static final byte[] f30140E = {-119, 80, 78, 71, AbstractC5358c.CR, 10, AbstractC5358c.SUB, 10};

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f30141F = {101, 88, 73, 102};

    /* renamed from: G, reason: collision with root package name */
    private static final byte[] f30142G = {73, 72, 68, 82};

    /* renamed from: H, reason: collision with root package name */
    private static final byte[] f30143H = {73, 69, 78, 68};

    /* renamed from: I, reason: collision with root package name */
    private static final byte[] f30144I = {82, 73, 70, 70};

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f30145J = {87, 69, 66, 80};

    /* renamed from: K, reason: collision with root package name */
    private static final byte[] f30146K = {69, 88, 73, 70};

    /* renamed from: L, reason: collision with root package name */
    private static final byte[] f30147L = {-99, 1, 42};

    /* renamed from: M, reason: collision with root package name */
    private static final byte[] f30148M = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f30149N = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: O, reason: collision with root package name */
    private static final byte[] f30150O = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    private static final byte[] f30151P = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    private static final byte[] f30152Q = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: T, reason: collision with root package name */
    static final String[] f30155T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: U, reason: collision with root package name */
    static final int[] f30156U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: V, reason: collision with root package name */
    static final byte[] f30157V = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: e0.a$b */
    private static class b extends InputStream implements DataInput {

        /* renamed from: e, reason: collision with root package name */
        private static final ByteOrder f30212e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f, reason: collision with root package name */
        private static final ByteOrder f30213f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a, reason: collision with root package name */
        private DataInputStream f30214a;

        /* renamed from: b, reason: collision with root package name */
        private ByteOrder f30215b;

        /* renamed from: c, reason: collision with root package name */
        final int f30216c;

        /* renamed from: d, reason: collision with root package name */
        int f30217d;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f30214a.available();
        }

        public int getLength() {
            return this.f30216c;
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i8) {
            this.f30214a.mark(i8);
        }

        public int peek() {
            return this.f30217d;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f30217d++;
            return this.f30214a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f30217d++;
            return this.f30214a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i8 = this.f30217d + 1;
            this.f30217d = i8;
            if (i8 > this.f30216c) {
                throw new EOFException();
            }
            int i9 = this.f30214a.read();
            if (i9 >= 0) {
                return (byte) i9;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f30217d += 2;
            return this.f30214a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i8, int i9) throws IOException {
            int i10 = this.f30217d + i9;
            this.f30217d = i10;
            if (i10 > this.f30216c) {
                throw new EOFException();
            }
            if (this.f30214a.read(bArr, i8, i9) != i9) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i8 = this.f30217d + 4;
            this.f30217d = i8;
            if (i8 > this.f30216c) {
                throw new EOFException();
            }
            int i9 = this.f30214a.read();
            int i10 = this.f30214a.read();
            int i11 = this.f30214a.read();
            int i12 = this.f30214a.read();
            if ((i9 | i10 | i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f30215b;
            if (byteOrder == f30212e) {
                return (i12 << 24) + (i11 << 16) + (i10 << 8) + i9;
            }
            if (byteOrder == f30213f) {
                return (i9 << 24) + (i10 << 16) + (i11 << 8) + i12;
            }
            throw new IOException("Invalid byte order: " + this.f30215b);
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i8 = this.f30217d + 8;
            this.f30217d = i8;
            if (i8 > this.f30216c) {
                throw new EOFException();
            }
            int i9 = this.f30214a.read();
            int i10 = this.f30214a.read();
            int i11 = this.f30214a.read();
            int i12 = this.f30214a.read();
            int i13 = this.f30214a.read();
            int i14 = this.f30214a.read();
            int i15 = this.f30214a.read();
            int i16 = this.f30214a.read();
            if ((i9 | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f30215b;
            if (byteOrder == f30212e) {
                return (i16 << 56) + (i15 << 48) + (i14 << 40) + (i13 << 32) + (i12 << 24) + (i11 << 16) + (i10 << 8) + i9;
            }
            if (byteOrder == f30213f) {
                return (i9 << 56) + (i10 << 48) + (i11 << 40) + (i12 << 32) + (i13 << 24) + (i14 << 16) + (i15 << 8) + i16;
            }
            throw new IOException("Invalid byte order: " + this.f30215b);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i8 = this.f30217d + 2;
            this.f30217d = i8;
            if (i8 > this.f30216c) {
                throw new EOFException();
            }
            int i9 = this.f30214a.read();
            int i10 = this.f30214a.read();
            if ((i9 | i10) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f30215b;
            if (byteOrder == f30212e) {
                return (short) ((i10 << 8) + i9);
            }
            if (byteOrder == f30213f) {
                return (short) ((i9 << 8) + i10);
            }
            throw new IOException("Invalid byte order: " + this.f30215b);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f30217d += 2;
            return this.f30214a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f30217d++;
            return this.f30214a.readUnsignedByte();
        }

        public long readUnsignedInt() {
            return readInt() & 4294967295L;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i8 = this.f30217d + 2;
            this.f30217d = i8;
            if (i8 > this.f30216c) {
                throw new EOFException();
            }
            int i9 = this.f30214a.read();
            int i10 = this.f30214a.read();
            if ((i9 | i10) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f30215b;
            if (byteOrder == f30212e) {
                return (i10 << 8) + i9;
            }
            if (byteOrder == f30213f) {
                return (i9 << 8) + i10;
            }
            throw new IOException("Invalid byte order: " + this.f30215b);
        }

        public void seek(long j8) throws IOException {
            int i8 = this.f30217d;
            if (i8 > j8) {
                this.f30217d = 0;
                this.f30214a.reset();
                this.f30214a.mark(this.f30216c);
            } else {
                j8 -= i8;
            }
            int i9 = (int) j8;
            if (skipBytes(i9) != i9) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.f30215b = byteOrder;
        }

        @Override // java.io.DataInput
        public int skipBytes(int i8) {
            int iMin = Math.min(i8, this.f30216c - this.f30217d);
            int iSkipBytes = 0;
            while (iSkipBytes < iMin) {
                iSkipBytes += this.f30214a.skipBytes(iMin - iSkipBytes);
            }
            this.f30217d += iSkipBytes;
            return iSkipBytes;
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f30215b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f30214a = dataInputStream;
            int iAvailable = dataInputStream.available();
            this.f30216c = iAvailable;
            this.f30217d = 0;
            this.f30214a.mark(iAvailable);
            this.f30215b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) throws IOException {
            int i10 = this.f30214a.read(bArr, i8, i9);
            this.f30217d += i10;
            return i10;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f30217d + bArr.length;
            this.f30217d = length;
            if (length <= this.f30216c) {
                if (this.f30214a.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: e0.a$c */
    private static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        final OutputStream f30218a;

        /* renamed from: b, reason: collision with root package name */
        private ByteOrder f30219b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f30218a = outputStream;
            this.f30219b = byteOrder;
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.f30219b = byteOrder;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f30218a.write(bArr);
        }

        public void writeByte(int i8) throws IOException {
            this.f30218a.write(i8);
        }

        public void writeInt(int i8) throws IOException {
            ByteOrder byteOrder = this.f30219b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f30218a.write(i8 & 255);
                this.f30218a.write((i8 >>> 8) & 255);
                this.f30218a.write((i8 >>> 16) & 255);
                this.f30218a.write((i8 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f30218a.write((i8 >>> 24) & 255);
                this.f30218a.write((i8 >>> 16) & 255);
                this.f30218a.write((i8 >>> 8) & 255);
                this.f30218a.write(i8 & 255);
            }
        }

        public void writeShort(short s8) throws IOException {
            ByteOrder byteOrder = this.f30219b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f30218a.write(s8 & 255);
                this.f30218a.write((s8 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f30218a.write((s8 >>> 8) & 255);
                this.f30218a.write(s8 & 255);
            }
        }

        public void writeUnsignedInt(long j8) throws IOException {
            writeInt((int) j8);
        }

        public void writeUnsignedShort(int i8) throws IOException {
            writeShort((short) i8);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            this.f30218a.write(bArr, i8, i9);
        }
    }

    /* renamed from: e0.a$d */
    private static class d {
        public static final long BYTES_OFFSET_UNKNOWN = -1;
        public final byte[] bytes;
        public final long bytesOffset;
        public final int format;
        public final int numberOfComponents;

        d(int i8, int i9, byte[] bArr) {
            this(i8, i9, -1L, bArr);
        }

        public static d createByte(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C5339a.f30176o0);
            return new d(1, bytes.length, bytes);
        }

        public static d createDouble(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5339a.f30156U[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d9 : dArr) {
                byteBufferWrap.putDouble(d9);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d createSLong(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5339a.f30156U[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i8 : iArr) {
                byteBufferWrap.putInt(i8);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d createSRational(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5339a.f30156U[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.numerator);
                byteBufferWrap.putInt((int) fVar.denominator);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d createString(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C5339a.f30176o0);
            return new d(2, bytes.length, bytes);
        }

        public static d createULong(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5339a.f30156U[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j8 : jArr) {
                byteBufferWrap.putInt((int) j8);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d createURational(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5339a.f30156U[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.numerator);
                byteBufferWrap.putInt((int) fVar.denominator);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d createUShort(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5339a.f30156U[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i8 : iArr) {
                byteBufferWrap.putShort((short) i8);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:49), block:B:17:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object a(java.nio.ByteOrder r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 436
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.C5339a.d.a(java.nio.ByteOrder):java.lang.Object");
        }

        public double getDoubleValue(ByteOrder byteOrder) throws Throwable {
            Object objA = a(byteOrder);
            if (objA == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objA instanceof String) {
                return Double.parseDouble((String) objA);
            }
            if (objA instanceof long[]) {
                if (((long[]) objA).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objA instanceof int[]) {
                if (((int[]) objA).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objA instanceof double[]) {
                double[] dArr = (double[]) objA;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objA instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objA;
            if (fVarArr.length == 1) {
                return fVarArr[0].calculate();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int getIntValue(ByteOrder byteOrder) throws Throwable {
            Object objA = a(byteOrder);
            if (objA == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objA instanceof String) {
                return Integer.parseInt((String) objA);
            }
            if (objA instanceof long[]) {
                long[] jArr = (long[]) objA;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objA instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objA;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String getStringValue(ByteOrder byteOrder) throws Throwable {
            Object objA = a(byteOrder);
            if (objA == null) {
                return null;
            }
            if (objA instanceof String) {
                return (String) objA;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = 0;
            if (objA instanceof long[]) {
                long[] jArr = (long[]) objA;
                while (i8 < jArr.length) {
                    sb.append(jArr[i8]);
                    i8++;
                    if (i8 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objA instanceof int[]) {
                int[] iArr = (int[]) objA;
                while (i8 < iArr.length) {
                    sb.append(iArr[i8]);
                    i8++;
                    if (i8 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objA instanceof double[]) {
                double[] dArr = (double[]) objA;
                while (i8 < dArr.length) {
                    sb.append(dArr[i8]);
                    i8++;
                    if (i8 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objA instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objA;
            while (i8 < fVarArr.length) {
                sb.append(fVarArr[i8].numerator);
                sb.append('/');
                sb.append(fVarArr[i8].denominator);
                i8++;
                if (i8 != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public int size() {
            return C5339a.f30156U[this.format] * this.numberOfComponents;
        }

        public String toString() {
            return "(" + C5339a.f30155T[this.format] + ", data length:" + this.bytes.length + ")";
        }

        d(int i8, int i9, long j8, byte[] bArr) {
            this.format = i8;
            this.numberOfComponents = i9;
            this.bytesOffset = j8;
            this.bytes = bArr;
        }

        public static d createDouble(double d9, ByteOrder byteOrder) {
            return createDouble(new double[]{d9}, byteOrder);
        }

        public static d createSLong(int i8, ByteOrder byteOrder) {
            return createSLong(new int[]{i8}, byteOrder);
        }

        public static d createULong(long j8, ByteOrder byteOrder) {
            return createULong(new long[]{j8}, byteOrder);
        }

        public static d createUShort(int i8, ByteOrder byteOrder) {
            return createUShort(new int[]{i8}, byteOrder);
        }

        public static d createSRational(f fVar, ByteOrder byteOrder) {
            return createSRational(new f[]{fVar}, byteOrder);
        }

        public static d createURational(f fVar, ByteOrder byteOrder) {
            return createURational(new f[]{fVar}, byteOrder);
        }
    }

    /* renamed from: e0.a$f */
    private static class f {
        public final long denominator;
        public final long numerator;

        f(double d9) {
            this((long) (d9 * 10000.0d), y.MIN_BACKOFF_MILLIS);
        }

        public double calculate() {
            return this.numerator / this.denominator;
        }

        public String toString() {
            return this.numerator + "/" + this.denominator;
        }

        f(long j8, long j9) {
            if (j9 == 0) {
                this.numerator = 0L;
                this.denominator = 1L;
            } else {
                this.numerator = j8;
                this.denominator = j9;
            }
        }
    }

    static {
        e[] eVarArr = {new e(TAG_NEW_SUBFILE_TYPE, 254, 4), new e(TAG_SUBFILE_TYPE, 255, 4), new e(TAG_IMAGE_WIDTH, 256, 3, 4), new e(TAG_IMAGE_LENGTH, k.OPTIMIZATION_STANDARD, 3, 4), new e(TAG_BITS_PER_SAMPLE, 258, 3), new e(TAG_COMPRESSION, 259, 3), new e(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new e(TAG_IMAGE_DESCRIPTION, 270, 2), new e(TAG_MAKE, 271, 2), new e(TAG_MODEL, 272, 2), new e(TAG_STRIP_OFFSETS, 273, 3, 4), new e(TAG_ORIENTATION, 274, 3), new e(TAG_SAMPLES_PER_PIXEL, 277, 3), new e(TAG_ROWS_PER_STRIP, 278, 3, 4), new e(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new e(TAG_X_RESOLUTION, 282, 5), new e(TAG_Y_RESOLUTION, 283, 5), new e(TAG_PLANAR_CONFIGURATION, 284, 3), new e(TAG_RESOLUTION_UNIT, 296, 3), new e(TAG_TRANSFER_FUNCTION, Map.MapException.StatusCode.AUTH_IS_VAILD_FAILED_VALUE, 3), new e(TAG_SOFTWARE, Map.MapException.StatusCode.AUTH_CHECK_AUTH_FAILED_VALUE, 2), new e(TAG_DATETIME, 306, 2), new e(TAG_ARTIST, Map.MapException.StatusCode.MAP_CURRENTLY_HAS_NO_STREAM_VALUE, 2), new e(TAG_WHITE_POINT, Map.MapException.StatusCode.MAP_CLASS_NOT_FOUND_VALUE, 5), new e(TAG_PRIMARY_CHROMATICITIES, 319, 5), new e("SubIFDPointer", 330, 4), new e(TAG_JPEG_INTERCHANGE_FORMAT, Map.MapException.StatusCode.GRPC_ROUTER_EVENT_ERROR_VALUE, 4), new e(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, Map.MapException.StatusCode.GRPC_ROUTER_CLOSE_ERROR_VALUE, 4), new e(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new e(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new e(TAG_Y_CB_CR_POSITIONING, 531, 3), new e(TAG_REFERENCE_BLACK_WHITE, 532, 5), new e(TAG_COPYRIGHT, 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new e(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new e(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new e(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new e(TAG_RW2_ISO, 23, 3), new e(TAG_RW2_JPG_FROM_RAW, 46, 7), new e(TAG_XMP, 700, 1)};
        f30158W = eVarArr;
        e[] eVarArr2 = {new e(TAG_EXPOSURE_TIME, 33434, 5), new e(TAG_F_NUMBER, 33437, 5), new e(TAG_EXPOSURE_PROGRAM, 34850, 3), new e(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new e(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new e(TAG_OECF, 34856, 7), new e(TAG_SENSITIVITY_TYPE, 34864, 3), new e(TAG_STANDARD_OUTPUT_SENSITIVITY, 34865, 4), new e(TAG_RECOMMENDED_EXPOSURE_INDEX, 34866, 4), new e(TAG_ISO_SPEED, 34867, 4), new e(TAG_ISO_SPEED_LATITUDE_YYY, 34868, 4), new e(TAG_ISO_SPEED_LATITUDE_ZZZ, 34869, 4), new e(TAG_EXIF_VERSION, 36864, 2), new e(TAG_DATETIME_ORIGINAL, 36867, 2), new e(TAG_DATETIME_DIGITIZED, 36868, 2), new e(TAG_OFFSET_TIME, 36880, 2), new e(TAG_OFFSET_TIME_ORIGINAL, 36881, 2), new e(TAG_OFFSET_TIME_DIGITIZED, 36882, 2), new e(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new e(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new e(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new e(TAG_APERTURE_VALUE, 37378, 5), new e(TAG_BRIGHTNESS_VALUE, 37379, 10), new e(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new e(TAG_MAX_APERTURE_VALUE, 37381, 5), new e(TAG_SUBJECT_DISTANCE, 37382, 5), new e(TAG_METERING_MODE, 37383, 3), new e(TAG_LIGHT_SOURCE, 37384, 3), new e(TAG_FLASH, 37385, 3), new e(TAG_FOCAL_LENGTH, 37386, 5), new e(TAG_SUBJECT_AREA, 37396, 3), new e(TAG_MAKER_NOTE, 37500, 7), new e(TAG_USER_COMMENT, 37510, 7), new e(TAG_SUBSEC_TIME, 37520, 2), new e(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new e(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new e(TAG_FLASHPIX_VERSION, 40960, 7), new e(TAG_COLOR_SPACE, 40961, 3), new e(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new e(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new e(TAG_RELATED_SOUND_FILE, 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e(TAG_FLASH_ENERGY, 41483, 5), new e(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new e(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new e(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new e(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new e(TAG_SUBJECT_LOCATION, 41492, 3), new e(TAG_EXPOSURE_INDEX, 41493, 5), new e(TAG_SENSING_METHOD, 41495, 3), new e(TAG_FILE_SOURCE, 41728, 7), new e(TAG_SCENE_TYPE, 41729, 7), new e(TAG_CFA_PATTERN, 41730, 7), new e(TAG_CUSTOM_RENDERED, 41985, 3), new e(TAG_EXPOSURE_MODE, 41986, 3), new e(TAG_WHITE_BALANCE, 41987, 3), new e(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new e(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new e(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new e(TAG_GAIN_CONTROL, 41991, 3), new e(TAG_CONTRAST, 41992, 3), new e(TAG_SATURATION, 41993, 3), new e(TAG_SHARPNESS, 41994, 3), new e(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new e(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new e(TAG_IMAGE_UNIQUE_ID, 42016, 2), new e("CameraOwnerName", 42032, 2), new e(TAG_BODY_SERIAL_NUMBER, 42033, 2), new e(TAG_LENS_SPECIFICATION, 42034, 5), new e(TAG_LENS_MAKE, 42035, 2), new e(TAG_LENS_MODEL, 42036, 2), new e(TAG_GAMMA, 42240, 5), new e(TAG_DNG_VERSION, 50706, 1), new e(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        f30159X = eVarArr2;
        e[] eVarArr3 = {new e(TAG_GPS_VERSION_ID, 0, 1), new e(TAG_GPS_LATITUDE_REF, 1, 2), new e(TAG_GPS_LATITUDE, 2, 5, 10), new e(TAG_GPS_LONGITUDE_REF, 3, 2), new e(TAG_GPS_LONGITUDE, 4, 5, 10), new e(TAG_GPS_ALTITUDE_REF, 5, 1), new e(TAG_GPS_ALTITUDE, 6, 5), new e(TAG_GPS_TIMESTAMP, 7, 5), new e(TAG_GPS_SATELLITES, 8, 2), new e(TAG_GPS_STATUS, 9, 2), new e(TAG_GPS_MEASURE_MODE, 10, 2), new e(TAG_GPS_DOP, 11, 5), new e(TAG_GPS_SPEED_REF, 12, 2), new e(TAG_GPS_SPEED, 13, 5), new e(TAG_GPS_TRACK_REF, 14, 2), new e(TAG_GPS_TRACK, 15, 5), new e(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new e(TAG_GPS_IMG_DIRECTION, 17, 5), new e(TAG_GPS_MAP_DATUM, 18, 2), new e(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new e(TAG_GPS_DEST_LATITUDE, 20, 5), new e(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new e(TAG_GPS_DEST_LONGITUDE, 22, 5), new e(TAG_GPS_DEST_BEARING_REF, 23, 2), new e(TAG_GPS_DEST_BEARING, 24, 5), new e(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new e(TAG_GPS_DEST_DISTANCE, 26, 5), new e(TAG_GPS_PROCESSING_METHOD, 27, 7), new e(TAG_GPS_AREA_INFORMATION, 28, 7), new e(TAG_GPS_DATESTAMP, 29, 2), new e(TAG_GPS_DIFFERENTIAL, 30, 3), new e(TAG_GPS_H_POSITIONING_ERROR, 31, 5)};
        f30160Y = eVarArr3;
        e[] eVarArr4 = {new e(TAG_INTEROPERABILITY_INDEX, 1, 2)};
        f30161Z = eVarArr4;
        e[] eVarArr5 = {new e(TAG_NEW_SUBFILE_TYPE, 254, 4), new e(TAG_SUBFILE_TYPE, 255, 4), new e(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new e(TAG_THUMBNAIL_IMAGE_LENGTH, k.OPTIMIZATION_STANDARD, 3, 4), new e(TAG_BITS_PER_SAMPLE, 258, 3), new e(TAG_COMPRESSION, 259, 3), new e(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new e(TAG_IMAGE_DESCRIPTION, 270, 2), new e(TAG_MAKE, 271, 2), new e(TAG_MODEL, 272, 2), new e(TAG_STRIP_OFFSETS, 273, 3, 4), new e(TAG_THUMBNAIL_ORIENTATION, 274, 3), new e(TAG_SAMPLES_PER_PIXEL, 277, 3), new e(TAG_ROWS_PER_STRIP, 278, 3, 4), new e(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new e(TAG_X_RESOLUTION, 282, 5), new e(TAG_Y_RESOLUTION, 283, 5), new e(TAG_PLANAR_CONFIGURATION, 284, 3), new e(TAG_RESOLUTION_UNIT, 296, 3), new e(TAG_TRANSFER_FUNCTION, Map.MapException.StatusCode.AUTH_IS_VAILD_FAILED_VALUE, 3), new e(TAG_SOFTWARE, Map.MapException.StatusCode.AUTH_CHECK_AUTH_FAILED_VALUE, 2), new e(TAG_DATETIME, 306, 2), new e(TAG_ARTIST, Map.MapException.StatusCode.MAP_CURRENTLY_HAS_NO_STREAM_VALUE, 2), new e(TAG_WHITE_POINT, Map.MapException.StatusCode.MAP_CLASS_NOT_FOUND_VALUE, 5), new e(TAG_PRIMARY_CHROMATICITIES, 319, 5), new e("SubIFDPointer", 330, 4), new e(TAG_JPEG_INTERCHANGE_FORMAT, Map.MapException.StatusCode.GRPC_ROUTER_EVENT_ERROR_VALUE, 4), new e(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, Map.MapException.StatusCode.GRPC_ROUTER_CLOSE_ERROR_VALUE, 4), new e(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new e(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new e(TAG_Y_CB_CR_POSITIONING, 531, 3), new e(TAG_REFERENCE_BLACK_WHITE, 532, 5), new e(TAG_COPYRIGHT, 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e(TAG_DNG_VERSION, 50706, 1), new e(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        f30162a0 = eVarArr5;
        f30163b0 = new e(TAG_STRIP_OFFSETS, 273, 3);
        e[] eVarArr6 = {new e(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f30164c0 = eVarArr6;
        e[] eVarArr7 = {new e(TAG_ORF_PREVIEW_IMAGE_START, k.OPTIMIZATION_STANDARD, 4), new e(TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)};
        f30165d0 = eVarArr7;
        e[] eVarArr8 = {new e(TAG_ORF_ASPECT_FRAME, 4371, 3)};
        f30166e0 = eVarArr8;
        e[] eVarArr9 = {new e(TAG_COLOR_SPACE, 55, 3)};
        f30167f0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f30168g0 = eVarArr10;
        f30169h0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f30170i0 = new e(TAG_JPEG_INTERCHANGE_FORMAT, Map.MapException.StatusCode.GRPC_ROUTER_EVENT_ERROR_VALUE, 4);
        f30171j0 = new e(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, Map.MapException.StatusCode.GRPC_ROUTER_CLOSE_ERROR_VALUE, 4);
        f30172k0 = new HashMap[eVarArr10.length];
        f30173l0 = new HashMap[eVarArr10.length];
        f30174m0 = new HashSet(Arrays.asList(TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE, TAG_GPS_TIMESTAMP));
        f30175n0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f30176o0 = charsetForName;
        f30177p0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f30178q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f30153R = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f30154S = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i8 = 0;
        while (true) {
            e[][] eVarArr11 = f30168g0;
            if (i8 >= eVarArr11.length) {
                HashMap map = f30175n0;
                e[] eVarArr12 = f30169h0;
                map.put(Integer.valueOf(eVarArr12[0].number), 5);
                map.put(Integer.valueOf(eVarArr12[1].number), 1);
                map.put(Integer.valueOf(eVarArr12[2].number), 2);
                map.put(Integer.valueOf(eVarArr12[3].number), 3);
                map.put(Integer.valueOf(eVarArr12[4].number), 7);
                map.put(Integer.valueOf(eVarArr12[5].number), 8);
                f30179r0 = Pattern.compile(".*[1-9].*");
                f30180s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f30181t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f30182u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f30172k0[i8] = new HashMap();
            f30173l0[i8] = new HashMap();
            for (e eVar : eVarArr11[i8]) {
                f30172k0[i8].put(Integer.valueOf(eVar.number), eVar);
                f30173l0[i8].put(eVar.name, eVar);
            }
            i8++;
        }
    }

    public C5339a(File file) throws Throwable {
        e[][] eVarArr = f30168g0;
        this.f30193f = new HashMap[eVarArr.length];
        this.f30194g = new HashSet(eVarArr.length);
        this.f30195h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        z(file.getAbsolutePath());
    }

    private static boolean A(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f30177p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr3 = f30177p0;
            if (i8 >= bArr3.length) {
                return true;
            }
            if (bArr2[i8] != bArr3[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean B(byte[] bArr) throws Throwable {
        b bVar;
        long length;
        byte[] bArr2;
        long j8;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            length = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f30187z)) {
            bVar.close();
            return false;
        }
        if (length == 1) {
            length = bVar.readLong();
            j8 = 16;
            if (length < 16) {
                bVar.close();
                return false;
            }
        } else {
            j8 = 8;
        }
        if (length > bArr.length) {
            length = bArr.length;
        }
        long j9 = length - j8;
        if (j9 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z8 = false;
        boolean z9 = false;
        for (long j10 = 0; j10 < j9 / 4; j10++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j10 != 1) {
                if (Arrays.equals(bArr3, f30136A)) {
                    z8 = true;
                } else if (Arrays.equals(bArr3, f30137B)) {
                    z9 = true;
                }
                if (z8 && z9) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean C(byte[] bArr) {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f30186y;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean D(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderQ = Q(bVar);
            this.f30195h = byteOrderQ;
            bVar.setByteOrder(byteOrderQ);
            short s8 = bVar.readShort();
            boolean z8 = s8 == 20306 || s8 == 21330;
            bVar.close();
            return z8;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private boolean E(byte[] bArr) {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f30140E;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean F(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i8 = 0; i8 < bytes.length; i8++) {
            if (bArr[i8] != bytes[i8]) {
                return false;
            }
        }
        return true;
    }

    private boolean G(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderQ = Q(bVar);
            this.f30195h = byteOrderQ;
            bVar.setByteOrder(byteOrderQ);
            boolean z8 = bVar.readShort() == 85;
            bVar.close();
            return z8;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static boolean H(FileDescriptor fileDescriptor) throws ErrnoException {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean I(HashMap map) throws Throwable {
        d dVar;
        d dVar2 = (d) map.get(TAG_BITS_PER_SAMPLE);
        if (dVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dVar2.a(this.f30195h);
        int[] iArr2 = BITS_PER_SAMPLE_RGB;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f30191d != 3 || (dVar = (d) map.get(TAG_PHOTOMETRIC_INTERPRETATION)) == null) {
            return false;
        }
        int intValue = dVar.getIntValue(this.f30195h);
        return (intValue == 1 && Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (intValue == 6 && Arrays.equals(iArr, iArr2));
    }

    private boolean J() {
        int i8 = this.f30191d;
        return i8 == 4 || i8 == 13 || i8 == 14;
    }

    private boolean K(HashMap map) {
        d dVar = (d) map.get(TAG_IMAGE_LENGTH);
        d dVar2 = (d) map.get(TAG_IMAGE_WIDTH);
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.getIntValue(this.f30195h) <= 512 && dVar2.getIntValue(this.f30195h) <= 512;
    }

    private boolean L(byte[] bArr) {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f30144I;
            if (i8 >= bArr2.length) {
                int i9 = 0;
                while (true) {
                    byte[] bArr3 = f30145J;
                    if (i9 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f30144I.length + i9 + 4] != bArr3[i9]) {
                        return false;
                    }
                    i9++;
                }
            } else {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            }
        }
    }

    private void M(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i8 = 0; i8 < f30168g0.length; i8++) {
            try {
                try {
                    this.f30193f[i8] = new HashMap();
                } catch (IOException e8) {
                    boolean z8 = f30183v;
                    if (z8) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e8);
                    }
                    a();
                    if (!z8) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (f30183v) {
                    P();
                }
                throw th;
            }
        }
        if (!this.f30192e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f30191d = o(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (this.f30192e) {
            u(bVar);
        } else {
            switch (this.f30191d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    s(bVar);
                    break;
                case 4:
                    n(bVar, 0, 0);
                    a();
                    if (f30183v) {
                        P();
                        return;
                    }
                    return;
                case 7:
                    p(bVar);
                    break;
                case 9:
                    r(bVar);
                    a();
                    if (f30183v) {
                        P();
                        return;
                    }
                    return;
                case 10:
                    t(bVar);
                    a();
                    if (f30183v) {
                        P();
                        return;
                    }
                    return;
                case 12:
                    m(bVar);
                    break;
                case 13:
                    q(bVar);
                    a();
                    if (f30183v) {
                        P();
                        return;
                    }
                    return;
                case 14:
                    v(bVar);
                    a();
                    if (f30183v) {
                        P();
                        return;
                    }
                    return;
            }
        }
        bVar.seek(this.f30203p);
        Y(bVar);
        a();
        if (!f30183v) {
            return;
        }
        P();
    }

    private static Long N(String str, String str2, String str3) throws NumberFormatException {
        if (str != null && f30179r0.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f30153R.parse(str, parsePosition);
                if (date == null && (date = f30154S.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    String strSubstring = str3.substring(0, 1);
                    int i8 = Integer.parseInt(str3.substring(1, 3));
                    int i9 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(strSubstring) || g5.e.STATE_NAME_NONE.equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i8 <= 14) {
                        time += ((i8 * 60) + i9) * 60000 * (g5.e.STATE_NAME_NONE.equals(strSubstring) ? 1 : -1);
                    }
                }
                if (str2 != null) {
                    try {
                        long j8 = Long.parseLong(str2);
                        while (j8 > 1000) {
                            j8 /= 10;
                        }
                        time += j8;
                    } catch (NumberFormatException unused) {
                    }
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused2) {
            }
        }
        return null;
    }

    private void O(b bVar, int i8) throws IOException {
        ByteOrder byteOrderQ = Q(bVar);
        this.f30195h = byteOrderQ;
        bVar.setByteOrder(byteOrderQ);
        int unsignedShort = bVar.readUnsignedShort();
        int i9 = this.f30191d;
        if (i9 != 7 && i9 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i10 = bVar.readInt();
        if (i10 < 8 || i10 >= i8) {
            throw new IOException("Invalid first Ifd offset: " + i10);
        }
        int i11 = i10 - 8;
        if (i11 <= 0 || bVar.skipBytes(i11) == i11) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i11);
    }

    private void P() {
        for (int i8 = 0; i8 < this.f30193f.length; i8++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i8);
            sb.append("]: ");
            sb.append(this.f30193f[i8].size());
            for (Map.Entry entry : this.f30193f[i8].entrySet()) {
                d dVar = (d) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append((String) entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(dVar.toString());
                sb2.append(", tagValue: '");
                sb2.append(dVar.getStringValue(this.f30195h));
                sb2.append("'");
            }
        }
    }

    private ByteOrder Q(b bVar) throws IOException {
        short s8 = bVar.readShort();
        if (s8 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s8 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s8));
    }

    private void R(byte[] bArr, int i8) throws IOException {
        b bVar = new b(bArr);
        O(bVar, bArr.length);
        S(bVar, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void S(e0.C5339a.b r26, int r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C5339a.S(e0.a$b, int):void");
    }

    private void T(String str) {
        for (int i8 = 0; i8 < f30168g0.length; i8++) {
            this.f30193f[i8].remove(str);
        }
    }

    private void U(b bVar, int i8) throws Throwable {
        d dVar = (d) this.f30193f[i8].get(TAG_IMAGE_LENGTH);
        d dVar2 = (d) this.f30193f[i8].get(TAG_IMAGE_WIDTH);
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f30193f[i8].get(TAG_JPEG_INTERCHANGE_FORMAT);
            d dVar4 = (d) this.f30193f[i8].get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int intValue = dVar3.getIntValue(this.f30195h);
            int intValue2 = dVar3.getIntValue(this.f30195h);
            bVar.seek(intValue);
            byte[] bArr = new byte[intValue2];
            bVar.read(bArr);
            n(new b(bArr), intValue, i8);
        }
    }

    private void V(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f30183v) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveJpegAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.writeByte(-1);
        if (dataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.writeByte(-40);
        d dVar = (getAttribute(TAG_XMP) == null || !this.f30208u) ? null : (d) this.f30193f[0].remove(TAG_XMP);
        cVar.writeByte(-1);
        cVar.writeByte(-31);
        d0(cVar);
        if (dVar != null) {
            this.f30193f[0].put(TAG_XMP, dVar);
        }
        byte[] bArr = new byte[4096];
        while (dataInputStream.readByte() == -1) {
            byte b9 = dataInputStream.readByte();
            if (b9 == -39 || b9 == -38) {
                cVar.writeByte(-1);
                cVar.writeByte(b9);
                h(dataInputStream, cVar);
                return;
            }
            if (b9 != -31) {
                cVar.writeByte(-1);
                cVar.writeByte(b9);
                int unsignedShort = dataInputStream.readUnsignedShort();
                cVar.writeUnsignedShort(unsignedShort);
                int i8 = unsignedShort - 2;
                if (i8 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i8 > 0) {
                    int i9 = dataInputStream.read(bArr, 0, Math.min(i8, 4096));
                    if (i9 >= 0) {
                        cVar.write(bArr, 0, i9);
                        i8 -= i9;
                    }
                }
            } else {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                int i10 = unsignedShort2 - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i10 >= 6) {
                    if (dataInputStream.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f30177p0)) {
                        int i11 = unsignedShort2 - 8;
                        if (dataInputStream.skipBytes(i11) != i11) {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                cVar.writeByte(-1);
                cVar.writeByte(b9);
                cVar.writeUnsignedShort(unsignedShort2);
                if (i10 >= 6) {
                    i10 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i10 > 0) {
                    int i12 = dataInputStream.read(bArr, 0, Math.min(i10, 4096));
                    if (i12 >= 0) {
                        cVar.write(bArr, 0, i12);
                        i10 -= i12;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void W(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f30183v) {
            StringBuilder sb = new StringBuilder();
            sb.append("savePngAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        i(dataInputStream, cVar, f30140E.length);
        if (this.f30203p == 0) {
            int i8 = dataInputStream.readInt();
            cVar.writeInt(i8);
            i(dataInputStream, cVar, i8 + 8);
        } else {
            i(dataInputStream, cVar, (r2 - r7.length) - 8);
            dataInputStream.skipBytes(dataInputStream.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            d0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f30218a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.writeInt((int) crc32.getValue());
            d(byteArrayOutputStream);
            h(dataInputStream, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            d(byteArrayOutputStream2);
            throw th;
        }
    }

    private void X(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i8;
        int i9;
        int i10;
        int i11;
        if (f30183v) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveWebpAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f30144I;
        i(bVar, cVar, bArr.length);
        byte[] bArr2 = f30145J;
        bVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i12 = this.f30203p;
                    if (i12 != 0) {
                        i(bVar, cVar2, (i12 - ((bArr.length + 4) + bArr2.length)) - 8);
                        bVar.skipBytes(4);
                        bVar.skipBytes(bVar.readInt());
                        d0(cVar2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = f30148M;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i13 = bVar.readInt();
                            byte[] bArr5 = new byte[i13 % 2 == 1 ? i13 + 1 : i13];
                            bVar.read(bArr5);
                            byte b9 = (byte) (8 | bArr5[0]);
                            bArr5[0] = b9;
                            boolean z8 = ((b9 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.writeInt(i13);
                            cVar2.write(bArr5);
                            if (z8) {
                                j(bVar, cVar2, f30151P, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, f30152Q)) {
                                        break;
                                    } else {
                                        k(bVar, cVar2, bArr6);
                                    }
                                }
                                d0(cVar2);
                            } else {
                                j(bVar, cVar2, f30150O, f30149N);
                                d0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = f30150O;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f30149N)) {
                                int i14 = bVar.readInt();
                                int i15 = i14 % 2 == 1 ? i14 + 1 : i14;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    if (bVar.read(bArr9) != 3 || !Arrays.equals(f30147L, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i8 = bVar.readInt();
                                    i9 = (i8 << 18) >> 18;
                                    i10 = (i8 << 2) >> 18;
                                    i15 -= 10;
                                    i11 = 0;
                                } else if (!Arrays.equals(bArr3, f30149N)) {
                                    i8 = 0;
                                    i9 = 0;
                                    i10 = 0;
                                    i11 = 0;
                                } else {
                                    if (bVar.readByte() != 47) {
                                        throw new IOException("Encountered error while checking VP8L signature");
                                    }
                                    i8 = bVar.readInt();
                                    i11 = i8 & 8;
                                    i15 -= 5;
                                    i10 = ((i8 << 4) >> 18) + 1;
                                    i9 = ((i8 << 18) >> 18) + 1;
                                }
                                cVar2.write(bArr4);
                                cVar2.writeInt(10);
                                byte[] bArr10 = new byte[10];
                                byte b10 = (byte) (bArr10[0] | 8);
                                bArr10[0] = b10;
                                bArr10[0] = (byte) (b10 | (i11 << 4));
                                int i16 = i9 - 1;
                                int i17 = i10 - 1;
                                bArr10[4] = (byte) i16;
                                bArr10[5] = (byte) (i16 >> 8);
                                bArr10[6] = (byte) (i16 >> 16);
                                bArr10[7] = (byte) i17;
                                bArr10[8] = (byte) (i17 >> 8);
                                bArr10[9] = (byte) (i17 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.writeInt(i14);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(f30147L);
                                    cVar2.writeInt(i8);
                                } else if (Arrays.equals(bArr3, f30149N)) {
                                    cVar2.write(47);
                                    cVar2.writeInt(i8);
                                }
                                i(bVar, cVar2, i15);
                                d0(cVar2);
                            }
                        }
                    }
                    h(bVar, cVar2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = f30145J;
                    cVar.writeInt(size + bArr11.length);
                    cVar.write(bArr11);
                    byteArrayOutputStream2.writeTo(cVar);
                    d(byteArrayOutputStream2);
                } catch (Exception e8) {
                    e = e8;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    d(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    private void Y(b bVar) throws Throwable {
        HashMap map = this.f30193f[4];
        d dVar = (d) map.get(TAG_COMPRESSION);
        if (dVar == null) {
            this.f30202o = 6;
            x(bVar, map);
            return;
        }
        int intValue = dVar.getIntValue(this.f30195h);
        this.f30202o = intValue;
        if (intValue != 1) {
            if (intValue == 6) {
                x(bVar, map);
                return;
            } else if (intValue != 7) {
                return;
            }
        }
        if (I(map)) {
            y(bVar, map);
        }
    }

    private static boolean Z(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    private void a() {
        String attribute = getAttribute(TAG_DATETIME_ORIGINAL);
        if (attribute != null && getAttribute(TAG_DATETIME) == null) {
            this.f30193f[0].put(TAG_DATETIME, d.createString(attribute));
        }
        if (getAttribute(TAG_IMAGE_WIDTH) == null) {
            this.f30193f[0].put(TAG_IMAGE_WIDTH, d.createULong(0L, this.f30195h));
        }
        if (getAttribute(TAG_IMAGE_LENGTH) == null) {
            this.f30193f[0].put(TAG_IMAGE_LENGTH, d.createULong(0L, this.f30195h));
        }
        if (getAttribute(TAG_ORIENTATION) == null) {
            this.f30193f[0].put(TAG_ORIENTATION, d.createULong(0L, this.f30195h));
        }
        if (getAttribute(TAG_LIGHT_SOURCE) == null) {
            this.f30193f[1].put(TAG_LIGHT_SOURCE, d.createULong(0L, this.f30195h));
        }
    }

    private void a0(int i8, int i9) throws Throwable {
        if (this.f30193f[i8].isEmpty() || this.f30193f[i9].isEmpty()) {
            return;
        }
        d dVar = (d) this.f30193f[i8].get(TAG_IMAGE_LENGTH);
        d dVar2 = (d) this.f30193f[i8].get(TAG_IMAGE_WIDTH);
        d dVar3 = (d) this.f30193f[i9].get(TAG_IMAGE_LENGTH);
        d dVar4 = (d) this.f30193f[i9].get(TAG_IMAGE_WIDTH);
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int intValue = dVar.getIntValue(this.f30195h);
        int intValue2 = dVar2.getIntValue(this.f30195h);
        int intValue3 = dVar3.getIntValue(this.f30195h);
        int intValue4 = dVar4.getIntValue(this.f30195h);
        if (intValue >= intValue3 || intValue2 >= intValue4) {
            return;
        }
        HashMap[] mapArr = this.f30193f;
        HashMap map = mapArr[i8];
        mapArr[i8] = mapArr[i9];
        mapArr[i9] = map;
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b9)));
        }
        return sb.toString();
    }

    private void b0(b bVar, int i8) throws Throwable {
        d dVarCreateUShort;
        d dVarCreateUShort2;
        d dVar = (d) this.f30193f[i8].get(TAG_DEFAULT_CROP_SIZE);
        d dVar2 = (d) this.f30193f[i8].get(TAG_RW2_SENSOR_TOP_BORDER);
        d dVar3 = (d) this.f30193f[i8].get(TAG_RW2_SENSOR_LEFT_BORDER);
        d dVar4 = (d) this.f30193f[i8].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        d dVar5 = (d) this.f30193f[i8].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                U(bVar, i8);
                return;
            }
            int intValue = dVar2.getIntValue(this.f30195h);
            int intValue2 = dVar4.getIntValue(this.f30195h);
            int intValue3 = dVar5.getIntValue(this.f30195h);
            int intValue4 = dVar3.getIntValue(this.f30195h);
            if (intValue2 <= intValue || intValue3 <= intValue4) {
                return;
            }
            d dVarCreateUShort3 = d.createUShort(intValue2 - intValue, this.f30195h);
            d dVarCreateUShort4 = d.createUShort(intValue3 - intValue4, this.f30195h);
            this.f30193f[i8].put(TAG_IMAGE_LENGTH, dVarCreateUShort3);
            this.f30193f[i8].put(TAG_IMAGE_WIDTH, dVarCreateUShort4);
            return;
        }
        if (dVar.format == 5) {
            f[] fVarArr = (f[]) dVar.a(this.f30195h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            dVarCreateUShort = d.createURational(fVarArr[0], this.f30195h);
            dVarCreateUShort2 = d.createURational(fVarArr[1], this.f30195h);
        } else {
            int[] iArr = (int[]) dVar.a(this.f30195h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarCreateUShort = d.createUShort(iArr[0], this.f30195h);
            dVarCreateUShort2 = d.createUShort(iArr[1], this.f30195h);
        }
        this.f30193f[i8].put(TAG_IMAGE_WIDTH, dVarCreateUShort);
        this.f30193f[i8].put(TAG_IMAGE_LENGTH, dVarCreateUShort2);
    }

    private static void c(FileDescriptor fileDescriptor) throws ErrnoException {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterface", "Error closing fd.");
        }
    }

    private void c0() throws Throwable {
        a0(0, 5);
        a0(0, 4);
        a0(5, 4);
        d dVar = (d) this.f30193f[1].get(TAG_PIXEL_X_DIMENSION);
        d dVar2 = (d) this.f30193f[1].get(TAG_PIXEL_Y_DIMENSION);
        if (dVar != null && dVar2 != null) {
            this.f30193f[0].put(TAG_IMAGE_WIDTH, dVar);
            this.f30193f[0].put(TAG_IMAGE_LENGTH, dVar2);
        }
        if (this.f30193f[4].isEmpty() && K(this.f30193f[5])) {
            HashMap[] mapArr = this.f30193f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        K(this.f30193f[4]);
    }

    private static void d(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    private int d0(c cVar) throws IOException {
        e[][] eVarArr = f30168g0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f30169h0) {
            T(eVar.name);
        }
        T(f30170i0.name);
        T(f30171j0.name);
        for (int i8 = 0; i8 < f30168g0.length; i8++) {
            for (Object obj : this.f30193f[i8].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f30193f[i8].remove(entry.getKey());
                }
            }
        }
        if (!this.f30193f[1].isEmpty()) {
            this.f30193f[0].put(f30169h0[1].name, d.createULong(0L, this.f30195h));
        }
        if (!this.f30193f[2].isEmpty()) {
            this.f30193f[0].put(f30169h0[2].name, d.createULong(0L, this.f30195h));
        }
        if (!this.f30193f[3].isEmpty()) {
            this.f30193f[1].put(f30169h0[3].name, d.createULong(0L, this.f30195h));
        }
        if (this.f30196i) {
            this.f30193f[4].put(f30170i0.name, d.createULong(0L, this.f30195h));
            this.f30193f[4].put(f30171j0.name, d.createULong(this.f30200m, this.f30195h));
        }
        for (int i9 = 0; i9 < f30168g0.length; i9++) {
            Iterator it = this.f30193f[i9].entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int size = ((d) ((Map.Entry) it.next()).getValue()).size();
                if (size > 4) {
                    i10 += size;
                }
            }
            iArr2[i9] = iArr2[i9] + i10;
        }
        int size2 = 8;
        for (int i11 = 0; i11 < f30168g0.length; i11++) {
            if (!this.f30193f[i11].isEmpty()) {
                iArr[i11] = size2;
                size2 += (this.f30193f[i11].size() * 12) + 6 + iArr2[i11];
            }
        }
        if (this.f30196i) {
            this.f30193f[4].put(f30170i0.name, d.createULong(size2, this.f30195h));
            this.f30199l = size2;
            size2 += this.f30200m;
        }
        if (this.f30191d == 4) {
            size2 += 8;
        }
        if (f30183v) {
            for (int i12 = 0; i12 < f30168g0.length; i12++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i12), Integer.valueOf(iArr[i12]), Integer.valueOf(this.f30193f[i12].size()), Integer.valueOf(iArr2[i12]), Integer.valueOf(size2));
            }
        }
        if (!this.f30193f[1].isEmpty()) {
            this.f30193f[0].put(f30169h0[1].name, d.createULong(iArr[1], this.f30195h));
        }
        if (!this.f30193f[2].isEmpty()) {
            this.f30193f[0].put(f30169h0[2].name, d.createULong(iArr[2], this.f30195h));
        }
        if (!this.f30193f[3].isEmpty()) {
            this.f30193f[1].put(f30169h0[3].name, d.createULong(iArr[3], this.f30195h));
        }
        int i13 = this.f30191d;
        if (i13 == 4) {
            cVar.writeUnsignedShort(size2);
            cVar.write(f30177p0);
        } else if (i13 == 13) {
            cVar.writeInt(size2);
            cVar.write(f30141F);
        } else if (i13 == 14) {
            cVar.write(f30146K);
            cVar.writeInt(size2);
        }
        cVar.writeShort(this.f30195h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.setByteOrder(this.f30195h);
        cVar.writeUnsignedShort(42);
        cVar.writeUnsignedInt(8L);
        for (int i14 = 0; i14 < f30168g0.length; i14++) {
            if (!this.f30193f[i14].isEmpty()) {
                cVar.writeUnsignedShort(this.f30193f[i14].size());
                int size3 = iArr[i14] + 2 + (this.f30193f[i14].size() * 12) + 4;
                for (Map.Entry entry2 : this.f30193f[i14].entrySet()) {
                    int i15 = ((e) f30173l0[i14].get(entry2.getKey())).number;
                    d dVar = (d) entry2.getValue();
                    int size4 = dVar.size();
                    cVar.writeUnsignedShort(i15);
                    cVar.writeUnsignedShort(dVar.format);
                    cVar.writeInt(dVar.numberOfComponents);
                    if (size4 > 4) {
                        cVar.writeUnsignedInt(size3);
                        size3 += size4;
                    } else {
                        cVar.write(dVar.bytes);
                        if (size4 < 4) {
                            while (size4 < 4) {
                                cVar.writeByte(0);
                                size4++;
                            }
                        }
                    }
                }
                if (i14 != 0 || this.f30193f[4].isEmpty()) {
                    cVar.writeUnsignedInt(0L);
                } else {
                    cVar.writeUnsignedInt(iArr[4]);
                }
                Iterator it2 = this.f30193f[i14].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).bytes;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f30196i) {
            cVar.write(getThumbnailBytes());
        }
        if (this.f30191d == 14 && size2 % 2 == 1) {
            cVar.writeByte(0);
        }
        cVar.setByteOrder(ByteOrder.BIG_ENDIAN);
        return size2;
    }

    private String e(double d9) {
        long j8 = (long) d9;
        double d10 = d9 - j8;
        long j9 = (long) (d10 * 60.0d);
        return j8 + "/1," + j9 + "/1," + Math.round((d10 - (j9 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private static double f(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d9 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d11 = d9 + (d10 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals(LONGITUDE_WEST)) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d11;
            }
            return -d11;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private static long[] g(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            jArr[i8] = iArr[i8];
        }
        return jArr;
    }

    private static int h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i8 = 0;
        while (true) {
            int i9 = inputStream.read(bArr);
            if (i9 == -1) {
                return i8;
            }
            i8 += i9;
            outputStream.write(bArr, 0, i9);
        }
    }

    private static void i(InputStream inputStream, OutputStream outputStream, int i8) throws IOException {
        byte[] bArr = new byte[8192];
        while (i8 > 0) {
            int iMin = Math.min(i8, 8192);
            int i9 = inputStream.read(bArr, 0, iMin);
            if (i9 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i8 -= i9;
            outputStream.write(bArr, 0, i9);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean isSupportedMimeType(String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        char c9 = 65535;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    c9 = 2;
                    break;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    c9 = 3;
                    break;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    c9 = 4;
                    break;
                }
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    c9 = 5;
                    break;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    c9 = 6;
                    break;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    c9 = 7;
                    break;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    c9 = '\b';
                    break;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    c9 = '\t';
                    break;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    c9 = 11;
                    break;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    c9 = C0712p.CR;
                    break;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    c9 = 14;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return true;
            default:
                return false;
        }
    }

    private void j(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f30176o0;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            k(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void k(b bVar, c cVar, byte[] bArr) throws IOException {
        int i8 = bVar.readInt();
        cVar.write(bArr);
        cVar.writeInt(i8);
        if (i8 % 2 == 1) {
            i8++;
        }
        i(bVar, cVar, i8);
    }

    private d l(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i8 = 0; i8 < f30168g0.length; i8++) {
            d dVar = (d) this.f30193f[i8].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void m(b bVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0274a(bVar));
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
            if (C0709m.YES.equals(strExtractMetadata6)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
            } else if (C0709m.YES.equals(strExtractMetadata7)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                strExtractMetadata = null;
                strExtractMetadata2 = null;
                strExtractMetadata3 = null;
            }
            if (strExtractMetadata != null) {
                this.f30193f[0].put(TAG_IMAGE_WIDTH, d.createUShort(Integer.parseInt(strExtractMetadata), this.f30195h));
            }
            if (strExtractMetadata2 != null) {
                this.f30193f[0].put(TAG_IMAGE_LENGTH, d.createUShort(Integer.parseInt(strExtractMetadata2), this.f30195h));
            }
            if (strExtractMetadata3 != null) {
                int i8 = Integer.parseInt(strExtractMetadata3);
                this.f30193f[0].put(TAG_ORIENTATION, d.createUShort(i8 != 90 ? i8 != 180 ? i8 != 270 ? 1 : 8 : 3 : 6, this.f30195h));
            }
            if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                int i9 = Integer.parseInt(strExtractMetadata4);
                int i10 = Integer.parseInt(strExtractMetadata5);
                if (i10 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.seek(i9);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i11 = i9 + 6;
                int i12 = i10 - 6;
                if (!Arrays.equals(bArr, f30177p0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i12];
                if (bVar.read(bArr2) != i12) {
                    throw new IOException("Can't read exif");
                }
                this.f30203p = i11;
                R(bArr2, 0);
            }
            if (f30183v) {
                StringBuilder sb = new StringBuilder();
                sb.append("Heif meta: ");
                sb.append(strExtractMetadata);
                sb.append("x");
                sb.append(strExtractMetadata2);
                sb.append(", rotation ");
                sb.append(strExtractMetadata3);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
    
        r19.setByteOrder(r18.f30195h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n(e0.C5339a.b r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C5339a.n(e0.a$b, int, int):void");
    }

    private int o(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (C(bArr)) {
            return 4;
        }
        if (F(bArr)) {
            return 9;
        }
        if (B(bArr)) {
            return 12;
        }
        if (D(bArr)) {
            return 7;
        }
        if (G(bArr)) {
            return 10;
        }
        if (E(bArr)) {
            return 13;
        }
        return L(bArr) ? 14 : 0;
    }

    private void p(b bVar) throws Throwable {
        int i8;
        int i9;
        s(bVar);
        d dVar = (d) this.f30193f[1].get(TAG_MAKER_NOTE);
        if (dVar != null) {
            b bVar2 = new b(dVar.bytes);
            bVar2.setByteOrder(this.f30195h);
            byte[] bArr = f30138C;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.seek(0L);
            byte[] bArr3 = f30139D;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.seek(12L);
            }
            S(bVar2, 6);
            d dVar2 = (d) this.f30193f[7].get(TAG_ORF_PREVIEW_IMAGE_START);
            d dVar3 = (d) this.f30193f[7].get(TAG_ORF_PREVIEW_IMAGE_LENGTH);
            if (dVar2 != null && dVar3 != null) {
                this.f30193f[5].put(TAG_JPEG_INTERCHANGE_FORMAT, dVar2);
                this.f30193f[5].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, dVar3);
            }
            d dVar4 = (d) this.f30193f[8].get(TAG_ORF_ASPECT_FRAME);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.a(this.f30195h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i10 = iArr[2];
                int i11 = iArr[0];
                if (i10 <= i11 || (i8 = iArr[3]) <= (i9 = iArr[1])) {
                    return;
                }
                int i12 = (i10 - i11) + 1;
                int i13 = (i8 - i9) + 1;
                if (i12 < i13) {
                    int i14 = i12 + i13;
                    i13 = i14 - i13;
                    i12 = i14 - i13;
                }
                d dVarCreateUShort = d.createUShort(i12, this.f30195h);
                d dVarCreateUShort2 = d.createUShort(i13, this.f30195h);
                this.f30193f[0].put(TAG_IMAGE_WIDTH, dVarCreateUShort);
                this.f30193f[0].put(TAG_IMAGE_LENGTH, dVarCreateUShort2);
            }
        }
    }

    private void q(b bVar) throws Throwable {
        if (f30183v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.mark(0);
        bVar.setByteOrder(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f30140E;
        bVar.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i8 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i9 = length + 8;
                if (i9 == 16 && !Arrays.equals(bArr2, f30142G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f30143H)) {
                    return;
                }
                if (Arrays.equals(bArr2, f30141F)) {
                    byte[] bArr3 = new byte[i8];
                    if (bVar.read(bArr3) != i8) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int i10 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i10) {
                        this.f30203p = i9;
                        R(bArr3, 0);
                        c0();
                        Y(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i10 + ", calculated CRC value: " + crc32.getValue());
                }
                int i11 = i8 + 4;
                bVar.skipBytes(i11);
                length = i9 + i11;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void r(b bVar) throws Throwable {
        boolean z8 = f30183v;
        if (z8) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRafAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        int i10 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i9];
        bVar.seek(i8);
        bVar.read(bArr4);
        n(new b(bArr4), i8, 5);
        bVar.seek(i10);
        bVar.setByteOrder(ByteOrder.BIG_ENDIAN);
        int i11 = bVar.readInt();
        if (z8) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append(i11);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f30163b0.number) {
                short s8 = bVar.readShort();
                short s9 = bVar.readShort();
                d dVarCreateUShort = d.createUShort(s8, this.f30195h);
                d dVarCreateUShort2 = d.createUShort(s9, this.f30195h);
                this.f30193f[0].put(TAG_IMAGE_LENGTH, dVarCreateUShort);
                this.f30193f[0].put(TAG_IMAGE_WIDTH, dVarCreateUShort2);
                if (f30183v) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Updated to length: ");
                    sb3.append((int) s8);
                    sb3.append(", width: ");
                    sb3.append((int) s9);
                    return;
                }
                return;
            }
            bVar.skipBytes(unsignedShort2);
        }
    }

    private void s(b bVar) throws Throwable {
        d dVar;
        O(bVar, bVar.available());
        S(bVar, 0);
        b0(bVar, 0);
        b0(bVar, 5);
        b0(bVar, 4);
        c0();
        if (this.f30191d != 8 || (dVar = (d) this.f30193f[1].get(TAG_MAKER_NOTE)) == null) {
            return;
        }
        b bVar2 = new b(dVar.bytes);
        bVar2.setByteOrder(this.f30195h);
        bVar2.seek(6L);
        S(bVar2, 9);
        d dVar2 = (d) this.f30193f[9].get(TAG_COLOR_SPACE);
        if (dVar2 != null) {
            this.f30193f[1].put(TAG_COLOR_SPACE, dVar2);
        }
    }

    private void t(b bVar) throws Throwable {
        if (f30183v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRw2Attributes starting with: ");
            sb.append(bVar);
        }
        s(bVar);
        d dVar = (d) this.f30193f[0].get(TAG_RW2_JPG_FROM_RAW);
        if (dVar != null) {
            n(new b(dVar.bytes), (int) dVar.bytesOffset, 5);
        }
        d dVar2 = (d) this.f30193f[0].get(TAG_RW2_ISO);
        d dVar3 = (d) this.f30193f[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f30193f[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, dVar2);
    }

    private void u(b bVar) throws IOException {
        byte[] bArr = f30177p0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f30203p = bArr.length;
        R(bArr2, 0);
    }

    private void v(b bVar) throws Throwable {
        if (f30183v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.mark(0);
        bVar.setByteOrder(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(f30144I.length);
        int i8 = bVar.readInt() + 8;
        int iSkipBytes = bVar.skipBytes(f30145J.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i9 = bVar.readInt();
                int i10 = iSkipBytes + 8;
                if (Arrays.equals(f30146K, bArr)) {
                    byte[] bArr2 = new byte[i9];
                    if (bVar.read(bArr2) == i9) {
                        this.f30203p = i10;
                        R(bArr2, 0);
                        Y(new b(bArr2));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                }
                if (i9 % 2 == 1) {
                    i9++;
                }
                int i11 = i10 + i9;
                if (i11 == i8) {
                    return;
                }
                if (i11 > i8) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int iSkipBytes2 = bVar.skipBytes(i9);
                if (iSkipBytes2 != i9) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                iSkipBytes = i10 + iSkipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair w(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairW = w(strArrSplit[0]);
            if (((Integer) pairW.first).intValue() == 2) {
                return pairW;
            }
            for (int i8 = 1; i8 < strArrSplit.length; i8++) {
                Pair pairW2 = w(strArrSplit[i8]);
                int iIntValue = (((Integer) pairW2.first).equals(pairW.first) || ((Integer) pairW2.second).equals(pairW.first)) ? ((Integer) pairW.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairW.second).intValue() == -1 || !(((Integer) pairW2.first).equals(pairW.second) || ((Integer) pairW2.second).equals(pairW.second))) ? -1 : ((Integer) pairW.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairW = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairW = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairW;
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

    private void x(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get(TAG_JPEG_INTERCHANGE_FORMAT);
        d dVar2 = (d) map.get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (dVar == null || dVar2 == null) {
            return;
        }
        int intValue = dVar.getIntValue(this.f30195h);
        int intValue2 = dVar2.getIntValue(this.f30195h);
        if (this.f30191d == 7) {
            intValue += this.f30204q;
        }
        int iMin = Math.min(intValue2, bVar.getLength() - intValue);
        if (intValue > 0 && iMin > 0) {
            this.f30196i = true;
            if (this.f30188a == null && this.f30190c == null && this.f30189b == null) {
                byte[] bArr = new byte[iMin];
                bVar.skip(intValue);
                bVar.read(bArr);
                this.f30201n = bArr;
            }
            this.f30199l = intValue;
            this.f30200m = iMin;
        }
        if (f30183v) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting thumbnail attributes with offset: ");
            sb.append(intValue);
            sb.append(", length: ");
            sb.append(iMin);
        }
    }

    private void y(b bVar, HashMap map) {
        d dVar = (d) map.get(TAG_STRIP_OFFSETS);
        d dVar2 = (d) map.get(TAG_STRIP_BYTE_COUNTS);
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrG = g(dVar.a(this.f30195h));
        long[] jArrG2 = g(dVar2.a(this.f30195h));
        if (jArrG == null || jArrG.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrG2 == null || jArrG2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrG.length != jArrG2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j8 = 0;
        for (long j9 : jArrG2) {
            j8 += j9;
        }
        int i8 = (int) j8;
        byte[] bArr = new byte[i8];
        this.f30198k = true;
        this.f30197j = true;
        this.f30196i = true;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < jArrG.length; i11++) {
            int i12 = (int) jArrG[i11];
            int i13 = (int) jArrG2[i11];
            if (i11 < jArrG.length - 1 && i12 + i13 != jArrG[i11 + 1]) {
                this.f30198k = false;
            }
            int i14 = i12 - i9;
            if (i14 < 0) {
                return;
            }
            long j10 = i14;
            if (bVar.skip(j10) != j10) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to skip ");
                sb.append(i14);
                sb.append(" bytes.");
                return;
            }
            int i15 = i9 + i14;
            byte[] bArr2 = new byte[i13];
            if (bVar.read(bArr2) != i13) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to read ");
                sb2.append(i13);
                sb2.append(" bytes.");
                return;
            }
            i9 = i15 + i13;
            System.arraycopy(bArr2, 0, bArr, i10, i13);
            i10 += i13;
        }
        this.f30201n = bArr;
        if (this.f30198k) {
            this.f30199l = (int) jArrG[0];
            this.f30200m = i8;
        }
    }

    private void z(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f30190c = null;
        this.f30188a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (H(fileInputStream2.getFD())) {
                    this.f30189b = fileInputStream2.getFD();
                } else {
                    this.f30189b = null;
                }
                M(fileInputStream2);
                d(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                d(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void flipHorizontally() throws NumberFormatException {
        int i8 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i8 = 2;
                break;
            case 2:
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
                i8 = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i8));
    }

    public void flipVertically() throws NumberFormatException {
        int i8 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i8 = 4;
                break;
            case 2:
                i8 = 3;
                break;
            case 3:
                i8 = 2;
                break;
            case 4:
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
                i8 = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i8));
    }

    public double getAltitude(double d9) {
        double attributeDouble = getAttributeDouble(TAG_GPS_ALTITUDE, -1.0d);
        int attributeInt = getAttributeInt(TAG_GPS_ALTITUDE_REF, -1);
        if (attributeDouble < 0.0d || attributeInt < 0) {
            return d9;
        }
        return attributeDouble * (attributeInt != 1 ? 1 : -1);
    }

    public String getAttribute(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarL = l(str);
        if (dVarL != null) {
            if (!f30174m0.contains(str)) {
                return dVarL.getStringValue(this.f30195h);
            }
            if (str.equals(TAG_GPS_TIMESTAMP)) {
                int i8 = dVarL.format;
                if (i8 != 5 && i8 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + dVarL.format);
                    return null;
                }
                f[] fVarArr = (f[]) dVarL.a(this.f30195h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.numerator / fVar.denominator));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.numerator / fVar2.denominator));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.numerator / fVar3.denominator)));
            }
            try {
                return Double.toString(dVarL.getDoubleValue(this.f30195h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public byte[] getAttributeBytes(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarL = l(str);
        if (dVarL != null) {
            return dVarL.bytes;
        }
        return null;
    }

    public double getAttributeDouble(String str, double d9) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarL = l(str);
        if (dVarL == null) {
            return d9;
        }
        try {
            return dVarL.getDoubleValue(this.f30195h);
        } catch (NumberFormatException unused) {
            return d9;
        }
    }

    public int getAttributeInt(String str, int i8) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarL = l(str);
        if (dVarL == null) {
            return i8;
        }
        try {
            return dVarL.getIntValue(this.f30195h);
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    public long[] getAttributeRange(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f30207t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d dVarL = l(str);
        if (dVarL != null) {
            return new long[]{dVarL.bytesOffset, dVarL.bytes.length};
        }
        return null;
    }

    public Long getDateTime() {
        return N(getAttribute(TAG_DATETIME), getAttribute(TAG_SUBSEC_TIME), getAttribute(TAG_OFFSET_TIME));
    }

    public Long getDateTimeDigitized() {
        return N(getAttribute(TAG_DATETIME_DIGITIZED), getAttribute(TAG_SUBSEC_TIME_DIGITIZED), getAttribute(TAG_OFFSET_TIME_DIGITIZED));
    }

    public Long getDateTimeOriginal() {
        return N(getAttribute(TAG_DATETIME_ORIGINAL), getAttribute(TAG_SUBSEC_TIME_ORIGINAL), getAttribute(TAG_OFFSET_TIME_ORIGINAL));
    }

    public Long getGpsDateTime() {
        String attribute = getAttribute(TAG_GPS_DATESTAMP);
        String attribute2 = getAttribute(TAG_GPS_TIMESTAMP);
        if (attribute != null && attribute2 != null) {
            Pattern pattern = f30179r0;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                String str = attribute + ' ' + attribute2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = f30153R.parse(str, parsePosition);
                    if (date == null && (date = f30154S.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] getThumbnail() {
        int i8 = this.f30202o;
        if (i8 == 6 || i8 == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    public Bitmap getThumbnailBitmap() throws Throwable {
        if (!this.f30196i) {
            return null;
        }
        if (this.f30201n == null) {
            this.f30201n = getThumbnailBytes();
        }
        int i8 = this.f30202o;
        if (i8 == 6 || i8 == 7) {
            return BitmapFactory.decodeByteArray(this.f30201n, 0, this.f30200m);
        }
        if (i8 == 1) {
            int length = this.f30201n.length / 3;
            int[] iArr = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                byte[] bArr = this.f30201n;
                int i10 = i9 * 3;
                iArr[i9] = (bArr[i10] << AbstractC5358c.DLE) + (bArr[i10 + 1] << 8) + bArr[i10 + 2];
            }
            d dVar = (d) this.f30193f[4].get(TAG_IMAGE_LENGTH);
            d dVar2 = (d) this.f30193f[4].get(TAG_IMAGE_WIDTH);
            if (dVar != null && dVar2 != null) {
                return Bitmap.createBitmap(iArr, dVar2.getIntValue(this.f30195h), dVar.getIntValue(this.f30195h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] getThumbnailBytes() throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r8.f30196i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r8.f30201n
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r8.f30190c     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r0 == 0) goto L28
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
            if (r2 == 0) goto L24
            r0.reset()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
        L18:
            r2 = r1
            goto L52
        L1a:
            r2 = move-exception
            r7 = r1
            r1 = r0
            r0 = r2
            r2 = r7
            goto L97
        L21:
            r2 = r1
            goto La0
        L24:
            d(r0)
            return r1
        L28:
            java.lang.String r0 = r8.f30188a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r0 == 0) goto L3d
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.lang.String r2 = r8.f30188a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            goto L18
        L34:
            r2 = move-exception
            r0 = r2
            r2 = r1
            goto L97
        L39:
            r0 = r1
            r2 = r0
            goto La0
        L3d:
            java.io.FileDescriptor r0 = r8.f30189b     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.io.FileDescriptor r0 = android.system.Os.dup(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r3 = 0
            android.system.Os.lseek(r0, r3, r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r7 = r2
            r2 = r0
            r0 = r7
        L52:
            int r3 = r8.f30199l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r4 = r8.f30203p     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            long r3 = r0.skip(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r8.f30199l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.f30203p     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L8a
            int r3 = r8.f30200m     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r0.read(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.f30200m     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            if (r5 != r6) goto L84
            r8.f30201n = r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            d(r0)
            if (r2 == 0) goto L7e
            c(r2)
        L7e:
            return r3
        L7f:
            r1 = move-exception
            r7 = r1
            r1 = r0
        L82:
            r0 = r7
            goto L97
        L84:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            throw r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
        L8a:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            throw r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
        L90:
            r2 = move-exception
            r7 = r2
            r2 = r0
            goto L82
        L94:
            r2 = r0
            r0 = r1
            goto La0
        L97:
            d(r1)
            if (r2 == 0) goto L9f
            c(r2)
        L9f:
            throw r0
        La0:
            d(r0)
            if (r2 == 0) goto La8
            c(r2)
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C5339a.getThumbnailBytes():byte[]");
    }

    public long[] getThumbnailRange() {
        if (this.f30207t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f30196i) {
            return null;
        }
        if (!this.f30197j || this.f30198k) {
            return new long[]{this.f30199l + this.f30203p, this.f30200m};
        }
        return null;
    }

    public boolean hasAttribute(String str) {
        return l(str) != null;
    }

    public boolean hasThumbnail() {
        return this.f30196i;
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public boolean isThumbnailCompressed() {
        if (!this.f30196i) {
            return false;
        }
        int i8 = this.f30202o;
        return i8 == 6 || i8 == 7;
    }

    public void resetOrientation() throws NumberFormatException {
        setAttribute(TAG_ORIENTATION, Integer.toString(1));
    }

    public void rotate(int i8) throws NumberFormatException {
        if (i8 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        List list = f30184w;
        if (list.contains(Integer.valueOf(attributeInt))) {
            int iIndexOf = (list.indexOf(Integer.valueOf(attributeInt)) + (i8 / 90)) % 4;
            iIntValue = ((Integer) list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0))).intValue();
        } else {
            List list2 = f30185x;
            if (list2.contains(Integer.valueOf(attributeInt))) {
                int iIndexOf2 = (list2.indexOf(Integer.valueOf(attributeInt)) + (i8 / 90)) % 4;
                iIntValue = ((Integer) list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0))).intValue();
            }
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(iIntValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00da A[Catch: all -> 0x00ea, Exception -> 0x00ed, TryCatch #20 {Exception -> 0x00ed, all -> 0x00ea, blocks: (B:59:0x00d6, B:61:0x00da, B:68:0x00f7, B:67:0x00ef), top: B:111:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef A[Catch: all -> 0x00ea, Exception -> 0x00ed, TryCatch #20 {Exception -> 0x00ed, all -> 0x00ea, blocks: (B:59:0x00d6, B:61:0x00da, B:68:0x00f7, B:67:0x00ef), top: B:111:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void saveAttributes() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C5339a.saveAttributes():void");
    }

    public void setAltitude(double d9) throws NumberFormatException {
        String str = d9 >= 0.0d ? "0" : "1";
        setAttribute(TAG_GPS_ALTITUDE, new f(Math.abs(d9)).toString());
        setAttribute(TAG_GPS_ALTITUDE_REF, str);
    }

    public void setAttribute(String str, String str2) throws NumberFormatException {
        e eVar;
        int i8;
        int i9;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ((TAG_DATETIME.equals(str3) || TAG_DATETIME_ORIGINAL.equals(str3) || TAG_DATETIME_DIGITIZED.equals(str3)) && strReplaceAll != null) {
            boolean zFind = f30181t0.matcher(strReplaceAll).find();
            boolean zFind2 = f30182u0.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll(g5.e.STATE_NAME_NONE, ":");
            }
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str3)) {
            str3 = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        int i10 = 2;
        int i11 = 1;
        if (strReplaceAll != null && f30174m0.contains(str3)) {
            if (str3.equals(TAG_GPS_TIMESTAMP)) {
                Matcher matcher = f30180s0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new f(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i12 = 0;
        int i13 = 0;
        while (i13 < f30168g0.length) {
            if ((i13 != 4 || this.f30196i) && (eVar = (e) f30173l0[i13].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair pairW = w(strReplaceAll);
                    if (eVar.primaryFormat == ((Integer) pairW.first).intValue() || eVar.primaryFormat == ((Integer) pairW.second).intValue()) {
                        i8 = eVar.primaryFormat;
                    } else {
                        int i14 = eVar.secondaryFormat;
                        if (i14 == -1 || !(i14 == ((Integer) pairW.first).intValue() || eVar.secondaryFormat == ((Integer) pairW.second).intValue())) {
                            int i15 = eVar.primaryFormat;
                            if (i15 == i11 || i15 == 7 || i15 == i10) {
                                i8 = i15;
                            } else if (f30183v) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Given tag (");
                                sb.append(str3);
                                sb.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f30155T;
                                sb.append(strArr[eVar.primaryFormat]);
                                sb.append(eVar.secondaryFormat == -1 ? "" : ", " + strArr[eVar.secondaryFormat]);
                                sb.append(" (guess: ");
                                sb.append(strArr[((Integer) pairW.first).intValue()]);
                                sb.append(((Integer) pairW.second).intValue() != -1 ? ", " + strArr[((Integer) pairW.second).intValue()] : "");
                                sb.append(")");
                            }
                        } else {
                            i8 = eVar.secondaryFormat;
                        }
                    }
                    String str4 = "/";
                    switch (i8) {
                        case 1:
                            i9 = i12;
                            this.f30193f[i13].put(str3, d.createByte(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i9 = i12;
                            this.f30193f[i13].put(str3, d.createString(strReplaceAll));
                            break;
                        case 3:
                            i9 = i12;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i16 = i9; i16 < strArrSplit.length; i16++) {
                                iArr[i16] = Integer.parseInt(strArrSplit[i16]);
                            }
                            this.f30193f[i13].put(str3, d.createUShort(iArr, this.f30195h));
                            break;
                        case 4:
                            i9 = i12;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i17 = i9; i17 < strArrSplit2.length; i17++) {
                                jArr[i17] = Long.parseLong(strArrSplit2[i17]);
                            }
                            this.f30193f[i13].put(str3, d.createULong(jArr, this.f30195h));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            f[] fVarArr = new f[strArrSplit3.length];
                            int i18 = 0;
                            while (i18 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i18].split(str4, -1);
                                fVarArr[i18] = new f((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i11]));
                                i18++;
                                str4 = str4;
                                i11 = 1;
                            }
                            i9 = 0;
                            this.f30193f[i13].put(str3, d.createURational(fVarArr, this.f30195h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f30183v) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Data format isn't one of expected formats: ");
                                sb2.append(i8);
                                break;
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i19 = 0; i19 < strArrSplit5.length; i19++) {
                                iArr2[i19] = Integer.parseInt(strArrSplit5[i19]);
                            }
                            this.f30193f[i13].put(str3, d.createSLong(iArr2, this.f30195h));
                            i9 = 0;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            f[] fVarArr2 = new f[strArrSplit6.length];
                            int i20 = i12;
                            while (i20 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i20].split("/", -1);
                                fVarArr2[i20] = new f((long) Double.parseDouble(strArrSplit7[i12]), (long) Double.parseDouble(strArrSplit7[i11]));
                                i20++;
                                i12 = 0;
                            }
                            this.f30193f[i13].put(str3, d.createSRational(fVarArr2, this.f30195h));
                            i9 = 0;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i21 = i12; i21 < strArrSplit8.length; i21++) {
                                dArr[i21] = Double.parseDouble(strArrSplit8[i21]);
                            }
                            this.f30193f[i13].put(str3, d.createDouble(dArr, this.f30195h));
                            break;
                    }
                } else {
                    this.f30193f[i13].remove(str3);
                }
                i9 = i12;
            } else {
                i9 = i12;
            }
            i13++;
            i12 = i9;
            i10 = 2;
            i11 = 1;
        }
    }

    public void setDateTime(Long l8) throws NumberFormatException {
        long jLongValue = l8.longValue() % 1000;
        setAttribute(TAG_DATETIME, f30153R.format(new Date(l8.longValue())));
        setAttribute(TAG_SUBSEC_TIME, Long.toString(jLongValue));
    }

    public void setGpsInfo(Location location) throws NumberFormatException {
        if (location == null) {
            return;
        }
        setAttribute(TAG_GPS_PROCESSING_METHOD, location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute(TAG_GPS_SPEED_REF, "K");
        setAttribute(TAG_GPS_SPEED, new f((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f30153R.format(new Date(location.getTime())).split("\\s+", -1);
        setAttribute(TAG_GPS_DATESTAMP, strArrSplit[0]);
        setAttribute(TAG_GPS_TIMESTAMP, strArrSplit[1]);
    }

    public void setLatLong(double d9, double d10) throws NumberFormatException {
        if (d9 < -90.0d || d9 > 90.0d || Double.isNaN(d9)) {
            throw new IllegalArgumentException("Latitude value " + d9 + " is not valid.");
        }
        if (d10 < -180.0d || d10 > 180.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Longitude value " + d10 + " is not valid.");
        }
        setAttribute(TAG_GPS_LATITUDE_REF, d9 >= 0.0d ? "N" : "S");
        setAttribute(TAG_GPS_LATITUDE, e(Math.abs(d9)));
        setAttribute(TAG_GPS_LONGITUDE_REF, d10 >= 0.0d ? "E" : LONGITUDE_WEST);
        setAttribute(TAG_GPS_LONGITUDE, e(Math.abs(d10)));
    }

    public double[] getLatLong() {
        String attribute = getAttribute(TAG_GPS_LATITUDE);
        String attribute2 = getAttribute(TAG_GPS_LATITUDE_REF);
        String attribute3 = getAttribute(TAG_GPS_LONGITUDE);
        String attribute4 = getAttribute(TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{f(attribute, attribute2), f(attribute3, attribute4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", attribute, attribute2, attribute3, attribute4));
            return null;
        }
    }

    /* renamed from: e0.a$e */
    static class e {
        public final String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        e(String str, int i8, int i9) {
            this.name = str;
            this.number = i8;
            this.primaryFormat = i9;
            this.secondaryFormat = -1;
        }

        boolean a(int i8) {
            int i9;
            int i10 = this.primaryFormat;
            if (i10 == 7 || i8 == 7 || i10 == i8 || (i9 = this.secondaryFormat) == i8) {
                return true;
            }
            if ((i10 == 4 || i9 == 4) && i8 == 3) {
                return true;
            }
            if ((i10 == 9 || i9 == 9) && i8 == 8) {
                return true;
            }
            return (i10 == 12 || i9 == 12) && i8 == 11;
        }

        e(String str, int i8, int i9, int i10) {
            this.name = str;
            this.number = i8;
            this.primaryFormat = i9;
            this.secondaryFormat = i10;
        }
    }

    public C5339a(String str) throws Throwable {
        e[][] eVarArr = f30168g0;
        this.f30193f = new HashMap[eVarArr.length];
        this.f30194g = new HashSet(eVarArr.length);
        this.f30195h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            z(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public C5339a(FileDescriptor fileDescriptor) throws Throwable {
        boolean z8;
        FileInputStream fileInputStream;
        Throwable th;
        e[][] eVarArr = f30168g0;
        this.f30193f = new HashMap[eVarArr.length];
        this.f30194g = new HashSet(eVarArr.length);
        this.f30195h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f30190c = null;
            this.f30188a = null;
            if (H(fileDescriptor)) {
                this.f30189b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z8 = true;
                } catch (Exception e8) {
                    throw new IOException("Failed to duplicate file descriptor", e8);
                }
            } else {
                this.f30189b = null;
                z8 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
            } catch (Throwable th2) {
                fileInputStream = null;
                th = th2;
            }
            try {
                M(fileInputStream);
                d(fileInputStream);
                if (z8) {
                    c(fileDescriptor);
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                d(fileInputStream);
                if (z8) {
                    c(fileDescriptor);
                }
                throw th;
            }
        }
        throw new NullPointerException("fileDescriptor cannot be null");
    }

    /* renamed from: e0.a$a, reason: collision with other inner class name */
    class C0274a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        long f30209a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f30210b;

        C0274a(b bVar) {
            this.f30210b = bVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j8, byte[] bArr, int i8, int i9) {
            if (i9 == 0) {
                return 0;
            }
            if (j8 < 0) {
                return -1;
            }
            try {
                long j9 = this.f30209a;
                if (j9 != j8) {
                    if (j9 >= 0 && j8 >= j9 + this.f30210b.available()) {
                        return -1;
                    }
                    this.f30210b.seek(j8);
                    this.f30209a = j8;
                }
                if (i9 > this.f30210b.available()) {
                    i9 = this.f30210b.available();
                }
                int i10 = this.f30210b.read(bArr, i8, i9);
                if (i10 >= 0) {
                    this.f30209a += i10;
                    return i10;
                }
            } catch (IOException unused) {
            }
            this.f30209a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public C5339a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5339a(java.io.InputStream r4, int r5) {
        /*
            r3 = this;
            r3.<init>()
            e0.a$e[][] r0 = e0.C5339a.f30168g0
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f30193f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f30194g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f30195h = r0
            if (r4 == 0) goto L69
            r0 = 0
            r3.f30188a = r0
            r1 = 1
            if (r5 != r1) goto L3b
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            r2 = 5000(0x1388, float:7.006E-42)
            r5.<init>(r4, r2)
            boolean r4 = A(r5)
            if (r4 != 0) goto L33
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L33:
            r3.f30192e = r1
            r3.f30190c = r0
            r3.f30189b = r0
            r4 = r5
            goto L65
        L3b:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L47
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f30190c = r5
            r3.f30189b = r0
            goto L65
        L47:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L61
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = H(r1)
            if (r1 == 0) goto L61
            r3.f30190c = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f30189b = r5
            goto L65
        L61:
            r3.f30190c = r0
            r3.f30189b = r0
        L65:
            r3.M(r4)
            return
        L69:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C5339a.<init>(java.io.InputStream, int):void");
    }
}
