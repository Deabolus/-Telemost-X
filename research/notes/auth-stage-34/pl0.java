package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class pl0 implements iea {
    public final /* synthetic */ int a;
    public final khg b;

    public /* synthetic */ pl0(khg khgVar, int i) {
        this.a = i;
        this.b = khgVar;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new poq((ihg) this.b.get());
            case 1:
                return new ro6((ihg) this.b.get());
            case 2:
                return new t8n((ihg) this.b.get());
            case 3:
                return new g2e((ihg) this.b.get());
            default:
                return new tin((ihg) this.b.get());
        }
    }
}
