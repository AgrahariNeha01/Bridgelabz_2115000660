import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class P36 {
    public static void main(String[] args) throws Exception {
        String jsonFile = "ipl.json";
        String csvFile = "ipl.csv";
        processJSON(jsonFile, "censored_ipl.json");
        processCSV(csvFile, "censored_ipl.csv");
    }

    static void processJSON(String in, String out) throws Exception {
        String data = new String(Files.readAllBytes(Paths.get(in)));
        JSONArray arr = new JSONArray(data);

        for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            obj.put("team1", mask(obj.getString("team1")));
            obj.put("team2", mask(obj.getString("team2")));
            obj.put("winner", mask(obj.getString("winner")));
            obj.put("player_of_match", "REDACTED");
            JSONObject sc = obj.getJSONObject("score");
            sc.put(mask(obj.getString("team1")), sc.remove(obj.getString("team1")));
            sc.put(mask(obj.getString("team2")), sc.remove(obj.getString("team2")));
        }

        Files.write(Paths.get(out), arr.toString(2).getBytes());
    }

    static void processCSV(String in, String out) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(in));
        List<String> res = new ArrayList<>();
        res.add(lines.get(0));

        for (int i = 1; i < lines.size(); i++) {
            String[] cols = lines.get(i).split(",");
            cols[1] = mask(cols[1]);
            cols[2] = mask(cols[2]);
            cols[5] = mask(cols[5]);
            cols[6] = "REDACTED";
            res.add(String.join(",", cols));
        }

        Files.write(Paths.get(out), res);
    }

    static String mask(String t) {
        return t.replaceAll(" (?=[^ ]+$)", " ***");
    }
}
