package z;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import z.InterfaceC6565N;

/* renamed from: z.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6562K {
    public static final int TEMPLATE_TYPE_NONE = -1;

    /* renamed from: a, reason: collision with root package name */
    final List f37732a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6565N f37733b;

    /* renamed from: c, reason: collision with root package name */
    final int f37734c;

    /* renamed from: d, reason: collision with root package name */
    final List f37735d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37736e;

    /* renamed from: f, reason: collision with root package name */
    private final J0 f37737f;
    public static final InterfaceC6565N.a OPTION_ROTATION = InterfaceC6565N.a.create("camerax.core.captureConfig.rotation", Integer.TYPE);
    public static final InterfaceC6565N.a OPTION_JPEG_QUALITY = InterfaceC6565N.a.create("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: z.K$b */
    public interface b {
        void unpack(N0 n02, a aVar);
    }

    C6562K(List list, InterfaceC6565N interfaceC6565N, int i8, List list2, boolean z8, J0 j02) {
        this.f37732a = list;
        this.f37733b = interfaceC6565N;
        this.f37734c = i8;
        this.f37735d = Collections.unmodifiableList(list2);
        this.f37736e = z8;
        this.f37737f = j02;
    }

    public static C6562K defaultEmptyCaptureConfig() {
        return new a().build();
    }

    public List<AbstractC6586j> getCameraCaptureCallbacks() {
        return this.f37735d;
    }

    public InterfaceC6565N getImplementationOptions() {
        return this.f37733b;
    }

    public List<S> getSurfaces() {
        return Collections.unmodifiableList(this.f37732a);
    }

    public J0 getTagBundle() {
        return this.f37737f;
    }

    public int getTemplateType() {
        return this.f37734c;
    }

    public boolean isUseRepeatingSurface() {
        return this.f37736e;
    }

    /* renamed from: z.K$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Set f37738a;

        /* renamed from: b, reason: collision with root package name */
        private q0 f37739b;

        /* renamed from: c, reason: collision with root package name */
        private int f37740c;

        /* renamed from: d, reason: collision with root package name */
        private List f37741d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f37742e;

        /* renamed from: f, reason: collision with root package name */
        private s0 f37743f;

        public a() {
            this.f37738a = new HashSet();
            this.f37739b = r0.create();
            this.f37740c = -1;
            this.f37741d = new ArrayList();
            this.f37742e = false;
            this.f37743f = s0.create();
        }

        public static a createFrom(N0 n02) {
            b captureOptionUnpacker = n02.getCaptureOptionUnpacker(null);
            if (captureOptionUnpacker != null) {
                a aVar = new a();
                captureOptionUnpacker.unpack(n02, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + n02.getTargetName(n02.toString()));
        }

        public static a from(C6562K c6562k) {
            return new a(c6562k);
        }

        public void addAllCameraCaptureCallbacks(Collection<AbstractC6586j> collection) {
            Iterator<AbstractC6586j> it = collection.iterator();
            while (it.hasNext()) {
                addCameraCaptureCallback(it.next());
            }
        }

        public void addAllTags(J0 j02) {
            this.f37743f.addTagBundle(j02);
        }

        public void addCameraCaptureCallback(AbstractC6586j abstractC6586j) {
            if (this.f37741d.contains(abstractC6586j)) {
                return;
            }
            this.f37741d.add(abstractC6586j);
        }

        public <T> void addImplementationOption(InterfaceC6565N.a aVar, T t8) {
            this.f37739b.insertOption(aVar, t8);
        }

        public void addImplementationOptions(InterfaceC6565N interfaceC6565N) {
            for (InterfaceC6565N.a aVar : interfaceC6565N.listOptions()) {
                Object objRetrieveOption = this.f37739b.retrieveOption(aVar, null);
                Object objRetrieveOption2 = interfaceC6565N.retrieveOption(aVar);
                if (objRetrieveOption instanceof AbstractC6599p0) {
                    ((AbstractC6599p0) objRetrieveOption).addAll(((AbstractC6599p0) objRetrieveOption2).getAllItems());
                } else {
                    if (objRetrieveOption2 instanceof AbstractC6599p0) {
                        objRetrieveOption2 = ((AbstractC6599p0) objRetrieveOption2).clone();
                    }
                    this.f37739b.insertOption(aVar, interfaceC6565N.getOptionPriority(aVar), objRetrieveOption2);
                }
            }
        }

        public void addSurface(S s8) {
            this.f37738a.add(s8);
        }

        public void addTag(String str, Object obj) {
            this.f37743f.putTag(str, obj);
        }

        public C6562K build() {
            return new C6562K(new ArrayList(this.f37738a), v0.from(this.f37739b), this.f37740c, this.f37741d, this.f37742e, J0.from(this.f37743f));
        }

        public void clearSurfaces() {
            this.f37738a.clear();
        }

        public InterfaceC6565N getImplementationOptions() {
            return this.f37739b;
        }

        public Set<S> getSurfaces() {
            return this.f37738a;
        }

        public Object getTag(String str) {
            return this.f37743f.getTag(str);
        }

        public int getTemplateType() {
            return this.f37740c;
        }

        public boolean isUseRepeatingSurface() {
            return this.f37742e;
        }

        public void removeSurface(S s8) {
            this.f37738a.remove(s8);
        }

        public void setImplementationOptions(InterfaceC6565N interfaceC6565N) {
            this.f37739b = r0.from(interfaceC6565N);
        }

        public void setTemplateType(int i8) {
            this.f37740c = i8;
        }

        public void setUseRepeatingSurface(boolean z8) {
            this.f37742e = z8;
        }

        private a(C6562K c6562k) {
            HashSet hashSet = new HashSet();
            this.f37738a = hashSet;
            this.f37739b = r0.create();
            this.f37740c = -1;
            this.f37741d = new ArrayList();
            this.f37742e = false;
            this.f37743f = s0.create();
            hashSet.addAll(c6562k.f37732a);
            this.f37739b = r0.from(c6562k.f37733b);
            this.f37740c = c6562k.f37734c;
            this.f37741d.addAll(c6562k.getCameraCaptureCallbacks());
            this.f37742e = c6562k.isUseRepeatingSurface();
            this.f37743f = s0.from(c6562k.getTagBundle());
        }
    }
}
