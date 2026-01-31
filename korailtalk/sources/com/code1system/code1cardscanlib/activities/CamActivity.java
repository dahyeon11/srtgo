package com.code1system.code1cardscanlib.activities;

import R6.p;
import S6.Q;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.e;
import androidx.camera.core.C0903t;
import androidx.camera.core.InterfaceC0888l;
import androidx.camera.core.InterfaceC0892n;
import androidx.camera.core.InterfaceC0902s0;
import androidx.camera.core.K0;
import androidx.camera.core.P;
import androidx.camera.core.i1;
import androidx.camera.core.r;
import androidx.camera.lifecycle.g;
import androidx.camera.view.PreviewView;
import androidx.core.app.AbstractC0918b;
import com.code1system.code1cardscanlib.activities.CamActivity;
import com.code1system.code1cardscanlib.util.CustomViewLandscape;
import com.code1system.code1cardscanlib.util.CustomViewPortrait;
import com.google.common.util.concurrent.C;
import com.google.firebase.iid.w;
import h1.AbstractC5578b;
import h1.AbstractC5579c;
import h1.AbstractC5580d;
import j1.C5811a;
import j1.C5812b;
import j1.C5813c;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k1.C5845c;
import k1.InterfaceC5843a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C5886e;
import l1.C5887f;

/* loaded from: classes.dex */
public final class CamActivity extends e {
    public static final a Companion = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private static final String[] f11687s = {"android.permission.CAMERA"};

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f11688a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC5843a f11689b;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11693f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11694g;

    /* renamed from: h, reason: collision with root package name */
    private int f11695h;

    /* renamed from: j, reason: collision with root package name */
    private int f11697j;

    /* renamed from: k, reason: collision with root package name */
    private int f11698k;

    /* renamed from: l, reason: collision with root package name */
    private TimerTask f11699l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC0892n f11700m;

    /* renamed from: n, reason: collision with root package name */
    private r f11701n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC0888l f11702o;

    /* renamed from: p, reason: collision with root package name */
    private int f11703p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11704q;

    /* renamed from: c, reason: collision with root package name */
    private final C5887f f11690c = new C5887f();

    /* renamed from: d, reason: collision with root package name */
    private final C5812b f11691d = new C5812b(null, null, 0, 7, null);

    /* renamed from: e, reason: collision with root package name */
    private final C5886e f11692e = new C5886e();

    /* renamed from: i, reason: collision with root package name */
    private C5813c f11696i = new C5813c(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* renamed from: r, reason: collision with root package name */
    private long f11705r = System.currentTimeMillis();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues((Integer) ((p) obj2).getSecond(), (Integer) ((p) obj).getSecond());
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues((Integer) ((p) obj2).getSecond(), (Integer) ((p) obj).getSecond());
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues((Integer) ((p) obj2).getSecond(), (Integer) ((p) obj).getSecond());
        }
    }

    private final void G() {
        CustomViewPortrait customViewPortrait = (CustomViewPortrait) findViewById(AbstractC5579c.customViewPortrait);
        CustomViewLandscape customViewLandscape = (CustomViewLandscape) findViewById(AbstractC5579c.customViewLandscape);
        ImageButton imageButton = (ImageButton) findViewById(AbstractC5579c.mainBtn);
        if (this.f11694g) {
            this.f11694g = false;
            imageButton.setImageResource(AbstractC5578b.button_portrait);
            customViewPortrait.setVisibility(4);
            customViewLandscape.setVisibility(0);
            return;
        }
        this.f11694g = true;
        imageButton.setImageResource(AbstractC5578b.button_landscape);
        customViewPortrait.setVisibility(0);
        customViewLandscape.setVisibility(4);
    }

    private final void H(C5811a c5811a) throws NumberFormatException {
        String str = new SimpleDateFormat("yy", new Locale("ko", "KR")).format(new Date(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(\"yy\", L…tem.currentTimeMillis()))");
        int i8 = Integer.parseInt(str);
        if (c5811a.getLuhnCheckSum()) {
            if (!this.f11691d.getCardNumber().containsKey(c5811a.getCardNumber())) {
                this.f11691d.getCardNumber().put(c5811a.getCardNumber(), 0);
                if (Intrinsics.areEqual(c5811a.getValidDate(), "0") || Integer.parseInt((String) l7.r.split$default((CharSequence) c5811a.getValidDate(), new String[]{"/"}, false, 0, 6, (Object) null).get(1)) > i8 + 5) {
                    return;
                }
                this.f11691d.getDate().put(c5811a.getCardNumber() + '_' + c5811a.getValidDate(), 0);
                return;
            }
            HashMap<String, Integer> cardNumber = this.f11691d.getCardNumber();
            String cardNumber2 = c5811a.getCardNumber();
            Integer num = this.f11691d.getCardNumber().get(c5811a.getCardNumber());
            if (num == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            cardNumber.put(cardNumber2, Integer.valueOf(num.intValue() + 1));
            if (!Intrinsics.areEqual(c5811a.getValidDate(), "0")) {
                if (this.f11691d.getDate().containsKey(c5811a.getCardNumber() + '_' + c5811a.getValidDate())) {
                    HashMap<String, Integer> date = this.f11691d.getDate();
                    String str2 = c5811a.getCardNumber() + '_' + c5811a.getValidDate();
                    Integer num2 = this.f11691d.getDate().get(c5811a.getCardNumber() + '_' + c5811a.getValidDate());
                    if (num2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    date.put(str2, Integer.valueOf(num2.intValue() + 1));
                    return;
                }
            }
            if (Intrinsics.areEqual(c5811a.getValidDate(), "0") || Integer.parseInt((String) l7.r.split$default((CharSequence) c5811a.getValidDate(), new String[]{"/"}, false, 0, 6, (Object) null).get(1)) > i8 + 5) {
                return;
            }
            this.f11691d.getDate().put(c5811a.getCardNumber() + '_' + c5811a.getValidDate(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(final CamActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new AlertDialog.Builder(this$0).setMessage("OCR 모듈을 불러올 수 없습니다.").setTitle("오류").setCancelable(false).setPositiveButton("확인", new DialogInterface.OnClickListener() { // from class: i1.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                CamActivity.J(this.f31679a, dialogInterface, i8);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(CamActivity this$0, DialogInterface dialogInterface, int i8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(CamActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G();
    }

    private final void L() {
        final C gVar = g.getInstance(this);
        Intrinsics.checkNotNullExpressionValue(gVar, "getInstance(this)");
        gVar.addListener(new Runnable() { // from class: i1.d
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                CamActivity.M(gVar, this);
            }
        }, androidx.core.content.a.getMainExecutor(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(C cameraProviderFuture, final CamActivity this$0) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(cameraProviderFuture, "$cameraProviderFuture");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = cameraProviderFuture.get();
        Intrinsics.checkNotNullExpressionValue(obj, "cameraProviderFuture.get()");
        g gVar = (g) obj;
        K0 k0Build = new K0.b().build();
        PreviewView previewView = (PreviewView) this$0.findViewById(AbstractC5579c.previewView);
        previewView.setScaleType(PreviewView.e.FIT_CENTER);
        k0Build.setSurfaceProvider(previewView.getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(k0Build, "Builder()\n              …ovider)\n                }");
        P pBuild = new P.c().setTargetResolution(new Size(1440, 1920)).setImageQueueDepth(w.ERROR_UNKNOWN).build();
        Intrinsics.checkNotNullExpressionValue(pBuild, "Builder()\n              …\n                .build()");
        ExecutorService executorService = this$0.f11688a;
        InterfaceC0888l interfaceC0888l = null;
        if (executorService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraExecutor");
            executorService = null;
        }
        pBuild.setAnalyzer(executorService, new P.a() { // from class: i1.e
            @Override // androidx.camera.core.P.a
            public final void analyze(InterfaceC0902s0 interfaceC0902s0) throws NumberFormatException {
                CamActivity.N(this.f31678a, interfaceC0902s0);
            }
        });
        i1 i1VarBuild = new i1.a().addUseCase(k0Build).addUseCase(pBuild).build();
        Intrinsics.checkNotNullExpressionValue(i1VarBuild, "Builder()\n              …\n                .build()");
        C0903t DEFAULT_BACK_CAMERA = C0903t.DEFAULT_BACK_CAMERA;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
        try {
            gVar.unbindAll();
            InterfaceC0888l interfaceC0888lBindToLifecycle = gVar.bindToLifecycle(this$0, DEFAULT_BACK_CAMERA, i1VarBuild);
            Intrinsics.checkNotNullExpressionValue(interfaceC0888lBindToLifecycle, "cameraProvider.bindToLif…seGroup\n                )");
            this$0.f11702o = interfaceC0888lBindToLifecycle;
            if (interfaceC0888lBindToLifecycle == null) {
                Intrinsics.throwUninitializedPropertyAccessException("camera");
                interfaceC0888lBindToLifecycle = null;
            }
            this$0.f11700m = interfaceC0888lBindToLifecycle.getCameraControl();
            InterfaceC0888l interfaceC0888l2 = this$0.f11702o;
            if (interfaceC0888l2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("camera");
            } else {
                interfaceC0888l = interfaceC0888l2;
            }
            this$0.f11701n = interfaceC0888l.getCameraInfo();
        } catch (Exception e8) {
            Log.e("CamActivity", "Use case binding failed", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(final CamActivity this$0, final InterfaceC0902s0 image) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(image, "image");
        Image image2 = image.getImage();
        C5887f c5887f = this$0.f11690c;
        Intrinsics.checkNotNull(image2);
        Bitmap bitmapImgToBitmap2$Code1CardScanLib_release = c5887f.imgToBitmap2$Code1CardScanLib_release(image2);
        if (this$0.f11693f) {
            image.close();
            return;
        }
        Bitmap bitmapRecognitionImage$Code1CardScanLib_release = this$0.f11690c.recognitionImage$Code1CardScanLib_release(bitmapImgToBitmap2$Code1CardScanLib_release, this$0.f11694g);
        InterfaceC5843a interfaceC5843a = this$0.f11689b;
        if (interfaceC5843a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardDetector");
            interfaceC5843a = null;
        }
        C5811a cardResult$Code1CardScanLib_release = this$0.f11692e.getCardResult$Code1CardScanLib_release(interfaceC5843a.recognizeImage(bitmapRecognitionImage$Code1CardScanLib_release));
        if (!cardResult$Code1CardScanLib_release.getResultCheckSum()) {
            this$0.f11695h = 99;
            image.close();
            return;
        }
        this$0.H(cardResult$Code1CardScanLib_release);
        C5812b c5812b = this$0.f11691d;
        c5812b.setCount(c5812b.getCount() + 1);
        if (this$0.f11691d.getCount() < 10) {
            List listSortedWith = S6.r.sortedWith(Q.toList(this$0.f11691d.getCardNumber()), new b());
            List listSortedWith2 = S6.r.sortedWith(Q.toList(this$0.f11691d.getDate()), new c());
            if (listSortedWith.isEmpty() || listSortedWith2.isEmpty()) {
                this$0.f11695h = 11;
                image.close();
                return;
            }
            if (((Number) ((p) listSortedWith.get(0)).getSecond()).intValue() < 3) {
                this$0.f11695h = 11;
                image.close();
                return;
            }
            this$0.f11696i.setCardNumber(((String) ((p) listSortedWith.get(0)).getFirst()).toString());
            int i8 = 0;
            while (true) {
                if (i8 >= listSortedWith2.size()) {
                    break;
                }
                if (Intrinsics.areEqual(((p) listSortedWith.get(0)).getFirst(), l7.r.split$default((CharSequence) ((p) listSortedWith2.get(i8)).getFirst(), new String[]{"_"}, false, 0, 6, (Object) null).get(0))) {
                    this$0.f11696i.setValidDate((String) l7.r.split$default((CharSequence) ((p) listSortedWith2.get(i8)).getFirst(), new String[]{"_"}, false, 0, 6, (Object) null).get(1));
                    this$0.f11695h = 10;
                    break;
                }
                i8++;
            }
        } else {
            List listSortedWith3 = S6.r.sortedWith(Q.toList(this$0.f11691d.getCardNumber()), new d());
            if (listSortedWith3.isEmpty()) {
                this$0.f11695h = 20;
            } else if (((Number) ((p) listSortedWith3.get(0)).getSecond()).intValue() >= 3) {
                this$0.f11695h = 22;
            } else {
                this$0.f11695h = 21;
            }
        }
        int i9 = this$0.f11695h;
        if (i9 != 10) {
            switch (i9) {
                case 20:
                    this$0.runOnUiThread(new Runnable() { // from class: i1.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            CamActivity.S(this.f31680a, image);
                        }
                    });
                    break;
                case 21:
                    this$0.runOnUiThread(new Runnable() { // from class: i1.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            CamActivity.O(this.f31682a, image);
                        }
                    });
                    break;
                case 22:
                    this$0.runOnUiThread(new Runnable() { // from class: i1.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            CamActivity.Q(this.f31684a, image);
                        }
                    });
                    break;
            }
        } else {
            Intent intent = new Intent();
            intent.putExtra("ocrResult", this$0.f11696i);
            this$0.setIntent(intent);
            this$0.setResult(-1, this$0.getIntent());
            image.close();
            this$0.finish();
        }
        this$0.f11691d.clear();
        image.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final CamActivity this$0, final InterfaceC0902s0 image) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(image, "$image");
        new AlertDialog.Builder(this$0).setMessage("카드번호 유효성 검증 실패").setTitle("오류").setCancelable(false).setPositiveButton("확인", new DialogInterface.OnClickListener() { // from class: i1.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                CamActivity.P(image, this$0, dialogInterface, i8);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(InterfaceC0902s0 image, CamActivity this$0, DialogInterface dialogInterface, int i8) {
        Intrinsics.checkNotNullParameter(image, "$image");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        image.close();
        this$0.onRestart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(final CamActivity this$0, final InterfaceC0902s0 image) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(image, "$image");
        new AlertDialog.Builder(this$0).setMessage("유효기간 검출 실패").setTitle("오류").setCancelable(false).setPositiveButton("확인", new DialogInterface.OnClickListener() { // from class: i1.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                CamActivity.R(image, this$0, dialogInterface, i8);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(InterfaceC0902s0 image, CamActivity this$0, DialogInterface dialogInterface, int i8) {
        Intrinsics.checkNotNullParameter(image, "$image");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        image.close();
        this$0.onRestart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(final CamActivity this$0, final InterfaceC0902s0 image) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(image, "$image");
        new AlertDialog.Builder(this$0).setMessage("유효성 검증 실패").setTitle("오류").setCancelable(false).setPositiveButton("확인", new DialogInterface.OnClickListener() { // from class: i1.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                CamActivity.T(image, this$0, dialogInterface, i8);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(InterfaceC0902s0 image, CamActivity this$0, DialogInterface dialogInterface, int i8) {
        Intrinsics.checkNotNullParameter(image, "$image");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        image.close();
        this$0.onRestart();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.f11704q) {
            TimerTask timerTask = this.f11699l;
            if (timerTask == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timer");
                timerTask = null;
            }
            timerTask.cancel();
        }
        this.f11703p = 0;
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        setContentView(AbstractC5580d.activity_cam_lib);
        AbstractC0918b.requestPermissions(this, f11687s, 10);
        this.f11697j = getIntent().getIntExtra("ocrMode", 0);
        this.f11698k = getIntent().getIntExtra("timeOut", 10000);
        try {
            this.f11689b = C5845c.Companion.create(this, "kt_01to13_reMix_ep40.tflite", "cardscan.txt", 640, false);
            L();
        } catch (Exception unused) {
            runOnUiThread(new Runnable() { // from class: i1.a
                @Override // java.lang.Runnable
                public final void run() {
                    CamActivity.I(this.f31672a);
                }
            });
        }
        ((ImageButton) findViewById(AbstractC5579c.mainBtn)).setOnClickListener(new View.OnClickListener() { // from class: i1.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CamActivity.K(this.f31675a, view);
            }
        });
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f11688a = executorServiceNewSingleThreadExecutor;
    }

    @Override // android.app.Activity
    protected void onRestart() {
        this.f11693f = false;
        this.f11691d.clear();
        L();
        super.onRestart();
    }
}
