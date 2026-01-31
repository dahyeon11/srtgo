package h3;

import java.io.DataOutput;

/* loaded from: classes2.dex */
public interface d extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int i8);

    @Override // java.io.DataOutput
    void write(byte[] bArr);

    @Override // java.io.DataOutput
    void write(byte[] bArr, int i8, int i9);

    @Override // java.io.DataOutput
    void writeBoolean(boolean z8);

    @Override // java.io.DataOutput
    void writeByte(int i8);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String str);

    @Override // java.io.DataOutput
    void writeChar(int i8);

    @Override // java.io.DataOutput
    void writeChars(String str);

    @Override // java.io.DataOutput
    void writeDouble(double d9);

    @Override // java.io.DataOutput
    void writeFloat(float f8);

    @Override // java.io.DataOutput
    void writeInt(int i8);

    @Override // java.io.DataOutput
    void writeLong(long j8);

    @Override // java.io.DataOutput
    void writeShort(int i8);

    @Override // java.io.DataOutput
    void writeUTF(String str);
}
