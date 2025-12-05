public class BachelorStudent extends Student implements ProjectScoreBehaviour {

    public BachelorStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    public float projectScore() {
        return 20f;
    }

    @Override
    public float computeTotalScore() {
        return computeBaseScore() + projectScore();
    }
}
