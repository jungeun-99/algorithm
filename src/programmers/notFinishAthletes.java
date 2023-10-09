package programmers;

import java.util.Arrays;

public class notFinishAthletes {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        String result = "";
        for (int i = 0; i < participant.length; i++) {
            if (i >= completion.length || !participant[i].equals(completion[i])) {
                result = participant[i];
                break;
            }
        }

        return result;
    }
}
