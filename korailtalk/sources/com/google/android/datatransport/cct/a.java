package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import m1.C5904b;
import o1.f;

/* loaded from: classes.dex */
public final class a implements f {
    public static final a INSTANCE;
    public static final a LEGACY_INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    static final String f11721c;

    /* renamed from: d, reason: collision with root package name */
    static final String f11722d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f11723e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f11724f;

    /* renamed from: a, reason: collision with root package name */
    private final String f11725a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11726b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f11721c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f11722d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f11723e = strA3;
        f11724f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C5904b.of("proto"), C5904b.of("json"))));
        INSTANCE = new a(strA, null);
        LEGACY_INSTANCE = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f11725a = str;
        this.f11726b = str2;
    }

    public static a fromByteArray(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    public byte[] asByteArray() {
        String str = this.f11726b;
        if (str == null && this.f11725a == null) {
            return null;
        }
        String str2 = this.f11725a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String getAPIKey() {
        return this.f11726b;
    }

    public String getEndPoint() {
        return this.f11725a;
    }

    @Override // o1.f, o1.InterfaceC6028e
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // o1.f, o1.InterfaceC6028e
    public String getName() {
        return "cct";
    }

    @Override // o1.f
    public Set<C5904b> getSupportedEncodings() {
        return f11724f;
    }
}
