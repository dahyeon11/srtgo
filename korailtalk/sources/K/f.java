package K;

import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class f {

    /* renamed from: e, reason: collision with root package name */
    private static AtomicInteger f2697e = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    private c f2698a;

    /* renamed from: b, reason: collision with root package name */
    private int f2699b;

    /* renamed from: c, reason: collision with root package name */
    private String f2700c;

    /* renamed from: d, reason: collision with root package name */
    private List f2701d;

    static abstract class a extends c implements j {
        a() {
        }

        static a a(Size size, int i8, int i9) {
            return new K.b(size, i8, i9);
        }

        public abstract int getImageFormat();

        public abstract int getMaxImages();

        public abstract Size getSize();
    }

    static abstract class b extends c implements l {
        b() {
        }

        static b a(int i8, int i9) {
            return new K.c(i8, i9);
        }

        public abstract int getImageFormat();

        public abstract int getMaxImages();
    }

    private static class c implements e {

        /* renamed from: a, reason: collision with root package name */
        private int f2702a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f2703b = 0;

        /* renamed from: c, reason: collision with root package name */
        private String f2704c = null;

        /* renamed from: d, reason: collision with root package name */
        private List f2705d = Collections.emptyList();

        c() {
        }

        @Override // K.e
        public int getId() {
            return this.f2702a;
        }

        @Override // K.e
        public String getPhysicalCameraId() {
            return this.f2704c;
        }

        @Override // K.e
        public int getSurfaceGroupId() {
            return this.f2703b;
        }

        @Override // K.e
        public List<e> getSurfaceSharingOutputConfigs() {
            return this.f2705d;
        }

        public void setId(int i8) {
            this.f2702a = i8;
        }

        public void setPhysicalCameraId(String str) {
            this.f2704c = str;
        }

        public void setSurfaceGroup(int i8) {
            this.f2703b = i8;
        }

        public void setSurfaceSharingConfigs(List<e> list) {
            this.f2705d = list;
        }
    }

    static abstract class d extends c implements p {
        d() {
        }

        static d a(Surface surface) {
            return new K.d(surface);
        }

        public abstract Surface getSurface();
    }

    private f(c cVar) {
        this.f2698a = cVar;
    }

    static f b(Camera2OutputConfigImpl camera2OutputConfigImpl) {
        c cVarA;
        if (camera2OutputConfigImpl instanceof SurfaceOutputConfigImpl) {
            cVarA = d.a(((SurfaceOutputConfigImpl) camera2OutputConfigImpl).getSurface());
        } else if (camera2OutputConfigImpl instanceof ImageReaderOutputConfigImpl) {
            ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            cVarA = a.a(imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
        } else if (camera2OutputConfigImpl instanceof MultiResolutionImageReaderOutputConfigImpl) {
            MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            cVarA = b.a(multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
        } else {
            cVarA = null;
        }
        cVarA.setPhysicalCameraId(camera2OutputConfigImpl.getPhysicalCameraId());
        cVarA.setSurfaceGroup(camera2OutputConfigImpl.getSurfaceGroupId());
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = camera2OutputConfigImpl.getSurfaceSharingOutputConfigs().iterator();
            while (it.hasNext()) {
                arrayList.add(b((Camera2OutputConfigImpl) it.next()).a());
            }
            cVarA.setSurfaceSharingConfigs(arrayList);
        }
        return new f(cVarA);
    }

    private int c() {
        return f2697e.getAndIncrement();
    }

    e a() {
        this.f2698a.setId(c());
        this.f2698a.setPhysicalCameraId(this.f2700c);
        this.f2698a.setSurfaceGroup(this.f2699b);
        List<e> list = this.f2701d;
        if (list != null) {
            this.f2698a.setSurfaceSharingConfigs(list);
        }
        return this.f2698a;
    }
}
