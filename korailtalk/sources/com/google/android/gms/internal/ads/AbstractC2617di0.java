package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.view.accessibility.AbstractC0927b;

/* renamed from: com.google.android.gms.internal.ads.di0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2617di0 {
    public static final int zza = AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL;
    public static final ClipData zzb = ClipData.newIntent("", new Intent());

    private static Intent a(Intent intent, int i8, int i9) {
        AbstractC1188Bj0.zzf((i8 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        AbstractC1188Bj0.zzf((i8 & 1) == 0 || b(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        AbstractC1188Bj0.zzf((i8 & 2) == 0 || b(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        AbstractC1188Bj0.zzf((i8 & 4) == 0 || b(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        AbstractC1188Bj0.zzf((i8 & 128) == 0 || b(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        AbstractC1188Bj0.zzf(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            AbstractC1188Bj0.zzf(!b(i8, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            AbstractC1188Bj0.zzf(b(i8, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!b(i8, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return intent2;
    }

    private static boolean b(int i8, int i9) {
        return (i8 & i9) == i9;
    }

    public static PendingIntent zza(Context context, int i8, Intent intent, int i9) {
        return PendingIntent.getActivity(context, 0, a(intent, 201326592, 0), 201326592);
    }

    public static PendingIntent zzb(Context context, int i8, Intent intent, int i9, int i10) {
        return PendingIntent.getService(context, 0, a(intent, i9, 0), i9);
    }
}
