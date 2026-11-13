package com.yandex.passport.internal.impl;

import android.content.Context;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.k2;
import com.yandex.passport.internal.methods.h3;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public final class s implements com.yandex.passport.api.r {
    public final o a;
    public final com.yandex.passport.internal.ui.util.i b;
    public final xeo c;

    public s(Context r4, o r5) {
        this.a = r5;
        final int r0 = 0;
        lo7.B(new q(this, r0));
        this.b = new com.yandex.passport.internal.ui.util.i(r4, new com.yandex.passport.internal.p(xzk.e, 1));
        final int r6 = 1;
        lo7.B(new q(this, r6));
        final int r7 = 2;
        this.c = lo7.B(new q(this, r7));
    }

    @Override // com.yandex.passport.api.r
    public final Object a(j2 r2, kc6 r3) {
        Object r4 = this.a.a(r2, r3);
        xe6 r5 = xe6.a;
        return r4;
    }

    @Override // com.yandex.passport.api.r
    public final Object b(String r2, ic6 r3) {
        Object r4 = this.a.b(r2, r3);
        xe6 r5 = xe6.a;
        return r4;
    }

    @Override // com.yandex.passport.api.r
    public final Object c(com.yandex.passport.internal.entities.h r2, ic6 r3) {
        Object r4 = this.a.c(r2, r3);
        xe6 r5 = xe6.a;
        return r4;
    }

    @Override // com.yandex.passport.api.r
    public final Object d(j2 r2, kc6 r3) {
        Object r4 = this.a.d(r2, r3);
        xe6 r5 = xe6.a;
        return r4;
    }

    @Override // com.yandex.passport.api.r
    public final Object e(lib r2, ic6 r3) {
        Object r4 = this.a.e(r2, r3);
        xe6 r5 = xe6.a;
        return r4;
    }

    @Override // com.yandex.passport.api.r
    public final com.yandex.passport.api.t f() {
        return (t) this.c.getValue();
    }

    @Override // com.yandex.passport.api.r
    public final Object g(k2 r2, kc6 r3) {
        Object r4 = this.a.g(r2, r3);
        xe6 r5 = xe6.a;
        return r4;
    }

    public final Object h(j2 r12, kc6 r13) {
        if ((r13 instanceof r) == false) goto L7;
        r r0 = (r) r13;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r14 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        o r15 = r0.d;
        nzn.U(r14);     // Catch: RuntimeException -> L14
    L23:
        Object r16 = ((mel) r14).a;     // Catch: RuntimeException -> L14
        Throwable r4 = mel.a(r16);     // Catch: RuntimeException -> L14
        if (r4 != null) goto L26;
    L28:
        return r16;
    L26:
        if ((r4 instanceof RuntimeException) == false) goto L28;
        r15.k((RuntimeException) r4);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        RuntimeException r17 = e;
    L31:
        r15.k(r17);
        throw r17;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r14);
        o r18 = this.a;
        r18.n();
        tk7 r19 = n08.a;     // Catch: RuntimeException -> L29
        b0o r5 = new b0o(r18.e, new h3(io.sentry.config.a.J(r12)), new i5e[0], null, 22);     // Catch: RuntimeException -> L29
        r0.d = r18;     // Catch: RuntimeException -> L29
        r0.g = 1;     // Catch: RuntimeException -> L29
        Object r110 = lo7.Q(r19, r5, r0);     // Catch: RuntimeException -> L29
        if (r110 != r2) goto L22;
        return r2;
    L22:
        r14 = r110;
        r15 = r18;
    L29:
        e = move-exception;
        r17 = e;
        r15 = r18;
    L7:
        r0 = new r(this, r13);
        goto L8
    }
}
