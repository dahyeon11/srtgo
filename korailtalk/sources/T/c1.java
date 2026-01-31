package t;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C0907v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u.C6372C;
import u.C6386i;
import z.H0;
import z.InterfaceC6577e0;

/* loaded from: classes.dex */
final class c1 {

    /* renamed from: q */
    private static final Size f36636q = new Size(640, 480);

    /* renamed from: r */
    private static final Size f36637r = new Size(0, 0);

    /* renamed from: s */
    private static final Size f36638s = new Size(1920, 1080);

    /* renamed from: t */
    private static final Size f36639t = new Size(720, 480);

    /* renamed from: u */
    private static final Rational f36640u = new Rational(4, 3);

    /* renamed from: v */
    private static final Rational f36641v = new Rational(3, 4);

    /* renamed from: w */
    private static final Rational f36642w = new Rational(16, 9);

    /* renamed from: x */
    private static final Rational f36643x = new Rational(9, 16);

    /* renamed from: c */
    private final String f36646c;

    /* renamed from: d */
    private final InterfaceC6272e f36647d;

    /* renamed from: e */
    private final C6372C f36648e;

    /* renamed from: f */
    private final x.d f36649f;

    /* renamed from: g */
    private final x.e f36650g;

    /* renamed from: h */
    private final int f36651h;

    /* renamed from: i */
    private final boolean f36652i;

    /* renamed from: m */
    private z.I0 f36656m;

    /* renamed from: o */
    private final E0 f36658o;

    /* renamed from: a */
    private final List f36644a = new ArrayList();

    /* renamed from: b */
    private final Map f36645b = new HashMap();

    /* renamed from: j */
    private final Map f36653j = new HashMap();

    /* renamed from: k */
    private boolean f36654k = false;

    /* renamed from: l */
    private boolean f36655l = false;

    /* renamed from: n */
    private Map f36657n = new HashMap();

    /* renamed from: p */
    private final x.l f36659p = new x.l();

    static final class a implements Comparator {

        /* renamed from: a */
        private Rational f36660a;

        a(Rational rational) {
            this.f36660a = rational;
        }

        @Override // java.util.Comparator
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Math.abs(rational.floatValue() - this.f36660a.floatValue()) - Math.abs(rational2.floatValue() - this.f36660a.floatValue()));
        }
    }

    c1(Context context, String str, u.P p8, InterfaceC6272e interfaceC6272e) throws C0907v {
        String str2 = (String) Z.h.checkNotNull(str);
        this.f36646c = str2;
        this.f36647d = (InterfaceC6272e) Z.h.checkNotNull(interfaceC6272e);
        this.f36649f = new x.d(str);
        this.f36650g = new x.e();
        this.f36658o = E0.b(context);
        try {
            C6372C cameraCharacteristicsCompat = p8.getCameraCharacteristicsCompat(str2);
            this.f36648e = cameraCharacteristicsCompat;
            Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f36651h = num != null ? num.intValue() : 2;
            this.f36652i = H();
            h();
            i();
            a();
        } catch (C6386i e8) {
            throw AbstractC6300s0.createFrom(e8);
        }
    }

    private Rational A(InterfaceC6577e0 interfaceC6577e0) {
        Rational rational;
        int i8 = new x.n().get(this.f36646c, this.f36648e);
        if (i8 == 0) {
            rational = this.f36652i ? f36640u : f36641v;
        } else if (i8 == 1) {
            rational = this.f36652i ? f36642w : f36643x;
        } else {
            if (i8 == 2) {
                Size sizeF = f(256);
                return new Rational(sizeF.getWidth(), sizeF.getHeight());
            }
            if (i8 != 3) {
                return null;
            }
            Size sizeB = B(interfaceC6577e0);
            if (!interfaceC6577e0.hasTargetAspectRatio()) {
                if (sizeB != null) {
                    return new Rational(sizeB.getWidth(), sizeB.getHeight());
                }
                return null;
            }
            int targetAspectRatio = interfaceC6577e0.getTargetAspectRatio();
            if (targetAspectRatio == 0) {
                rational = this.f36652i ? f36640u : f36641v;
            } else {
                if (targetAspectRatio != 1) {
                    androidx.camera.core.B0.e("SupportedSurfaceCombination", "Undefined target aspect ratio: " + targetAspectRatio);
                    return null;
                }
                rational = this.f36652i ? f36642w : f36643x;
            }
        }
        return rational;
    }

    private Size B(InterfaceC6577e0 interfaceC6577e0) {
        return g(interfaceC6577e0.getTargetResolution(null), interfaceC6577e0.getTargetRotation(0));
    }

    private List C(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int surfaceOccupancyPriority = ((z.N0) it.next()).getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                z.N0 n02 = (z.N0) it3.next();
                if (iIntValue == n02.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(n02)));
                }
            }
        }
        return arrayList;
    }

    private Map D(List list) {
        HashMap map = new HashMap();
        map.put(f36640u, new ArrayList());
        map.put(f36642w, new ArrayList());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = null;
            for (Rational rational2 : map.keySet()) {
                if (E(size, rational2)) {
                    List list2 = (List) map.get(rational2);
                    if (!list2.contains(size)) {
                        list2.add(size);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                map.put(new Rational(size.getWidth(), size.getHeight()), new ArrayList(Collections.singleton(size)));
            }
        }
        return map;
    }

    static boolean E(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (l(size) >= l(f36636q)) {
            return F(size, rational);
        }
        return false;
    }

    private static boolean F(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i8 = width % 16;
        if (i8 == 0 && height % 16 == 0) {
            return I(Math.max(0, height + (-16)), width, rational) || I(Math.max(0, width + (-16)), height, rational2);
        }
        if (i8 == 0) {
            return I(height, width, rational);
        }
        if (height % 16 == 0) {
            return I(width, height, rational2);
        }
        return false;
    }

    private boolean G(int i8) {
        Integer num = (Integer) this.f36648e.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Z.h.checkNotNull(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int iSurfaceRotationToDegrees = androidx.camera.core.impl.utils.c.surfaceRotationToDegrees(i8);
        Integer num2 = (Integer) this.f36648e.get(CameraCharacteristics.LENS_FACING);
        Z.h.checkNotNull(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int relativeImageRotation = androidx.camera.core.impl.utils.c.getRelativeImageRotation(iSurfaceRotationToDegrees, num.intValue(), 1 == num2.intValue());
        return relativeImageRotation == 90 || relativeImageRotation == 270;
    }

    private boolean H() {
        Size size = (Size) this.f36648e.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        return size == null || size.getWidth() >= size.getHeight();
    }

    private static boolean I(int i8, int i9, Rational rational) {
        Z.h.checkArgument(i9 % 16 == 0);
        double numerator = (i8 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i9 + (-16))) && numerator < ((double) (i9 + 16));
    }

    private void J() {
        this.f36658o.e();
        if (this.f36656m == null) {
            i();
        } else {
            this.f36656m = z.I0.create(this.f36656m.getAnalysisSize(), this.f36658o.d(), this.f36656m.getRecordSize());
        }
    }

    private void K(List list, Size size) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = -1;
        int i9 = 0;
        while (true) {
            int i10 = i9;
            int i11 = i8;
            i8 = i10;
            if (i8 >= list.size()) {
                break;
            }
            Size size2 = (Size) list.get(i8);
            if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                break;
            }
            if (i11 >= 0) {
                arrayList.add((Size) list.get(i11));
            }
            i9 = i8 + 1;
        }
        list.removeAll(arrayList);
    }

    private Size[] c(int i8) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f36648e.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i8);
        if (outputSizes != null) {
            Size[] sizeArrD = d(outputSizes, i8);
            Arrays.sort(sizeArrD, new androidx.camera.core.impl.utils.d(true));
            return sizeArrD;
        }
        throw new IllegalArgumentException("Can not get supported output size for the format: " + i8);
    }

    private Size[] d(Size[] sizeArr, int i8) {
        List listE = e(i8);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(listE);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    private List e(int i8) {
        List list = (List) this.f36653j.get(Integer.valueOf(i8));
        if (list != null) {
            return list;
        }
        List<Size> list2 = this.f36649f.get(i8);
        this.f36653j.put(Integer.valueOf(i8), list2);
        return list2;
    }

    private Size f(int i8) {
        Size size = (Size) this.f36645b.get(Integer.valueOf(i8));
        if (size != null) {
            return size;
        }
        Size sizeT = t(i8);
        this.f36645b.put(Integer.valueOf(i8), sizeT);
        return sizeT;
    }

    private Size g(Size size, int i8) {
        return (size == null || !G(i8)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private void h() {
        this.f36644a.addAll(q());
        int i8 = this.f36651h;
        if (i8 == 0 || i8 == 1 || i8 == 3) {
            this.f36644a.addAll(s());
        }
        int i9 = this.f36651h;
        if (i9 == 1 || i9 == 3) {
            this.f36644a.addAll(p());
        }
        int[] iArr = (int[]) this.f36648e.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 3) {
                    this.f36654k = true;
                } else if (i10 == 6) {
                    this.f36655l = true;
                }
            }
        }
        if (this.f36654k) {
            this.f36644a.addAll(u());
        }
        if (this.f36655l && this.f36651h == 0) {
            this.f36644a.addAll(m());
        }
        if (this.f36651h == 3) {
            this.f36644a.addAll(r());
        }
        this.f36644a.addAll(this.f36650g.get(this.f36646c, this.f36651h));
    }

    private void i() {
        this.f36656m = z.I0.create(new Size(640, 480), this.f36658o.d(), v());
    }

    private Size[] j(int i8) {
        Size[] sizeArr = (Size[]) this.f36657n.get(Integer.valueOf(i8));
        if (sizeArr != null) {
            return sizeArr;
        }
        Size[] sizeArrC = c(i8);
        this.f36657n.put(Integer.valueOf(i8), sizeArrC);
        return sizeArrC;
    }

    private List k(List list) {
        Iterator it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= ((List) it.next()).size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / ((List) list.get(0)).size();
        int i9 = size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < size; i11++) {
                ((List) arrayList.get(i11)).add((Size) list2.get((i11 % i9) / size2));
            }
            if (i10 < list.size() - 1) {
                i9 = size2;
                size2 /= ((List) list.get(i10 + 1)).size();
            }
        }
        return arrayList;
    }

    private static int l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    private H0.b n(int i8) {
        return i8 == 35 ? H0.b.YUV : i8 == 256 ? H0.b.JPEG : i8 == 32 ? H0.b.RAW : H0.b.PRIV;
    }

    private Size[] o(int i8, InterfaceC6577e0 interfaceC6577e0) {
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> supportedResolutions = interfaceC6577e0.getSupportedResolutions(null);
        if (supportedResolutions != null) {
            Iterator<Pair<Integer, Size[]>> it = supportedResolutions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair<Integer, Size[]> next = it.next();
                if (((Integer) next.first).intValue() == i8) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        if (sizeArr == null) {
            return sizeArr;
        }
        Size[] sizeArrD = d(sizeArr, i8);
        Arrays.sort(sizeArrD, new androidx.camera.core.impl.utils.d(true));
        return sizeArrD;
    }

    private Size v() throws NumberFormatException {
        try {
            int i8 = Integer.parseInt(this.f36646c);
            CamcorderProfile camcorderProfile = this.f36647d.hasProfile(i8, 1) ? this.f36647d.get(i8, 1) : null;
            return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : w(i8);
        } catch (NumberFormatException unused) {
            return x();
        }
    }

    private Size w(int i8) {
        Size size = f36639t;
        CamcorderProfile camcorderProfile = this.f36647d.hasProfile(i8, 10) ? this.f36647d.get(i8, 10) : this.f36647d.hasProfile(i8, 8) ? this.f36647d.get(i8, 8) : this.f36647d.hasProfile(i8, 12) ? this.f36647d.get(i8, 12) : this.f36647d.hasProfile(i8, 6) ? this.f36647d.get(i8, 6) : this.f36647d.hasProfile(i8, 5) ? this.f36647d.get(i8, 5) : this.f36647d.hasProfile(i8, 4) ? this.f36647d.get(i8, 4) : null;
        return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : size;
    }

    private Size x() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f36648e.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return f36639t;
        }
        Arrays.sort(outputSizes, new androidx.camera.core.impl.utils.d(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = f36638s;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return f36639t;
    }

    z.H0 L(int i8, Size size) {
        H0.b bVarN = n(i8);
        H0.a aVar = H0.a.NOT_SUPPORT;
        Size sizeF = f(i8);
        if (size.getWidth() * size.getHeight() <= this.f36656m.getAnalysisSize().getWidth() * this.f36656m.getAnalysisSize().getHeight()) {
            aVar = H0.a.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.f36656m.getPreviewSize().getWidth() * this.f36656m.getPreviewSize().getHeight()) {
            aVar = H0.a.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.f36656m.getRecordSize().getWidth() * this.f36656m.getRecordSize().getHeight()) {
            aVar = H0.a.RECORD;
        } else if (size.getWidth() * size.getHeight() <= sizeF.getWidth() * sizeF.getHeight()) {
            aVar = H0.a.MAXIMUM;
        }
        return z.H0.create(bVarN, aVar);
    }

    boolean b(List list) {
        Iterator it = this.f36644a.iterator();
        boolean zIsSupported = false;
        while (it.hasNext() && !(zIsSupported = ((z.G0) it.next()).isSupported(list))) {
        }
        return zIsSupported;
    }

    List m() {
        ArrayList arrayList = new ArrayList();
        z.G0 g02 = new z.G0();
        H0.b bVar = H0.b.PRIV;
        H0.a aVar = H0.a.PREVIEW;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar));
        H0.a aVar2 = H0.a.MAXIMUM;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar2));
        arrayList.add(g02);
        z.G0 g03 = new z.G0();
        g03.addSurfaceConfig(z.H0.create(bVar, aVar));
        H0.b bVar2 = H0.b.YUV;
        g03.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        arrayList.add(g03);
        z.G0 g04 = new z.G0();
        g04.addSurfaceConfig(z.H0.create(bVar2, aVar));
        g04.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        arrayList.add(g04);
        return arrayList;
    }

    List p() {
        ArrayList arrayList = new ArrayList();
        z.G0 g02 = new z.G0();
        H0.b bVar = H0.b.PRIV;
        H0.a aVar = H0.a.PREVIEW;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar));
        H0.a aVar2 = H0.a.MAXIMUM;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar2));
        arrayList.add(g02);
        z.G0 g03 = new z.G0();
        g03.addSurfaceConfig(z.H0.create(bVar, aVar));
        H0.b bVar2 = H0.b.YUV;
        g03.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        arrayList.add(g03);
        z.G0 g04 = new z.G0();
        g04.addSurfaceConfig(z.H0.create(bVar2, aVar));
        g04.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        arrayList.add(g04);
        z.G0 g05 = new z.G0();
        g05.addSurfaceConfig(z.H0.create(bVar, aVar));
        g05.addSurfaceConfig(z.H0.create(bVar, aVar));
        g05.addSurfaceConfig(z.H0.create(H0.b.JPEG, aVar2));
        arrayList.add(g05);
        z.G0 g06 = new z.G0();
        H0.a aVar3 = H0.a.ANALYSIS;
        g06.addSurfaceConfig(z.H0.create(bVar2, aVar3));
        g06.addSurfaceConfig(z.H0.create(bVar, aVar));
        g06.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        arrayList.add(g06);
        z.G0 g07 = new z.G0();
        g07.addSurfaceConfig(z.H0.create(bVar2, aVar3));
        g07.addSurfaceConfig(z.H0.create(bVar2, aVar));
        g07.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        arrayList.add(g07);
        return arrayList;
    }

    List q() {
        ArrayList arrayList = new ArrayList();
        z.G0 g02 = new z.G0();
        H0.b bVar = H0.b.PRIV;
        H0.a aVar = H0.a.MAXIMUM;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar));
        arrayList.add(g02);
        z.G0 g03 = new z.G0();
        H0.b bVar2 = H0.b.JPEG;
        g03.addSurfaceConfig(z.H0.create(bVar2, aVar));
        arrayList.add(g03);
        z.G0 g04 = new z.G0();
        H0.b bVar3 = H0.b.YUV;
        g04.addSurfaceConfig(z.H0.create(bVar3, aVar));
        arrayList.add(g04);
        z.G0 g05 = new z.G0();
        H0.a aVar2 = H0.a.PREVIEW;
        g05.addSurfaceConfig(z.H0.create(bVar, aVar2));
        g05.addSurfaceConfig(z.H0.create(bVar2, aVar));
        arrayList.add(g05);
        z.G0 g06 = new z.G0();
        g06.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        g06.addSurfaceConfig(z.H0.create(bVar2, aVar));
        arrayList.add(g06);
        z.G0 g07 = new z.G0();
        g07.addSurfaceConfig(z.H0.create(bVar, aVar2));
        g07.addSurfaceConfig(z.H0.create(bVar, aVar2));
        arrayList.add(g07);
        z.G0 g08 = new z.G0();
        g08.addSurfaceConfig(z.H0.create(bVar, aVar2));
        g08.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        arrayList.add(g08);
        z.G0 g09 = new z.G0();
        g09.addSurfaceConfig(z.H0.create(bVar, aVar2));
        g09.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        g09.addSurfaceConfig(z.H0.create(bVar2, aVar));
        arrayList.add(g09);
        return arrayList;
    }

    List r() {
        ArrayList arrayList = new ArrayList();
        z.G0 g02 = new z.G0();
        H0.b bVar = H0.b.PRIV;
        H0.a aVar = H0.a.PREVIEW;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar));
        H0.a aVar2 = H0.a.ANALYSIS;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar2));
        H0.b bVar2 = H0.b.YUV;
        H0.a aVar3 = H0.a.MAXIMUM;
        g02.addSurfaceConfig(z.H0.create(bVar2, aVar3));
        H0.b bVar3 = H0.b.RAW;
        g02.addSurfaceConfig(z.H0.create(bVar3, aVar3));
        arrayList.add(g02);
        z.G0 g03 = new z.G0();
        g03.addSurfaceConfig(z.H0.create(bVar, aVar));
        g03.addSurfaceConfig(z.H0.create(bVar, aVar2));
        g03.addSurfaceConfig(z.H0.create(H0.b.JPEG, aVar3));
        g03.addSurfaceConfig(z.H0.create(bVar3, aVar3));
        arrayList.add(g03);
        return arrayList;
    }

    List s() {
        ArrayList arrayList = new ArrayList();
        z.G0 g02 = new z.G0();
        H0.b bVar = H0.b.PRIV;
        H0.a aVar = H0.a.PREVIEW;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar));
        H0.a aVar2 = H0.a.RECORD;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar2));
        arrayList.add(g02);
        z.G0 g03 = new z.G0();
        g03.addSurfaceConfig(z.H0.create(bVar, aVar));
        H0.b bVar2 = H0.b.YUV;
        g03.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        arrayList.add(g03);
        z.G0 g04 = new z.G0();
        g04.addSurfaceConfig(z.H0.create(bVar2, aVar));
        g04.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        arrayList.add(g04);
        z.G0 g05 = new z.G0();
        g05.addSurfaceConfig(z.H0.create(bVar, aVar));
        g05.addSurfaceConfig(z.H0.create(bVar, aVar2));
        H0.b bVar3 = H0.b.JPEG;
        g05.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        arrayList.add(g05);
        z.G0 g06 = new z.G0();
        g06.addSurfaceConfig(z.H0.create(bVar, aVar));
        g06.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        g06.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        arrayList.add(g06);
        z.G0 g07 = new z.G0();
        g07.addSurfaceConfig(z.H0.create(bVar2, aVar));
        g07.addSurfaceConfig(z.H0.create(bVar2, aVar));
        g07.addSurfaceConfig(z.H0.create(bVar3, H0.a.MAXIMUM));
        arrayList.add(g07);
        return arrayList;
    }

    Size t(int i8) {
        return (Size) Collections.max(Arrays.asList(j(i8)), new androidx.camera.core.impl.utils.d());
    }

    List u() {
        ArrayList arrayList = new ArrayList();
        z.G0 g02 = new z.G0();
        H0.b bVar = H0.b.RAW;
        H0.a aVar = H0.a.MAXIMUM;
        g02.addSurfaceConfig(z.H0.create(bVar, aVar));
        arrayList.add(g02);
        z.G0 g03 = new z.G0();
        H0.b bVar2 = H0.b.PRIV;
        H0.a aVar2 = H0.a.PREVIEW;
        g03.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        g03.addSurfaceConfig(z.H0.create(bVar, aVar));
        arrayList.add(g03);
        z.G0 g04 = new z.G0();
        H0.b bVar3 = H0.b.YUV;
        g04.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        g04.addSurfaceConfig(z.H0.create(bVar, aVar));
        arrayList.add(g04);
        z.G0 g05 = new z.G0();
        g05.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        g05.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        g05.addSurfaceConfig(z.H0.create(bVar, aVar));
        arrayList.add(g05);
        z.G0 g06 = new z.G0();
        g06.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        g06.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        g06.addSurfaceConfig(z.H0.create(bVar, aVar));
        arrayList.add(g06);
        z.G0 g07 = new z.G0();
        g07.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        g07.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        g07.addSurfaceConfig(z.H0.create(bVar, aVar));
        arrayList.add(g07);
        z.G0 g08 = new z.G0();
        g08.addSurfaceConfig(z.H0.create(bVar2, aVar2));
        H0.b bVar4 = H0.b.JPEG;
        g08.addSurfaceConfig(z.H0.create(bVar4, aVar));
        g08.addSurfaceConfig(z.H0.create(bVar, aVar));
        arrayList.add(g08);
        z.G0 g09 = new z.G0();
        g09.addSurfaceConfig(z.H0.create(bVar3, aVar2));
        g09.addSurfaceConfig(z.H0.create(bVar4, aVar));
        g09.addSurfaceConfig(z.H0.create(bVar, aVar));
        arrayList.add(g09);
        return arrayList;
    }

    Map y(List list, List list2) {
        HashMap map;
        J();
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(L(((z.N0) it.next()).getInputFormat(), new Size(640, 480)));
        }
        if (!b(arrayList)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f36646c + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
        }
        List listC = C(list2);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            arrayList2.add(z((z.N0) list2.get(((Integer) it2.next()).intValue())));
        }
        Iterator it3 = k(arrayList2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                map = null;
                break;
            }
            List list3 = (List) it3.next();
            ArrayList arrayList3 = new ArrayList(list);
            for (int i8 = 0; i8 < list3.size(); i8++) {
                arrayList3.add(L(((z.N0) list2.get(((Integer) listC.get(i8)).intValue())).getInputFormat(), (Size) list3.get(i8)));
            }
            if (b(arrayList3)) {
                map = new HashMap();
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    z.N0 n02 = (z.N0) it4.next();
                    map.put(n02, (Size) list3.get(listC.indexOf(Integer.valueOf(list2.indexOf(n02)))));
                }
            }
        }
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f36646c + " and Hardware level: " + this.f36651h + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
    }

    List z(z.N0 n02) {
        int inputFormat = n02.getInputFormat();
        InterfaceC6577e0 interfaceC6577e0 = (InterfaceC6577e0) n02;
        Size[] sizeArrO = o(inputFormat, interfaceC6577e0);
        if (sizeArrO == null) {
            sizeArrO = j(inputFormat);
        }
        ArrayList arrayList = new ArrayList();
        Size maxResolution = interfaceC6577e0.getMaxResolution(null);
        Size sizeT = t(inputFormat);
        if (maxResolution == null || l(sizeT) < l(maxResolution)) {
            maxResolution = sizeT;
        }
        Arrays.sort(sizeArrO, new androidx.camera.core.impl.utils.d(true));
        Size sizeB = B(interfaceC6577e0);
        Size size = f36636q;
        int iL = l(size);
        if (l(maxResolution) < iL) {
            size = f36637r;
        } else if (sizeB != null && l(sizeB) < iL) {
            size = sizeB;
        }
        for (Size size2 : sizeArrO) {
            if (l(size2) <= l(maxResolution) && l(size2) >= l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + inputFormat);
        }
        Rational rationalA = A(interfaceC6577e0);
        if (sizeB == null) {
            sizeB = interfaceC6577e0.getDefaultResolution(null);
        }
        ArrayList arrayList2 = new ArrayList();
        new HashMap();
        if (rationalA == null) {
            arrayList2.addAll(arrayList);
            if (sizeB != null) {
                K(arrayList2, sizeB);
            }
        } else {
            Map mapD = D(arrayList);
            if (sizeB != null) {
                Iterator it = mapD.keySet().iterator();
                while (it.hasNext()) {
                    K((List) mapD.get((Rational) it.next()), sizeB);
                }
            }
            ArrayList arrayList3 = new ArrayList(mapD.keySet());
            Collections.sort(arrayList3, new a(rationalA));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                for (Size size3 : (List) mapD.get((Rational) it2.next())) {
                    if (!arrayList2.contains(size3)) {
                        arrayList2.add(size3);
                    }
                }
            }
        }
        return this.f36659p.insertOrPrioritize(n(n02.getInputFormat()), arrayList2);
    }

    private void a() {
    }
}
