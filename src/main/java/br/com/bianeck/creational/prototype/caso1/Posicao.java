package br.com.bianeck.creational.prototype.caso1;

public class Posicao {

    private final int x;
    private final int y;

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Posicao outro = (Posicao) obj;
        if (x != outro.x)
            return false;
        if (y != outro.y)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Posição [x=" + x + ", y=" + y + "]";
    }
}
