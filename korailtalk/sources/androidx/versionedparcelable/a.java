package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import com.h2osystech.smartalimi.common.Const;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final O.a f10851a;

    /* renamed from: b, reason: collision with root package name */
    protected final O.a f10852b;

    /* renamed from: c, reason: collision with root package name */
    protected final O.a f10853c;

    /* renamed from: androidx.versionedparcelable.a$a, reason: collision with other inner class name */
    class C0172a extends ObjectInputStream {
        C0172a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public a(O.a aVar, O.a aVar2, O.a aVar3) {
        this.f10851a = aVar;
        this.f10852b = aVar2;
        this.f10853c = aVar3;
    }

    private void D(Serializable serializable) throws IOException {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e8) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e8);
        }
    }

    private void G(E0.a aVar) {
        try {
            writeString(c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e8);
        }
    }

    private Exception a(int i8, String str) {
        switch (i8) {
            case -9:
                return (Exception) readParcelable();
            case Const.SB_ERR_INVALID_ID /* -8 */:
            default:
                return new RuntimeException("Unknown exception code: " + i8 + " msg " + str);
            case -7:
                return new UnsupportedOperationException(str);
            case Const.SB_ERR_INVALID_DATA /* -6 */:
                return new NetworkOnMainThreadException();
            case Const.SB_ERR_NOT_INIT_INFO /* -5 */:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f10853c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f10853c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws NoSuchMethodException, SecurityException {
        Method method = (Method) this.f10851a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f10851a.put(str, declaredMethod);
        return declaredMethod;
    }

    private int e(Object obj) {
        if (obj instanceof String) {
            return 4;
        }
        if (obj instanceof Parcelable) {
            return 2;
        }
        if (obj instanceof E0.a) {
            return 1;
        }
        if (obj instanceof Serializable) {
            return 3;
        }
        if (obj instanceof IBinder) {
            return 5;
        }
        if (obj instanceof Integer) {
            return 7;
        }
        if (obj instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(obj.getClass().getName() + " cannot be VersionedParcelled");
    }

    private Method f(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = (Method) this.f10852b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, a.class);
        this.f10852b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Collection j(Collection collection) {
        int i8 = readInt();
        if (i8 < 0) {
            return null;
        }
        if (i8 != 0) {
            int i9 = readInt();
            if (i8 < 0) {
                return null;
            }
            if (i9 == 1) {
                while (i8 > 0) {
                    collection.add(s());
                    i8--;
                }
            } else if (i9 == 2) {
                while (i8 > 0) {
                    collection.add(readParcelable());
                    i8--;
                }
            } else if (i9 == 3) {
                while (i8 > 0) {
                    collection.add(r());
                    i8--;
                }
            } else if (i9 == 4) {
                while (i8 > 0) {
                    collection.add(readString());
                    i8--;
                }
            } else if (i9 == 5) {
                while (i8 > 0) {
                    collection.add(readStrongBinder());
                    i8--;
                }
            }
        }
        return collection;
    }

    private Exception l(int i8, String str) {
        return a(i8, str);
    }

    private int m() {
        return readInt();
    }

    private void w(Collection collection) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int iE = e(collection.iterator().next());
            writeInt(iE);
            switch (iE) {
                case 1:
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        F((E0.a) it.next());
                    }
                    break;
                case 2:
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        D((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator it6 = collection.iterator();
                    while (it6.hasNext()) {
                        writeInt(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator it7 = collection.iterator();
                    while (it7.hasNext()) {
                        writeFloat(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private void x(Collection collection, int i8) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i8);
        w(collection);
    }

    protected void A(int[] iArr) {
        if (iArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(iArr.length);
        for (int i8 : iArr) {
            writeInt(i8);
        }
    }

    protected void B(long[] jArr) {
        if (jArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(jArr.length);
        for (long j8 : jArr) {
            writeLong(j8);
        }
    }

    protected void C() {
        writeInt(0);
    }

    protected void E(E0.a aVar, a aVar2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            f(aVar.getClass()).invoke(null, aVar, aVar2);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (!(e11.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            }
            throw ((RuntimeException) e11.getCause());
        }
    }

    protected void F(E0.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (aVar == null) {
            writeString(null);
            return;
        }
        G(aVar);
        a aVarB = b();
        E(aVar, aVarB);
        aVarB.closeField();
    }

    protected abstract a b();

    protected abstract void closeField();

    protected Object[] g(Object[] objArr) {
        int i8 = readInt();
        if (i8 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i8);
        if (i8 != 0) {
            int i9 = readInt();
            if (i8 < 0) {
                return null;
            }
            if (i9 == 1) {
                while (i8 > 0) {
                    arrayList.add(s());
                    i8--;
                }
            } else if (i9 == 2) {
                while (i8 > 0) {
                    arrayList.add(readParcelable());
                    i8--;
                }
            } else if (i9 == 3) {
                while (i8 > 0) {
                    arrayList.add(r());
                    i8--;
                }
            } else if (i9 == 4) {
                while (i8 > 0) {
                    arrayList.add(readString());
                    i8--;
                }
            } else if (i9 == 5) {
                while (i8 > 0) {
                    arrayList.add(readStrongBinder());
                    i8--;
                }
            }
        }
        return arrayList.toArray(objArr);
    }

    protected boolean[] h() {
        int i8 = readInt();
        if (i8 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            zArr[i9] = readInt() != 0;
        }
        return zArr;
    }

    protected abstract CharSequence i();

    public boolean isStream() {
        return false;
    }

    protected double[] k() {
        int i8 = readInt();
        if (i8 < 0) {
            return null;
        }
        double[] dArr = new double[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            dArr[i9] = readDouble();
        }
        return dArr;
    }

    protected float[] n() {
        int i8 = readInt();
        if (i8 < 0) {
            return null;
        }
        float[] fArr = new float[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            fArr[i9] = readFloat();
        }
        return fArr;
    }

    protected E0.a o(String str, a aVar) {
        try {
            return (E0.a) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        }
    }

    protected int[] p() {
        int i8 = readInt();
        if (i8 < 0) {
            return null;
        }
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = readInt();
        }
        return iArr;
    }

    protected long[] q() {
        int i8 = readInt();
        if (i8 < 0) {
            return null;
        }
        long[] jArr = new long[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            jArr[i9] = readLong();
        }
        return jArr;
    }

    protected Serializable r() {
        String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (Serializable) new C0172a(new ByteArrayInputStream(readByteArray())).readObject();
        } catch (IOException e8) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + string + ")", e8);
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + string + ")", e9);
        }
    }

    public <T> T[] readArray(T[] tArr, int i8) {
        return !readField(i8) ? tArr : (T[]) g(tArr);
    }

    protected abstract boolean readBoolean();

    public boolean readBoolean(boolean z8, int i8) {
        return !readField(i8) ? z8 : readBoolean();
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i8) {
        return !readField(i8) ? zArr : h();
    }

    protected abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i8) {
        return !readField(i8) ? bundle : readBundle();
    }

    public byte readByte(byte b9, int i8) {
        return !readField(i8) ? b9 : (byte) (readInt() & 255);
    }

    protected abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i8) {
        return !readField(i8) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i8) {
        if (!readField(i8)) {
            return cArr;
        }
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        char[] cArr2 = new char[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            cArr2[i10] = (char) readInt();
        }
        return cArr2;
    }

    public CharSequence readCharSequence(CharSequence charSequence, int i8) {
        return !readField(i8) ? charSequence : i();
    }

    protected abstract double readDouble();

    public double readDouble(double d9, int i8) {
        return !readField(i8) ? d9 : readDouble();
    }

    public double[] readDoubleArray(double[] dArr, int i8) {
        return !readField(i8) ? dArr : k();
    }

    public Exception readException(Exception exc, int i8) {
        int iM;
        return (readField(i8) && (iM = m()) != 0) ? l(iM, readString()) : exc;
    }

    protected abstract boolean readField(int i8);

    protected abstract float readFloat();

    public float readFloat(float f8, int i8) {
        return !readField(i8) ? f8 : readFloat();
    }

    public float[] readFloatArray(float[] fArr, int i8) {
        return !readField(i8) ? fArr : n();
    }

    protected abstract int readInt();

    public int readInt(int i8, int i9) {
        return !readField(i9) ? i8 : readInt();
    }

    public int[] readIntArray(int[] iArr, int i8) {
        return !readField(i8) ? iArr : p();
    }

    public <T> List<T> readList(List<T> list, int i8) {
        return !readField(i8) ? list : (List) j(new ArrayList());
    }

    protected abstract long readLong();

    public long readLong(long j8, int i8) {
        return !readField(i8) ? j8 : readLong();
    }

    public long[] readLongArray(long[] jArr, int i8) {
        return !readField(i8) ? jArr : q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i8) {
        if (!readField(i8)) {
            return map;
        }
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        O.a aVar = new O.a();
        if (i9 == 0) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        j(arrayList);
        j(arrayList2);
        for (int i10 = 0; i10 < i9; i10++) {
            aVar.put(arrayList.get(i10), arrayList2.get(i10));
        }
        return aVar;
    }

    protected abstract Parcelable readParcelable();

    public <T extends Parcelable> T readParcelable(T t8, int i8) {
        return !readField(i8) ? t8 : (T) readParcelable();
    }

    public <T> Set<T> readSet(Set<T> set, int i8) {
        return !readField(i8) ? set : (Set) j(new O.b());
    }

    public Size readSize(Size size, int i8) {
        if (!readField(i8)) {
            return size;
        }
        if (readBoolean()) {
            return new Size(readInt(), readInt());
        }
        return null;
    }

    public SizeF readSizeF(SizeF sizeF, int i8) {
        if (!readField(i8)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i8) {
        if (!readField(i8)) {
            return sparseBooleanArray;
        }
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    protected abstract String readString();

    public String readString(String str, int i8) {
        return !readField(i8) ? str : readString();
    }

    protected abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i8) {
        return !readField(i8) ? iBinder : readStrongBinder();
    }

    public <T extends E0.a> T readVersionedParcelable(T t8, int i8) {
        return !readField(i8) ? t8 : (T) s();
    }

    protected E0.a s() {
        String string = readString();
        if (string == null) {
            return null;
        }
        return o(string, b());
    }

    protected abstract void setOutputField(int i8);

    public void setSerializationFlags(boolean z8, boolean z9) {
    }

    protected void t(Object[] objArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (objArr == null) {
            writeInt(-1);
            return;
        }
        int length = objArr.length;
        writeInt(length);
        if (length > 0) {
            int i8 = 0;
            int iE = e(objArr[0]);
            writeInt(iE);
            if (iE == 1) {
                while (i8 < length) {
                    F((E0.a) objArr[i8]);
                    i8++;
                }
                return;
            }
            if (iE == 2) {
                while (i8 < length) {
                    writeParcelable((Parcelable) objArr[i8]);
                    i8++;
                }
                return;
            }
            if (iE == 3) {
                while (i8 < length) {
                    D((Serializable) objArr[i8]);
                    i8++;
                }
            } else if (iE == 4) {
                while (i8 < length) {
                    writeString((String) objArr[i8]);
                    i8++;
                }
            } else {
                if (iE != 5) {
                    return;
                }
                while (i8 < length) {
                    writeStrongBinder((IBinder) objArr[i8]);
                    i8++;
                }
            }
        }
    }

    protected void u(boolean[] zArr) {
        if (zArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(zArr.length);
        for (boolean z8 : zArr) {
            writeInt(z8 ? 1 : 0);
        }
    }

    protected abstract void v(CharSequence charSequence);

    public <T> void writeArray(T[] tArr, int i8) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i8);
        t(tArr);
    }

    protected abstract void writeBoolean(boolean z8);

    public void writeBoolean(boolean z8, int i8) {
        setOutputField(i8);
        writeBoolean(z8);
    }

    public void writeBooleanArray(boolean[] zArr, int i8) {
        setOutputField(i8);
        u(zArr);
    }

    protected abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i8) {
        setOutputField(i8);
        writeBundle(bundle);
    }

    public void writeByte(byte b9, int i8) {
        setOutputField(i8);
        writeInt(b9);
    }

    protected abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i8) {
        setOutputField(i8);
        writeByteArray(bArr);
    }

    protected abstract void writeByteArray(byte[] bArr, int i8, int i9);

    public void writeCharArray(char[] cArr, int i8) {
        setOutputField(i8);
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c9 : cArr) {
            writeInt(c9);
        }
    }

    public void writeCharSequence(CharSequence charSequence, int i8) {
        setOutputField(i8);
        v(charSequence);
    }

    protected abstract void writeDouble(double d9);

    public void writeDouble(double d9, int i8) {
        setOutputField(i8);
        writeDouble(d9);
    }

    public void writeDoubleArray(double[] dArr, int i8) {
        setOutputField(i8);
        y(dArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int i8) {
        setOutputField(i8);
        if (exc == 0) {
            C();
            return;
        }
        int i9 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? -9 : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? -5 : exc instanceof NetworkOnMainThreadException ? -6 : exc instanceof UnsupportedOperationException ? -7 : 0;
        writeInt(i9);
        if (i9 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        writeString(exc.getMessage());
        if (i9 != -9) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    protected abstract void writeFloat(float f8);

    public void writeFloat(float f8, int i8) {
        setOutputField(i8);
        writeFloat(f8);
    }

    public void writeFloatArray(float[] fArr, int i8) {
        setOutputField(i8);
        z(fArr);
    }

    protected abstract void writeInt(int i8);

    public void writeInt(int i8, int i9) {
        setOutputField(i9);
        writeInt(i8);
    }

    public void writeIntArray(int[] iArr, int i8) {
        setOutputField(i8);
        A(iArr);
    }

    public <T> void writeList(List<T> list, int i8) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        x(list, i8);
    }

    protected abstract void writeLong(long j8);

    public void writeLong(long j8, int i8) {
        setOutputField(i8);
        writeLong(j8);
    }

    public void writeLongArray(long[] jArr, int i8) {
        setOutputField(i8);
        B(jArr);
    }

    public <K, V> void writeMap(Map<K, V> map, int i8) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i8);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        w(arrayList);
        w(arrayList2);
    }

    protected abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i8) {
        setOutputField(i8);
        writeParcelable(parcelable);
    }

    public void writeSerializable(Serializable serializable, int i8) throws IOException {
        setOutputField(i8);
        D(serializable);
    }

    public <T> void writeSet(Set<T> set, int i8) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        x(set, i8);
    }

    public void writeSize(Size size, int i8) {
        setOutputField(i8);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    public void writeSizeF(SizeF sizeF, int i8) {
        setOutputField(i8);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i8) {
        setOutputField(i8);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            writeInt(sparseBooleanArray.keyAt(i9));
            writeBoolean(sparseBooleanArray.valueAt(i9));
        }
    }

    protected abstract void writeString(String str);

    public void writeString(String str, int i8) {
        setOutputField(i8);
        writeString(str);
    }

    protected abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i8) {
        setOutputField(i8);
        writeStrongBinder(iBinder);
    }

    protected abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i8) {
        setOutputField(i8);
        writeStrongInterface(iInterface);
    }

    public void writeVersionedParcelable(E0.a aVar, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i8);
        F(aVar);
    }

    protected void y(double[] dArr) {
        if (dArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(dArr.length);
        for (double d9 : dArr) {
            writeDouble(d9);
        }
    }

    protected void z(float[] fArr) {
        if (fArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(fArr.length);
        for (float f8 : fArr) {
            writeFloat(f8);
        }
    }

    public void writeByteArray(byte[] bArr, int i8, int i9, int i10) {
        setOutputField(i10);
        writeByteArray(bArr, i8, i9);
    }
}
