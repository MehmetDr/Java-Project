public abstract class Student {
    protected int id;
    protected float mid;
    protected float fin;

    public Student(int id, float mid, float fin) {
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }

    public float computeBaseScore() {
        return mid * 0.4f + fin * 0.6f;
    }

    public abstract float computeTotalScore();
}
