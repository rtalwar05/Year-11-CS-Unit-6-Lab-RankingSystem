import static java.lang.Math.abs;

public class User {

    int rank;
    int progress;

    public User() {
        rank = -8;
        progress = 0;
    }

    public int getRank() {
        return rank;
    }

    private void setRank(int rank) {
        this.rank = rank;
    }

    public int getProgress() {
        return progress;
    }

    private void setProgress(int progress) {
        this.progress = progress;
    }

    public void incProgress (int r)
    {
        if (r > 8 || r < -8 || r == 0)
        {
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }
        else if ( r > rank)
        {
            int d = abs(r - rank);
            int f = 10 * d * d;
            progress = progress + f;
        }
        else if (rank == r)
        {
            progress = progress + 3;
        }
        else if (rank - r == 1)
        {
            progress = progress + 1;
        }

        rankUp();



    }

    public void rankUp()
    {
        while (progress >= 100 && rank < 8)
        {
            progress = progress - 100;
            rank++;
            if (rank == 0)
            {
                rank = 1;
            }

        }


    }

    @Override
    public String toString() {
        return "User{" +
                "rank=" + rank +
                ", progress=" + progress +
                '}';
    }
}
