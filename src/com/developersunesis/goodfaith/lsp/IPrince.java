package com.developersunesis.goodfaith.lsp;

public class IPrince extends IKing {

    private IKing father;

    public IPrince(String name, String honor, int age) {
        super(name, honor, age);
    }

    public IPrince(String name, String honor, int age, IKing father) {
        super(name, honor, age);
        this.father = father;
    }

    public IKing getFather() {
        return father;
    }

    public void setFather(IKing father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "IPrince{" +
                "father=" + father +
                '}';
    }
}
