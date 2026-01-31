package k1;

import R6.G;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.RectF;
import d7.t;
import f7.l;
import j7.s;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import k1.InterfaceC5843a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.tensorflow.lite.e;
import org.tensorflow.lite.j;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5845c implements InterfaceC5843a {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f33539a;

    /* renamed from: b, reason: collision with root package name */
    private int f33540b;

    /* renamed from: c, reason: collision with root package name */
    private int f33541c;

    /* renamed from: d, reason: collision with root package name */
    private float f33542d;

    /* renamed from: e, reason: collision with root package name */
    private int f33543e;

    /* renamed from: f, reason: collision with root package name */
    private float f33544f;

    /* renamed from: g, reason: collision with root package name */
    private int f33545g;

    /* renamed from: h, reason: collision with root package name */
    private int f33546h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f33547i;

    /* renamed from: j, reason: collision with root package name */
    private final List f33548j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f33549k;

    /* renamed from: l, reason: collision with root package name */
    private float[][][] f33550l;

    /* renamed from: m, reason: collision with root package name */
    private float[][] f33551m;

    /* renamed from: n, reason: collision with root package name */
    private float[][] f33552n;

    /* renamed from: o, reason: collision with root package name */
    private float[] f33553o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f33554p;

    /* renamed from: q, reason: collision with root package name */
    private MappedByteBuffer f33555q;

    /* renamed from: r, reason: collision with root package name */
    private e.a f33556r;

    /* renamed from: s, reason: collision with root package name */
    private e f33557s;

    /* renamed from: t, reason: collision with root package name */
    private float f33558t;

    /* renamed from: u, reason: collision with root package name */
    private float f33559u;

    /* renamed from: k1.c$a */
    public static final class a {

        /* renamed from: k1.c$a$a, reason: collision with other inner class name */
        static final class C0338a extends Lambda implements l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5845c f33560a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0338a(C5845c c5845c) {
                super(1);
                this.f33560a = c5845c;
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return G.INSTANCE;
            }

            public final void invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f33560a.f33548j.add(it);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MappedByteBuffer a(AssetManager assetManager, String str) throws IOException {
            AssetFileDescriptor assetFileDescriptorOpenFd = assetManager.openFd(str);
            Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "assets.openFd(modelFilename)");
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "inputStream.channel");
            MappedByteBuffer result = channel.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
            assetFileDescriptorOpenFd.close();
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }

        public final InterfaceC5843a create(Context context, String modelFilename, String labelFilename, int i8, boolean z8) throws IOException {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(modelFilename, "modelFilename");
            Intrinsics.checkNotNullParameter(labelFilename, "labelFilename");
            ByteBuffer byteBuffer = null;
            C5845c c5845c = new C5845c(0 == true ? 1 : 0);
            AssetManager assets = context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "context.assets");
            MappedByteBuffer mappedByteBufferA = a(assets, modelFilename);
            InputStream inputStreamOpen = context.getAssets().open(labelFilename);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(labelFilename)");
            t.forEachLine(new BufferedReader(new InputStreamReader(inputStreamOpen)), new C0338a(c5845c));
            c5845c.f33540b = i8;
            try {
                e.a aVar = new e.a();
                aVar.setNumThreads(4);
                c5845c.f33557s = new e(mappedByteBufferA, aVar);
                c5845c.f33555q = mappedByteBufferA;
                c5845c.f33556r = aVar;
                c5845c.f33539a = z8;
                int i9 = z8 ? 1 : 4;
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c5845c.f33540b * c5845c.f33540b * 3 * i9);
                Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(1 * d.inp…* 3 * numBytesPerChannel)");
                c5845c.f33554p = byteBufferAllocateDirect;
                ByteBuffer byteBuffer2 = c5845c.f33554p;
                if (byteBuffer2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgData");
                    byteBuffer2 = null;
                }
                byteBuffer2.order(ByteOrder.nativeOrder());
                c5845c.f33549k = new int[c5845c.f33540b * c5845c.f33540b];
                float[][] fArr = new float[43][];
                for (int i10 = 0; i10 < 43; i10++) {
                    fArr[i10] = new float[4];
                }
                c5845c.f33550l = new float[][][]{fArr};
                c5845c.f33551m = new float[][]{new float[43]};
                c5845c.f33552n = new float[][]{new float[43]};
                c5845c.f33553o = new float[1];
                int i11 = i9;
                c5845c.f33541c = (int) ((Math.pow(i8 / 32, 2.0d) + Math.pow(i8 / 16, 2.0d) + Math.pow(i8 / 8, 2.0d)) * 3);
                if (c5845c.f33539a) {
                    e eVar = c5845c.f33557s;
                    Intrinsics.checkNotNull(eVar);
                    j inputTensor = eVar.getInputTensor(0);
                    c5845c.f33542d = inputTensor.quantizationParams().getScale();
                    c5845c.f33543e = inputTensor.quantizationParams().getZeroPoint();
                    e eVar2 = c5845c.f33557s;
                    Intrinsics.checkNotNull(eVar2);
                    j outputTensor = eVar2.getOutputTensor(0);
                    c5845c.f33544f = outputTensor.quantizationParams().getScale();
                    c5845c.f33545g = outputTensor.quantizationParams().getZeroPoint();
                }
                e eVar3 = c5845c.f33557s;
                Intrinsics.checkNotNull(eVar3);
                int[] iArrShape = eVar3.getOutputTensor(0).shape();
                int i12 = iArrShape[iArrShape.length - 1];
                c5845c.f33546h = i12 - 5;
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(c5845c.f33541c * i12 * i11);
                Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect2, "allocateDirect(d.output_… 5) * numBytesPerChannel)");
                c5845c.f33547i = byteBufferAllocateDirect2;
                ByteBuffer byteBuffer3 = c5845c.f33547i;
                if (byteBuffer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("outData");
                } else {
                    byteBuffer = byteBuffer3;
                }
                byteBuffer.order(ByteOrder.nativeOrder());
                return c5845c;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }

        private a() {
        }
    }

    public /* synthetic */ C5845c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final float b(RectF rectF, RectF rectF2) {
        float f8 = rectF.left;
        float f9 = rectF.right;
        float f10 = 2;
        float f11 = (f8 + f9) / f10;
        float f12 = f9 - f8;
        float f13 = rectF2.left;
        float f14 = rectF2.right;
        float fG = g(f11, f12, (f13 + f14) / f10, f14 - f13);
        float f15 = rectF.top;
        float f16 = rectF.bottom;
        float f17 = (f15 + f16) / f10;
        float f18 = f16 - f15;
        float f19 = rectF2.top;
        float f20 = rectF2.bottom;
        float fG2 = g(f17, f18, (f19 + f20) / f10, f20 - f19);
        if (fG < 0.0f || fG2 < 0.0f) {
            return 0.0f;
        }
        return fG * fG2;
    }

    private final float c(RectF rectF, RectF rectF2) {
        return b(rectF, rectF2) / d(rectF, rectF2);
    }

    private final float d(RectF rectF, RectF rectF2) {
        return (((rectF.right - rectF.left) * (rectF.bottom - rectF.top)) + ((rectF2.right - rectF2.left) * (rectF2.bottom - rectF2.top))) - b(rectF, rectF2);
    }

    private final ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = this.f33548j.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            PriorityQueue priorityQueue = new PriorityQueue(50, new Comparator() { // from class: k1.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C5845c.f((InterfaceC5843a.C0337a) obj, (InterfaceC5843a.C0337a) obj2);
                }
            });
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                int i11 = i10 + 1;
                if (((InterfaceC5843a.C0337a) arrayList.get(i10)).getDetectedClass1() == i8) {
                    priorityQueue.add(arrayList.get(i10));
                }
                i10 = i11;
            }
            while (priorityQueue.size() > 0) {
                Object[] array = priorityQueue.toArray(new InterfaceC5843a.C0337a[priorityQueue.size()]);
                Intrinsics.checkNotNullExpressionValue(array, "pq.toArray(a)");
                InterfaceC5843a.C0337a[] c0337aArr = (InterfaceC5843a.C0337a[]) array;
                InterfaceC5843a.C0337a c0337a = c0337aArr[0];
                arrayList2.add(c0337a);
                priorityQueue.clear();
                int length = c0337aArr.length;
                int i12 = 1;
                while (i12 < length) {
                    int i13 = i12 + 1;
                    InterfaceC5843a.C0337a c0337a2 = c0337aArr[i12];
                    if (c(c0337a.getLocation(), c0337a2.getLocation()) < this.f33558t) {
                        priorityQueue.add(c0337a2);
                    }
                    i12 = i13;
                }
            }
            i8 = i9;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(InterfaceC5843a.C0337a c0337a, InterfaceC5843a.C0337a c0337a2) {
        Float confidence1 = c0337a2.getConfidence1();
        Intrinsics.checkNotNull(confidence1);
        float fFloatValue = confidence1.floatValue();
        Float confidence12 = c0337a.getConfidence1();
        Intrinsics.checkNotNull(confidence12);
        return Float.compare(fFloatValue, confidence12.floatValue());
    }

    private final float g(float f8, float f9, float f10, float f11) {
        float f12 = 2;
        float f13 = f9 / f12;
        float f14 = f8 - f13;
        float f15 = f11 / f12;
        float f16 = f10 - f15;
        if (f14 <= f16) {
            f14 = f16;
        }
        float f17 = f8 + f13;
        float f18 = f10 + f15;
        if (f17 >= f18) {
            f17 = f18;
        }
        return f17 - f14;
    }

    private final void h() {
        e eVar = this.f33557s;
        Intrinsics.checkNotNull(eVar);
        eVar.close();
        MappedByteBuffer mappedByteBuffer = this.f33555q;
        Intrinsics.checkNotNull(mappedByteBuffer);
        this.f33557s = new e(mappedByteBuffer, this.f33556r);
    }

    @Override // k1.InterfaceC5843a
    public void close() {
        e eVar = this.f33557s;
        if (eVar != null) {
            Intrinsics.checkNotNull(eVar);
            eVar.close();
            this.f33557s = null;
        }
    }

    @Override // k1.InterfaceC5843a
    public float getObjThresh() {
        return this.f33559u;
    }

    @Override // k1.InterfaceC5843a
    public String getStatString() {
        return "";
    }

    @Override // k1.InterfaceC5843a
    public List<InterfaceC5843a.C0337a> recognizeImage(Bitmap bitmap) {
        int[] iArr;
        int i8;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int[] iArr2 = this.f33549k;
        ByteBuffer byteBuffer = null;
        if (iArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intValues");
            iArr = null;
        } else {
            iArr = iArr2;
        }
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        ByteBuffer byteBuffer2 = this.f33554p;
        if (byteBuffer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgData");
            byteBuffer2 = null;
        }
        byteBuffer2.rewind();
        int i9 = this.f33540b;
        int i10 = 0;
        int i11 = 0;
        while (i11 < i9) {
            int i12 = i11 + 1;
            int i13 = this.f33540b;
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                int[] iArr3 = this.f33549k;
                if (iArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("intValues");
                    iArr3 = null;
                }
                int i16 = iArr3[(this.f33540b * i11) + i14];
                ByteBuffer byteBuffer3 = this.f33554p;
                if (byteBuffer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgData");
                    byteBuffer3 = null;
                }
                byteBuffer3.putFloat((((i16 >> 16) & 255) - 127.5f) / 127.5f);
                ByteBuffer byteBuffer4 = this.f33554p;
                if (byteBuffer4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgData");
                    byteBuffer4 = null;
                }
                byteBuffer4.putFloat((((i16 >> 8) & 255) - 127.5f) / 127.5f);
                ByteBuffer byteBuffer5 = this.f33554p;
                if (byteBuffer5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgData");
                    byteBuffer5 = null;
                }
                byteBuffer5.putFloat(((i16 & 255) - 127.5f) / 127.5f);
                i14 = i15;
            }
            i11 = i12;
        }
        ByteBuffer byteBuffer6 = this.f33554p;
        if (byteBuffer6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgData");
            byteBuffer6 = null;
        }
        ByteBuffer[] byteBufferArr = {byteBuffer6};
        HashMap map = new HashMap();
        ByteBuffer byteBuffer7 = this.f33547i;
        if (byteBuffer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outData");
            byteBuffer7 = null;
        }
        byteBuffer7.rewind();
        ByteBuffer byteBuffer8 = this.f33547i;
        if (byteBuffer8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outData");
        } else {
            byteBuffer = byteBuffer8;
        }
        map.put(0, byteBuffer);
        e eVar = this.f33557s;
        Intrinsics.checkNotNull(eVar);
        eVar.runForMultipleInputsOutputs(byteBufferArr, map);
        Object obj = map.get(0);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.nio.ByteBuffer");
        }
        ByteBuffer byteBuffer9 = (ByteBuffer) obj;
        byteBuffer9.rewind();
        ArrayList arrayList = new ArrayList();
        int i17 = this.f33541c;
        float[][] fArr = new float[i17][];
        for (int i18 = 0; i18 < i17; i18++) {
            fArr[i18] = new float[this.f33546h + 5];
        }
        float[][][] fArr2 = {fArr};
        int i19 = this.f33541c;
        int i20 = 0;
        while (i20 < i19) {
            int i21 = i20 + 1;
            int i22 = this.f33546h + 5;
            int i23 = 0;
            while (i23 < i22) {
                int i24 = i23 + 1;
                if (this.f33539a) {
                    fArr2[0][i20][i23] = this.f33544f * ((byteBuffer9.get() & 255) - this.f33545g);
                } else {
                    fArr2[0][i20][i23] = byteBuffer9.getFloat();
                }
                i23 = i24;
            }
            for (int i25 = 0; i25 < 4; i25++) {
                float[] fArr3 = fArr2[0][i20];
                fArr3[i25] = fArr3[i25] * this.f33540b;
            }
            i20 = i21;
        }
        int i26 = this.f33541c;
        int i27 = 0;
        while (i27 < i26) {
            int i28 = i27 + 1;
            float f8 = fArr2[i10][i27][4];
            float[] fArr4 = new float[this.f33548j.size()];
            int size = this.f33548j.size();
            for (int i29 = i10; i29 < size; i29++) {
                fArr4[i29] = fArr2[i10][i27][i29 + 5];
            }
            int size2 = this.f33548j.size();
            float f9 = 0.0f;
            int i30 = -1;
            int i31 = i10;
            while (i31 < size2) {
                int i32 = i31 + 1;
                float f10 = fArr4[i31];
                if (f10 > f9) {
                    i30 = i31;
                    i31 = i32;
                    f9 = f10;
                } else {
                    i31 = i32;
                }
            }
            float f11 = f9 * f8;
            if (f11 > getObjThresh()) {
                float[] fArr5 = fArr2[i10][i27];
                float f12 = fArr5[i10];
                float f13 = fArr5[1];
                float f14 = 2;
                float f15 = fArr5[2] / f14;
                float f16 = fArr5[3] / f14;
                RectF rectF = new RectF(s.coerceAtLeast(0.0f, f12 - f15), s.coerceAtLeast(0.0f, f13 - f16), s.coerceAtMost(bitmap.getWidth() - 1, f12 + f15), s.coerceAtMost(bitmap.getHeight() - 1, f13 + f16));
                i8 = 0;
                arrayList.add(new InterfaceC5843a.C0337a(Intrinsics.stringPlus("", 0), (String) this.f33548j.get(i30), Float.valueOf(f11), rectF, i30));
            } else {
                i8 = i10;
            }
            i10 = i8;
            i27 = i28;
        }
        return e(arrayList);
    }

    @Override // k1.InterfaceC5843a
    public void setNumThreads(int i8) {
        if (this.f33557s != null) {
            e.a aVar = this.f33556r;
            Intrinsics.checkNotNull(aVar);
            aVar.setNumThreads(i8);
            h();
        }
    }

    @Override // k1.InterfaceC5843a
    public void setObjThresh(float f8) {
        this.f33559u = this.f33559u;
    }

    @Override // k1.InterfaceC5843a
    public void setUseNNAPI(boolean z8) {
        if (this.f33557s != null) {
            e.a aVar = this.f33556r;
            Intrinsics.checkNotNull(aVar);
            aVar.setUseNNAPI(z8);
            h();
        }
    }

    private C5845c() {
        this.f33548j = new ArrayList();
        this.f33558t = 0.5f;
        this.f33559u = 0.5f;
    }

    @Override // k1.InterfaceC5843a
    public void enableStatLogging(boolean z8) {
    }
}
