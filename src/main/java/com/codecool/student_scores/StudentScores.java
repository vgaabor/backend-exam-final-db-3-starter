package com.codecool.student_scores;

import java.sql.DriverManager;

public class StudentScores {
    Connection con;

    public static void StudentScores(String DB_URL, String USERNAME, String PASSWORD) {
        this.con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }

    public City getCityWithHighestScore() {
        /*
            select city, sum(score) as sumScore
            from student_scores
            group by city
            order by sumScore desc
            limit 1
         */
    }

    public String getMostActiveStudent() {
        /*
            select student_name, count(student_name) as db
            from student_scores
            group by student_name
            order by db desc
            limit 1
         */
    }
}
