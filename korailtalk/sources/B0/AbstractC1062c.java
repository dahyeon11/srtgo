package b0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1062c extends AbstractC1060a {

    /* renamed from: j, reason: collision with root package name */
    private int f11287j;

    /* renamed from: k, reason: collision with root package name */
    private int f11288k;

    /* renamed from: l, reason: collision with root package name */
    private LayoutInflater f11289l;

    @Deprecated
    public AbstractC1062c(Context context, int i8, Cursor cursor) {
        super(context, cursor);
        this.f11288k = i8;
        this.f11287j = i8;
        this.f11289l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // b0.AbstractC1060a
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f11289l.inflate(this.f11288k, viewGroup, false);
    }

    @Override // b0.AbstractC1060a
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f11289l.inflate(this.f11287j, viewGroup, false);
    }

    public void setDropDownViewResource(int i8) {
        this.f11288k = i8;
    }

    public void setViewResource(int i8) {
        this.f11287j = i8;
    }

    @Deprecated
    public AbstractC1062c(Context context, int i8, Cursor cursor, boolean z8) {
        super(context, cursor, z8);
        this.f11288k = i8;
        this.f11287j = i8;
        this.f11289l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public AbstractC1062c(Context context, int i8, Cursor cursor, int i9) {
        super(context, cursor, i9);
        this.f11288k = i8;
        this.f11287j = i8;
        this.f11289l = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
