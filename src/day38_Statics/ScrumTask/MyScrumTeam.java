package day38_Statics.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {


        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();

        developer1.setInfo("Bektemir", "K-01", "Full stack Developer", "Amazon", 160000, 'M');
        developer2.setInfo("Nikola", "Y-821", "Software Developer", "Windows", 155000, 'M');
        developer3.setInfo("Meredith", "T-234", "Full stack Developer", "Apple", 140000, 'F');
        developer4.setInfo("Ian", "L-02", "Developer", "CVS Pharmacy", 135000, 'M');

        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        tester1.setInfo("Adnan", "0005", "Tester", "Cybertek", 98000, 'M');
        tester2.setInfo("Dean", "0006", "Tester", "Cybertek", 98500, 'M');
        tester3.setInfo("Jair", "0007", "Tester", "Cybertek", 99000, 'M');

        Tester[] testers = {tester2, tester3};
        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.setInfo("Yalcin", "Bektemir", "Elvira");
        scrum1.addTester(tester1);
        scrum1.addTester(testers);
        scrum1.addDeveloper(developers);

        System.out.println(scrum1);
        System.out.println("===================================================");
        for (Developer each : scrum1.developersTeam) {
            System.out.println(each);
        }
        System.out.println("===================================================");
        for (Tester each : scrum1.testersTeam) {
            System.out.println(each);
        }
        System.out.println("==========================================================================================");
        Tester tester4 = new Tester();
        Tester tester5 = new Tester();
        tester4.setInfo("Asuman", "GR-24", "SDET", "Javaholics", 170000, 'F');
        tester5.setInfo("Ercan", "GR-24", "SDET", "Javaholics", 170000, 'M');

        Developer developer5 = new Developer();
        Developer developer6 = new Developer();
        developer5.setInfo("ALtynai", "GR-24", "Full-Stack Developer", "Javaholics", 180000, 'F');
        developer6.setInfo("Shardae", "GR-24", "Full-Stack Developer", "Javaholics", 170000, 'F');

        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.addTester(tester4);
        scrum2.addTester(tester5);
        scrum2.addDeveloper(developer5);
        scrum2.addDeveloper(developer6);

        scrum2.setInfo("Svetlana", "Daniel", "Mayasa");

        // scrum1.removeDeveloper("Y-821");
        //  scrum1.removeTester("0006");

        System.out.println(scrum1);
        System.out.println(scrum2);

        System.out.println("=================================================");
        ScrumTeam[] scrums = {scrum1, scrum2};

        // print the names & salary of every single testers

        for (ScrumTeam eachScrum : scrums) {
            for (Tester eachTester : eachScrum.testersTeam) {
                System.out.println(eachTester.name + " : $" + eachTester.salary);
            }
        }
        System.out.println("===================================================");
        // print the names & salary of every single developers
        for (ScrumTeam eachScrum : scrums) {
            for (Developer eachDeveloper : eachScrum.developersTeam) {
                System.out.println(eachDeveloper.name + " : $" + eachDeveloper.salary);
            }
        }

        System.out.println("===============================================");
        int countDevelopers = 0;
        int countTesters = 0;

        for (ScrumTeam each : scrums) {
            countTesters += each.testersTeam.size();
            countDevelopers += each.developersTeam.size();
        }

        System.out.println("Testers: " + countTesters);
        System.out.println("Developers: " + countDevelopers);

        System.out.println("=================================================");
        //    ScrumTeam[] scrums = {scrum1, scrum2};

        scrums[0].SM = "Aihait";
        scrums[1].SM = "Aysel";

        System.out.println(scrums[0]);
        System.out.println(scrums[1]);

        System.out.println("===============================================");

        ArrayList<ScrumTeam> scrumList = new ArrayList<>();

        scrumList.addAll(Arrays.asList(scrums));

        for (ScrumTeam eachScrum : scrumList) {
            System.out.println("Tester: ");
            for (Tester eachTester : eachScrum.testersTeam) {
                System.out.println(eachTester.name + " : " + eachTester.salary);
            }

            System.out.println("---------------------------------------------");
            System.out.println("Developer: ");
            for (Developer eachDeveloper : eachScrum.developersTeam) {
                System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
            }
            System.out.println("---------------------------------------------");

        }
    }
}
 /*
        for( int i = 0; i <= scrumList.size()-1; i++){
                 ScrumTeam eachTeam =   scrumList.get(i);
                 for(int j =0; j <= eachTeam.testersTeam.size()-1; j++ ){ // j is index nm of Testers
                       Tester eachTester = eachTeam.testersTeam.get(j);
                     System.out.println( eachTester.name +" : "+eachTester.salary );
                 }
                for(int k = 0; k <= eachTeam.developersTeam.size()-1; k++){ // k is index nm of developers
                       Developer eachDeveloper    = eachTeam.developersTeam.get(k);
                    System.out.println(eachDeveloper.name +" : "+eachDeveloper.salary);
                }
        }
         */