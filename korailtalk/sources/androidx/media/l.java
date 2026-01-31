package androidx.media;

import androidx.media.m;

/* loaded from: classes.dex */
public abstract class l {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;

    /* renamed from: a, reason: collision with root package name */
    private final int f10102a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10103b;

    /* renamed from: c, reason: collision with root package name */
    private int f10104c;

    /* renamed from: d, reason: collision with root package name */
    private b f10105d;

    /* renamed from: e, reason: collision with root package name */
    private Object f10106e;

    class a implements m.b {
        a() {
        }

        @Override // androidx.media.m.b
        public void onAdjustVolume(int i8) {
            l.this.onAdjustVolume(i8);
        }

        @Override // androidx.media.m.b
        public void onSetVolumeTo(int i8) {
            l.this.onSetVolumeTo(i8);
        }
    }

    public static abstract class b {
        public abstract void onVolumeChanged(l lVar);
    }

    public l(int i8, int i9, int i10) {
        this.f10102a = i8;
        this.f10103b = i9;
        this.f10104c = i10;
    }

    public final int getCurrentVolume() {
        return this.f10104c;
    }

    public final int getMaxVolume() {
        return this.f10103b;
    }

    public final int getVolumeControl() {
        return this.f10102a;
    }

    public Object getVolumeProvider() {
        if (this.f10106e == null) {
            this.f10106e = m.createVolumeProvider(this.f10102a, this.f10103b, this.f10104c, new a());
        }
        return this.f10106e;
    }

    public void onAdjustVolume(int i8) {
    }

    public void onSetVolumeTo(int i8) {
    }

    public void setCallback(b bVar) {
        this.f10105d = bVar;
    }

    public final void setCurrentVolume(int i8) {
        this.f10104c = i8;
        Object volumeProvider = getVolumeProvider();
        if (volumeProvider != null) {
            m.setCurrentVolume(volumeProvider, i8);
        }
        b bVar = this.f10105d;
        if (bVar != null) {
            bVar.onVolumeChanged(this);
        }
    }
}
