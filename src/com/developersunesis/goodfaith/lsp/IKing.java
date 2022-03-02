package com.developersunesis.goodfaith.lsp;

public class IKing {
    private String name;
    private String honor;
    private int age;

    public IKing(String name, String honor, int age) {
        this.name = name;
        this.honor = honor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "IKing{" + "name='" + name + '\'' +
                ", honor='" + honor + '\'' +
                ", age=" + age +
                '}';
    }
}
