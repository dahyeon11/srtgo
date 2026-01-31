package androidx.media;

import android.media.VolumeProvider;

/* loaded from: classes.dex */
abstract class m {

    static class a extends VolumeProvider {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f10108a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, int i9, int i10, b bVar) {
            super(i8, i9, i10);
            this.f10108a = bVar;
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i8) {
            this.f10108a.onAdjustVolume(i8);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i8) {
            this.f10108a.onSetVolumeTo(i8);
        }
    }

    public interface b {
        void onAdjustVolume(int i8);

        void onSetVolumeTo(int i8);
    }

    public static Object createVolumeProvider(int i8, int i9, int i10, b bVar) {
        return new a(i8, i9, i10, bVar);
    }

    public static void setCurrentVolume(Object obj, int i8) {
        ((VolumeProvider) obj).setCurrentVolume(i8);
    }
}
