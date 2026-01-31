package z4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.webkit.WebView;
import f4.C5503b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import n4.AbstractC5955f;

/* renamed from: z4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6633g {
    private static Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * 2.6f), (int) (bitmap.getHeight() * 2.6f), bitmap.getConfig());
        bitmapCreateBitmap.eraseColor(-1);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (r1 - bitmap.getWidth()) / 2, (r2 - bitmap.getHeight()) / 2, (Paint) null);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    private static void b(Bitmap bitmap, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        if (C6630d.isNotNull(bitmap)) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
                        } catch (FileNotFoundException e8) {
                            e = e8;
                            fileOutputStream2 = fileOutputStream;
                            t.e(e.getMessage());
                            if (C6630d.isNotNull(fileOutputStream2)) {
                                fileOutputStream2.close();
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            if (C6630d.isNotNull(fileOutputStream2)) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e9) {
                                    t.e(e9.getMessage());
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (FileNotFoundException e10) {
                    e = e10;
                }
                if (C6630d.isNotNull(fileOutputStream)) {
                    fileOutputStream.close();
                }
            } catch (IOException e11) {
                t.e(e11.getMessage());
            }
        }
    }

    public static boolean captureViewAndSaveToFile(View view, File file) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            t.e("captureViewAndSaveToFile", "View의 크기가 0입니다. 레이아웃이 완료되었는지 확인하세요.");
            return false;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(-1);
            view.draw(canvas);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    t.d("captureViewAndSaveToFile", "View 캡처 완료: " + file.getAbsolutePath());
                    fileOutputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e8) {
                t.e("captureViewAndSaveToFile", "Bitmap 파일 저장 오류: " + file.getAbsolutePath(), e8);
                return false;
            } catch (Exception e9) {
                t.e("captureViewAndSaveToFile", "저장 중 예기치 않은 오류: " + file.getAbsolutePath(), e9);
                return false;
            }
        } catch (IllegalArgumentException e10) {
            t.e("captureViewAndSaveToFile", "Bitmap 생성 실패. 너비: " + view.getWidth() + ", 높이: " + view.getHeight(), e10);
            return false;
        }
    }

    public static Bitmap createBarcode(String str, int i8, int i9, int i10, int i11) {
        F3.l lVar = new F3.l();
        HashMap map = new HashMap();
        map.put(F3.g.ERROR_CORRECTION, g4.f.M);
        map.put(F3.g.MARGIN, 0);
        map.put(F3.g.CHARACTER_SET, "UTF-8");
        Bitmap bitmapCreateBitmap = null;
        try {
            M3.b bVarEncode = lVar.encode(str, F3.a.CODE_128, i8, i9, map);
            bitmapCreateBitmap = Bitmap.createBitmap(bVarEncode.getWidth(), bVarEncode.getHeight(), Bitmap.Config.ARGB_8888);
            for (int i12 = 0; i12 < i8; i12++) {
                for (int i13 = 0; i13 < i9; i13++) {
                    bitmapCreateBitmap.setPixel(i12, i13, bVarEncode.get(i12, i13) ? i10 : i11);
                }
            }
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
        return bitmapCreateBitmap;
    }

    public static void createMobileFaxBitmapFile(File file, View view) throws Throwable {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        Bitmap bitmapA = a(bitmapCreateBitmap);
        b(bitmapA, file);
        bitmapA.recycle();
    }

    public static Bitmap createQRCode(String str, int i8, int i9, int i10, int i11) {
        Bitmap bitmapCreateBitmap = null;
        try {
            C5503b c5503b = new C5503b();
            HashMap map = new HashMap();
            map.put(F3.g.ERROR_CORRECTION, g4.f.M);
            map.put(F3.g.MARGIN, 0);
            map.put(F3.g.CHARACTER_SET, "UTF-8");
            M3.b bVarEncode = c5503b.encode(str, F3.a.QR_CODE, i8, i9, map);
            bitmapCreateBitmap = Bitmap.createBitmap(bVarEncode.getWidth(), bVarEncode.getHeight(), Bitmap.Config.ARGB_8888);
            for (int i12 = 0; i12 < i8; i12++) {
                for (int i13 = 0; i13 < i9; i13++) {
                    bitmapCreateBitmap.setPixel(i12, i13, bVarEncode.get(i12, i13) ? i10 : i11);
                }
            }
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.FileOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.Picture] */
    public static void productReceiptSaveToBitmapFile(WebView webView, File file) throws Throwable {
        FileNotFoundException e8;
        ?? CapturePicture = webView.capturePicture();
        ?? CreateBitmap = Bitmap.createBitmap(CapturePicture.getWidth(), CapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
        ?? canvas = new Canvas(CreateBitmap);
        CapturePicture.draw(canvas);
        try {
            try {
                try {
                    canvas = new FileOutputStream(file);
                } catch (FileNotFoundException e9) {
                    canvas = 0;
                    e8 = e9;
                } catch (Throwable th) {
                    canvas = 0;
                    th = th;
                    if (C6630d.isNotNull(canvas)) {
                        try {
                            canvas.close();
                        } catch (IOException e10) {
                            t.e(e10.getMessage());
                        }
                    }
                    throw th;
                }
                try {
                    CreateBitmap.compress(Bitmap.CompressFormat.PNG, 70, canvas);
                } catch (FileNotFoundException e11) {
                    e8 = e11;
                    t.e(e8.getMessage());
                    if (C6630d.isNotNull(canvas)) {
                        canvas.close();
                        canvas = canvas;
                    }
                }
                if (C6630d.isNotNull(canvas)) {
                    canvas.close();
                    canvas = canvas;
                }
            } catch (IOException e12) {
                t.e(e12.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008c -> B:43:0x00a4). Please report as a decompilation issue!!! */
    public static boolean receiptSaveToBitmapFile(File file, View view) throws Throwable {
        boolean z8 = false;
        ?? r12 = 0;
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        r12 = 0;
        try {
        } catch (IOException e8) {
            t.e(e8.getMessage());
            r12 = r12;
        }
        try {
            try {
                int width = view.getWidth();
                int height = view.getHeight();
                t.e("receiptSaveToBitmapFile width : " + width + ", height : " + height);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(-1);
                view.draw(canvas);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, N.pxToDp(width), N.pxToDp(height), true);
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                try {
                    r12 = 70;
                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream3);
                    bitmapCreateBitmap.recycle();
                    bitmapCreateScaledBitmap.recycle();
                    if (C6630d.isNotNull(fileOutputStream3)) {
                        try {
                            fileOutputStream3.close();
                        } catch (IOException e9) {
                            t.e(e9.getMessage());
                        }
                    }
                    z8 = true;
                } catch (FileNotFoundException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream3;
                    t.e(e.getMessage());
                    boolean zIsNotNull = C6630d.isNotNull(fileOutputStream);
                    r12 = fileOutputStream;
                    if (zIsNotNull) {
                        fileOutputStream.close();
                        r12 = fileOutputStream;
                    }
                    return z8;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    fileOutputStream2 = fileOutputStream3;
                    t.e(e.getMessage());
                    boolean zIsNotNull2 = C6630d.isNotNull(fileOutputStream2);
                    r12 = fileOutputStream2;
                    if (zIsNotNull2) {
                        fileOutputStream2.close();
                        r12 = fileOutputStream2;
                    }
                    return z8;
                } catch (Throwable th) {
                    th = th;
                    r12 = fileOutputStream3;
                    if (C6630d.isNotNull(r12)) {
                        try {
                            r12.close();
                        } catch (IOException e12) {
                            t.e(e12.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e13) {
                e = e13;
            } catch (OutOfMemoryError e14) {
                e = e14;
            }
            return z8;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean ticketSaveToBitmapFile(View view, View view2, File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                view.findViewById(AbstractC5955f.tv_ticket_title_right).setVisibility(4);
                view2.findViewById(AbstractC5955f.v_train_info).setVisibility(4);
                int width = view.getWidth();
                int height = view.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), config);
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(view.getWidth(), view.getHeight() + view2.getHeight(), config);
                view.draw(new Canvas(bitmapCreateBitmap));
                view2.draw(new Canvas(bitmapCreateBitmap2));
                Canvas canvas = new Canvas(bitmapCreateBitmap3);
                canvas.drawColor(-1);
                canvas.drawBitmap(bitmapCreateBitmap, new Matrix(), null);
                canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, view.getHeight(), (Paint) null);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmapCreateBitmap3.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream2);
                    view.findViewById(AbstractC5955f.tv_ticket_title_right).setVisibility(0);
                    view2.findViewById(AbstractC5955f.v_train_info).setVisibility(4);
                    if (!C6630d.isNull(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e8) {
                            t.e(e8.getMessage());
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream2;
                    view.findViewById(AbstractC5955f.tv_ticket_title_right).setVisibility(0);
                    view2.findViewById(AbstractC5955f.v_train_info).setVisibility(4);
                    if (C6630d.isNull(fileOutputStream)) {
                        return false;
                    }
                    fileOutputStream.close();
                    return false;
                } catch (OutOfMemoryError unused2) {
                    fileOutputStream = fileOutputStream2;
                    view.findViewById(AbstractC5955f.tv_ticket_title_right).setVisibility(0);
                    view2.findViewById(AbstractC5955f.v_train_info).setVisibility(4);
                    if (C6630d.isNull(fileOutputStream)) {
                        return false;
                    }
                    fileOutputStream.close();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    view.findViewById(AbstractC5955f.tv_ticket_title_right).setVisibility(0);
                    view2.findViewById(AbstractC5955f.v_train_info).setVisibility(4);
                    if (!C6630d.isNull(fileOutputStream)) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e9) {
                            t.e(e9.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
            } catch (OutOfMemoryError unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            t.e(e10.getMessage());
            return false;
        }
    }
}
