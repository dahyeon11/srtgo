package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.h;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends FilterOutputStream {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f7709g = "Exif\u0000\u0000".getBytes(g.f7681a);

    /* renamed from: a, reason: collision with root package name */
    private final h f7710a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f7711b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteBuffer f7712c;

    /* renamed from: d, reason: collision with root package name */
    private int f7713d;

    /* renamed from: e, reason: collision with root package name */
    private int f7714e;

    /* renamed from: f, reason: collision with root package name */
    private int f7715f;

    static final class a {
        public static final short APP1 = -31;
        public static final short DAC = -52;
        public static final short DHT = -60;
        public static final short EOI = -39;
        public static final short JPG = -56;
        public static final short SOF0 = -64;
        public static final short SOF15 = -49;
        public static final short SOI = -40;

        public static boolean isSofMarker(short s8) {
            return (s8 < -64 || s8 > -49 || s8 == -60 || s8 == -56 || s8 == -52) ? false : true;
        }
    }

    public i(OutputStream outputStream, h hVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f7711b = new byte[1];
        this.f7712c = ByteBuffer.allocate(4);
        this.f7713d = 0;
        this.f7710a = hVar;
    }

    private int a(int i8, byte[] bArr, int i9, int i10) {
        int iMin = Math.min(i10, i8 - this.f7712c.position());
        this.f7712c.put(bArr, i9, iMin);
        return iMin;
    }

    private void b(b bVar) throws IOException {
        j[][] jVarArr = h.f7691i;
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (j jVar : h.f7689g) {
            for (int i8 = 0; i8 < h.f7691i.length; i8++) {
                this.f7710a.a(i8).remove(jVar.name);
            }
        }
        if (!this.f7710a.a(1).isEmpty()) {
            this.f7710a.a(0).put(h.f7689g[1].name, g.createULong(0L, this.f7710a.getByteOrder()));
        }
        if (!this.f7710a.a(2).isEmpty()) {
            this.f7710a.a(0).put(h.f7689g[2].name, g.createULong(0L, this.f7710a.getByteOrder()));
        }
        if (!this.f7710a.a(3).isEmpty()) {
            this.f7710a.a(1).put(h.f7689g[3].name, g.createULong(0L, this.f7710a.getByteOrder()));
        }
        for (int i9 = 0; i9 < h.f7691i.length; i9++) {
            Iterator it = this.f7710a.a(i9).entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int size = ((g) ((Map.Entry) it.next()).getValue()).size();
                if (size > 4) {
                    i10 += size;
                }
            }
            iArr2[i9] = iArr2[i9] + i10;
        }
        int size2 = 8;
        for (int i11 = 0; i11 < h.f7691i.length; i11++) {
            if (!this.f7710a.a(i11).isEmpty()) {
                iArr[i11] = size2;
                size2 += (this.f7710a.a(i11).size() * 12) + 6 + iArr2[i11];
            }
        }
        int i12 = size2 + 8;
        if (!this.f7710a.a(1).isEmpty()) {
            this.f7710a.a(0).put(h.f7689g[1].name, g.createULong(iArr[1], this.f7710a.getByteOrder()));
        }
        if (!this.f7710a.a(2).isEmpty()) {
            this.f7710a.a(0).put(h.f7689g[2].name, g.createULong(iArr[2], this.f7710a.getByteOrder()));
        }
        if (!this.f7710a.a(3).isEmpty()) {
            this.f7710a.a(1).put(h.f7689g[3].name, g.createULong(iArr[3], this.f7710a.getByteOrder()));
        }
        bVar.writeUnsignedShort(i12);
        bVar.write(f7709g);
        bVar.writeShort(this.f7710a.getByteOrder() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.setByteOrder(this.f7710a.getByteOrder());
        bVar.writeUnsignedShort(42);
        bVar.writeUnsignedInt(8L);
        for (int i13 = 0; i13 < h.f7691i.length; i13++) {
            if (!this.f7710a.a(i13).isEmpty()) {
                bVar.writeUnsignedShort(this.f7710a.a(i13).size());
                int size3 = iArr[i13] + 2 + (this.f7710a.a(i13).size() * 12) + 4;
                for (Map.Entry entry : this.f7710a.a(i13).entrySet()) {
                    int i14 = ((j) Z.h.checkNotNull((j) ((HashMap) h.b.f7700f.get(i13)).get(entry.getKey()), "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).number;
                    g gVar = (g) entry.getValue();
                    int size4 = gVar.size();
                    bVar.writeUnsignedShort(i14);
                    bVar.writeUnsignedShort(gVar.format);
                    bVar.writeInt(gVar.numberOfComponents);
                    if (size4 > 4) {
                        bVar.writeUnsignedInt(size3);
                        size3 += size4;
                    } else {
                        bVar.write(gVar.bytes);
                        if (size4 < 4) {
                            while (size4 < 4) {
                                bVar.writeByte(0);
                                size4++;
                            }
                        }
                    }
                }
                bVar.writeUnsignedInt(0L);
                Iterator it2 = this.f7710a.a(i13).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((g) ((Map.Entry) it2.next()).getValue()).bytes;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.i.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i8) throws IOException {
        byte[] bArr = this.f7711b;
        bArr[0] = (byte) (i8 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
