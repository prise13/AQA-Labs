package day_4;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class JsonMapper {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Employee employee = mapper.readValue(Paths.get("input.json").toFile(), Employee.class);
        employee.setFirstName("Anatoliy");
        mapper.writeValue(new File("output.json"), employee);
    }
}
