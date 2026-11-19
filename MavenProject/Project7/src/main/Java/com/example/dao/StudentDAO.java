package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Student;

public class StudentDAO{

    // Save Student
    public boolean saveStudent(Student student) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO student(id,name,age,city) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getCity());

            int row = ps.executeUpdate();

            if (row > 0) {
                status = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // View All Students
    public List<Student> getAllStudents() {

        List<Student> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM student";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Student student = new Student();

                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setCity(rs.getString("city"));

                list.add(student);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Get Student By ID
    public Student getStudentById(int id) {

        Student student = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM student WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                student = new Student();

                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setCity(rs.getString("city"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }

    // Update Student
    public boolean updateStudent(Student student) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE student SET name=?, age=?, city=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCity());
            ps.setInt(4, student.getId());

            int row = ps.executeUpdate();

            if (row > 0) {
                status = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // Delete Student
    public boolean deleteStudent(int id) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM student WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int row = ps.executeUpdate();

            if (row > 0) {
                status = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}