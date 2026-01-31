package com.journeyapps.barcodescanner;

import F3.s;
import K3.k;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import j4.C5827b;
import j4.InterfaceC5826a;
import j4.f;
import j4.g;
import j4.h;
import j4.i;
import j4.j;
import j4.u;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class BarcodeView extends com.journeyapps.barcodescanner.a {

    /* renamed from: B, reason: collision with root package name */
    private b f27446B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC5826a f27447C;

    /* renamed from: D, reason: collision with root package name */
    private i f27448D;

    /* renamed from: E, reason: collision with root package name */
    private g f27449E;

    /* renamed from: F, reason: collision with root package name */
    private Handler f27450F;

    /* renamed from: G, reason: collision with root package name */
    private final Handler.Callback f27451G;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == k.zxing_decode_succeeded) {
                C5827b c5827b = (C5827b) message.obj;
                if (c5827b != null && BarcodeView.this.f27447C != null && BarcodeView.this.f27446B != b.NONE) {
                    BarcodeView.this.f27447C.barcodeResult(c5827b);
                    if (BarcodeView.this.f27446B == b.SINGLE) {
                        BarcodeView.this.stopDecoding();
                    }
                }
                return true;
            }
            if (i8 == k.zxing_decode_failed) {
                return true;
            }
            if (i8 != k.zxing_possible_result_points) {
                return false;
            }
            List<s> list = (List) message.obj;
            if (BarcodeView.this.f27447C != null && BarcodeView.this.f27446B != b.NONE) {
                BarcodeView.this.f27447C.possibleResultPoints(list);
            }
            return true;
        }
    }

    private enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        this.f27446B = b.NONE;
        this.f27447C = null;
        this.f27451G = new a();
        C();
    }

    private f A() {
        if (this.f27449E == null) {
            this.f27449E = B();
        }
        h hVar = new h();
        HashMap map = new HashMap();
        map.put(F3.e.NEED_RESULT_POINT_CALLBACK, hVar);
        f fVarCreateDecoder = this.f27449E.createDecoder(map);
        hVar.setDecoder(fVarCreateDecoder);
        return fVarCreateDecoder;
    }

    private void C() {
        this.f27449E = new j();
        this.f27450F = new Handler(this.f27451G);
    }

    private void D() {
        E();
        if (this.f27446B == b.NONE || !isPreviewActive()) {
            return;
        }
        i iVar = new i(getCameraInstance(), A(), this.f27450F);
        this.f27448D = iVar;
        iVar.setCropRect(getPreviewFramingRect());
        this.f27448D.start();
    }

    private void E() {
        i iVar = this.f27448D;
        if (iVar != null) {
            iVar.stop();
            this.f27448D = null;
        }
    }

    protected g B() {
        return new j();
    }

    public void decodeContinuous(InterfaceC5826a interfaceC5826a) {
        this.f27446B = b.CONTINUOUS;
        this.f27447C = interfaceC5826a;
        D();
    }

    public void decodeSingle(InterfaceC5826a interfaceC5826a) {
        this.f27446B = b.SINGLE;
        this.f27447C = interfaceC5826a;
        D();
    }

    public g getDecoderFactory() {
        return this.f27449E;
    }

    @Override // com.journeyapps.barcodescanner.a
    public void pause() {
        E();
        super.pause();
    }

    @Override // com.journeyapps.barcodescanner.a
    protected void s() {
        super.s();
        D();
    }

    public void setDecoderFactory(g gVar) {
        u.validateMainThread();
        this.f27449E = gVar;
        i iVar = this.f27448D;
        if (iVar != null) {
            iVar.setDecoder(A());
        }
    }

    public void stopDecoding() {
        this.f27446B = b.NONE;
        this.f27447C = null;
        E();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27446B = b.NONE;
        this.f27447C = null;
        this.f27451G = new a();
        C();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f27446B = b.NONE;
        this.f27447C = null;
        this.f27451G = new a();
        C();
    }
}
