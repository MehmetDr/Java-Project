public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour {
    private int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int numberOfConf, int numberOfArticles) {
        super(id, mid, fin, numberOfConf);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public float articleScore() {
        return numberOfArticles * 8f;
    }

    @Override
    public float computeTotalScore() {
        return super.computeTotalScore() + articleScore();
    }
}
