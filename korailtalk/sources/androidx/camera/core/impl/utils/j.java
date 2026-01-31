package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
class j {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    j(String str, int i8, int i9) {
        this.name = str;
        this.number = i8;
        this.primaryFormat = i9;
        this.secondaryFormat = -1;
    }

    j(String str, int i8, int i9, int i10) {
        this.name = str;
        this.number = i8;
        this.primaryFormat = i9;
        this.secondaryFormat = i10;
    }
}
