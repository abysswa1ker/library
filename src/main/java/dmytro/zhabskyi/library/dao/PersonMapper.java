package dmytro.zhabskyi.library.dao;

import dmytro.zhabskyi.library.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setPerson_id(rs.getInt("person_id"));
        person.setName(rs.getString("name"));
        person.setYearOfBirth(rs.getInt("year_of_birth"));

        return person;
    }
}
