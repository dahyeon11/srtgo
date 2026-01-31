package k4;

import Q7.C0709m;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import k4.k;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f33580a = Pattern.compile(";");

    private static List a(int i8) {
        int i9 = -i8;
        return Collections.singletonList(new Camera.Area(new Rect(i9, i9, i8, i8), 1));
    }

    private static String b(String str, Collection collection, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("Requesting ");
        sb.append(str);
        sb.append(" value from among: ");
        sb.append(Arrays.toString(strArr));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Supported ");
        sb2.append(str);
        sb2.append(" values: ");
        sb2.append(collection);
        if (collection == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (collection.contains(str2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Can set ");
                sb3.append(str);
                sb3.append(" to: ");
                sb3.append(str2);
                return str2;
            }
        }
        return null;
    }

    private static Integer c(Camera.Parameters parameters, double d9) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        StringBuilder sb = new StringBuilder();
        sb.append("Zoom ratios: ");
        sb.append(zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            Log.w("CameraConfiguration", "Invalid zoom ratios!");
            return null;
        }
        double d10 = d9 * 100.0d;
        double d11 = Double.POSITIVE_INFINITY;
        int i8 = 0;
        for (int i9 = 0; i9 < zoomRatios.size(); i9++) {
            double dAbs = Math.abs(zoomRatios.get(i9).intValue() - d10);
            if (dAbs < d11) {
                i8 = i9;
                d11 = dAbs;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Chose zoom ratio of ");
        sb2.append(zoomRatios.get(i8).intValue() / 100.0d);
        return Integer.valueOf(i8);
    }

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats(parameters.flatten());
    }

    private static String d(Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Camera.Area area = (Camera.Area) it.next();
            sb.append(area.rect);
            sb.append(':');
            sb.append(area.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    private static String e(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString((int[]) it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        String strB;
        if ("barcode".equals(parameters.getSceneMode()) || (strB = b("scene mode", parameters.getSupportedSceneModes(), "barcode")) == null) {
            return;
        }
        parameters.setSceneMode(strB);
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z8) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
            return;
        }
        if (exposureCompensationStep > 0.0f) {
            int iRound = Math.round((z8 ? 0.0f : 1.5f) / exposureCompensationStep);
            float f8 = exposureCompensationStep * iRound;
            int iMax = Math.max(Math.min(iRound, maxExposureCompensation), minExposureCompensation);
            if (parameters.getExposureCompensation() == iMax) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exposure compensation already set to ");
                sb.append(iMax);
                sb.append(" / ");
                sb.append(f8);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting exposure compensation to ");
            sb2.append(iMax);
            sb2.append(" / ");
            sb2.append(f8);
            parameters.setExposureCompensation(iMax);
        }
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    public static void setFocus(Camera.Parameters parameters, k.a aVar, boolean z8) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String strB = (z8 || aVar == k.a.AUTO) ? b("focus mode", supportedFocusModes, "auto") : aVar == k.a.CONTINUOUS ? b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : aVar == k.a.INFINITY ? b("focus mode", supportedFocusModes, "infinity") : aVar == k.a.MACRO ? b("focus mode", supportedFocusModes, "macro") : null;
        if (!z8 && strB == null) {
            strB = b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strB != null) {
            if (!strB.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(strB);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Focus mode already set to ");
            sb.append(strB);
        }
    }

    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Old focus areas: ");
            sb.append(d(parameters.getFocusAreas()));
            List<Camera.Area> listA = a(400);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting focus area to : ");
            sb2.append(d(listA));
            parameters.setFocusAreas(listA);
        }
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        String strB;
        if ("negative".equals(parameters.getColorEffect()) || (strB = b("color effect", parameters.getSupportedColorEffects(), "negative")) == null) {
            return;
        }
        parameters.setColorEffect(strB);
    }

    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Old metering areas: ");
            sb.append(parameters.getMeteringAreas());
            List<Camera.Area> listA = a(400);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting metering area to : ");
            sb2.append(d(listA));
            parameters.setMeteringAreas(listA);
        }
    }

    public static void setTorch(Camera.Parameters parameters, boolean z8) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strB = z8 ? b("flash mode", supportedFlashModes, "torch", C0709m.ON) : b("flash mode", supportedFlashModes, C0709m.OFF);
        if (strB != null) {
            if (strB.equals(parameters.getFlashMode())) {
                StringBuilder sb = new StringBuilder();
                sb.append("Flash mode already set to ");
                sb.append(strB);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting flash mode to ");
                sb2.append(strB);
                parameters.setFlashMode(strB);
            }
        }
    }

    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (!parameters.isVideoStabilizationSupported() || parameters.getVideoStabilization()) {
            return;
        }
        parameters.setVideoStabilization(true);
    }

    public static void setZoom(Camera.Parameters parameters, double d9) {
        Integer numC;
        if (!parameters.isZoomSupported() || (numC = c(parameters, d9)) == null) {
            return;
        }
        if (parameters.getZoom() == numC.intValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Zoom is already set to ");
            sb.append(numC);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting zoom to ");
            sb2.append(numC);
            parameters.setZoom(numC.intValue());
        }
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append('\n');
        sb.append("BRAND=");
        sb.append(Build.BRAND);
        sb.append('\n');
        sb.append("CPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append('\n');
        sb.append("DEVICE=");
        sb.append(Build.DEVICE);
        sb.append('\n');
        sb.append("DISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append('\n');
        sb.append("FINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append('\n');
        sb.append("HOST=");
        sb.append(Build.HOST);
        sb.append('\n');
        sb.append("ID=");
        sb.append(Build.ID);
        sb.append('\n');
        sb.append("MANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append('\n');
        sb.append("MODEL=");
        sb.append(Build.MODEL);
        sb.append('\n');
        sb.append("PRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append('\n');
        sb.append("TAGS=");
        sb.append(Build.TAGS);
        sb.append('\n');
        sb.append("TIME=");
        sb.append(Build.TIME);
        sb.append('\n');
        sb.append("TYPE=");
        sb.append(Build.TYPE);
        sb.append('\n');
        sb.append("USER=");
        sb.append(Build.USER);
        sb.append('\n');
        sb.append("VERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append('\n');
        sb.append("VERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append('\n');
        sb.append("VERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append('\n');
        sb.append("VERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append('\n');
        if (charSequence != null) {
            String[] strArrSplit = f33580a.split(charSequence);
            Arrays.sort(strArrSplit);
            for (String str : strArrSplit) {
                sb.append(str);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i8, int i9) {
        int[] next;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        StringBuilder sb = new StringBuilder();
        sb.append("Supported FPS ranges: ");
        sb.append(e(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i10 = next[0];
            int i11 = next[1];
            if (i10 >= i8 * 1000 && i11 <= i9 * 1000) {
                break;
            }
        }
        if (next == null) {
            return;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        if (Arrays.equals(iArr, next)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FPS range already set to ");
            sb2.append(Arrays.toString(next));
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Setting FPS range to ");
            sb3.append(Arrays.toString(next));
            parameters.setPreviewFpsRange(next[0], next[1]);
        }
    }
}
