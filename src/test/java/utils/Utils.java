package utils;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Utils {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //getting user credentials from JSON.
    public void getUserCreds(int pos) throws IOException, ParseException {
        String fileName="./src/test/resources/users.json";
        JSONParser jsonParser=new JSONParser();
        Object obj=jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray=(JSONArray) obj;
        JSONObject jsonObject=(JSONObject) jsonArray.get(pos);
        setEmail((String)jsonObject.get("email"));
        setPassword((String)jsonObject.get("password"));
    }
}
