package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class h0j extends kc6 {
    public /* synthetic */ Object d;
    public final /* synthetic */ k0j e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0j(k0j k0jVar, kc6 kc6Var) {
        super(kc6Var);
        this.e = k0jVar;
    }

    public final Object t(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objB = k0j.b(this.e, this);
        return objB == xe6.a ? objB : new mel(objB);
    }
}
