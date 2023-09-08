import java.util.*;

public class Activity_Selection {
    // activity selection
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[]= {2,4,6,7,9,9};

        //sorting
        int activities[][]= new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0]=i; //index 
            //ith index par i ki value store karna does not make any sense now but it will make once the array is sorted
            activities[i][1]=start[i];
            activities[i][2]=end[i];

        }
        //lambda function -> short form of big function
            Arrays.sort(activities, Comparator.comparingDouble(o -> o[2] ));




    //end time basis sorted
    int maxAct =0; //count
    //storing of the activity index
    ArrayList<Integer> ans= new ArrayList<>(); 

    //1st activity 
    maxAct =1;
    ans.add(activities[0][0]); //because we will anyhow take the first index as it takes less time
int lastEnd= activities[0][2]; // last ending time
    for(int i=1; i<end.length; i++){
if(activities[i][1]>= lastEnd){
    //[i][1] => 1 = first column
    //start[i]>= lastEnd=> activity non overlapping 
    //activity select 
    maxAct++;
    ans.add(activities[i][0]);
    //update last end
    lastEnd= activities[i][2];

}
    }
    System.out.println("Max Activities "+ maxAct);
    for(int i=0; i<ans.size(); i++){
        System.out.print("A"+ans.get(i)+ " ");
    }
    System.out.println();
    }
}
