package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends i implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f25908a;

    public f() {
        this.f25908a = new ArrayList();
    }

    private i a() {
        int size = this.f25908a.size();
        if (size == 1) {
            return (i) this.f25908a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public void add(Boolean bool) {
        this.f25908a.add(bool == null ? k.INSTANCE : new o(bool));
    }

    public void addAll(f fVar) {
        this.f25908a.addAll(fVar.f25908a);
    }

    public List<i> asList() {
        return new com.google.gson.internal.h(this.f25908a);
    }

    public boolean contains(i iVar) {
        return this.f25908a.contains(iVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof f) && ((f) obj).f25908a.equals(this.f25908a));
    }

    public i get(int i8) {
        return (i) this.f25908a.get(i8);
    }

    @Override // com.google.gson.i
    public BigDecimal getAsBigDecimal() {
        return a().getAsBigDecimal();
    }

    @Override // com.google.gson.i
    public BigInteger getAsBigInteger() {
        return a().getAsBigInteger();
    }

    @Override // com.google.gson.i
    public boolean getAsBoolean() {
        return a().getAsBoolean();
    }

    @Override // com.google.gson.i
    public byte getAsByte() {
        return a().getAsByte();
    }

    @Override // com.google.gson.i
    @Deprecated
    public char getAsCharacter() {
        return a().getAsCharacter();
    }

    @Override // com.google.gson.i
    public double getAsDouble() {
        return a().getAsDouble();
    }

    @Override // com.google.gson.i
    public float getAsFloat() {
        return a().getAsFloat();
    }

    @Override // com.google.gson.i
    public int getAsInt() {
        return a().getAsInt();
    }

    @Override // com.google.gson.i
    public long getAsLong() {
        return a().getAsLong();
    }

    @Override // com.google.gson.i
    public Number getAsNumber() {
        return a().getAsNumber();
    }

    @Override // com.google.gson.i
    public short getAsShort() {
        return a().getAsShort();
    }

    @Override // com.google.gson.i
    public String getAsString() {
        return a().getAsString();
    }

    public int hashCode() {
        return this.f25908a.hashCode();
    }

    public boolean isEmpty() {
        return this.f25908a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<i> iterator() {
        return this.f25908a.iterator();
    }

    public boolean remove(i iVar) {
        return this.f25908a.remove(iVar);
    }

    public i set(int i8, i iVar) {
        ArrayList arrayList = this.f25908a;
        if (iVar == null) {
            iVar = k.INSTANCE;
        }
        return (i) arrayList.set(i8, iVar);
    }

    public int size() {
        return this.f25908a.size();
    }

    public void add(Character ch) {
        this.f25908a.add(ch == null ? k.INSTANCE : new o(ch));
    }

    @Override // com.google.gson.i
    public f deepCopy() {
        if (this.f25908a.isEmpty()) {
            return new f();
        }
        f fVar = new f(this.f25908a.size());
        Iterator it = this.f25908a.iterator();
        while (it.hasNext()) {
            fVar.add(((i) it.next()).deepCopy());
        }
        return fVar;
    }

    public i remove(int i8) {
        return (i) this.f25908a.remove(i8);
    }

    public f(int i8) {
        this.f25908a = new ArrayList(i8);
    }

    public void add(Number number) {
        this.f25908a.add(number == null ? k.INSTANCE : new o(number));
    }

    public void add(String str) {
        this.f25908a.add(str == null ? k.INSTANCE : new o(str));
    }

    public void add(i iVar) {
        if (iVar == null) {
            iVar = k.INSTANCE;
        }
        this.f25908a.add(iVar);
    }
}
