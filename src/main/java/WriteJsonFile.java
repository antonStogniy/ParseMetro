import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteJsonFile {
    public static void writeJsonSimpleDemo(String fileName) throws Exception{
        JSONObject sampleOject = new JSONObject();
        sampleOject.put("name","Stackabuser");
        sampleOject.put("age",35);
        JSONArray messages = new JSONArray();
        messages.add("My test");
        messages.add("I working in Home");
        sampleOject.put("messages",messages);
        Files.write(Paths.get(fileName),sampleOject.toJSONString().getBytes());
    }
}
