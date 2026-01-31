package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.zg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5122zg0 {
    private static final String a(Context context, C1876Sf0 c1876Sf0) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = EnumC1761Pj0.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e8) {
            c1876Sf0.zzc(2024, 0L, e8);
        } catch (NoSuchFieldException e9) {
            c1876Sf0.zzc(2024, 0L, e9);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private static final void b(byte[] bArr, String str, Context context, C1876Sf0 c1876Sf0) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(EnumC1761Pj0.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        c1876Sf0.zzb(4007, sb.toString());
    }

    public static boolean zza(EnumC1214Cc enumC1214Cc) {
        EnumC1214Cc enumC1214Cc2 = EnumC1214Cc.UNSUPPORTED;
        int iOrdinal = enumC1214Cc.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final EnumC1214Cc zzb(Context context, C1876Sf0 c1876Sf0) throws IOException {
        EnumC1214Cc enumC1214Cc;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new C3881om0(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                c1876Sf0.zzb(5017, "No .so");
                enumC1214Cc = EnumC1214Cc.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e8) {
                    b(null, e8.toString(), context, c1876Sf0);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        b(bArr, null, context, c1876Sf0);
                        enumC1214Cc = EnumC1214Cc.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s8 = ByteBuffer.wrap(bArr2).getShort();
                        if (s8 == 3) {
                            enumC1214Cc = EnumC1214Cc.X86;
                        } else if (s8 == 40) {
                            enumC1214Cc = EnumC1214Cc.ARM7;
                        } else if (s8 == 62) {
                            enumC1214Cc = EnumC1214Cc.X86_64;
                        } else if (s8 == 183) {
                            enumC1214Cc = EnumC1214Cc.ARM64;
                        } else if (s8 != 243) {
                            b(bArr, null, context, c1876Sf0);
                            enumC1214Cc = EnumC1214Cc.UNSUPPORTED;
                        } else {
                            enumC1214Cc = EnumC1214Cc.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    enumC1214Cc = EnumC1214Cc.UNSUPPORTED;
                }
            }
        } else {
            c1876Sf0.zzb(5017, "No lib/");
            enumC1214Cc = EnumC1214Cc.UNKNOWN;
        }
        if (enumC1214Cc == EnumC1214Cc.UNKNOWN) {
            String strA = a(context, c1876Sf0);
            if (TextUtils.isEmpty(strA)) {
                b(null, "Empty dev arch", context, c1876Sf0);
                enumC1214Cc = EnumC1214Cc.UNSUPPORTED;
            } else if (strA.equalsIgnoreCase("i686") || strA.equalsIgnoreCase("x86")) {
                enumC1214Cc = EnumC1214Cc.X86;
            } else if (strA.equalsIgnoreCase("x86_64")) {
                enumC1214Cc = EnumC1214Cc.X86_64;
            } else if (strA.equalsIgnoreCase("arm64-v8a")) {
                enumC1214Cc = EnumC1214Cc.ARM64;
            } else if (strA.equalsIgnoreCase("armeabi-v7a") || strA.equalsIgnoreCase("armv71")) {
                enumC1214Cc = EnumC1214Cc.ARM7;
            } else if (strA.equalsIgnoreCase("riscv64")) {
                enumC1214Cc = EnumC1214Cc.RISCV64;
            } else {
                b(null, strA, context, c1876Sf0);
                enumC1214Cc = EnumC1214Cc.UNSUPPORTED;
            }
        }
        c1876Sf0.zzb(5018, enumC1214Cc.name());
        return enumC1214Cc;
    }
}
