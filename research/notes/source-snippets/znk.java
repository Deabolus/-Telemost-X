package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final /* synthetic */ class znk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aok b;

    public /* synthetic */ znk(aok aokVar, int i) {
        this.a = i;
        this.b = aokVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
