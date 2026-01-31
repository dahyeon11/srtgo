package io.grpc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* loaded from: classes.dex */
public final class P0 extends AbstractC5725g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32049a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f32050b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f32051c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32052d;

    /* renamed from: e, reason: collision with root package name */
    private final List f32053e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f32054f;

    /* renamed from: g, reason: collision with root package name */
    private final List f32055g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f32056a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f32057b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f32058c;

        /* renamed from: d, reason: collision with root package name */
        private String f32059d;

        /* renamed from: e, reason: collision with root package name */
        private List f32060e;

        /* renamed from: f, reason: collision with root package name */
        private byte[] f32061f;

        /* renamed from: g, reason: collision with root package name */
        private List f32062g;

        private void h() {
            this.f32057b = null;
            this.f32058c = null;
            this.f32059d = null;
            this.f32060e = null;
        }

        private void i() {
            this.f32061f = null;
            this.f32062g = null;
        }

        public AbstractC5725g build() {
            return new P0(this);
        }

        public b keyManager(File file, File file2) {
            return keyManager(file, file2, (String) null);
        }

        public b requireFakeFeature() {
            this.f32056a = true;
            return this;
        }

        public b trustManager(File file) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                return trustManager(fileInputStream);
            } finally {
                fileInputStream.close();
            }
        }

        private b() {
        }

        public b keyManager(File file, File file2, String str) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream = new FileInputStream(file2);
                b bVarKeyManager = keyManager(fileInputStream, fileInputStream, str);
                fileInputStream.close();
                return bVarKeyManager;
            } catch (Throwable th) {
                throw th;
            } finally {
                fileInputStream.close();
            }
        }

        public b trustManager(InputStream inputStream) {
            byte[] byteArray = h3.h.toByteArray(inputStream);
            i();
            this.f32061f = byteArray;
            return this;
        }

        public b trustManager(TrustManager... trustManagerArr) {
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
            i();
            this.f32062g = listUnmodifiableList;
            return this;
        }

        public b keyManager(InputStream inputStream, InputStream inputStream2) {
            return keyManager(inputStream, inputStream2, (String) null);
        }

        public b keyManager(InputStream inputStream, InputStream inputStream2, String str) {
            byte[] byteArray = h3.h.toByteArray(inputStream);
            byte[] byteArray2 = h3.h.toByteArray(inputStream2);
            h();
            this.f32057b = byteArray;
            this.f32058c = byteArray2;
            this.f32059d = str;
            return this;
        }

        public b keyManager(KeyManager... keyManagerArr) {
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
            h();
            this.f32060e = listUnmodifiableList;
            return this;
        }
    }

    public enum c {
        FAKE,
        MTLS,
        CUSTOM_MANAGERS
    }

    P0(b bVar) {
        this.f32049a = bVar.f32056a;
        this.f32050b = bVar.f32057b;
        this.f32051c = bVar.f32058c;
        this.f32052d = bVar.f32059d;
        this.f32053e = bVar.f32060e;
        this.f32054f = bVar.f32061f;
        this.f32055g = bVar.f32062g;
    }

    private static void a(Set set, Set set2, c cVar) {
        if (set.contains(cVar)) {
            return;
        }
        set2.add(cVar);
    }

    public static AbstractC5725g create() {
        return newBuilder().build();
    }

    public static b newBuilder() {
        return new b();
    }

    public byte[] getCertificateChain() {
        byte[] bArr = this.f32050b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<KeyManager> getKeyManagers() {
        return this.f32053e;
    }

    public byte[] getPrivateKey() {
        byte[] bArr = this.f32051c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPrivateKeyPassword() {
        return this.f32052d;
    }

    public byte[] getRootCertificates() {
        byte[] bArr = this.f32054f;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> getTrustManagers() {
        return this.f32055g;
    }

    public Set<c> incomprehensible(Set<c> set) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(c.class);
        if (this.f32049a) {
            a(set, enumSetNoneOf, c.FAKE);
        }
        if (this.f32054f != null || this.f32051c != null || this.f32053e != null) {
            a(set, enumSetNoneOf, c.MTLS);
        }
        if (this.f32053e != null || this.f32055g != null) {
            a(set, enumSetNoneOf, c.CUSTOM_MANAGERS);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    @Override // io.grpc.AbstractC5725g
    public AbstractC5725g withoutBearerTokens() {
        return this;
    }
}
