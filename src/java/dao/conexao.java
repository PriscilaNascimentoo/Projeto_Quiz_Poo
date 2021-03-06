/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import web.DbListener;

public class conexao {
    private String nome;
    private String senha;
    
    public static ArrayList<Usuario> getUsuario() throws Exception{
        ArrayList<Usuario> list = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection(DbListener.JDBCURL);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM usuario");
        while(rs.next()){
            list.add(new Usuario(
                    rs.getString("nome"), 
                    rs.getString("senha")));
        }
        rs.close();
        stmt.close();
        con.close();
        return list;
    }
    
    
    
    public static void addUsuario(String nome, String senha) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection(DbListener.JDBCURL);
        String SQL = "INSERT INTO users(nome, senha) VALUES(?,?)";
        PreparedStatement stmt = con.prepareStatement(SQL);
        stmt.setString(1, nome);
        stmt.setString(2, senha);
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public static void removeUsuario(String nome) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection(DbListener.JDBCURL);
        String SQL = "DELETE FROM usuario WHERE nome = ?";
        PreparedStatement stmt = con.prepareStatement(SQL);
        stmt.setString(1, nome);
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public static void changeSenha(String nome, String senha) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection(DbListener.JDBCURL);
        String SQL = "UPDATE users SET senha WHERE nome=?";
        PreparedStatement stmt = con.prepareStatement(SQL);
        stmt.setString(1, senha);
        stmt.setString(2, nome);
        stmt.execute();
        stmt.close();
        con.close();
    }

    /**
     *
     * @param nome
     * @param senha
     */
    public conexao(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

