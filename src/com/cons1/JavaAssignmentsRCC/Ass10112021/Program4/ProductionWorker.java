package com.cons1.JavaAssignmentsRCC.Ass10112021.Program4;

/*      In a particular factory, a team leader is an hourly paid production worker
        who leads a small team. In addition to hourly pay, team leaders earn a fixed
        monthly bonus. Team leaders are required to attend a minimum number of
        hours of training per year. Design a TeamLeader class that inherits from the
        ProductionWorker class. The TeamLeader class should have fields for the
        monthly bonus amount, the required number of training hours, and the
        number of training hours that the team leader has attended. Write one or
        more constructors for the class. Demonstrate the class by writing a program
        that uses a TeamLeader object.
*/
public class ProductionWorker {
    String LeaderName;
    int NoOfMembers;

    public ProductionWorker(String leaderName, int NoOfMembers) {
        this.LeaderName = leaderName;
        this.NoOfMembers = NoOfMembers;
    }
}
