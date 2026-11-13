package com.yandex.passport.internal.authsdk;

import defpackage.oyg;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public final enum a extends Enum {
    public static final /* synthetic */ a[] a = null;

    static {
        a[] r0 = {new a("GetAccounts", 0)};
        a = r0;
        oyg.B(r0);
    }

    public static a valueOf(String r1) {
        return (a) Enum.valueOf(a.class, r1);
    }

    public static a[] values() {
        return (a[]) a.clone();
    }
}
