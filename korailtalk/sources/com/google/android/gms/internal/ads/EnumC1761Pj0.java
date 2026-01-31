package com.google.android.gms.internal.ads;

import com.j256.ormlite.stmt.query.SimpleComparison;

/* renamed from: com.google.android.gms.internal.ads.Pj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1761Pj0 {
    JAVA_VERSION("java.version"),
    JAVA_VENDOR("java.vendor"),
    JAVA_VENDOR_URL("java.vendor.url"),
    JAVA_HOME("java.home"),
    JAVA_VM_SPECIFICATION_VERSION("java.vm.specification.version"),
    JAVA_VM_SPECIFICATION_VENDOR("java.vm.specification.vendor"),
    JAVA_VM_SPECIFICATION_NAME("java.vm.specification.name"),
    JAVA_VM_VERSION("java.vm.version"),
    JAVA_VM_VENDOR("java.vm.vendor"),
    JAVA_VM_NAME("java.vm.name"),
    JAVA_SPECIFICATION_VERSION("java.specification.version"),
    JAVA_SPECIFICATION_VENDOR("java.specification.vendor"),
    JAVA_SPECIFICATION_NAME("java.specification.name"),
    JAVA_CLASS_VERSION("java.class.version"),
    JAVA_CLASS_PATH("java.class.path"),
    JAVA_LIBRARY_PATH("java.library.path"),
    JAVA_IO_TMPDIR("java.io.tmpdir"),
    JAVA_COMPILER("java.compiler"),
    JAVA_EXT_DIRS("java.ext.dirs"),
    OS_NAME("os.name"),
    OS_ARCH("os.arch"),
    OS_VERSION("os.version"),
    FILE_SEPARATOR("file.separator"),
    PATH_SEPARATOR("path.separator"),
    LINE_SEPARATOR("line.separator"),
    USER_NAME("user.name"),
    USER_HOME("user.home"),
    USER_DIR("user.dir");


    /* renamed from: a, reason: collision with root package name */
    private final String f15401a;

    EnumC1761Pj0(String str) {
        this.f15401a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f15401a + SimpleComparison.EQUAL_TO_OPERATION + System.getProperty(this.f15401a);
    }

    public final String zza() {
        return System.getProperty(this.f15401a);
    }
}
