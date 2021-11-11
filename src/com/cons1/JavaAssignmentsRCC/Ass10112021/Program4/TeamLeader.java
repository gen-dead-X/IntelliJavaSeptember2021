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

public class TeamLeader extends ProductionWorker{

    double MonthlyBonus;
    int AtdTime;
    int ReqTime;

    public TeamLeader(String LeadName, int members, double monthlyBonus, int atdTime, int reqTime) {
        super(LeadName, members);
        MonthlyBonus = monthlyBonus;
        AtdTime = atdTime;
        ReqTime = reqTime;
    }
    void CheckTime(){
        if (AtdTime >= ReqTime)
            System.out.println("Keep it up!");
        else
            System.out.println("Required hours not achieve.");
    }

    void display(){
        System.out.println("Name : " + LeaderName);
        System.out.println("No. Of Members : " + this.NoOfMembers);
        System.out.println("Monthly Bonus : " + this.MonthlyBonus);
        System.out.println("Hours Required : " + this.ReqTime);
        System.out.println("Hours attended : " + this.AtdTime);
    }
}
