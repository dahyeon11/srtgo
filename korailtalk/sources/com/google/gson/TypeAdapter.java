package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes2.dex */
public abstract class TypeAdapter {
    public final Object fromJson(Reader reader) {
        return read(new D3.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            return read(new com.google.gson.internal.bind.b(iVar));
        } catch (IOException e8) {
            throw new j(e8);
        }
    }

    public final TypeAdapter nullSafe() {
        return new TypeAdapter() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public Object read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return TypeAdapter.this.read(aVar);
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Object obj) throws IOException {
                if (obj == null) {
                    cVar.nullValue();
                } else {
                    TypeAdapter.this.write(cVar, obj);
                }
            }
        };
    }

    public abstract Object read(D3.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new D3.c(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            com.google.gson.internal.bind.c cVar = new com.google.gson.internal.bind.c();
            write(cVar, obj);
            return cVar.get();
        } catch (IOException e8) {
            throw new j(e8);
        }
    }

    public abstract void write(D3.c cVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e8) {
            throw new j(e8);
        }
    }
}
