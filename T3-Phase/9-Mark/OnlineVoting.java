import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class OnlineVoting {
    public static void main(String[] args) throws IOException {
        // Create and populate the HashMap with captain information
        Map<String, Captain> captains = new HashMap<>();
        captains.put("Rohit", new Captain("Rohit", 28, "Team MI"));
        captains.put("Dhoni", new Captain("Dhoni", 39, "Team CSK "));
        captains.put("Virat", new Captain("Virat", 35, "Team RCB"));
        captains.put("Hardik", new Captain("Hardik", 32, "Team GT"));
        captains.put("Rishabh", new Captain("Rishabh", 30, "Team DC"));

        // Print captain details
        System.out.println("Captain Details:");
        for (Captain captain : captains.values()) {
            System.out.println(captain);
        }

        // Create a list to store voting sequence

        Queue<String> votingSequence = new ArrayDeque<>();

        // Simulate 50 voters and record their votes
        for (int i = 1; i <= 50; i++) {
            String voterName = "Voter-" + i;
            String selectedCaptain = getRandomCaptain(captains);
            votingSequence.add(voterName + " voted for " + selectedCaptain);
        }

        // Write initial captain HashMap and voting sequence to "Voting Result.txt" file
        BufferedWriter writer = new BufferedWriter(new FileWriter("Voting Result.txt"));
        writer.write("Captain Details:\n");
        for (Captain captain : captains.values()) {
            writer.write(captain.toString() + "\n");
        }
        writer.write("\nVoting Sequence:\n");
        for (String vote : votingSequence) {
            writer.write(vote + "\n");
        }
        writer.write("\n");
        writer.flush();
        // Count votes for each captain
        Map<String, Integer> voteCount = new HashMap<>();
        for (Captain captain : captains.values()) {
            voteCount.put(captain.name, 0);
        }

        for (String vote : votingSequence) {
            String selectedCaptain = vote.substring(vote.lastIndexOf(' ') + 1);
            voteCount.put(selectedCaptain, voteCount.get(selectedCaptain) + 1);
        }

        // Sort the results based on vote count in descending order
        List<Map.Entry<String, Integer>> sortedResults = new ArrayList<>(voteCount.entrySet());
        Collections.sort(sortedResults,
                Collections.reverseOrder(Comparator.comparing(Map.Entry<String, Integer>::getValue)));

        // Calculate the percentage of votes gained for the winner
        double totalVotes = votingSequence.size();
        Map.Entry<String, Integer> winnerEntry = sortedResults.get(0);
        String winnerName = winnerEntry.getKey();
        double winnerVotes = winnerEntry.getValue();
        double winnerPercentage = (winnerVotes / totalVotes) * 100;

        // Display the winner and results
        System.out.println("\nVoting Results:");
        for (Map.Entry<String, Integer> entry : sortedResults) {
            String captainName = entry.getKey();
            int votes = entry.getValue();
            double percentage = (votes / totalVotes) * 100;
            System.out.println(captainName + ": " + votes + " votes (" + percentage + "%)");
        }

        System.out.println("\nWinner: " + captains.get(winnerName) + ", Total Votes: " + winnerVotes +
                " (" + winnerPercentage + "%)");

        // Write final results to "Voting Result.txt" file
        BufferedWriter wr = new BufferedWriter(new FileWriter("Voting Result.txt", true));
        wr.write("\nVoting Results:\n");
        for (Map.Entry<String, Integer> entry : sortedResults) {
            String captainName = entry.getKey();
            int votes = entry.getValue();
            double percentage = (votes / totalVotes) * 100;
            wr.write(captainName + ": " + votes + " votes (" + percentage + "%)\n");
        }
        wr.write("\nWinner: " + captains.get(winnerName) + ", Total Votes: " + winnerVotes +
                " (" + winnerPercentage + "%)\n");
        wr.flush();
        System.out.println("\nResults written to 'Voting Result.txt'.");
    }

    static String getRandomCaptain(Map<String, Captain> captains) {
        List<String> captainNames = new ArrayList<>(captains.keySet());
        int index = (int) (Math.random() * captainNames.size());
        return captainNames.get(index);
    }
}

class Captain {
    String name;
    int age;
    String team;

    public Captain(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old, " + team + " team)";
    }
}
