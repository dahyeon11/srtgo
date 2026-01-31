package d7;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class h extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final File f30100a;

    /* renamed from: b, reason: collision with root package name */
    private final File f30101b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30102c;

    public /* synthetic */ h(File file, File file2, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i8 & 2) != 0 ? null : file2, (i8 & 4) != 0 ? null : str);
    }

    public final File getFile() {
        return this.f30100a;
    }

    public final File getOther() {
        return this.f30101b;
    }

    public final String getReason() {
        return this.f30102c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(File file, File file2, String str) {
        super(AbstractC5333d.a(file, file2, str));
        Intrinsics.checkNotNullParameter(file, "file");
        this.f30100a = file;
        this.f30101b = file2;
        this.f30102c = str;
    }
}
