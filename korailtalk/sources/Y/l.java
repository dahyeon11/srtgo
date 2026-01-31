package y;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.I;
import java.util.Set;
import s.C6203b;
import y.l;
import z.A0;
import z.InterfaceC6565N;
import z.q0;
import z.r0;
import z.v0;

/* loaded from: classes.dex */
public class l implements A0 {

    /* renamed from: a */
    private final InterfaceC6565N f37553a;

    public static final class a implements I {

        /* renamed from: a */
        private final r0 f37554a = r0.create();

        public static /* synthetic */ boolean b(a aVar, InterfaceC6565N interfaceC6565N, InterfaceC6565N.a aVar2) {
            aVar.getMutableConfig().insertOption(aVar2, interfaceC6565N.getOptionPriority(aVar2), interfaceC6565N.retrieveOption(aVar2));
            return true;
        }

        public static a from(final InterfaceC6565N interfaceC6565N) {
            final a aVar = new a();
            interfaceC6565N.findOptions(C6203b.CAPTURE_REQUEST_ID_STEM, new InterfaceC6565N.b() { // from class: y.k
                @Override // z.InterfaceC6565N.b
                public final boolean onOptionMatched(InterfaceC6565N.a aVar2) {
                    return l.a.b(this.f37551a, interfaceC6565N, aVar2);
                }
            });
            return aVar;
        }

        public <ValueT> a clearCaptureRequestOption(CaptureRequest.Key<ValueT> key) {
            this.f37554a.removeOption(C6203b.createCaptureRequestOption(key));
            return this;
        }

        @Override // androidx.camera.core.I
        public q0 getMutableConfig() {
            return this.f37554a;
        }

        public <ValueT> a setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f37554a.insertOption(C6203b.createCaptureRequestOption(key), valuet);
            return this;
        }

        @Override // androidx.camera.core.I
        public l build() {
            return new l(v0.from(this.f37554a));
        }
    }

    public l(InterfaceC6565N interfaceC6565N) {
        this.f37553a = interfaceC6565N;
    }

    @Override // z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    public <ValueT> ValueT getCaptureRequestOption(CaptureRequest.Key<ValueT> key) {
        return (ValueT) this.f37553a.retrieveOption(C6203b.createCaptureRequestOption(key), null);
    }

    @Override // z.A0
    public InterfaceC6565N getConfig() {
        return this.f37553a;
    }

    @Override // z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return super.getOptionPriority(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set getPriorities(InterfaceC6565N.a aVar) {
        return super.getPriorities(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set listOptions() {
        return super.listOptions();
    }

    @Override // z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar) {
        return super.retrieveOption(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        return super.retrieveOptionWithPriority(aVar, cVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }

    public <ValueT> ValueT getCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
        return (ValueT) this.f37553a.retrieveOption(C6203b.createCaptureRequestOption(key), valuet);
    }
}
