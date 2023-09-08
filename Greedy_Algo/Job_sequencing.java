import java.util.*;

public class Job_sequencing {
    static class Job {
        int deadline;
        int profit;
        int id; // 0(a), 1(B)..

        // constructor
        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;

        }
    }
    public static void main(String[] args) {
    // Job sequencing problem
    int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
    // job type ke object
ArrayList<Job> jobs = new ArrayList<>(); 
for(int i = 0;i<jobsInfo.length;i++)
    {
        //0th column -deadline
        //1st column - profit
        jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));

    }

    //lamda function
    Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit); //desceding order
    //jobs, (a,b) -> a.profit-b.profit); //asceding order

    //storing of sequence
    ArrayList<Integer> seq= new ArrayList<>();
int time =0;

    for(int i=0; i<jobs.size(); i++){
        Job curr= jobs.get(i);
if(curr.deadline> time){
    seq.add(curr.id);
    time++;
}
    }
    //print sequence
    System.out.println("Max jObs= " + seq.size());
    for(int i=0; i<seq.size(); i++){
        System.out.print(seq.get(i) + " ");
    }
}

}
