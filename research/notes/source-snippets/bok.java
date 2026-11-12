package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class bok {
    public static final int d;
    public static final int e;
    public final mgn a;
    public final LinkedHashMap b;
    public final k45 c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d = (int) timeUnit.toMillis(1L);
        e = (int) timeUnit.toMillis(10L);
    }

    public bok(mgn mgnVar) {
        mqd.z(mgnVar, "connection");
        this.a = mgnVar;
        this.b = new LinkedHashMap();
        this.c = k45.a;
    }
}
