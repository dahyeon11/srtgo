package com.google.gson;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class l extends i {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.g f26084a = new com.google.gson.internal.g(false);

    public void add(String str, i iVar) {
        com.google.gson.internal.g gVar = this.f26084a;
        if (iVar == null) {
            iVar = k.INSTANCE;
        }
        gVar.put(str, iVar);
    }

    public void addProperty(String str, String str2) {
        add(str, str2 == null ? k.INSTANCE : new o(str2));
    }

    public Map<String, i> asMap() {
        return this.f26084a;
    }

    public Set<Map.Entry<String, i>> entrySet() {
        return this.f26084a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).f26084a.equals(this.f26084a));
    }

    public i get(String str) {
        return (i) this.f26084a.get(str);
    }

    public f getAsJsonArray(String str) {
        return (f) this.f26084a.get(str);
    }

    public l getAsJsonObject(String str) {
        return (l) this.f26084a.get(str);
    }

    public o getAsJsonPrimitive(String str) {
        return (o) this.f26084a.get(str);
    }

    public boolean has(String str) {
        return this.f26084a.containsKey(str);
    }

    public int hashCode() {
        return this.f26084a.hashCode();
    }

    public boolean isEmpty() {
        return this.f26084a.size() == 0;
    }

    public Set<String> keySet() {
        return this.f26084a.keySet();
    }

    public i remove(String str) {
        return (i) this.f26084a.remove(str);
    }

    public int size() {
        return this.f26084a.size();
    }

    public void addProperty(String str, Number number) {
        add(str, number == null ? k.INSTANCE : new o(number));
    }

    @Override // com.google.gson.i
    public l deepCopy() {
        l lVar = new l();
        for (Map.Entry<Object, Object> entry : this.f26084a.entrySet()) {
            lVar.add((String) entry.getKey(), ((i) entry.getValue()).deepCopy());
        }
        return lVar;
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? k.INSTANCE : new o(bool));
    }

    public void addProperty(String str, Character ch) {
        add(str, ch == null ? k.INSTANCE : new o(ch));
    }
}
