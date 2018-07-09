import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShellCommond {

    public static String exeCmd(String commandStr) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            //System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

}
