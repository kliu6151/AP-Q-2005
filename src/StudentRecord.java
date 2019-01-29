/**
 * @author Kevin Liu
 * @author Edmund Wu
 */
public class StudentRecord {
    private int[] scores;

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    private double average(int first, int last)
    {
        double average = 0;
        for(int i = first; i < last; i++)
        {
            average += this.scores[i];
        }
        return average / (last - first);
    }

    private boolean hasImproved()
    {
        for(int i = 1; i < this.scores.length; i++)
        {
            if (this.scores[i] < this.scores[i - 1])
                return false;
        }
        return true;
    }

    public boolean improved() {
        return this.hasImproved();
    }

    public double finalAverage()
    {
        if(hasImproved())
        {
            return average(this.scores.length / 2, this.scores.length);
        }
        return average(0, this.scores.length);
    }
}