package com.yandex.passport.internal.methods;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public final class n4 extends u5 {
    public final d6 b;
    public final b c;
    public final List d;
    public final i e;

    public n4(Bundle r5) {
        mqd.z(r5, "bundle");
        this(new com.yandex.passport.api.k2(com.yandex.passport.api.n.b("environment", "from(...)", r5), r5.getLong("passport-uid")), (com.yandex.passport.internal.credentials.e) x5.d.b(r5));
    }

    @Override // com.yandex.passport.internal.methods.u5
    public final List b() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.u5
    public final f c() {
        return this.e;
    }

    public n4(com.yandex.passport.api.k2 r3, com.yandex.passport.internal.credentials.e r4) {
        d6 r0 = new d6(r3);
        b r5 = new b(x5.d, r4);
        super(v5.j);
        this.b = r0;
        this.c = r5;
        this.d = f3r.J(new w[]{r0, r5});
        this.e = i.g;
    }
}
