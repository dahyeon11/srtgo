package z;

import androidx.camera.core.impl.utils.h;

/* renamed from: z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6600q {

    /* renamed from: z.q$a */
    public static final class a implements InterfaceC6600q {
        public static InterfaceC6600q create() {
            return new a();
        }

        @Override // z.InterfaceC6600q
        public EnumC6590l getAeState() {
            return EnumC6590l.UNKNOWN;
        }

        @Override // z.InterfaceC6600q
        public EnumC6592m getAfMode() {
            return EnumC6592m.UNKNOWN;
        }

        @Override // z.InterfaceC6600q
        public EnumC6594n getAfState() {
            return EnumC6594n.UNKNOWN;
        }

        @Override // z.InterfaceC6600q
        public EnumC6596o getAwbState() {
            return EnumC6596o.UNKNOWN;
        }

        @Override // z.InterfaceC6600q
        public EnumC6598p getFlashState() {
            return EnumC6598p.UNKNOWN;
        }

        @Override // z.InterfaceC6600q
        public J0 getTagBundle() {
            return J0.emptyBundle();
        }

        @Override // z.InterfaceC6600q
        public long getTimestamp() {
            return -1L;
        }

        @Override // z.InterfaceC6600q
        public /* bridge */ /* synthetic */ void populateExifData(h.b bVar) {
            super.populateExifData(bVar);
        }
    }

    EnumC6590l getAeState();

    EnumC6592m getAfMode();

    EnumC6594n getAfState();

    EnumC6596o getAwbState();

    EnumC6598p getFlashState();

    J0 getTagBundle();

    long getTimestamp();

    default void populateExifData(h.b bVar) {
        bVar.setFlashState(getFlashState());
    }
}
