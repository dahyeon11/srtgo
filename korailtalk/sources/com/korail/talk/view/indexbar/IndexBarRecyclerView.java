package com.korail.talk.view.indexbar;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import q6.InterfaceC6114a;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class IndexBarRecyclerView extends RecyclerView {

    /* renamed from: J0 */
    private boolean f29357J0;

    /* renamed from: K0 */
    private Handler f29358K0;
    public float idxBarH;
    public float idxBarMB;
    public float idxBarMR;
    public float idxBarMT;
    public float idxBarW;
    public float idxBarX;
    public float idxBarY;
    public String[] idxCharAry;
    public float idxCharH;
    public float idxCharLineH;
    public float idxCharW;
    public float idxCharX;
    public float idxCharY;
    public String selIdxChar;
    public boolean showCenterChar;
    public boolean showIndexBar;

    private class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            IndexBarRecyclerView indexBarRecyclerView = IndexBarRecyclerView.this;
            indexBarRecyclerView.showCenterChar = false;
            indexBarRecyclerView.invalidate();
        }

        /* synthetic */ b(IndexBarRecyclerView indexBarRecyclerView, a aVar) {
            this();
        }
    }

    public IndexBarRecyclerView(Context context) {
        super(context);
        this.idxBarMT = N.dpToPx(4.0f);
        this.idxBarMB = N.dpToPx(6.9f);
        this.idxBarMR = N.dpToPx(0.0f);
        this.idxBarW = N.dpToPx(26.0f);
        this.idxCharW = N.SpToPx(10.0f);
        this.idxCharH = N.SpToPx(11.0f);
    }

    private void R0(String str) {
        if (!C6630d.isNotNull(str) || str.isEmpty()) {
            return;
        }
        LinkedHashMap<String, Integer> indexCharacterMap = ((InterfaceC6114a) getAdapter()).getIndexCharacterMap();
        ((GridLayoutManager) getLayoutManager()).scrollToPositionWithOffset(indexCharacterMap.containsKey(str) ? indexCharacterMap.get(str).intValue() : 0, 0);
        invalidate();
    }

    public void initCharacter() {
        this.f29357J0 = false;
        this.showIndexBar = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f29357J0) {
            setupIndexCharacter();
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x001f, code lost:
    
        if (r2 != 3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x003d, code lost:
    
        if (r1 <= (r0 + (r6.idxCharLineH * r6.idxCharAry.length))) goto L85;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.view.indexbar.IndexBarRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setupIndexCharacter() {
        LinkedHashMap<String, Integer> indexCharacterMap = ((InterfaceC6114a) getAdapter()).getIndexCharacterMap();
        int i8 = 0;
        if (C6630d.isNull(indexCharacterMap) || indexCharacterMap.isEmpty()) {
            this.showIndexBar = false;
            return;
        }
        this.showIndexBar = true;
        ArrayList arrayList = new ArrayList(indexCharacterMap.keySet());
        this.idxCharAry = new String[arrayList.size()];
        while (true) {
            String[] strArr = this.idxCharAry;
            if (i8 >= strArr.length) {
                this.idxBarX = (getWidth() - this.idxBarMR) - this.idxBarW;
                this.idxBarY = this.idxBarMT;
                float height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.idxBarMT) - this.idxBarMB;
                this.idxBarH = height;
                String[] strArr2 = this.idxCharAry;
                float length = height / strArr2.length;
                this.idxCharLineH = length;
                this.idxCharX = this.idxBarX + ((this.idxBarW - this.idxCharW) / 2.0f);
                this.idxCharY = this.idxBarY + ((height - (length * strArr2.length)) / 2.0f);
                this.f29357J0 = true;
                return;
            }
            strArr[i8] = ((String) arrayList.get(i8)).toUpperCase();
            i8++;
        }
    }

    public IndexBarRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.idxBarMT = N.dpToPx(4.0f);
        this.idxBarMB = N.dpToPx(6.9f);
        this.idxBarMR = N.dpToPx(0.0f);
        this.idxBarW = N.dpToPx(26.0f);
        this.idxCharW = N.SpToPx(10.0f);
        this.idxCharH = N.SpToPx(11.0f);
    }

    public IndexBarRecyclerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.idxBarMT = N.dpToPx(4.0f);
        this.idxBarMB = N.dpToPx(6.9f);
        this.idxBarMR = N.dpToPx(0.0f);
        this.idxBarW = N.dpToPx(26.0f);
        this.idxCharW = N.SpToPx(10.0f);
        this.idxCharH = N.SpToPx(11.0f);
    }
}
