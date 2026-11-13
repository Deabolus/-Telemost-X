package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class uc1 extends wc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ uc1(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.wc1
    public final String f() {
        switch (this.a) {
            case 0:
                return "YAMBAUTH " + this.b;
            default:
                return "OAuthTeam " + this.b;
        }
    }

    @Override // defpackage.wc1
    public final String g() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // defpackage.wc1
    public boolean h() {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.h();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "YAMBAUTH token";
            default:
                return "OAuthTeam token";
        }
    }
}
