package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes2.dex */
public final class n {
    @Deprecated
    public n() {
    }

    public static i parseReader(Reader reader) {
        try {
            D3.a aVar = new D3.a(reader);
            i reader2 = parseReader(aVar);
            if (!reader2.isJsonNull() && aVar.peek() != D3.b.END_DOCUMENT) {
                throw new r("Did not consume the entire document.");
            }
            return reader2;
        } catch (D3.d e8) {
            throw new r(e8);
        } catch (IOException e9) {
            throw new j(e9);
        } catch (NumberFormatException e10) {
            throw new r(e10);
        }
    }

    public static i parseString(String str) {
        return parseReader(new StringReader(str));
    }

    @Deprecated
    public i parse(String str) {
        return parseString(str);
    }

    @Deprecated
    public i parse(Reader reader) {
        return parseReader(reader);
    }

    @Deprecated
    public i parse(D3.a aVar) {
        return parseReader(aVar);
    }

    public static i parseReader(D3.a aVar) {
        boolean zIsLenient = aVar.isLenient();
        aVar.setLenient(true);
        try {
            try {
                return com.google.gson.internal.m.parse(aVar);
            } catch (OutOfMemoryError e8) {
                throw new m("Failed parsing JSON source: " + aVar + " to Json", e8);
            } catch (StackOverflowError e9) {
                throw new m("Failed parsing JSON source: " + aVar + " to Json", e9);
            }
        } finally {
            aVar.setLenient(zIsLenient);
        }
    }
}
