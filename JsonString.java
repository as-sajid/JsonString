
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonString {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper= new ObjectMapper();
       mapper.enable(SerializationFeature.INDENT_OUTPUT);
        FootballPlayer player=new FootballPlayer("Joes",10);
        String jsonString =mapper.writeValueAsString(player);
        System.out.println(jsonString);
        String path="C:/Users/nolog/OneDrive/Desktop/java/Outputs/outfile.json";
        mapper.writeValue(new File(path), jsonString);
    }
}