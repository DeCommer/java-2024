package com.jpahibernate.jpahiberante.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

@Repository
public class CourseJdbcRepository {
    
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String DELETE_QUERY = 
        """
        DELETE FROM item WHERE id = ?;    
        """;

    private static String INSERT_QUERY = 
        """
        INSERT INTO item(id, name, description) VALUES(?, ?, ?);
        """;

    private static String SELECT_QUERY = 
    """
    SELECT * FROM item WHERE id = ?;
    """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, 
            course.getId(), course.getName(), course.getDescription());
    }

    public void delete(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course find(long id) {
        //result set to bean to rowMapper
        return springJdbcTemplate.queryForObject(SELECT_QUERY, 
        new BeanPropertyRowMapper<>(Course.class), id);
    }
}
